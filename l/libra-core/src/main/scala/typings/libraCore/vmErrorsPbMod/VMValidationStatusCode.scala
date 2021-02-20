package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMValidationStatusCode extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatusCode")
@js.native
object VMValidationStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMValidationStatusCode with Double] = js.native
  
  @js.native
  sealed trait EXCEEDEDMAXTRANSACTIONSIZE extends VMValidationStatusCode
  /* 10 */ val EXCEEDEDMAXTRANSACTIONSIZE: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.EXCEEDEDMAXTRANSACTIONSIZE with Double = js.native
  
  @js.native
  sealed trait GASUNITPRICEABOVEMAXBOUND extends VMValidationStatusCode
  /* 16 */ val GASUNITPRICEABOVEMAXBOUND: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.GASUNITPRICEABOVEMAXBOUND with Double = js.native
  
  @js.native
  sealed trait GASUNITPRICEBELOWMINBOUND extends VMValidationStatusCode
  /* 15 */ val GASUNITPRICEBELOWMINBOUND: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.GASUNITPRICEBELOWMINBOUND with Double = js.native
  
  @js.native
  sealed trait INSUFFICIENTBALANCEFORTRANSACTIONFEE extends VMValidationStatusCode
  /* 5 */ val INSUFFICIENTBALANCEFORTRANSACTIONFEE: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.INSUFFICIENTBALANCEFORTRANSACTIONFEE with Double = js.native
  
  @js.native
  sealed trait INVALIDAUTHKEY extends VMValidationStatusCode
  /* 2 */ val INVALIDAUTHKEY: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.INVALIDAUTHKEY with Double = js.native
  
  @js.native
  sealed trait INVALIDSIGNATURE extends VMValidationStatusCode
  /* 1 */ val INVALIDSIGNATURE: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.INVALIDSIGNATURE with Double = js.native
  
  @js.native
  sealed trait INVALIDWRITESET extends VMValidationStatusCode
  /* 9 */ val INVALIDWRITESET: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.INVALIDWRITESET with Double = js.native
  
  @js.native
  sealed trait MAXGASUNITSBELOWMINTRANSACTIONGASUNITS extends VMValidationStatusCode
  /* 14 */ val MAXGASUNITSBELOWMINTRANSACTIONGASUNITS: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.MAXGASUNITSBELOWMINTRANSACTIONGASUNITS with Double = js.native
  
  @js.native
  sealed trait MAXGASUNITSEXCEEDSMAXGASUNITSBOUND extends VMValidationStatusCode
  /* 13 */ val MAXGASUNITSEXCEEDSMAXGASUNITSBOUND: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.MAXGASUNITSEXCEEDSMAXGASUNITSBOUND with Double = js.native
  
  @js.native
  sealed trait REJECTEDWRITESET extends VMValidationStatusCode
  /* 8 */ val REJECTEDWRITESET: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.REJECTEDWRITESET with Double = js.native
  
  @js.native
  sealed trait SENDINGACCOUNTDOESNOTEXIST extends VMValidationStatusCode
  /* 7 */ val SENDINGACCOUNTDOESNOTEXIST: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.SENDINGACCOUNTDOESNOTEXIST with Double = js.native
  
  @js.native
  sealed trait SEQUENCENUMBERTOONEW extends VMValidationStatusCode
  /* 4 */ val SEQUENCENUMBERTOONEW: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.SEQUENCENUMBERTOONEW with Double = js.native
  
  @js.native
  sealed trait SEQUENCENUMBERTOOOLD extends VMValidationStatusCode
  /* 3 */ val SEQUENCENUMBERTOOOLD: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.SEQUENCENUMBERTOOOLD with Double = js.native
  
  @js.native
  sealed trait TRANSACTIONEXPIRED extends VMValidationStatusCode
  /* 6 */ val TRANSACTIONEXPIRED: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.TRANSACTIONEXPIRED with Double = js.native
  
  @js.native
  sealed trait UNKNOWNMODULE extends VMValidationStatusCode
  /* 12 */ val UNKNOWNMODULE: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.UNKNOWNMODULE with Double = js.native
  
  @js.native
  sealed trait UNKNOWNSCRIPT extends VMValidationStatusCode
  /* 11 */ val UNKNOWNSCRIPT: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.UNKNOWNSCRIPT with Double = js.native
  
  @js.native
  sealed trait UNKNOWNVALIDATIONSTATUS extends VMValidationStatusCode
  /* 0 */ val UNKNOWNVALIDATIONSTATUS: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.UNKNOWNVALIDATIONSTATUS with Double = js.native
}
