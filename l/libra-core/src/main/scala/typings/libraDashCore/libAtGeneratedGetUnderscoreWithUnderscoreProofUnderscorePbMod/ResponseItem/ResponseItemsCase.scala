package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponseItemsCase extends js.Object

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.ResponseItemsCase")
@js.native
object ResponseItemsCase extends js.Object {
  @js.native
  sealed trait GET_ACCOUNT_STATE_RESPONSE extends ResponseItemsCase
  
  @js.native
  sealed trait GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE extends ResponseItemsCase
  
  @js.native
  sealed trait GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE extends ResponseItemsCase
  
  @js.native
  sealed trait GET_TRANSACTIONS_RESPONSE extends ResponseItemsCase
  
  @js.native
  sealed trait RESPONSEITEMS_NOT_SET extends ResponseItemsCase
  
  /* 3 */ val GET_ACCOUNT_STATE_RESPONSE: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.GET_ACCOUNT_STATE_RESPONSE with Double = js.native
  /* 4 */ val GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE with Double = js.native
  /* 5 */ val GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE with Double = js.native
  /* 6 */ val GET_TRANSACTIONS_RESPONSE: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.GET_TRANSACTIONS_RESPONSE with Double = js.native
  /* 0 */ val RESPONSEITEMS_NOT_SET: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.RESPONSEITEMS_NOT_SET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseItemsCase with Double] = js.native
}

