package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VMVerificationErrorKind extends js.Object

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationErrorKind")
@js.native
object VMVerificationErrorKind extends js.Object {
  @js.native
  sealed trait ASSERTTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BOOLEANOPTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BORROWFIELDBADFIELDERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BORROWFIELDEXISTSMUTABLEBORROWERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BORROWFIELDTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BORROWGLOBALNORESOURCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BORROWGLOBALTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BORROWLOCEXISTSBORROWERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BORROWLOCREFERENCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BORROWLOCUNAVAILABLEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait BRTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait CALLBORROWEDMUTABLEREFERENCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait CALLTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait COPYLOCEXISTSBORROWERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait COPYLOCRESOURCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait COPYLOCUNAVAILABLEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait CREATEACCOUNTTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait DUPLICATEELEMENT extends VMVerificationErrorKind
  
  @js.native
  sealed trait EQUALITYOPTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait EXISTSRESOURCETYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait FREEZEREFEXISTSMUTABLEBORROWERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait FREEZEREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait INCONSISTENTFIELDS extends VMVerificationErrorKind
  
  @js.native
  sealed trait INDEXOUTOFBOUNDS extends VMVerificationErrorKind
  
  @js.native
  sealed trait INTEGEROPTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait INVALIDFALLTHROUGH extends VMVerificationErrorKind
  
  @js.native
  sealed trait INVALIDFIELDDEFREFERENCE extends VMVerificationErrorKind
  
  @js.native
  sealed trait INVALIDMAINFUNCTIONSIGNATURE extends VMVerificationErrorKind
  
  @js.native
  sealed trait INVALIDMODULEHANDLE extends VMVerificationErrorKind
  
  @js.native
  sealed trait INVALIDRESOURCEFIELD extends VMVerificationErrorKind
  
  @js.native
  sealed trait INVALIDSIGNATURETOKEN extends VMVerificationErrorKind
  
  @js.native
  sealed trait JOINFAILURE extends VMVerificationErrorKind
  
  @js.native
  sealed trait LOOKUPFAILED extends VMVerificationErrorKind
  
  @js.native
  sealed trait MISSINGDEPENDENCY extends VMVerificationErrorKind
  
  @js.native
  sealed trait MODULEADDRESSDOESNOTMATCHSENDER extends VMVerificationErrorKind
  
  @js.native
  sealed trait MOVEFROMNORESOURCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait MOVEFROMTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait MOVELOCEXISTSBORROWERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait MOVELOCUNAVAILABLEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait MOVETOSENDERNORESOURCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait MOVETOSENDERTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait NEGATIVESTACKSIZEWITHINBLOCK extends VMVerificationErrorKind
  
  @js.native
  sealed trait NOMODULEHANDLES extends VMVerificationErrorKind
  
  @js.native
  sealed trait PACKTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait POPREFERENCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait POPRESOURCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait RANGEOUTOFBOUNDS extends VMVerificationErrorKind
  
  @js.native
  sealed trait READREFEXISTSMUTABLEBORROWERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait READREFRESOURCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait READREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait RECURSIVESTRUCTDEFINITION extends VMVerificationErrorKind
  
  @js.native
  sealed trait RELEASEREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait RETTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait RETUNSAFETODESTROYERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait STLOCTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait STLOCUNSAFETODESTROYERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait TYPEMISMATCH extends VMVerificationErrorKind
  
  @js.native
  sealed trait TYPERESOLUTIONFAILURE extends VMVerificationErrorKind
  
  @js.native
  sealed trait UNBALANCEDSTACK extends VMVerificationErrorKind
  
  @js.native
  sealed trait UNIMPLEMENTEDHANDLE extends VMVerificationErrorKind
  
  @js.native
  sealed trait UNKNOWNVERIFICATIONERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait UNPACKTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait UNUSEDFIELDS extends VMVerificationErrorKind
  
  @js.native
  sealed trait VISIBILITYMISMATCH extends VMVerificationErrorKind
  
  @js.native
  sealed trait WRITEREFEXISTSBORROWERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait WRITEREFNOMUTABLEREFERENCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait WRITEREFRESOURCEERROR extends VMVerificationErrorKind
  
