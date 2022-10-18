package typings.libraCore.`lib@GeneratedVmErrorsPbMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuntimeStatus extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "RuntimeStatus")
@js.native
object RuntimeStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuntimeStatus & Double] = js.native
  
  @js.native
  sealed trait ACCOUNTADDRESSALREADYEXISTS
    extends StObject
       with RuntimeStatus
  /* 6 */ val ACCOUNTADDRESSALREADYEXISTS: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.ACCOUNTADDRESSALREADYEXISTS & Double = js.native
  
  @js.native
  sealed trait CANNOTWRITEEXISTINGRESOURCE
    extends StObject
       with RuntimeStatus
  /* 12 */ val CANNOTWRITEEXISTINGRESOURCE: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.CANNOTWRITEEXISTINGRESOURCE & Double = js.native
  
  @js.native
  sealed trait DATAFORMATERROR
    extends StObject
       with RuntimeStatus
  /* 9 */ val DATAFORMATERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.DATAFORMATERROR & Double = js.native
  
  @js.native
  sealed trait DUPLICATEMODULENAME
    extends StObject
       with RuntimeStatus
  /* 15 */ val DUPLICATEMODULENAME: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.DUPLICATEMODULENAME & Double = js.native
  
  @js.native
  sealed trait EVICTEDACCOUNTACCESS
    extends StObject
       with RuntimeStatus
  /* 5 */ val EVICTEDACCOUNTACCESS: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.EVICTEDACCOUNTACCESS & Double = js.native
  
  @js.native
  sealed trait EXECUTED
    extends StObject
       with RuntimeStatus
  /* 1 */ val EXECUTED: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.EXECUTED & Double = js.native
  
  @js.native
  sealed trait INVALIDDATA
    extends StObject
       with RuntimeStatus
  /* 10 */ val INVALIDDATA: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.INVALIDDATA & Double = js.native
  
  @js.native
  sealed trait MISSINGDATA
    extends StObject
       with RuntimeStatus
  /* 8 */ val MISSINGDATA: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.MISSINGDATA & Double = js.native
  
  @js.native
  sealed trait OUTOFGAS
    extends StObject
       with RuntimeStatus
  /* 2 */ val OUTOFGAS: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.OUTOFGAS & Double = js.native
  
  @js.native
  sealed trait REMOTEDATAERROR
    extends StObject
       with RuntimeStatus
  /* 11 */ val REMOTEDATAERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.REMOTEDATAERROR & Double = js.native
  
  @js.native
  sealed trait RESOURCEALREADYEXISTS
    extends StObject
       with RuntimeStatus
  /* 4 */ val RESOURCEALREADYEXISTS: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.RESOURCEALREADYEXISTS & Double = js.native
  
  @js.native
  sealed trait RESOURCEDOESNOTEXIST
    extends StObject
       with RuntimeStatus
  /* 3 */ val RESOURCEDOESNOTEXIST: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.RESOURCEDOESNOTEXIST & Double = js.native
  
  @js.native
  sealed trait TYPEERROR
    extends StObject
       with RuntimeStatus
  /* 7 */ val TYPEERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.TYPEERROR & Double = js.native
  
  @js.native
  sealed trait UNKNOWNRUNTIMESTATUS
    extends StObject
       with RuntimeStatus
  /* 0 */ val UNKNOWNRUNTIMESTATUS: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.UNKNOWNRUNTIMESTATUS & Double = js.native
  
  @js.native
  sealed trait VALUEDESERIALIZATIONERROR
    extends StObject
       with RuntimeStatus
  /* 14 */ val VALUEDESERIALIZATIONERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.VALUEDESERIALIZATIONERROR & Double = js.native
  
  @js.native
  sealed trait VALUESERIALIZATIONERROR
    extends StObject
       with RuntimeStatus
  /* 13 */ val VALUESERIALIZATIONERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.RuntimeStatus.VALUESERIALIZATIONERROR & Double = js.native
}
