package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuntimeStatus extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "RuntimeStatus")
@js.native
object RuntimeStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuntimeStatus with Double] = js.native
  
  @js.native
  sealed trait ACCOUNTADDRESSALREADYEXISTS extends RuntimeStatus
  /* 6 */ val ACCOUNTADDRESSALREADYEXISTS: typings.libraCore.vmErrorsPbMod.RuntimeStatus.ACCOUNTADDRESSALREADYEXISTS with Double = js.native
  
  @js.native
  sealed trait CANNOTWRITEEXISTINGRESOURCE extends RuntimeStatus
  /* 12 */ val CANNOTWRITEEXISTINGRESOURCE: typings.libraCore.vmErrorsPbMod.RuntimeStatus.CANNOTWRITEEXISTINGRESOURCE with Double = js.native
  
  @js.native
  sealed trait DATAFORMATERROR extends RuntimeStatus
  /* 9 */ val DATAFORMATERROR: typings.libraCore.vmErrorsPbMod.RuntimeStatus.DATAFORMATERROR with Double = js.native
  
  @js.native
  sealed trait DUPLICATEMODULENAME extends RuntimeStatus
  /* 15 */ val DUPLICATEMODULENAME: typings.libraCore.vmErrorsPbMod.RuntimeStatus.DUPLICATEMODULENAME with Double = js.native
  
  @js.native
  sealed trait EVICTEDACCOUNTACCESS extends RuntimeStatus
  /* 5 */ val EVICTEDACCOUNTACCESS: typings.libraCore.vmErrorsPbMod.RuntimeStatus.EVICTEDACCOUNTACCESS with Double = js.native
  
  @js.native
  sealed trait EXECUTED extends RuntimeStatus
  /* 1 */ val EXECUTED: typings.libraCore.vmErrorsPbMod.RuntimeStatus.EXECUTED with Double = js.native
  
  @js.native
  sealed trait INVALIDDATA extends RuntimeStatus
  /* 10 */ val INVALIDDATA: typings.libraCore.vmErrorsPbMod.RuntimeStatus.INVALIDDATA with Double = js.native
  
  @js.native
  sealed trait MISSINGDATA extends RuntimeStatus
  /* 8 */ val MISSINGDATA: typings.libraCore.vmErrorsPbMod.RuntimeStatus.MISSINGDATA with Double = js.native
  
  @js.native
  sealed trait OUTOFGAS extends RuntimeStatus
  /* 2 */ val OUTOFGAS: typings.libraCore.vmErrorsPbMod.RuntimeStatus.OUTOFGAS with Double = js.native
  
  @js.native
  sealed trait REMOTEDATAERROR extends RuntimeStatus
  /* 11 */ val REMOTEDATAERROR: typings.libraCore.vmErrorsPbMod.RuntimeStatus.REMOTEDATAERROR with Double = js.native
  
  @js.native
  sealed trait RESOURCEALREADYEXISTS extends RuntimeStatus
  /* 4 */ val RESOURCEALREADYEXISTS: typings.libraCore.vmErrorsPbMod.RuntimeStatus.RESOURCEALREADYEXISTS with Double = js.native
  
  @js.native
  sealed trait RESOURCEDOESNOTEXIST extends RuntimeStatus
  /* 3 */ val RESOURCEDOESNOTEXIST: typings.libraCore.vmErrorsPbMod.RuntimeStatus.RESOURCEDOESNOTEXIST with Double = js.native
  
  @js.native
  sealed trait TYPEERROR extends RuntimeStatus
  /* 7 */ val TYPEERROR: typings.libraCore.vmErrorsPbMod.RuntimeStatus.TYPEERROR with Double = js.native
  
  @js.native
  sealed trait UNKNOWNRUNTIMESTATUS extends RuntimeStatus
  /* 0 */ val UNKNOWNRUNTIMESTATUS: typings.libraCore.vmErrorsPbMod.RuntimeStatus.UNKNOWNRUNTIMESTATUS with Double = js.native
  
  @js.native
  sealed trait VALUEDESERIALIZATIONERROR extends RuntimeStatus
  /* 14 */ val VALUEDESERIALIZATIONERROR: typings.libraCore.vmErrorsPbMod.RuntimeStatus.VALUEDESERIALIZATIONERROR with Double = js.native
  
  @js.native
  sealed trait VALUESERIALIZATIONERROR extends RuntimeStatus
  /* 13 */ val VALUESERIALIZATIONERROR: typings.libraCore.vmErrorsPbMod.RuntimeStatus.VALUESERIALIZATIONERROR with Double = js.native
}
