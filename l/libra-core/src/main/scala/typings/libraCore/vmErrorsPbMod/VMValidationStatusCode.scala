package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMValidationStatusCode extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatusCode")
@js.native
object VMValidationStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMValidationStatusCode & Double] = js.native
  
  @js.native
  sealed trait EXCEEDEDMAXTRANSACTIONSIZE
    extends StObject
       with VMValidationStatusCode
  /* 10 */ val EXCEEDEDMAXTRANSACTIONSIZE: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.EXCEEDEDMAXTRANSACTIONSIZE & Double = js.native
  
  @js.native
  sealed trait GASUNITPRICEABOVEMAXBOUND
    extends StObject
       with VMValidationStatusCode
  /* 16 */ val GASUNITPRICEABOVEMAXBOUND: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.GASUNITPRICEABOVEMAXBOUND & Double = js.native
  
  @js.native
  sealed trait GASUNITPRICEBELOWMINBOUND
    extends StObject
       with VMValidationStatusCode
  /* 15 */ val GASUNITPRICEBELOWMINBOUND: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.GASUNITPRICEBELOWMINBOUND & Double = js.native
  
  @js.native
  sealed trait INSUFFICIENTBALANCEFORTRANSACTIONFEE
    extends StObject
       with VMValidationStatusCode
  /* 5 */ val INSUFFICIENTBALANCEFORTRANSACTIONFEE: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.INSUFFICIENTBALANCEFORTRANSACTIONFEE & Double = js.native
  
  @js.native
  sealed trait INVALIDAUTHKEY
    extends StObject
       with VMValidationStatusCode
  /* 2 */ val INVALIDAUTHKEY: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.INVALIDAUTHKEY & Double = js.native
  
  @js.native
  sealed trait INVALIDSIGNATURE
    extends StObject
       with VMValidationStatusCode
  /* 1 */ val INVALIDSIGNATURE: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.INVALIDSIGNATURE & Double = js.native
  
  @js.native
  sealed trait INVALIDWRITESET
    extends StObject
       with VMValidationStatusCode
  /* 9 */ val INVALIDWRITESET: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.INVALIDWRITESET & Double = js.native
  
  @js.native
  sealed trait MAXGASUNITSBELOWMINTRANSACTIONGASUNITS
    extends StObject
       with VMValidationStatusCode
  /* 14 */ val MAXGASUNITSBELOWMINTRANSACTIONGASUNITS: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.MAXGASUNITSBELOWMINTRANSACTIONGASUNITS & Double = js.native
  
  @js.native
  sealed trait MAXGASUNITSEXCEEDSMAXGASUNITSBOUND
    extends StObject
       with VMValidationStatusCode
  /* 13 */ val MAXGASUNITSEXCEEDSMAXGASUNITSBOUND: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.MAXGASUNITSEXCEEDSMAXGASUNITSBOUND & Double = js.native
  
  @js.native
  sealed trait REJECTEDWRITESET
    extends StObject
       with VMValidationStatusCode
  /* 8 */ val REJECTEDWRITESET: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.REJECTEDWRITESET & Double = js.native
  
  @js.native
  sealed trait SENDINGACCOUNTDOESNOTEXIST
    extends StObject
       with VMValidationStatusCode
  /* 7 */ val SENDINGACCOUNTDOESNOTEXIST: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.SENDINGACCOUNTDOESNOTEXIST & Double = js.native
  
  @js.native
  sealed trait SEQUENCENUMBERTOONEW
    extends StObject
       with VMValidationStatusCode
  /* 4 */ val SEQUENCENUMBERTOONEW: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.SEQUENCENUMBERTOONEW & Double = js.native
  
  @js.native
  sealed trait SEQUENCENUMBERTOOOLD
    extends StObject
       with VMValidationStatusCode
  /* 3 */ val SEQUENCENUMBERTOOOLD: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.SEQUENCENUMBERTOOOLD & Double = js.native
  
  @js.native
  sealed trait TRANSACTIONEXPIRED
    extends StObject
       with VMValidationStatusCode
  /* 6 */ val TRANSACTIONEXPIRED: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.TRANSACTIONEXPIRED & Double = js.native
  
  @js.native
  sealed trait UNKNOWNMODULE
    extends StObject
       with VMValidationStatusCode
  /* 12 */ val UNKNOWNMODULE: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.UNKNOWNMODULE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNSCRIPT
    extends StObject
       with VMValidationStatusCode
  /* 11 */ val UNKNOWNSCRIPT: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.UNKNOWNSCRIPT & Double = js.native
  
  @js.native
  sealed trait UNKNOWNVALIDATIONSTATUS
    extends StObject
       with VMValidationStatusCode
  /* 0 */ val UNKNOWNVALIDATIONSTATUS: typings.libraCore.vmErrorsPbMod.VMValidationStatusCode.UNKNOWNVALIDATIONSTATUS & Double = js.native
}
