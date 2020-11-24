package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuntimeStatus extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "RuntimeStatus")
@js.native
object RuntimeStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuntimeStatus with Double] = js.native
  
  @js.native
  sealed trait ACCOUNTADDRESSALREADYEXISTS extends RuntimeStatus
  /* 6 */ @js.native
  object ACCOUNTADDRESSALREADYEXISTS extends TopLevel[ACCOUNTADDRESSALREADYEXISTS with Double]
  
  @js.native
  sealed trait CANNOTWRITEEXISTINGRESOURCE extends RuntimeStatus
  /* 12 */ @js.native
  object CANNOTWRITEEXISTINGRESOURCE extends TopLevel[CANNOTWRITEEXISTINGRESOURCE with Double]
  
  @js.native
  sealed trait DATAFORMATERROR extends RuntimeStatus
  /* 9 */ @js.native
  object DATAFORMATERROR extends TopLevel[DATAFORMATERROR with Double]
  
  @js.native
  sealed trait DUPLICATEMODULENAME extends RuntimeStatus
  /* 15 */ @js.native
  object DUPLICATEMODULENAME extends TopLevel[DUPLICATEMODULENAME with Double]
  
  @js.native
  sealed trait EVICTEDACCOUNTACCESS extends RuntimeStatus
  /* 5 */ @js.native
  object EVICTEDACCOUNTACCESS extends TopLevel[EVICTEDACCOUNTACCESS with Double]
  
  @js.native
  sealed trait EXECUTED extends RuntimeStatus
  /* 1 */ @js.native
  object EXECUTED extends TopLevel[EXECUTED with Double]
  
  @js.native
  sealed trait INVALIDDATA extends RuntimeStatus
  /* 10 */ @js.native
  object INVALIDDATA extends TopLevel[INVALIDDATA with Double]
  
  @js.native
  sealed trait MISSINGDATA extends RuntimeStatus
  /* 8 */ @js.native
  object MISSINGDATA extends TopLevel[MISSINGDATA with Double]
  
  @js.native
  sealed trait OUTOFGAS extends RuntimeStatus
  /* 2 */ @js.native
  object OUTOFGAS extends TopLevel[OUTOFGAS with Double]
  
  @js.native
  sealed trait REMOTEDATAERROR extends RuntimeStatus
  /* 11 */ @js.native
  object REMOTEDATAERROR extends TopLevel[REMOTEDATAERROR with Double]
  
  @js.native
  sealed trait RESOURCEALREADYEXISTS extends RuntimeStatus
  /* 4 */ @js.native
  object RESOURCEALREADYEXISTS extends TopLevel[RESOURCEALREADYEXISTS with Double]
  
  @js.native
  sealed trait RESOURCEDOESNOTEXIST extends RuntimeStatus
  /* 3 */ @js.native
  object RESOURCEDOESNOTEXIST extends TopLevel[RESOURCEDOESNOTEXIST with Double]
  
  @js.native
  sealed trait TYPEERROR extends RuntimeStatus
  /* 7 */ @js.native
  object TYPEERROR extends TopLevel[TYPEERROR with Double]
  
  @js.native
  sealed trait UNKNOWNRUNTIMESTATUS extends RuntimeStatus
  /* 0 */ @js.native
  object UNKNOWNRUNTIMESTATUS extends TopLevel[UNKNOWNRUNTIMESTATUS with Double]
  
  @js.native
  sealed trait VALUEDESERIALIZATIONERROR extends RuntimeStatus
  /* 14 */ @js.native
  object VALUEDESERIALIZATIONERROR extends TopLevel[VALUEDESERIALIZATIONERROR with Double]
  
  @js.native
  sealed trait VALUESERIALIZATIONERROR extends RuntimeStatus
  /* 13 */ @js.native
  object VALUESERIALIZATIONERROR extends TopLevel[VALUESERIALIZATIONERROR with Double]
}
