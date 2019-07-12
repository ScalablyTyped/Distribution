package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraVerificationError extends js.Object

@JSImport("libra-core", "LibraVerificationError")
@js.native
object LibraVerificationError extends js.Object {
  @js.native
  sealed trait ASSERTTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BOOLEANOPTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BORROWFIELDBADFIELDERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BORROWFIELDEXISTSMUTABLEBORROWERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BORROWFIELDTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BORROWGLOBALNORESOURCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BORROWGLOBALTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BORROWLOCEXISTSBORROWERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BORROWLOCREFERENCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BORROWLOCUNAVAILABLEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait BRTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait CALLBORROWEDMUTABLEREFERENCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait CALLTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait COPYLOCEXISTSBORROWERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait COPYLOCRESOURCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait COPYLOCUNAVAILABLEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait CREATEACCOUNTTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait DUPLICATEELEMENT
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait EQUALITYOPTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait EXISTSRESOURCETYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait FREEZEREFEXISTSMUTABLEBORROWERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait FREEZEREFTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait INCONSISTENTFIELDS
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait INDEXOUTOFBOUNDS
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait INTEGEROPTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait INVALIDFALLTHROUGH
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait INVALIDFIELDDEFREFERENCE
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait INVALIDMAINFUNCTIONSIGNATURE
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait INVALIDMODULEHANDLE
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait INVALIDRESOURCEFIELD
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait INVALIDSIGNATURETOKEN
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait JOINFAILURE
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait LOOKUPFAILED
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait MISSINGDEPENDENCY
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait MODULEADDRESSDOESNOTMATCHSENDER
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait MOVEFROMNORESOURCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait MOVEFROMTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait MOVELOCEXISTSBORROWERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait MOVELOCUNAVAILABLEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait MOVETOSENDERNORESOURCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait MOVETOSENDERTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait NEGATIVESTACKSIZEWITHINBLOCK
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait NOMODULEHANDLES
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait PACKTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait POPREFERENCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait POPRESOURCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait RANGEOUTOFBOUNDS
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait READREFEXISTSMUTABLEBORROWERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait READREFRESOURCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait READREFTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait RECURSIVESTRUCTDEFINITION
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait RELEASEREFTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait RETTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait RETUNSAFETODESTROYERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait STLOCTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait STLOCUNSAFETODESTROYERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait TYPEMISMATCH
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait TYPERESOLUTIONFAILURE
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait UNBALANCEDSTACK
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait UNIMPLEMENTEDHANDLE
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait UNKNOWNVERIFICATIONERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait UNPACKTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait UNUSEDFIELDS
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait VISIBILITYMISMATCH
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait WRITEREFEXISTSBORROWERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait WRITEREFNOMUTABLEREFERENCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait WRITEREFRESOURCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  @js.native
  sealed trait WRITEREFTYPEMISMATCHERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationError
  
