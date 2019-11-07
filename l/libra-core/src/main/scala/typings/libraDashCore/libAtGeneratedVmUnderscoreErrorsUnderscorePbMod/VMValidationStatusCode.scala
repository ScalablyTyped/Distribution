package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VMValidationStatusCode extends js.Object

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatusCode")
@js.native
object VMValidationStatusCode extends js.Object {
  @js.native
  sealed trait EXCEEDEDMAXTRANSACTIONSIZE extends VMValidationStatusCode
  
  @js.native
  sealed trait GASUNITPRICEABOVEMAXBOUND extends VMValidationStatusCode
  
  @js.native
  sealed trait GASUNITPRICEBELOWMINBOUND extends VMValidationStatusCode
  
  @js.native
  sealed trait INSUFFICIENTBALANCEFORTRANSACTIONFEE extends VMValidationStatusCode
  
  @js.native
  sealed trait INVALIDAUTHKEY extends VMValidationStatusCode
  
  @js.native
  sealed trait INVALIDSIGNATURE extends VMValidationStatusCode
  
  @js.native
  sealed trait INVALIDWRITESET extends VMValidationStatusCode
  
  @js.native
  sealed trait MAXGASUNITSBELOWMINTRANSACTIONGASUNITS extends VMValidationStatusCode
  
  @js.native
  sealed trait MAXGASUNITSEXCEEDSMAXGASUNITSBOUND extends VMValidationStatusCode
  
  @js.native
  sealed trait REJECTEDWRITESET extends VMValidationStatusCode
  
  @js.native
  sealed trait SENDINGACCOUNTDOESNOTEXIST extends VMValidationStatusCode
  
  @js.native
  sealed trait SEQUENCENUMBERTOONEW extends VMValidationStatusCode
  
  @js.native
  sealed trait SEQUENCENUMBERTOOOLD extends VMValidationStatusCode
  
  @js.native
  sealed trait TRANSACTIONEXPIRED extends VMValidationStatusCode
  
  @js.native
  sealed trait UNKNOWNMODULE extends VMValidationStatusCode
  
  @js.native
  sealed trait UNKNOWNSCRIPT extends VMValidationStatusCode
  
  @js.native
  sealed trait UNKNOWNVALIDATIONSTATUS extends VMValidationStatusCode
  
  /* 10 */ val EXCEEDEDMAXTRANSACTIONSIZE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.EXCEEDEDMAXTRANSACTIONSIZE with Double = js.native
  /* 16 */ val GASUNITPRICEABOVEMAXBOUND: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.GASUNITPRICEABOVEMAXBOUND with Double = js.native
  /* 15 */ val GASUNITPRICEBELOWMINBOUND: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.GASUNITPRICEBELOWMINBOUND with Double = js.native
  /* 5 */ val INSUFFICIENTBALANCEFORTRANSACTIONFEE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.INSUFFICIENTBALANCEFORTRANSACTIONFEE with Double = js.native
  /* 2 */ val INVALIDAUTHKEY: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.INVALIDAUTHKEY with Double = js.native
  /* 1 */ val INVALIDSIGNATURE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.INVALIDSIGNATURE with Double = js.native
  /* 9 */ val INVALIDWRITESET: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.INVALIDWRITESET with Double = js.native
  /* 14 */ val MAXGASUNITSBELOWMINTRANSACTIONGASUNITS: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.MAXGASUNITSBELOWMINTRANSACTIONGASUNITS with Double = js.native
  /* 13 */ val MAXGASUNITSEXCEEDSMAXGASUNITSBOUND: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.MAXGASUNITSEXCEEDSMAXGASUNITSBOUND with Double = js.native
  /* 8 */ val REJECTEDWRITESET: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.REJECTEDWRITESET with Double = js.native
  /* 7 */ val SENDINGACCOUNTDOESNOTEXIST: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.SENDINGACCOUNTDOESNOTEXIST with Double = js.native
  /* 4 */ val SEQUENCENUMBERTOONEW: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.SEQUENCENUMBERTOONEW with Double = js.native
  /* 3 */ val SEQUENCENUMBERTOOOLD: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.SEQUENCENUMBERTOOOLD with Double = js.native
  /* 6 */ val TRANSACTIONEXPIRED: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.TRANSACTIONEXPIRED with Double = js.native
  /* 12 */ val UNKNOWNMODULE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.UNKNOWNMODULE with Double = js.native
  /* 11 */ val UNKNOWNSCRIPT: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.UNKNOWNSCRIPT with Double = js.native
  /* 0 */ val UNKNOWNVALIDATIONSTATUS: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatusCode.UNKNOWNVALIDATIONSTATUS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMValidationStatusCode with Double] = js.native
}

