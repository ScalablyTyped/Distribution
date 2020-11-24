package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMVerificationErrorKind extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationErrorKind")
@js.native
object VMVerificationErrorKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMVerificationErrorKind with Double] = js.native
  
  @js.native
  sealed trait ASSERTTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 26 */ @js.native
  object ASSERTTYPEMISMATCHERROR extends TopLevel[ASSERTTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait BOOLEANOPTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 56 */ @js.native
  object BOOLEANOPTYPEMISMATCHERROR extends TopLevel[BOOLEANOPTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait BORROWFIELDBADFIELDERROR extends VMVerificationErrorKind
  /* 34 */ @js.native
  object BORROWFIELDBADFIELDERROR extends TopLevel[BORROWFIELDBADFIELDERROR with Double]
  
  @js.native
  sealed trait BORROWFIELDEXISTSMUTABLEBORROWERROR extends VMVerificationErrorKind
  /* 35 */ @js.native
  object BORROWFIELDEXISTSMUTABLEBORROWERROR extends TopLevel[BORROWFIELDEXISTSMUTABLEBORROWERROR with Double]
  
  @js.native
  sealed trait BORROWFIELDTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 33 */ @js.native
  object BORROWFIELDTYPEMISMATCHERROR extends TopLevel[BORROWFIELDTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait BORROWGLOBALNORESOURCEERROR extends VMVerificationErrorKind
  /* 60 */ @js.native
  object BORROWGLOBALNORESOURCEERROR extends TopLevel[BORROWGLOBALNORESOURCEERROR with Double]
  
  @js.native
  sealed trait BORROWGLOBALTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 59 */ @js.native
  object BORROWGLOBALTYPEMISMATCHERROR extends TopLevel[BORROWGLOBALTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait BORROWLOCEXISTSBORROWERROR extends VMVerificationErrorKind
  /* 43 */ @js.native
  object BORROWLOCEXISTSBORROWERROR extends TopLevel[BORROWLOCEXISTSBORROWERROR with Double]
  
  @js.native
  sealed trait BORROWLOCREFERENCEERROR extends VMVerificationErrorKind
  /* 41 */ @js.native
  object BORROWLOCREFERENCEERROR extends TopLevel[BORROWLOCREFERENCEERROR with Double]
  
  @js.native
  sealed trait BORROWLOCUNAVAILABLEERROR extends VMVerificationErrorKind
  /* 42 */ @js.native
  object BORROWLOCUNAVAILABLEERROR extends TopLevel[BORROWLOCUNAVAILABLEERROR with Double]
  
  @js.native
  sealed trait BRTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 25 */ @js.native
  object BRTYPEMISMATCHERROR extends TopLevel[BRTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait CALLBORROWEDMUTABLEREFERENCEERROR extends VMVerificationErrorKind
  /* 45 */ @js.native
  object CALLBORROWEDMUTABLEREFERENCEERROR extends TopLevel[CALLBORROWEDMUTABLEREFERENCEERROR with Double]
  
  @js.native
  sealed trait CALLTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 44 */ @js.native
  object CALLTYPEMISMATCHERROR extends TopLevel[CALLTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait COPYLOCEXISTSBORROWERROR extends VMVerificationErrorKind
  /* 38 */ @js.native
  object COPYLOCEXISTSBORROWERROR extends TopLevel[COPYLOCEXISTSBORROWERROR with Double]
  
  @js.native
  sealed trait COPYLOCRESOURCEERROR extends VMVerificationErrorKind
  /* 37 */ @js.native
  object COPYLOCRESOURCEERROR extends TopLevel[COPYLOCRESOURCEERROR with Double]
  
  @js.native
  sealed trait COPYLOCUNAVAILABLEERROR extends VMVerificationErrorKind
  /* 36 */ @js.native
  object COPYLOCUNAVAILABLEERROR extends TopLevel[COPYLOCUNAVAILABLEERROR with Double]
  
  @js.native
  sealed trait CREATEACCOUNTTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 65 */ @js.native
  object CREATEACCOUNTTYPEMISMATCHERROR extends TopLevel[CREATEACCOUNTTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait DUPLICATEELEMENT extends VMVerificationErrorKind
  /* 12 */ @js.native
  object DUPLICATEELEMENT extends TopLevel[DUPLICATEELEMENT with Double]
  
  @js.native
  sealed trait EQUALITYOPTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 57 */ @js.native
  object EQUALITYOPTYPEMISMATCHERROR extends TopLevel[EQUALITYOPTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait EXISTSRESOURCETYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 58 */ @js.native
  object EXISTSRESOURCETYPEMISMATCHERROR extends TopLevel[EXISTSRESOURCETYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait FREEZEREFEXISTSMUTABLEBORROWERROR extends VMVerificationErrorKind
  /* 32 */ @js.native
  object FREEZEREFEXISTSMUTABLEBORROWERROR extends TopLevel[FREEZEREFEXISTSMUTABLEBORROWERROR with Double]
  
  @js.native
  sealed trait FREEZEREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 31 */ @js.native
  object FREEZEREFTYPEMISMATCHERROR extends TopLevel[FREEZEREFTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait INCONSISTENTFIELDS extends VMVerificationErrorKind
  /* 15 */ @js.native
  object INCONSISTENTFIELDS extends TopLevel[INCONSISTENTFIELDS with Double]
  
  @js.native
  sealed trait INDEXOUTOFBOUNDS extends VMVerificationErrorKind
  /* 1 */ @js.native
  object INDEXOUTOFBOUNDS extends TopLevel[INDEXOUTOFBOUNDS with Double]
  
  @js.native
  sealed trait INTEGEROPTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 55 */ @js.native
  object INTEGEROPTYPEMISMATCHERROR extends TopLevel[INTEGEROPTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait INVALIDFALLTHROUGH extends VMVerificationErrorKind
  /* 7 */ @js.native
  object INVALIDFALLTHROUGH extends TopLevel[INVALIDFALLTHROUGH with Double]
  
  @js.native
  sealed trait INVALIDFIELDDEFREFERENCE extends VMVerificationErrorKind
  /* 4 */ @js.native
  object INVALIDFIELDDEFREFERENCE extends TopLevel[INVALIDFIELDDEFREFERENCE with Double]
  
  @js.native
  sealed trait INVALIDMAINFUNCTIONSIGNATURE extends VMVerificationErrorKind
  /* 11 */ @js.native
  object INVALIDMAINFUNCTIONSIGNATURE extends TopLevel[INVALIDMAINFUNCTIONSIGNATURE with Double]
  
  @js.native
  sealed trait INVALIDMODULEHANDLE extends VMVerificationErrorKind
  /* 13 */ @js.native
  object INVALIDMODULEHANDLE extends TopLevel[INVALIDMODULEHANDLE with Double]
  
  @js.native
  sealed trait INVALIDRESOURCEFIELD extends VMVerificationErrorKind
  /* 6 */ @js.native
  object INVALIDRESOURCEFIELD extends TopLevel[INVALIDRESOURCEFIELD with Double]
  
  @js.native
  sealed trait INVALIDSIGNATURETOKEN extends VMVerificationErrorKind
  /* 3 */ @js.native
  object INVALIDSIGNATURETOKEN extends TopLevel[INVALIDSIGNATURETOKEN with Double]
  
  @js.native
  sealed trait JOINFAILURE extends VMVerificationErrorKind
  /* 8 */ @js.native
  object JOINFAILURE extends TopLevel[JOINFAILURE with Double]
  
  @js.native
  sealed trait LOOKUPFAILED extends VMVerificationErrorKind
  /* 17 */ @js.native
  object LOOKUPFAILED extends TopLevel[LOOKUPFAILED with Double]
  
  @js.native
  sealed trait MISSINGDEPENDENCY extends VMVerificationErrorKind
  /* 21 */ @js.native
  object MISSINGDEPENDENCY extends TopLevel[MISSINGDEPENDENCY with Double]
  
  @js.native
  sealed trait MODULEADDRESSDOESNOTMATCHSENDER extends VMVerificationErrorKind
  /* 66 */ @js.native
  object MODULEADDRESSDOESNOTMATCHSENDER extends TopLevel[MODULEADDRESSDOESNOTMATCHSENDER with Double]
  
  @js.native
  sealed trait MOVEFROMNORESOURCEERROR extends VMVerificationErrorKind
  /* 62 */ @js.native
  object MOVEFROMNORESOURCEERROR extends TopLevel[MOVEFROMNORESOURCEERROR with Double]
  
  @js.native
  sealed trait MOVEFROMTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 61 */ @js.native
  object MOVEFROMTYPEMISMATCHERROR extends TopLevel[MOVEFROMTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait MOVELOCEXISTSBORROWERROR extends VMVerificationErrorKind
  /* 40 */ @js.native
  object MOVELOCEXISTSBORROWERROR extends TopLevel[MOVELOCEXISTSBORROWERROR with Double]
  
  @js.native
  sealed trait MOVELOCUNAVAILABLEERROR extends VMVerificationErrorKind
  /* 39 */ @js.native
  object MOVELOCUNAVAILABLEERROR extends TopLevel[MOVELOCUNAVAILABLEERROR with Double]
  
  @js.native
  sealed trait MOVETOSENDERNORESOURCEERROR extends VMVerificationErrorKind
  /* 64 */ @js.native
  object MOVETOSENDERNORESOURCEERROR extends TopLevel[MOVETOSENDERNORESOURCEERROR with Double]
  
  @js.native
  sealed trait MOVETOSENDERTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 63 */ @js.native
  object MOVETOSENDERTYPEMISMATCHERROR extends TopLevel[MOVETOSENDERTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait NEGATIVESTACKSIZEWITHINBLOCK extends VMVerificationErrorKind
  /* 9 */ @js.native
  object NEGATIVESTACKSIZEWITHINBLOCK extends TopLevel[NEGATIVESTACKSIZEWITHINBLOCK with Double]
  
  @js.native
  sealed trait NOMODULEHANDLES extends VMVerificationErrorKind
  /* 67 */ @js.native
  object NOMODULEHANDLES extends TopLevel[NOMODULEHANDLES with Double]
  
  @js.native
  sealed trait PACKTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 46 */ @js.native
  object PACKTYPEMISMATCHERROR extends TopLevel[PACKTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait POPREFERENCEERROR extends VMVerificationErrorKind
  /* 22 */ @js.native
  object POPREFERENCEERROR extends TopLevel[POPREFERENCEERROR with Double]
  
  @js.native
  sealed trait POPRESOURCEERROR extends VMVerificationErrorKind
  /* 23 */ @js.native
  object POPRESOURCEERROR extends TopLevel[POPRESOURCEERROR with Double]
  
  @js.native
  sealed trait RANGEOUTOFBOUNDS extends VMVerificationErrorKind
  /* 2 */ @js.native
  object RANGEOUTOFBOUNDS extends TopLevel[RANGEOUTOFBOUNDS with Double]
  
  @js.native
  sealed trait READREFEXISTSMUTABLEBORROWERROR extends VMVerificationErrorKind
  /* 50 */ @js.native
  object READREFEXISTSMUTABLEBORROWERROR extends TopLevel[READREFEXISTSMUTABLEBORROWERROR with Double]
  
  @js.native
  sealed trait READREFRESOURCEERROR extends VMVerificationErrorKind
  /* 49 */ @js.native
  object READREFRESOURCEERROR extends TopLevel[READREFRESOURCEERROR with Double]
  
  @js.native
  sealed trait READREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 48 */ @js.native
  object READREFTYPEMISMATCHERROR extends TopLevel[READREFTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait RECURSIVESTRUCTDEFINITION extends VMVerificationErrorKind
  /* 5 */ @js.native
  object RECURSIVESTRUCTDEFINITION extends TopLevel[RECURSIVESTRUCTDEFINITION with Double]
  
  @js.native
  sealed trait RELEASEREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 24 */ @js.native
  object RELEASEREFTYPEMISMATCHERROR extends TopLevel[RELEASEREFTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait RETTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 30 */ @js.native
  object RETTYPEMISMATCHERROR extends TopLevel[RETTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait RETUNSAFETODESTROYERROR extends VMVerificationErrorKind
  /* 29 */ @js.native
  object RETUNSAFETODESTROYERROR extends TopLevel[RETUNSAFETODESTROYERROR with Double]
  
  @js.native
  sealed trait STLOCTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 27 */ @js.native
  object STLOCTYPEMISMATCHERROR extends TopLevel[STLOCTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait STLOCUNSAFETODESTROYERROR extends VMVerificationErrorKind
  /* 28 */ @js.native
  object STLOCUNSAFETODESTROYERROR extends TopLevel[STLOCUNSAFETODESTROYERROR with Double]
  
  @js.native
  sealed trait TYPEMISMATCH extends VMVerificationErrorKind
  /* 20 */ @js.native
  object TYPEMISMATCH extends TopLevel[TYPEMISMATCH with Double]
  
  @js.native
  sealed trait TYPERESOLUTIONFAILURE extends VMVerificationErrorKind
  /* 19 */ @js.native
  object TYPERESOLUTIONFAILURE extends TopLevel[TYPERESOLUTIONFAILURE with Double]
  
  @js.native
  sealed trait UNBALANCEDSTACK extends VMVerificationErrorKind
  /* 10 */ @js.native
  object UNBALANCEDSTACK extends TopLevel[UNBALANCEDSTACK with Double]
  
  @js.native
  sealed trait UNIMPLEMENTEDHANDLE extends VMVerificationErrorKind
  /* 14 */ @js.native
  object UNIMPLEMENTEDHANDLE extends TopLevel[UNIMPLEMENTEDHANDLE with Double]
  
  @js.native
  sealed trait UNKNOWNVERIFICATIONERROR extends VMVerificationErrorKind
  /* 0 */ @js.native
  object UNKNOWNVERIFICATIONERROR extends TopLevel[UNKNOWNVERIFICATIONERROR with Double]
  
  @js.native
  sealed trait UNPACKTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 47 */ @js.native
  object UNPACKTYPEMISMATCHERROR extends TopLevel[UNPACKTYPEMISMATCHERROR with Double]
  
  @js.native
  sealed trait UNUSEDFIELDS extends VMVerificationErrorKind
  /* 16 */ @js.native
  object UNUSEDFIELDS extends TopLevel[UNUSEDFIELDS with Double]
  
  @js.native
  sealed trait VISIBILITYMISMATCH extends VMVerificationErrorKind
  /* 18 */ @js.native
  object VISIBILITYMISMATCH extends TopLevel[VISIBILITYMISMATCH with Double]
  
  @js.native
  sealed trait WRITEREFEXISTSBORROWERROR extends VMVerificationErrorKind
  /* 53 */ @js.native
  object WRITEREFEXISTSBORROWERROR extends TopLevel[WRITEREFEXISTSBORROWERROR with Double]
  
  @js.native
  sealed trait WRITEREFNOMUTABLEREFERENCEERROR extends VMVerificationErrorKind
  /* 54 */ @js.native
  object WRITEREFNOMUTABLEREFERENCEERROR extends TopLevel[WRITEREFNOMUTABLEREFERENCEERROR with Double]
  
  @js.native
  sealed trait WRITEREFRESOURCEERROR extends VMVerificationErrorKind
  /* 52 */ @js.native
  object WRITEREFRESOURCEERROR extends TopLevel[WRITEREFRESOURCEERROR with Double]
  
  @js.native
  sealed trait WRITEREFTYPEMISMATCHERROR extends VMVerificationErrorKind
  /* 51 */ @js.native
  object WRITEREFTYPEMISMATCHERROR extends TopLevel[WRITEREFTYPEMISMATCHERROR with Double]
}
