package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMVerificationErrorKind extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationErrorKind")
@js.native
object VMVerificationErrorKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMVerificationErrorKind with Double] = js.native
  
  @js.native
  sealed trait ASSERTTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 26 */ val ASSERTTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.ASSERTTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait BOOLEANOPTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 56 */ val BOOLEANOPTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BOOLEANOPTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait BORROWFIELDBADFIELDERROR extends VMVerificationErrorKind
  /* 34 */ val BORROWFIELDBADFIELDERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWFIELDBADFIELDERROR with Double = js.native
  
  @js.native
  sealed trait BORROWFIELDEXISTSMUTABLEBORROWERROR extends VMVerificationErrorKind
  /* 35 */ val BORROWFIELDEXISTSMUTABLEBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWFIELDEXISTSMUTABLEBORROWERROR with Double = js.native
  
  @js.native
  sealed trait BORROWFIELDTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 33 */ val BORROWFIELDTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWFIELDTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait BORROWGLOBALNORESOURCEERROR extends VMVerificationErrorKind
  /* 60 */ val BORROWGLOBALNORESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWGLOBALNORESOURCEERROR with Double = js.native
  
  @js.native
  sealed trait BORROWGLOBALTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 59 */ val BORROWGLOBALTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWGLOBALTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait BORROWLOCEXISTSBORROWERROR extends VMVerificationErrorKind
  /* 43 */ val BORROWLOCEXISTSBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWLOCEXISTSBORROWERROR with Double = js.native
  
  @js.native
  sealed trait BORROWLOCREFERENCEERROR extends VMVerificationErrorKind
  /* 41 */ val BORROWLOCREFERENCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWLOCREFERENCEERROR with Double = js.native
  
  @js.native
  sealed trait BORROWLOCUNAVAILABLEERROR extends VMVerificationErrorKind
  /* 42 */ val BORROWLOCUNAVAILABLEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWLOCUNAVAILABLEERROR with Double = js.native
  
  @js.native
  sealed trait BRTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 25 */ val BRTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BRTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait CALLBORROWEDMUTABLEREFERENCEERROR extends VMVerificationErrorKind
  /* 45 */ val CALLBORROWEDMUTABLEREFERENCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.CALLBORROWEDMUTABLEREFERENCEERROR with Double = js.native
  
  @js.native
  sealed trait CALLTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 44 */ val CALLTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.CALLTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait COPYLOCEXISTSBORROWERROR extends VMVerificationErrorKind
  /* 38 */ val COPYLOCEXISTSBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.COPYLOCEXISTSBORROWERROR with Double = js.native
  
  @js.native
  sealed trait COPYLOCRESOURCEERROR extends VMVerificationErrorKind
  /* 37 */ val COPYLOCRESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.COPYLOCRESOURCEERROR with Double = js.native
  
  @js.native
  sealed trait COPYLOCUNAVAILABLEERROR extends VMVerificationErrorKind
  /* 36 */ val COPYLOCUNAVAILABLEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.COPYLOCUNAVAILABLEERROR with Double = js.native
  
  @js.native
  sealed trait CREATEACCOUNTTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 65 */ val CREATEACCOUNTTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.CREATEACCOUNTTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait DUPLICATEELEMENT extends VMVerificationErrorKind
  /* 12 */ val DUPLICATEELEMENT: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.DUPLICATEELEMENT with Double = js.native
  
  @js.native
  sealed trait EQUALITYOPTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 57 */ val EQUALITYOPTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.EQUALITYOPTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait EXISTSRESOURCETYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 58 */ val EXISTSRESOURCETYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.EXISTSRESOURCETYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait FREEZEREFEXISTSMUTABLEBORROWERROR extends VMVerificationErrorKind
  /* 32 */ val FREEZEREFEXISTSMUTABLEBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.FREEZEREFEXISTSMUTABLEBORROWERROR with Double = js.native
  
  @js.native
  sealed trait FREEZEREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 31 */ val FREEZEREFTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.FREEZEREFTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait INCONSISTENTFIELDS extends VMVerificationErrorKind
  /* 15 */ val INCONSISTENTFIELDS: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INCONSISTENTFIELDS with Double = js.native
  
  @js.native
  sealed trait INDEXOUTOFBOUNDS extends VMVerificationErrorKind
  /* 1 */ val INDEXOUTOFBOUNDS: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INDEXOUTOFBOUNDS with Double = js.native
  
  @js.native
  sealed trait INTEGEROPTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 55 */ val INTEGEROPTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INTEGEROPTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait INVALIDFALLTHROUGH extends VMVerificationErrorKind
  /* 7 */ val INVALIDFALLTHROUGH: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDFALLTHROUGH with Double = js.native
  
  @js.native
  sealed trait INVALIDFIELDDEFREFERENCE extends VMVerificationErrorKind
  /* 4 */ val INVALIDFIELDDEFREFERENCE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDFIELDDEFREFERENCE with Double = js.native
  
  @js.native
  sealed trait INVALIDMAINFUNCTIONSIGNATURE extends VMVerificationErrorKind
  /* 11 */ val INVALIDMAINFUNCTIONSIGNATURE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDMAINFUNCTIONSIGNATURE with Double = js.native
  
  @js.native
  sealed trait INVALIDMODULEHANDLE extends VMVerificationErrorKind
  /* 13 */ val INVALIDMODULEHANDLE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDMODULEHANDLE with Double = js.native
  
  @js.native
  sealed trait INVALIDRESOURCEFIELD extends VMVerificationErrorKind
  /* 6 */ val INVALIDRESOURCEFIELD: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDRESOURCEFIELD with Double = js.native
  
  @js.native
  sealed trait INVALIDSIGNATURETOKEN extends VMVerificationErrorKind
  /* 3 */ val INVALIDSIGNATURETOKEN: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDSIGNATURETOKEN with Double = js.native
  
  @js.native
  sealed trait JOINFAILURE extends VMVerificationErrorKind
  /* 8 */ val JOINFAILURE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.JOINFAILURE with Double = js.native
  
  @js.native
  sealed trait LOOKUPFAILED extends VMVerificationErrorKind
  /* 17 */ val LOOKUPFAILED: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.LOOKUPFAILED with Double = js.native
  
  @js.native
  sealed trait MISSINGDEPENDENCY extends VMVerificationErrorKind
  /* 21 */ val MISSINGDEPENDENCY: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MISSINGDEPENDENCY with Double = js.native
  
  @js.native
  sealed trait MODULEADDRESSDOESNOTMATCHSENDER extends VMVerificationErrorKind
  /* 66 */ val MODULEADDRESSDOESNOTMATCHSENDER: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MODULEADDRESSDOESNOTMATCHSENDER with Double = js.native
  
  @js.native
  sealed trait MOVEFROMNORESOURCEERROR extends VMVerificationErrorKind
  /* 62 */ val MOVEFROMNORESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVEFROMNORESOURCEERROR with Double = js.native
  
  @js.native
  sealed trait MOVEFROMTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 61 */ val MOVEFROMTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVEFROMTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait MOVELOCEXISTSBORROWERROR extends VMVerificationErrorKind
  /* 40 */ val MOVELOCEXISTSBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVELOCEXISTSBORROWERROR with Double = js.native
  
  @js.native
  sealed trait MOVELOCUNAVAILABLEERROR extends VMVerificationErrorKind
  /* 39 */ val MOVELOCUNAVAILABLEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVELOCUNAVAILABLEERROR with Double = js.native
  
  @js.native
  sealed trait MOVETOSENDERNORESOURCEERROR extends VMVerificationErrorKind
  /* 64 */ val MOVETOSENDERNORESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVETOSENDERNORESOURCEERROR with Double = js.native
  
  @js.native
  sealed trait MOVETOSENDERTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 63 */ val MOVETOSENDERTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVETOSENDERTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait NEGATIVESTACKSIZEWITHINBLOCK extends VMVerificationErrorKind
  /* 9 */ val NEGATIVESTACKSIZEWITHINBLOCK: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.NEGATIVESTACKSIZEWITHINBLOCK with Double = js.native
  
  @js.native
  sealed trait NOMODULEHANDLES extends VMVerificationErrorKind
  /* 67 */ val NOMODULEHANDLES: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.NOMODULEHANDLES with Double = js.native
  
  @js.native
  sealed trait PACKTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 46 */ val PACKTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.PACKTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait POPREFERENCEERROR extends VMVerificationErrorKind
  /* 22 */ val POPREFERENCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.POPREFERENCEERROR with Double = js.native
  
  @js.native
  sealed trait POPRESOURCEERROR extends VMVerificationErrorKind
  /* 23 */ val POPRESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.POPRESOURCEERROR with Double = js.native
  
  @js.native
  sealed trait RANGEOUTOFBOUNDS extends VMVerificationErrorKind
  /* 2 */ val RANGEOUTOFBOUNDS: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RANGEOUTOFBOUNDS with Double = js.native
  
  @js.native
  sealed trait READREFEXISTSMUTABLEBORROWERROR extends VMVerificationErrorKind
  /* 50 */ val READREFEXISTSMUTABLEBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.READREFEXISTSMUTABLEBORROWERROR with Double = js.native
  
  @js.native
  sealed trait READREFRESOURCEERROR extends VMVerificationErrorKind
  /* 49 */ val READREFRESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.READREFRESOURCEERROR with Double = js.native
  
  @js.native
  sealed trait READREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 48 */ val READREFTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.READREFTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait RECURSIVESTRUCTDEFINITION extends VMVerificationErrorKind
  /* 5 */ val RECURSIVESTRUCTDEFINITION: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RECURSIVESTRUCTDEFINITION with Double = js.native
  
  @js.native
  sealed trait RELEASEREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 24 */ val RELEASEREFTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RELEASEREFTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait RETTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 30 */ val RETTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RETTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait RETUNSAFETODESTROYERROR extends VMVerificationErrorKind
  /* 29 */ val RETUNSAFETODESTROYERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RETUNSAFETODESTROYERROR with Double = js.native
  
  @js.native
  sealed trait STLOCTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 27 */ val STLOCTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.STLOCTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait STLOCUNSAFETODESTROYERROR extends VMVerificationErrorKind
  /* 28 */ val STLOCUNSAFETODESTROYERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.STLOCUNSAFETODESTROYERROR with Double = js.native
  
  @js.native
  sealed trait TYPEMISMATCH extends VMVerificationErrorKind
  /* 20 */ val TYPEMISMATCH: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.TYPEMISMATCH with Double = js.native
  
  @js.native
  sealed trait TYPERESOLUTIONFAILURE extends VMVerificationErrorKind
  /* 19 */ val TYPERESOLUTIONFAILURE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.TYPERESOLUTIONFAILURE with Double = js.native
  
  @js.native
  sealed trait UNBALANCEDSTACK extends VMVerificationErrorKind
  /* 10 */ val UNBALANCEDSTACK: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNBALANCEDSTACK with Double = js.native
  
  @js.native
  sealed trait UNIMPLEMENTEDHANDLE extends VMVerificationErrorKind
  /* 14 */ val UNIMPLEMENTEDHANDLE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNIMPLEMENTEDHANDLE with Double = js.native
  
  @js.native
  sealed trait UNKNOWNVERIFICATIONERROR extends VMVerificationErrorKind
  /* 0 */ val UNKNOWNVERIFICATIONERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNKNOWNVERIFICATIONERROR with Double = js.native
  
  @js.native
  sealed trait UNPACKTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 47 */ val UNPACKTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNPACKTYPEMISMATCHERROR with Double = js.native
  
  @js.native
  sealed trait UNUSEDFIELDS extends VMVerificationErrorKind
  /* 16 */ val UNUSEDFIELDS: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNUSEDFIELDS with Double = js.native
  
  @js.native
  sealed trait VISIBILITYMISMATCH extends VMVerificationErrorKind
  /* 18 */ val VISIBILITYMISMATCH: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.VISIBILITYMISMATCH with Double = js.native
  
  @js.native
  sealed trait WRITEREFEXISTSBORROWERROR extends VMVerificationErrorKind
  /* 53 */ val WRITEREFEXISTSBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.WRITEREFEXISTSBORROWERROR with Double = js.native
  
  @js.native
  sealed trait WRITEREFNOMUTABLEREFERENCEERROR extends VMVerificationErrorKind
  /* 54 */ val WRITEREFNOMUTABLEREFERENCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.WRITEREFNOMUTABLEREFERENCEERROR with Double = js.native
  
  @js.native
  sealed trait WRITEREFRESOURCEERROR extends VMVerificationErrorKind
  /* 52 */ val WRITEREFRESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.WRITEREFRESOURCEERROR with Double = js.native
  
  @js.native
  sealed trait WRITEREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 51 */ val WRITEREFTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.WRITEREFTYPEMISMATCHERROR with Double = js.native
}
