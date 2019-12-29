package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMVerificationErrorKind with Double] = js.native
  /* 26 */ @js.native
  object ASSERTTYPEMISMATCHERROR extends TopLevel[ASSERTTYPEMISMATCHERROR with Double]
  
  /* 56 */ @js.native
  object BOOLEANOPTYPEMISMATCHERROR extends TopLevel[BOOLEANOPTYPEMISMATCHERROR with Double]
  
  /* 34 */ @js.native
  object BORROWFIELDBADFIELDERROR extends TopLevel[BORROWFIELDBADFIELDERROR with Double]
  
  /* 35 */ @js.native
  object BORROWFIELDEXISTSMUTABLEBORROWERROR extends TopLevel[BORROWFIELDEXISTSMUTABLEBORROWERROR with Double]
  
  /* 33 */ @js.native
  object BORROWFIELDTYPEMISMATCHERROR extends TopLevel[BORROWFIELDTYPEMISMATCHERROR with Double]
  
  /* 60 */ @js.native
  object BORROWGLOBALNORESOURCEERROR extends TopLevel[BORROWGLOBALNORESOURCEERROR with Double]
  
  /* 59 */ @js.native
  object BORROWGLOBALTYPEMISMATCHERROR extends TopLevel[BORROWGLOBALTYPEMISMATCHERROR with Double]
  
  /* 43 */ @js.native
  object BORROWLOCEXISTSBORROWERROR extends TopLevel[BORROWLOCEXISTSBORROWERROR with Double]
  
  /* 41 */ @js.native
  object BORROWLOCREFERENCEERROR extends TopLevel[BORROWLOCREFERENCEERROR with Double]
  
  /* 42 */ @js.native
  object BORROWLOCUNAVAILABLEERROR extends TopLevel[BORROWLOCUNAVAILABLEERROR with Double]
  
  /* 25 */ @js.native
  object BRTYPEMISMATCHERROR extends TopLevel[BRTYPEMISMATCHERROR with Double]
  
  /* 45 */ @js.native
  object CALLBORROWEDMUTABLEREFERENCEERROR extends TopLevel[CALLBORROWEDMUTABLEREFERENCEERROR with Double]
  
  /* 44 */ @js.native
  object CALLTYPEMISMATCHERROR extends TopLevel[CALLTYPEMISMATCHERROR with Double]
  
  /* 38 */ @js.native
  object COPYLOCEXISTSBORROWERROR extends TopLevel[COPYLOCEXISTSBORROWERROR with Double]
  
  /* 37 */ @js.native
  object COPYLOCRESOURCEERROR extends TopLevel[COPYLOCRESOURCEERROR with Double]
  
  /* 36 */ @js.native
  object COPYLOCUNAVAILABLEERROR extends TopLevel[COPYLOCUNAVAILABLEERROR with Double]
  
  /* 65 */ @js.native
  object CREATEACCOUNTTYPEMISMATCHERROR extends TopLevel[CREATEACCOUNTTYPEMISMATCHERROR with Double]
  
  /* 12 */ @js.native
  object DUPLICATEELEMENT extends TopLevel[DUPLICATEELEMENT with Double]
  
  /* 57 */ @js.native
  object EQUALITYOPTYPEMISMATCHERROR extends TopLevel[EQUALITYOPTYPEMISMATCHERROR with Double]
  
  /* 58 */ @js.native
  object EXISTSRESOURCETYPEMISMATCHERROR extends TopLevel[EXISTSRESOURCETYPEMISMATCHERROR with Double]
  
  /* 32 */ @js.native
  object FREEZEREFEXISTSMUTABLEBORROWERROR extends TopLevel[FREEZEREFEXISTSMUTABLEBORROWERROR with Double]
  
  /* 31 */ @js.native
  object FREEZEREFTYPEMISMATCHERROR extends TopLevel[FREEZEREFTYPEMISMATCHERROR with Double]
  
  /* 15 */ @js.native
  object INCONSISTENTFIELDS extends TopLevel[INCONSISTENTFIELDS with Double]
  
  /* 1 */ @js.native
  object INDEXOUTOFBOUNDS extends TopLevel[INDEXOUTOFBOUNDS with Double]
  
  /* 55 */ @js.native
  object INTEGEROPTYPEMISMATCHERROR extends TopLevel[INTEGEROPTYPEMISMATCHERROR with Double]
  
  /* 7 */ @js.native
  object INVALIDFALLTHROUGH extends TopLevel[INVALIDFALLTHROUGH with Double]
  
  /* 4 */ @js.native
  object INVALIDFIELDDEFREFERENCE extends TopLevel[INVALIDFIELDDEFREFERENCE with Double]
  
  /* 11 */ @js.native
  object INVALIDMAINFUNCTIONSIGNATURE extends TopLevel[INVALIDMAINFUNCTIONSIGNATURE with Double]
  
  /* 13 */ @js.native
  object INVALIDMODULEHANDLE extends TopLevel[INVALIDMODULEHANDLE with Double]
  
  /* 6 */ @js.native
  object INVALIDRESOURCEFIELD extends TopLevel[INVALIDRESOURCEFIELD with Double]
  
  /* 3 */ @js.native
  object INVALIDSIGNATURETOKEN extends TopLevel[INVALIDSIGNATURETOKEN with Double]
  
  /* 8 */ @js.native
  object JOINFAILURE extends TopLevel[JOINFAILURE with Double]
  
  /* 17 */ @js.native
  object LOOKUPFAILED extends TopLevel[LOOKUPFAILED with Double]
  
  /* 21 */ @js.native
  object MISSINGDEPENDENCY extends TopLevel[MISSINGDEPENDENCY with Double]
  
  /* 66 */ @js.native
  object MODULEADDRESSDOESNOTMATCHSENDER extends TopLevel[MODULEADDRESSDOESNOTMATCHSENDER with Double]
  
  /* 62 */ @js.native
  object MOVEFROMNORESOURCEERROR extends TopLevel[MOVEFROMNORESOURCEERROR with Double]
  
  /* 61 */ @js.native
  object MOVEFROMTYPEMISMATCHERROR extends TopLevel[MOVEFROMTYPEMISMATCHERROR with Double]
  
  /* 40 */ @js.native
  object MOVELOCEXISTSBORROWERROR extends TopLevel[MOVELOCEXISTSBORROWERROR with Double]
  
  /* 39 */ @js.native
  object MOVELOCUNAVAILABLEERROR extends TopLevel[MOVELOCUNAVAILABLEERROR with Double]
  
  /* 64 */ @js.native
  object MOVETOSENDERNORESOURCEERROR extends TopLevel[MOVETOSENDERNORESOURCEERROR with Double]
  
  /* 63 */ @js.native
  object MOVETOSENDERTYPEMISMATCHERROR extends TopLevel[MOVETOSENDERTYPEMISMATCHERROR with Double]
  
  /* 9 */ @js.native
  object NEGATIVESTACKSIZEWITHINBLOCK extends TopLevel[NEGATIVESTACKSIZEWITHINBLOCK with Double]
  
  /* 67 */ @js.native
  object NOMODULEHANDLES extends TopLevel[NOMODULEHANDLES with Double]
  
  /* 46 */ @js.native
  object PACKTYPEMISMATCHERROR extends TopLevel[PACKTYPEMISMATCHERROR with Double]
  
  /* 22 */ @js.native
  object POPREFERENCEERROR extends TopLevel[POPREFERENCEERROR with Double]
  
  /* 23 */ @js.native
  object POPRESOURCEERROR extends TopLevel[POPRESOURCEERROR with Double]
  
  /* 2 */ @js.native
  object RANGEOUTOFBOUNDS extends TopLevel[RANGEOUTOFBOUNDS with Double]
  
  /* 50 */ @js.native
  object READREFEXISTSMUTABLEBORROWERROR extends TopLevel[READREFEXISTSMUTABLEBORROWERROR with Double]
  
  /* 49 */ @js.native
  object READREFRESOURCEERROR extends TopLevel[READREFRESOURCEERROR with Double]
  
  /* 48 */ @js.native
  object READREFTYPEMISMATCHERROR extends TopLevel[READREFTYPEMISMATCHERROR with Double]
  
  /* 5 */ @js.native
  object RECURSIVESTRUCTDEFINITION extends TopLevel[RECURSIVESTRUCTDEFINITION with Double]
  
  /* 24 */ @js.native
  object RELEASEREFTYPEMISMATCHERROR extends TopLevel[RELEASEREFTYPEMISMATCHERROR with Double]
  
  /* 30 */ @js.native
  object RETTYPEMISMATCHERROR extends TopLevel[RETTYPEMISMATCHERROR with Double]
  
  /* 29 */ @js.native
  object RETUNSAFETODESTROYERROR extends TopLevel[RETUNSAFETODESTROYERROR with Double]
  
  /* 27 */ @js.native
  object STLOCTYPEMISMATCHERROR extends TopLevel[STLOCTYPEMISMATCHERROR with Double]
  
  /* 28 */ @js.native
  object STLOCUNSAFETODESTROYERROR extends TopLevel[STLOCUNSAFETODESTROYERROR with Double]
  
  /* 20 */ @js.native
  object TYPEMISMATCH extends TopLevel[TYPEMISMATCH with Double]
  
  /* 19 */ @js.native
  object TYPERESOLUTIONFAILURE extends TopLevel[TYPERESOLUTIONFAILURE with Double]
  
  /* 10 */ @js.native
  object UNBALANCEDSTACK extends TopLevel[UNBALANCEDSTACK with Double]
  
  /* 14 */ @js.native
  object UNIMPLEMENTEDHANDLE extends TopLevel[UNIMPLEMENTEDHANDLE with Double]
  
  /* 0 */ @js.native
  object UNKNOWNVERIFICATIONERROR extends TopLevel[UNKNOWNVERIFICATIONERROR with Double]
  
  /* 47 */ @js.native
  object UNPACKTYPEMISMATCHERROR extends TopLevel[UNPACKTYPEMISMATCHERROR with Double]
  
  /* 16 */ @js.native
  object UNUSEDFIELDS extends TopLevel[UNUSEDFIELDS with Double]
  
  /* 18 */ @js.native
  object VISIBILITYMISMATCH extends TopLevel[VISIBILITYMISMATCH with Double]
  
  /* 53 */ @js.native
  object WRITEREFEXISTSBORROWERROR extends TopLevel[WRITEREFEXISTSBORROWERROR with Double]
  
  /* 54 */ @js.native
  object WRITEREFNOMUTABLEREFERENCEERROR extends TopLevel[WRITEREFNOMUTABLEREFERENCEERROR with Double]
  
  /* 52 */ @js.native
  object WRITEREFRESOURCEERROR extends TopLevel[WRITEREFRESOURCEERROR with Double]
  
  /* 51 */ @js.native
  object WRITEREFTYPEMISMATCHERROR extends TopLevel[WRITEREFTYPEMISMATCHERROR with Double]
  
}

