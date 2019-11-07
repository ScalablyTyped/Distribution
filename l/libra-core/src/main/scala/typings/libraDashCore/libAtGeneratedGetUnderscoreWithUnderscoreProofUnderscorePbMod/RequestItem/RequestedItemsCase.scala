package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.RequestItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RequestedItemsCase extends js.Object

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.RequestedItemsCase")
@js.native
object RequestedItemsCase extends js.Object {
  @js.native
  sealed trait GET_ACCOUNT_STATE_REQUEST extends RequestedItemsCase
  
  @js.native
  sealed trait GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST extends RequestedItemsCase
  
  @js.native
  sealed trait GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST extends RequestedItemsCase
  
  @js.native
  sealed trait GET_TRANSACTIONS_REQUEST extends RequestedItemsCase
  
  @js.native
  sealed trait REQUESTEDITEMS_NOT_SET extends RequestedItemsCase
  
  /* 1 */ val GET_ACCOUNT_STATE_REQUEST: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.RequestItem.RequestedItemsCase.GET_ACCOUNT_STATE_REQUEST with Double = js.native
  /* 2 */ val GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.RequestItem.RequestedItemsCase.GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST with Double = js.native
  /* 3 */ val GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.RequestItem.RequestedItemsCase.GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST with Double = js.native
  /* 4 */ val GET_TRANSACTIONS_REQUEST: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.RequestItem.RequestedItemsCase.GET_TRANSACTIONS_REQUEST with Double = js.native
  /* 0 */ val REQUESTEDITEMS_NOT_SET: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.RequestItem.RequestedItemsCase.REQUESTEDITEMS_NOT_SET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RequestedItemsCase with Double] = js.native
}

