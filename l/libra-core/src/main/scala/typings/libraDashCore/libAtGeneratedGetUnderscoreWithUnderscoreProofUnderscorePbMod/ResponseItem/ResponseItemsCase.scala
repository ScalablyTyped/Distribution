package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem

import org.scalablytyped.runtime.TopLevel
import typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.GET_ACCOUNT_STATE_RESPONSE
import typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE
import typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE
import typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.GET_TRANSACTIONS_RESPONSE
import typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem.ResponseItemsCase.RESPONSEITEMS_NOT_SET
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseItemsCase with Double] = js.native
  /* 3 */ @js.native
  object GET_ACCOUNT_STATE_RESPONSE extends TopLevel[GET_ACCOUNT_STATE_RESPONSE with Double]
  
  /* 4 */ @js.native
  object GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE extends TopLevel[GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE with Double]
  
  /* 5 */ @js.native
  object GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE extends TopLevel[GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE with Double]
  
  /* 6 */ @js.native
  object GET_TRANSACTIONS_RESPONSE extends TopLevel[GET_TRANSACTIONS_RESPONSE with Double]
  
  /* 0 */ @js.native
  object RESPONSEITEMS_NOT_SET extends TopLevel[RESPONSEITEMS_NOT_SET with Double]
  
}