  @js.native
  sealed trait WRITEREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  
  /* 26 */ val ASSERTTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.ASSERTTYPEMISMATCHERROR with Double = js.native
  /* 56 */ val BOOLEANOPTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BOOLEANOPTYPEMISMATCHERROR with Double = js.native
  /* 34 */ val BORROWFIELDBADFIELDERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BORROWFIELDBADFIELDERROR with Double = js.native
  /* 35 */ val BORROWFIELDEXISTSMUTABLEBORROWERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BORROWFIELDEXISTSMUTABLEBORROWERROR with Double = js.native
  /* 33 */ val BORROWFIELDTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BORROWFIELDTYPEMISMATCHERROR with Double = js.native
  /* 60 */ val BORROWGLOBALNORESOURCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BORROWGLOBALNORESOURCEERROR with Double = js.native
  /* 59 */ val BORROWGLOBALTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BORROWGLOBALTYPEMISMATCHERROR with Double = js.native
  /* 43 */ val BORROWLOCEXISTSBORROWERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BORROWLOCEXISTSBORROWERROR with Double = js.native
  /* 41 */ val BORROWLOCREFERENCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BORROWLOCREFERENCEERROR with Double = js.native
  /* 42 */ val BORROWLOCUNAVAILABLEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BORROWLOCUNAVAILABLEERROR with Double = js.native
  /* 25 */ val BRTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.BRTYPEMISMATCHERROR with Double = js.native
  /* 45 */ val CALLBORROWEDMUTABLEREFERENCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.CALLBORROWEDMUTABLEREFERENCEERROR with Double = js.native
  /* 44 */ val CALLTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.CALLTYPEMISMATCHERROR with Double = js.native
  /* 38 */ val COPYLOCEXISTSBORROWERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.COPYLOCEXISTSBORROWERROR with Double = js.native
  /* 37 */ val COPYLOCRESOURCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.COPYLOCRESOURCEERROR with Double = js.native
  /* 36 */ val COPYLOCUNAVAILABLEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.COPYLOCUNAVAILABLEERROR with Double = js.native
  /* 65 */ val CREATEACCOUNTTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.CREATEACCOUNTTYPEMISMATCHERROR with Double = js.native
  /* 12 */ val DUPLICATEELEMENT: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.DUPLICATEELEMENT with Double = js.native
  /* 57 */ val EQUALITYOPTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.EQUALITYOPTYPEMISMATCHERROR with Double = js.native
  /* 58 */ val EXISTSRESOURCETYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.EXISTSRESOURCETYPEMISMATCHERROR with Double = js.native
  /* 32 */ val FREEZEREFEXISTSMUTABLEBORROWERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.FREEZEREFEXISTSMUTABLEBORROWERROR with Double = js.native
  /* 31 */ val FREEZEREFTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.FREEZEREFTYPEMISMATCHERROR with Double = js.native
  /* 15 */ val INCONSISTENTFIELDS: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.INCONSISTENTFIELDS with Double = js.native
  /* 1 */ val INDEXOUTOFBOUNDS: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.INDEXOUTOFBOUNDS with Double = js.native
  /* 55 */ val INTEGEROPTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.INTEGEROPTYPEMISMATCHERROR with Double = js.native
  /* 7 */ val INVALIDFALLTHROUGH: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.INVALIDFALLTHROUGH with Double = js.native
  /* 4 */ val INVALIDFIELDDEFREFERENCE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.INVALIDFIELDDEFREFERENCE with Double = js.native
  /* 11 */ val INVALIDMAINFUNCTIONSIGNATURE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.INVALIDMAINFUNCTIONSIGNATURE with Double = js.native
  /* 13 */ val INVALIDMODULEHANDLE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.INVALIDMODULEHANDLE with Double = js.native
  /* 6 */ val INVALIDRESOURCEFIELD: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.INVALIDRESOURCEFIELD with Double = js.native
  /* 3 */ val INVALIDSIGNATURETOKEN: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.INVALIDSIGNATURETOKEN with Double = js.native
  /* 8 */ val JOINFAILURE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.JOINFAILURE with Double = js.native
  /* 17 */ val LOOKUPFAILED: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.LOOKUPFAILED with Double = js.native
  /* 21 */ val MISSINGDEPENDENCY: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.MISSINGDEPENDENCY with Double = js.native
  /* 66 */ val MODULEADDRESSDOESNOTMATCHSENDER: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.MODULEADDRESSDOESNOTMATCHSENDER with Double = js.native
  /* 62 */ val MOVEFROMNORESOURCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.MOVEFROMNORESOURCEERROR with Double = js.native
  /* 61 */ val MOVEFROMTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.MOVEFROMTYPEMISMATCHERROR with Double = js.native
  /* 40 */ val MOVELOCEXISTSBORROWERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.MOVELOCEXISTSBORROWERROR with Double = js.native
  /* 39 */ val MOVELOCUNAVAILABLEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.MOVELOCUNAVAILABLEERROR with Double = js.native
  /* 64 */ val MOVETOSENDERNORESOURCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.MOVETOSENDERNORESOURCEERROR with Double = js.native
  /* 63 */ val MOVETOSENDERTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.MOVETOSENDERTYPEMISMATCHERROR with Double = js.native
  /* 9 */ val NEGATIVESTACKSIZEWITHINBLOCK: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.NEGATIVESTACKSIZEWITHINBLOCK with Double = js.native
  /* 67 */ val NOMODULEHANDLES: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.NOMODULEHANDLES with Double = js.native
  /* 46 */ val PACKTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.PACKTYPEMISMATCHERROR with Double = js.native
  /* 22 */ val POPREFERENCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.POPREFERENCEERROR with Double = js.native
  /* 23 */ val POPRESOURCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.POPRESOURCEERROR with Double = js.native
  /* 2 */ val RANGEOUTOFBOUNDS: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.RANGEOUTOFBOUNDS with Double = js.native
  /* 50 */ val READREFEXISTSMUTABLEBORROWERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.READREFEXISTSMUTABLEBORROWERROR with Double = js.native
  /* 49 */ val READREFRESOURCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.READREFRESOURCEERROR with Double = js.native
  /* 48 */ val READREFTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.READREFTYPEMISMATCHERROR with Double = js.native
  /* 5 */ val RECURSIVESTRUCTDEFINITION: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.RECURSIVESTRUCTDEFINITION with Double = js.native
  /* 24 */ val RELEASEREFTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.RELEASEREFTYPEMISMATCHERROR with Double = js.native
  /* 30 */ val RETTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.RETTYPEMISMATCHERROR with Double = js.native
  /* 29 */ val RETUNSAFETODESTROYERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.RETUNSAFETODESTROYERROR with Double = js.native
  /* 27 */ val STLOCTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.STLOCTYPEMISMATCHERROR with Double = js.native
  /* 28 */ val STLOCUNSAFETODESTROYERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.STLOCUNSAFETODESTROYERROR with Double = js.native
  /* 20 */ val TYPEMISMATCH: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.TYPEMISMATCH with Double = js.native
  /* 19 */ val TYPERESOLUTIONFAILURE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.TYPERESOLUTIONFAILURE with Double = js.native
  /* 10 */ val UNBALANCEDSTACK: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.UNBALANCEDSTACK with Double = js.native
  /* 14 */ val UNIMPLEMENTEDHANDLE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.UNIMPLEMENTEDHANDLE with Double = js.native
  /* 0 */ val UNKNOWNVERIFICATIONERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.UNKNOWNVERIFICATIONERROR with Double = js.native
  /* 47 */ val UNPACKTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.UNPACKTYPEMISMATCHERROR with Double = js.native
  /* 16 */ val UNUSEDFIELDS: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.UNUSEDFIELDS with Double = js.native
  /* 18 */ val VISIBILITYMISMATCH: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.VISIBILITYMISMATCH with Double = js.native
  /* 53 */ val WRITEREFEXISTSBORROWERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.WRITEREFEXISTSBORROWERROR with Double = js.native
  /* 54 */ val WRITEREFNOMUTABLEREFERENCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.WRITEREFNOMUTABLEREFERENCEERROR with Double = js.native
  /* 52 */ val WRITEREFRESOURCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.WRITEREFRESOURCEERROR with Double = js.native
  /* 51 */ val WRITEREFTYPEMISMATCHERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind.WRITEREFTYPEMISMATCHERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMVerificationErrorKind with Double] = js.native
}

