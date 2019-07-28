package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraVerificationError extends js.Object

@JSImport("libra-core", "LibraVerificationError")
@js.native
object LibraVerificationError extends js.Object {
  @js.native
  sealed trait ASSERTTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait BOOLEANOPTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait BORROWFIELDBADFIELDERROR extends LibraVerificationError
  
  @js.native
  sealed trait BORROWFIELDEXISTSMUTABLEBORROWERROR extends LibraVerificationError
  
  @js.native
  sealed trait BORROWFIELDTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait BORROWGLOBALNORESOURCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait BORROWGLOBALTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait BORROWLOCEXISTSBORROWERROR extends LibraVerificationError
  
  @js.native
  sealed trait BORROWLOCREFERENCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait BORROWLOCUNAVAILABLEERROR extends LibraVerificationError
  
  @js.native
  sealed trait BRTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait CALLBORROWEDMUTABLEREFERENCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait CALLTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait COPYLOCEXISTSBORROWERROR extends LibraVerificationError
  
  @js.native
  sealed trait COPYLOCRESOURCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait COPYLOCUNAVAILABLEERROR extends LibraVerificationError
  
  @js.native
  sealed trait CREATEACCOUNTTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait DUPLICATEELEMENT extends LibraVerificationError
  
  @js.native
  sealed trait EQUALITYOPTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait EXISTSRESOURCETYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait FREEZEREFEXISTSMUTABLEBORROWERROR extends LibraVerificationError
  
  @js.native
  sealed trait FREEZEREFTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait INCONSISTENTFIELDS extends LibraVerificationError
  
  @js.native
  sealed trait INDEXOUTOFBOUNDS extends LibraVerificationError
  
  @js.native
  sealed trait INTEGEROPTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait INVALIDFALLTHROUGH extends LibraVerificationError
  
  @js.native
  sealed trait INVALIDFIELDDEFREFERENCE extends LibraVerificationError
  
  @js.native
  sealed trait INVALIDMAINFUNCTIONSIGNATURE extends LibraVerificationError
  
  @js.native
  sealed trait INVALIDMODULEHANDLE extends LibraVerificationError
  
  @js.native
  sealed trait INVALIDRESOURCEFIELD extends LibraVerificationError
  
  @js.native
  sealed trait INVALIDSIGNATURETOKEN extends LibraVerificationError
  
  @js.native
  sealed trait JOINFAILURE extends LibraVerificationError
  
  @js.native
  sealed trait LOOKUPFAILED extends LibraVerificationError
  
  @js.native
  sealed trait MISSINGDEPENDENCY extends LibraVerificationError
  
  @js.native
  sealed trait MODULEADDRESSDOESNOTMATCHSENDER extends LibraVerificationError
  
  @js.native
  sealed trait MOVEFROMNORESOURCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait MOVEFROMTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait MOVELOCEXISTSBORROWERROR extends LibraVerificationError
  
  @js.native
  sealed trait MOVELOCUNAVAILABLEERROR extends LibraVerificationError
  
  @js.native
  sealed trait MOVETOSENDERNORESOURCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait MOVETOSENDERTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait NEGATIVESTACKSIZEWITHINBLOCK extends LibraVerificationError
  
  @js.native
  sealed trait NOMODULEHANDLES extends LibraVerificationError
  
  @js.native
  sealed trait PACKTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait POPREFERENCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait POPRESOURCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait RANGEOUTOFBOUNDS extends LibraVerificationError
  
  @js.native
  sealed trait READREFEXISTSMUTABLEBORROWERROR extends LibraVerificationError
  
  @js.native
  sealed trait READREFRESOURCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait READREFTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait RECURSIVESTRUCTDEFINITION extends LibraVerificationError
  
  @js.native
  sealed trait RELEASEREFTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait RETTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait RETUNSAFETODESTROYERROR extends LibraVerificationError
  
  @js.native
  sealed trait STLOCTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait STLOCUNSAFETODESTROYERROR extends LibraVerificationError
  
  @js.native
  sealed trait TYPEMISMATCH extends LibraVerificationError
  
  @js.native
  sealed trait TYPERESOLUTIONFAILURE extends LibraVerificationError
  
  @js.native
  sealed trait UNBALANCEDSTACK extends LibraVerificationError
  
  @js.native
  sealed trait UNIMPLEMENTEDHANDLE extends LibraVerificationError
  
  @js.native
  sealed trait UNKNOWNVERIFICATIONERROR extends LibraVerificationError
  