  /* 26 */ val ASSERTTYPEMISMATCHERROR: ASSERTTYPEMISMATCHERROR with scala.Double = js.native
  /* 56 */ val BOOLEANOPTYPEMISMATCHERROR: BOOLEANOPTYPEMISMATCHERROR with scala.Double = js.native
  /* 34 */ val BORROWFIELDBADFIELDERROR: BORROWFIELDBADFIELDERROR with scala.Double = js.native
  /* 35 */ val BORROWFIELDEXISTSMUTABLEBORROWERROR: BORROWFIELDEXISTSMUTABLEBORROWERROR with scala.Double = js.native
  /* 33 */ val BORROWFIELDTYPEMISMATCHERROR: BORROWFIELDTYPEMISMATCHERROR with scala.Double = js.native
  /* 60 */ val BORROWGLOBALNORESOURCEERROR: BORROWGLOBALNORESOURCEERROR with scala.Double = js.native
  /* 59 */ val BORROWGLOBALTYPEMISMATCHERROR: BORROWGLOBALTYPEMISMATCHERROR with scala.Double = js.native
  /* 43 */ val BORROWLOCEXISTSBORROWERROR: BORROWLOCEXISTSBORROWERROR with scala.Double = js.native
  /* 41 */ val BORROWLOCREFERENCEERROR: BORROWLOCREFERENCEERROR with scala.Double = js.native
  /* 42 */ val BORROWLOCUNAVAILABLEERROR: BORROWLOCUNAVAILABLEERROR with scala.Double = js.native
  /* 25 */ val BRTYPEMISMATCHERROR: BRTYPEMISMATCHERROR with scala.Double = js.native
  /* 45 */ val CALLBORROWEDMUTABLEREFERENCEERROR: CALLBORROWEDMUTABLEREFERENCEERROR with scala.Double = js.native
  /* 44 */ val CALLTYPEMISMATCHERROR: CALLTYPEMISMATCHERROR with scala.Double = js.native
  /* 38 */ val COPYLOCEXISTSBORROWERROR: COPYLOCEXISTSBORROWERROR with scala.Double = js.native
  /* 37 */ val COPYLOCRESOURCEERROR: COPYLOCRESOURCEERROR with scala.Double = js.native
  /* 36 */ val COPYLOCUNAVAILABLEERROR: COPYLOCUNAVAILABLEERROR with scala.Double = js.native
  /* 65 */ val CREATEACCOUNTTYPEMISMATCHERROR: CREATEACCOUNTTYPEMISMATCHERROR with scala.Double = js.native
  /* 12 */ val DUPLICATEELEMENT: DUPLICATEELEMENT with scala.Double = js.native
  /* 57 */ val EQUALITYOPTYPEMISMATCHERROR: EQUALITYOPTYPEMISMATCHERROR with scala.Double = js.native
  /* 58 */ val EXISTSRESOURCETYPEMISMATCHERROR: EXISTSRESOURCETYPEMISMATCHERROR with scala.Double = js.native
  /* 32 */ val FREEZEREFEXISTSMUTABLEBORROWERROR: FREEZEREFEXISTSMUTABLEBORROWERROR with scala.Double = js.native
  /* 31 */ val FREEZEREFTYPEMISMATCHERROR: FREEZEREFTYPEMISMATCHERROR with scala.Double = js.native
  /* 15 */ val INCONSISTENTFIELDS: INCONSISTENTFIELDS with scala.Double = js.native
  /* 1 */ val INDEXOUTOFBOUNDS: INDEXOUTOFBOUNDS with scala.Double = js.native
  /* 55 */ val INTEGEROPTYPEMISMATCHERROR: INTEGEROPTYPEMISMATCHERROR with scala.Double = js.native
  /* 7 */ val INVALIDFALLTHROUGH: INVALIDFALLTHROUGH with scala.Double = js.native
  /* 4 */ val INVALIDFIELDDEFREFERENCE: INVALIDFIELDDEFREFERENCE with scala.Double = js.native
  /* 11 */ val INVALIDMAINFUNCTIONSIGNATURE: INVALIDMAINFUNCTIONSIGNATURE with scala.Double = js.native
  /* 13 */ val INVALIDMODULEHANDLE: INVALIDMODULEHANDLE with scala.Double = js.native
  /* 6 */ val INVALIDRESOURCEFIELD: INVALIDRESOURCEFIELD with scala.Double = js.native
  /* 3 */ val INVALIDSIGNATURETOKEN: INVALIDSIGNATURETOKEN with scala.Double = js.native
  /* 8 */ val JOINFAILURE: JOINFAILURE with scala.Double = js.native
  /* 17 */ val LOOKUPFAILED: LOOKUPFAILED with scala.Double = js.native
  /* 21 */ val MISSINGDEPENDENCY: MISSINGDEPENDENCY with scala.Double = js.native
  /* 66 */ val MODULEADDRESSDOESNOTMATCHSENDER: MODULEADDRESSDOESNOTMATCHSENDER with scala.Double = js.native
  /* 62 */ val MOVEFROMNORESOURCEERROR: MOVEFROMNORESOURCEERROR with scala.Double = js.native
  /* 61 */ val MOVEFROMTYPEMISMATCHERROR: MOVEFROMTYPEMISMATCHERROR with scala.Double = js.native
  /* 40 */ val MOVELOCEXISTSBORROWERROR: MOVELOCEXISTSBORROWERROR with scala.Double = js.native
  /* 39 */ val MOVELOCUNAVAILABLEERROR: MOVELOCUNAVAILABLEERROR with scala.Double = js.native
  /* 64 */ val MOVETOSENDERNORESOURCEERROR: MOVETOSENDERNORESOURCEERROR with scala.Double = js.native
  /* 63 */ val MOVETOSENDERTYPEMISMATCHERROR: MOVETOSENDERTYPEMISMATCHERROR with scala.Double = js.native
  /* 9 */ val NEGATIVESTACKSIZEWITHINBLOCK: NEGATIVESTACKSIZEWITHINBLOCK with scala.Double = js.native
  /* 67 */ val NOMODULEHANDLES: NOMODULEHANDLES with scala.Double = js.native
  /* 46 */ val PACKTYPEMISMATCHERROR: PACKTYPEMISMATCHERROR with scala.Double = js.native
  /* 22 */ val POPREFERENCEERROR: POPREFERENCEERROR with scala.Double = js.native
  /* 23 */ val POPRESOURCEERROR: POPRESOURCEERROR with scala.Double = js.native
  /* 2 */ val RANGEOUTOFBOUNDS: RANGEOUTOFBOUNDS with scala.Double = js.native
  /* 50 */ val READREFEXISTSMUTABLEBORROWERROR: READREFEXISTSMUTABLEBORROWERROR with scala.Double = js.native
  /* 49 */ val READREFRESOURCEERROR: READREFRESOURCEERROR with scala.Double = js.native
  /* 48 */ val READREFTYPEMISMATCHERROR: READREFTYPEMISMATCHERROR with scala.Double = js.native
  /* 5 */ val RECURSIVESTRUCTDEFINITION: RECURSIVESTRUCTDEFINITION with scala.Double = js.native
  /* 24 */ val RELEASEREFTYPEMISMATCHERROR: RELEASEREFTYPEMISMATCHERROR with scala.Double = js.native
  /* 30 */ val RETTYPEMISMATCHERROR: RETTYPEMISMATCHERROR with scala.Double = js.native
  /* 29 */ val RETUNSAFETODESTROYERROR: RETUNSAFETODESTROYERROR with scala.Double = js.native
  /* 27 */ val STLOCTYPEMISMATCHERROR: STLOCTYPEMISMATCHERROR with scala.Double = js.native
  /* 28 */ val STLOCUNSAFETODESTROYERROR: STLOCUNSAFETODESTROYERROR with scala.Double = js.native
  /* 20 */ val TYPEMISMATCH: TYPEMISMATCH with scala.Double = js.native
  /* 19 */ val TYPERESOLUTIONFAILURE: TYPERESOLUTIONFAILURE with scala.Double = js.native
  /* 10 */ val UNBALANCEDSTACK: UNBALANCEDSTACK with scala.Double = js.native
  /* 14 */ val UNIMPLEMENTEDHANDLE: UNIMPLEMENTEDHANDLE with scala.Double = js.native
  /* 0 */ val UNKNOWNVERIFICATIONERROR: UNKNOWNVERIFICATIONERROR with scala.Double = js.native
  /* 47 */ val UNPACKTYPEMISMATCHERROR: UNPACKTYPEMISMATCHERROR with scala.Double = js.native
  /* 16 */ val UNUSEDFIELDS: UNUSEDFIELDS with scala.Double = js.native
  /* 18 */ val VISIBILITYMISMATCH: VISIBILITYMISMATCH with scala.Double = js.native
  /* 53 */ val WRITEREFEXISTSBORROWERROR: WRITEREFEXISTSBORROWERROR with scala.Double = js.native
  /* 54 */ val WRITEREFNOMUTABLEREFERENCEERROR: WRITEREFNOMUTABLEREFERENCEERROR with scala.Double = js.native
  /* 52 */ val WRITEREFRESOURCEERROR: WRITEREFRESOURCEERROR with scala.Double = js.native
  /* 51 */ val WRITEREFTYPEMISMATCHERROR: WRITEREFTYPEMISMATCHERROR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraVerificationError with scala.Double] = js.native
}

