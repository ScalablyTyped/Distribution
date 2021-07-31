package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMVerificationErrorKind extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationErrorKind")
@js.native
object VMVerificationErrorKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMVerificationErrorKind & Double] = js.native
  
  @js.native
  sealed trait ASSERTTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 26 */ val ASSERTTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.ASSERTTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait BOOLEANOPTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 56 */ val BOOLEANOPTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BOOLEANOPTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait BORROWFIELDBADFIELDERROR
    extends StObject
       with VMVerificationErrorKind
  /* 34 */ val BORROWFIELDBADFIELDERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWFIELDBADFIELDERROR & Double = js.native
  
  @js.native
  sealed trait BORROWFIELDEXISTSMUTABLEBORROWERROR
    extends StObject
       with VMVerificationErrorKind
  /* 35 */ val BORROWFIELDEXISTSMUTABLEBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWFIELDEXISTSMUTABLEBORROWERROR & Double = js.native
  
  @js.native
  sealed trait BORROWFIELDTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 33 */ val BORROWFIELDTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWFIELDTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait BORROWGLOBALNORESOURCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 60 */ val BORROWGLOBALNORESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWGLOBALNORESOURCEERROR & Double = js.native
  
  @js.native
  sealed trait BORROWGLOBALTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 59 */ val BORROWGLOBALTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWGLOBALTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait BORROWLOCEXISTSBORROWERROR
    extends StObject
       with VMVerificationErrorKind
  /* 43 */ val BORROWLOCEXISTSBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWLOCEXISTSBORROWERROR & Double = js.native
  
  @js.native
  sealed trait BORROWLOCREFERENCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 41 */ val BORROWLOCREFERENCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWLOCREFERENCEERROR & Double = js.native
  
  @js.native
  sealed trait BORROWLOCUNAVAILABLEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 42 */ val BORROWLOCUNAVAILABLEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BORROWLOCUNAVAILABLEERROR & Double = js.native
  
  @js.native
  sealed trait BRTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 25 */ val BRTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.BRTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait CALLBORROWEDMUTABLEREFERENCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 45 */ val CALLBORROWEDMUTABLEREFERENCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.CALLBORROWEDMUTABLEREFERENCEERROR & Double = js.native
  
  @js.native
  sealed trait CALLTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 44 */ val CALLTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.CALLTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait COPYLOCEXISTSBORROWERROR
    extends StObject
       with VMVerificationErrorKind
  /* 38 */ val COPYLOCEXISTSBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.COPYLOCEXISTSBORROWERROR & Double = js.native
  
  @js.native
  sealed trait COPYLOCRESOURCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 37 */ val COPYLOCRESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.COPYLOCRESOURCEERROR & Double = js.native
  
  @js.native
  sealed trait COPYLOCUNAVAILABLEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 36 */ val COPYLOCUNAVAILABLEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.COPYLOCUNAVAILABLEERROR & Double = js.native
  
  @js.native
  sealed trait CREATEACCOUNTTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 65 */ val CREATEACCOUNTTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.CREATEACCOUNTTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait DUPLICATEELEMENT
    extends StObject
       with VMVerificationErrorKind
  /* 12 */ val DUPLICATEELEMENT: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.DUPLICATEELEMENT & Double = js.native
  
  @js.native
  sealed trait EQUALITYOPTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 57 */ val EQUALITYOPTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.EQUALITYOPTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait EXISTSRESOURCETYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 58 */ val EXISTSRESOURCETYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.EXISTSRESOURCETYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait FREEZEREFEXISTSMUTABLEBORROWERROR
    extends StObject
       with VMVerificationErrorKind
  /* 32 */ val FREEZEREFEXISTSMUTABLEBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.FREEZEREFEXISTSMUTABLEBORROWERROR & Double = js.native
  
  @js.native
  sealed trait FREEZEREFTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 31 */ val FREEZEREFTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.FREEZEREFTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait INCONSISTENTFIELDS
    extends StObject
       with VMVerificationErrorKind
  /* 15 */ val INCONSISTENTFIELDS: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INCONSISTENTFIELDS & Double = js.native
  
  @js.native
  sealed trait INDEXOUTOFBOUNDS
    extends StObject
       with VMVerificationErrorKind
  /* 1 */ val INDEXOUTOFBOUNDS: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INDEXOUTOFBOUNDS & Double = js.native
  
  @js.native
  sealed trait INTEGEROPTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 55 */ val INTEGEROPTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INTEGEROPTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait INVALIDFALLTHROUGH
    extends StObject
       with VMVerificationErrorKind
  /* 7 */ val INVALIDFALLTHROUGH: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDFALLTHROUGH & Double = js.native
  
  @js.native
  sealed trait INVALIDFIELDDEFREFERENCE
    extends StObject
       with VMVerificationErrorKind
  /* 4 */ val INVALIDFIELDDEFREFERENCE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDFIELDDEFREFERENCE & Double = js.native
  
  @js.native
  sealed trait INVALIDMAINFUNCTIONSIGNATURE
    extends StObject
       with VMVerificationErrorKind
  /* 11 */ val INVALIDMAINFUNCTIONSIGNATURE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDMAINFUNCTIONSIGNATURE & Double = js.native
  
  @js.native
  sealed trait INVALIDMODULEHANDLE
    extends StObject
       with VMVerificationErrorKind
  /* 13 */ val INVALIDMODULEHANDLE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDMODULEHANDLE & Double = js.native
  
  @js.native
  sealed trait INVALIDRESOURCEFIELD
    extends StObject
       with VMVerificationErrorKind
  /* 6 */ val INVALIDRESOURCEFIELD: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDRESOURCEFIELD & Double = js.native
  
  @js.native
  sealed trait INVALIDSIGNATURETOKEN
    extends StObject
       with VMVerificationErrorKind
  /* 3 */ val INVALIDSIGNATURETOKEN: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.INVALIDSIGNATURETOKEN & Double = js.native
  
  @js.native
  sealed trait JOINFAILURE
    extends StObject
       with VMVerificationErrorKind
  /* 8 */ val JOINFAILURE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.JOINFAILURE & Double = js.native
  
  @js.native
  sealed trait LOOKUPFAILED
    extends StObject
       with VMVerificationErrorKind
  /* 17 */ val LOOKUPFAILED: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.LOOKUPFAILED & Double = js.native
  
  @js.native
  sealed trait MISSINGDEPENDENCY
    extends StObject
       with VMVerificationErrorKind
  /* 21 */ val MISSINGDEPENDENCY: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MISSINGDEPENDENCY & Double = js.native
  
  @js.native
  sealed trait MODULEADDRESSDOESNOTMATCHSENDER
    extends StObject
       with VMVerificationErrorKind
  /* 66 */ val MODULEADDRESSDOESNOTMATCHSENDER: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MODULEADDRESSDOESNOTMATCHSENDER & Double = js.native
  
  @js.native
  sealed trait MOVEFROMNORESOURCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 62 */ val MOVEFROMNORESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVEFROMNORESOURCEERROR & Double = js.native
  
  @js.native
  sealed trait MOVEFROMTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 61 */ val MOVEFROMTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVEFROMTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait MOVELOCEXISTSBORROWERROR
    extends StObject
       with VMVerificationErrorKind
  /* 40 */ val MOVELOCEXISTSBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVELOCEXISTSBORROWERROR & Double = js.native
  
  @js.native
  sealed trait MOVELOCUNAVAILABLEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 39 */ val MOVELOCUNAVAILABLEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVELOCUNAVAILABLEERROR & Double = js.native
  
  @js.native
  sealed trait MOVETOSENDERNORESOURCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 64 */ val MOVETOSENDERNORESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVETOSENDERNORESOURCEERROR & Double = js.native
  
  @js.native
  sealed trait MOVETOSENDERTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 63 */ val MOVETOSENDERTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.MOVETOSENDERTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait NEGATIVESTACKSIZEWITHINBLOCK
    extends StObject
       with VMVerificationErrorKind
  /* 9 */ val NEGATIVESTACKSIZEWITHINBLOCK: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.NEGATIVESTACKSIZEWITHINBLOCK & Double = js.native
  
  @js.native
  sealed trait NOMODULEHANDLES
    extends StObject
       with VMVerificationErrorKind
  /* 67 */ val NOMODULEHANDLES: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.NOMODULEHANDLES & Double = js.native
  
  @js.native
  sealed trait PACKTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 46 */ val PACKTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.PACKTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait POPREFERENCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 22 */ val POPREFERENCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.POPREFERENCEERROR & Double = js.native
  
  @js.native
  sealed trait POPRESOURCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 23 */ val POPRESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.POPRESOURCEERROR & Double = js.native
  
  @js.native
  sealed trait RANGEOUTOFBOUNDS
    extends StObject
       with VMVerificationErrorKind
  /* 2 */ val RANGEOUTOFBOUNDS: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RANGEOUTOFBOUNDS & Double = js.native
  
  @js.native
  sealed trait READREFEXISTSMUTABLEBORROWERROR
    extends StObject
       with VMVerificationErrorKind
  /* 50 */ val READREFEXISTSMUTABLEBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.READREFEXISTSMUTABLEBORROWERROR & Double = js.native
  
  @js.native
  sealed trait READREFRESOURCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 49 */ val READREFRESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.READREFRESOURCEERROR & Double = js.native
  
  @js.native
  sealed trait READREFTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 48 */ val READREFTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.READREFTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait RECURSIVESTRUCTDEFINITION
    extends StObject
       with VMVerificationErrorKind
  /* 5 */ val RECURSIVESTRUCTDEFINITION: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RECURSIVESTRUCTDEFINITION & Double = js.native
  
  @js.native
  sealed trait RELEASEREFTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 24 */ val RELEASEREFTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RELEASEREFTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait RETTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 30 */ val RETTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RETTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait RETUNSAFETODESTROYERROR
    extends StObject
       with VMVerificationErrorKind
  /* 29 */ val RETUNSAFETODESTROYERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.RETUNSAFETODESTROYERROR & Double = js.native
  
  @js.native
  sealed trait STLOCTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 27 */ val STLOCTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.STLOCTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait STLOCUNSAFETODESTROYERROR
    extends StObject
       with VMVerificationErrorKind
  /* 28 */ val STLOCUNSAFETODESTROYERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.STLOCUNSAFETODESTROYERROR & Double = js.native
  
  @js.native
  sealed trait TYPEMISMATCH
    extends StObject
       with VMVerificationErrorKind
  /* 20 */ val TYPEMISMATCH: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.TYPEMISMATCH & Double = js.native
  
  @js.native
  sealed trait TYPERESOLUTIONFAILURE
    extends StObject
       with VMVerificationErrorKind
  /* 19 */ val TYPERESOLUTIONFAILURE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.TYPERESOLUTIONFAILURE & Double = js.native
  
  @js.native
  sealed trait UNBALANCEDSTACK
    extends StObject
       with VMVerificationErrorKind
  /* 10 */ val UNBALANCEDSTACK: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNBALANCEDSTACK & Double = js.native
  
  @js.native
  sealed trait UNIMPLEMENTEDHANDLE
    extends StObject
       with VMVerificationErrorKind
  /* 14 */ val UNIMPLEMENTEDHANDLE: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNIMPLEMENTEDHANDLE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNVERIFICATIONERROR
    extends StObject
       with VMVerificationErrorKind
  /* 0 */ val UNKNOWNVERIFICATIONERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNKNOWNVERIFICATIONERROR & Double = js.native
  
  @js.native
  sealed trait UNPACKTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 47 */ val UNPACKTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNPACKTYPEMISMATCHERROR & Double = js.native
  
  @js.native
  sealed trait UNUSEDFIELDS
    extends StObject
       with VMVerificationErrorKind
  /* 16 */ val UNUSEDFIELDS: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.UNUSEDFIELDS & Double = js.native
  
  @js.native
  sealed trait VISIBILITYMISMATCH
    extends StObject
       with VMVerificationErrorKind
  /* 18 */ val VISIBILITYMISMATCH: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.VISIBILITYMISMATCH & Double = js.native
  
  @js.native
  sealed trait WRITEREFEXISTSBORROWERROR
    extends StObject
       with VMVerificationErrorKind
  /* 53 */ val WRITEREFEXISTSBORROWERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.WRITEREFEXISTSBORROWERROR & Double = js.native
  
  @js.native
  sealed trait WRITEREFNOMUTABLEREFERENCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 54 */ val WRITEREFNOMUTABLEREFERENCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.WRITEREFNOMUTABLEREFERENCEERROR & Double = js.native
  
  @js.native
  sealed trait WRITEREFRESOURCEERROR
    extends StObject
       with VMVerificationErrorKind
  /* 52 */ val WRITEREFRESOURCEERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.WRITEREFRESOURCEERROR & Double = js.native
  
  @js.native
  sealed trait WRITEREFTYPEMISMATCHERROR
    extends StObject
       with VMVerificationErrorKind
  /* 51 */ val WRITEREFTYPEMISMATCHERROR: typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind.WRITEREFTYPEMISMATCHERROR & Double = js.native
}