  @js.native
  sealed trait UNPACKTYPEMISMATCHERROR extends LibraVerificationError
  
  @js.native
  sealed trait UNUSEDFIELDS extends LibraVerificationError
  
  @js.native
  sealed trait VISIBILITYMISMATCH extends LibraVerificationError
  
  @js.native
  sealed trait WRITEREFEXISTSBORROWERROR extends LibraVerificationError
  
  @js.native
  sealed trait WRITEREFNOMUTABLEREFERENCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait WRITEREFRESOURCEERROR extends LibraVerificationError
  
  @js.native
  sealed trait WRITEREFTYPEMISMATCHERROR extends LibraVerificationError
  
  /* 26 */ val ASSERTTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.ASSERTTYPEMISMATCHERROR with Double = js.native
  /* 56 */ val BOOLEANOPTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BOOLEANOPTYPEMISMATCHERROR with Double = js.native
  /* 34 */ val BORROWFIELDBADFIELDERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BORROWFIELDBADFIELDERROR with Double = js.native
  /* 35 */ val BORROWFIELDEXISTSMUTABLEBORROWERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BORROWFIELDEXISTSMUTABLEBORROWERROR with Double = js.native
  /* 33 */ val BORROWFIELDTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BORROWFIELDTYPEMISMATCHERROR with Double = js.native
  /* 60 */ val BORROWGLOBALNORESOURCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BORROWGLOBALNORESOURCEERROR with Double = js.native
  /* 59 */ val BORROWGLOBALTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BORROWGLOBALTYPEMISMATCHERROR with Double = js.native
  /* 43 */ val BORROWLOCEXISTSBORROWERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BORROWLOCEXISTSBORROWERROR with Double = js.native
  /* 41 */ val BORROWLOCREFERENCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BORROWLOCREFERENCEERROR with Double = js.native
  /* 42 */ val BORROWLOCUNAVAILABLEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BORROWLOCUNAVAILABLEERROR with Double = js.native
  /* 25 */ val BRTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.BRTYPEMISMATCHERROR with Double = js.native
  /* 45 */ val CALLBORROWEDMUTABLEREFERENCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.CALLBORROWEDMUTABLEREFERENCEERROR with Double = js.native
  /* 44 */ val CALLTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.CALLTYPEMISMATCHERROR with Double = js.native
  /* 38 */ val COPYLOCEXISTSBORROWERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.COPYLOCEXISTSBORROWERROR with Double = js.native
  /* 37 */ val COPYLOCRESOURCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.COPYLOCRESOURCEERROR with Double = js.native
  /* 36 */ val COPYLOCUNAVAILABLEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.COPYLOCUNAVAILABLEERROR with Double = js.native
  /* 65 */ val CREATEACCOUNTTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.CREATEACCOUNTTYPEMISMATCHERROR with Double = js.native
  /* 12 */ val DUPLICATEELEMENT: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.DUPLICATEELEMENT with Double = js.native
  /* 57 */ val EQUALITYOPTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.EQUALITYOPTYPEMISMATCHERROR with Double = js.native
  /* 58 */ val EXISTSRESOURCETYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.EXISTSRESOURCETYPEMISMATCHERROR with Double = js.native
  /* 32 */ val FREEZEREFEXISTSMUTABLEBORROWERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.FREEZEREFEXISTSMUTABLEBORROWERROR with Double = js.native
  /* 31 */ val FREEZEREFTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.FREEZEREFTYPEMISMATCHERROR with Double = js.native
  /* 15 */ val INCONSISTENTFIELDS: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.INCONSISTENTFIELDS with Double = js.native
  /* 1 */ val INDEXOUTOFBOUNDS: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.INDEXOUTOFBOUNDS with Double = js.native
  /* 55 */ val INTEGEROPTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.INTEGEROPTYPEMISMATCHERROR with Double = js.native
  /* 7 */ val INVALIDFALLTHROUGH: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.INVALIDFALLTHROUGH with Double = js.native
  /* 4 */ val INVALIDFIELDDEFREFERENCE: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.INVALIDFIELDDEFREFERENCE with Double = js.native
  /* 11 */ val INVALIDMAINFUNCTIONSIGNATURE: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.INVALIDMAINFUNCTIONSIGNATURE with Double = js.native
  /* 13 */ val INVALIDMODULEHANDLE: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.INVALIDMODULEHANDLE with Double = js.native
  /* 6 */ val INVALIDRESOURCEFIELD: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.INVALIDRESOURCEFIELD with Double = js.native
  /* 3 */ val INVALIDSIGNATURETOKEN: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.INVALIDSIGNATURETOKEN with Double = js.native
  /* 8 */ val JOINFAILURE: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.JOINFAILURE with Double = js.native
  /* 17 */ val LOOKUPFAILED: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.LOOKUPFAILED with Double = js.native
  /* 21 */ val MISSINGDEPENDENCY: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.MISSINGDEPENDENCY with Double = js.native
  /* 66 */ val MODULEADDRESSDOESNOTMATCHSENDER: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.MODULEADDRESSDOESNOTMATCHSENDER with Double = js.native
  /* 62 */ val MOVEFROMNORESOURCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.MOVEFROMNORESOURCEERROR with Double = js.native
  /* 61 */ val MOVEFROMTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.MOVEFROMTYPEMISMATCHERROR with Double = js.native
  /* 40 */ val MOVELOCEXISTSBORROWERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.MOVELOCEXISTSBORROWERROR with Double = js.native
  /* 39 */ val MOVELOCUNAVAILABLEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.MOVELOCUNAVAILABLEERROR with Double = js.native
  /* 64 */ val MOVETOSENDERNORESOURCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.MOVETOSENDERNORESOURCEERROR with Double = js.native
  /* 63 */ val MOVETOSENDERTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.MOVETOSENDERTYPEMISMATCHERROR with Double = js.native
  /* 9 */ val NEGATIVESTACKSIZEWITHINBLOCK: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.NEGATIVESTACKSIZEWITHINBLOCK with Double = js.native
  /* 67 */ val NOMODULEHANDLES: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.NOMODULEHANDLES with Double = js.native
  /* 46 */ val PACKTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.PACKTYPEMISMATCHERROR with Double = js.native
  /* 22 */ val POPREFERENCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.POPREFERENCEERROR with Double = js.native
  /* 23 */ val POPRESOURCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.POPRESOURCEERROR with Double = js.native
  /* 2 */ val RANGEOUTOFBOUNDS: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.RANGEOUTOFBOUNDS with Double = js.native
  /* 50 */ val READREFEXISTSMUTABLEBORROWERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.READREFEXISTSMUTABLEBORROWERROR with Double = js.native
  /* 49 */ val READREFRESOURCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.READREFRESOURCEERROR with Double = js.native
  /* 48 */ val READREFTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.READREFTYPEMISMATCHERROR with Double = js.native
  /* 5 */ val RECURSIVESTRUCTDEFINITION: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.RECURSIVESTRUCTDEFINITION with Double = js.native
  /* 24 */ val RELEASEREFTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.RELEASEREFTYPEMISMATCHERROR with Double = js.native
  /* 30 */ val RETTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.RETTYPEMISMATCHERROR with Double = js.native
  /* 29 */ val RETUNSAFETODESTROYERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.RETUNSAFETODESTROYERROR with Double = js.native
  /* 27 */ val STLOCTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.STLOCTYPEMISMATCHERROR with Double = js.native
  /* 28 */ val STLOCUNSAFETODESTROYERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.STLOCUNSAFETODESTROYERROR with Double = js.native
  /* 20 */ val TYPEMISMATCH: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.TYPEMISMATCH with Double = js.native
  /* 19 */ val TYPERESOLUTIONFAILURE: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.TYPERESOLUTIONFAILURE with Double = js.native
  /* 10 */ val UNBALANCEDSTACK: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.UNBALANCEDSTACK with Double = js.native
  /* 14 */ val UNIMPLEMENTEDHANDLE: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.UNIMPLEMENTEDHANDLE with Double = js.native
  /* 0 */ val UNKNOWNVERIFICATIONERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.UNKNOWNVERIFICATIONERROR with Double = js.native
  /* 47 */ val UNPACKTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.UNPACKTYPEMISMATCHERROR with Double = js.native
  /* 16 */ val UNUSEDFIELDS: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.UNUSEDFIELDS with Double = js.native
  /* 18 */ val VISIBILITYMISMATCH: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.VISIBILITYMISMATCH with Double = js.native
  /* 53 */ val WRITEREFEXISTSBORROWERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.WRITEREFEXISTSBORROWERROR with Double = js.native
  /* 54 */ val WRITEREFNOMUTABLEREFERENCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.WRITEREFNOMUTABLEREFERENCEERROR with Double = js.native
  /* 52 */ val WRITEREFRESOURCEERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.WRITEREFRESOURCEERROR with Double = js.native
  /* 51 */ val WRITEREFTYPEMISMATCHERROR: typings.libraDashCore.libraDashCoreMod.LibraVerificationError.WRITEREFTYPEMISMATCHERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraVerificationError with Double] = js.native
}

