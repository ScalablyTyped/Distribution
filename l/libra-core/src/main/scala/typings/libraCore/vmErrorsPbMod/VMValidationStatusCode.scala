package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMValidationStatusCode extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatusCode")
@js.native
object VMValidationStatusCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMValidationStatusCode with Double] = js.native
  
  @js.native
  sealed trait EXCEEDEDMAXTRANSACTIONSIZE extends VMValidationStatusCode
  /* 10 */ @js.native
  object EXCEEDEDMAXTRANSACTIONSIZE extends TopLevel[EXCEEDEDMAXTRANSACTIONSIZE with Double]
  
  @js.native
  sealed trait GASUNITPRICEABOVEMAXBOUND extends VMValidationStatusCode
  /* 16 */ @js.native
  object GASUNITPRICEABOVEMAXBOUND extends TopLevel[GASUNITPRICEABOVEMAXBOUND with Double]
  
  @js.native
  sealed trait GASUNITPRICEBELOWMINBOUND extends VMValidationStatusCode
  /* 15 */ @js.native
  object GASUNITPRICEBELOWMINBOUND extends TopLevel[GASUNITPRICEBELOWMINBOUND with Double]
  
  @js.native
  sealed trait INSUFFICIENTBALANCEFORTRANSACTIONFEE extends VMValidationStatusCode
  /* 5 */ @js.native
  object INSUFFICIENTBALANCEFORTRANSACTIONFEE extends TopLevel[INSUFFICIENTBALANCEFORTRANSACTIONFEE with Double]
  
  @js.native
  sealed trait INVALIDAUTHKEY extends VMValidationStatusCode
  /* 2 */ @js.native
  object INVALIDAUTHKEY extends TopLevel[INVALIDAUTHKEY with Double]
  
  @js.native
  sealed trait INVALIDSIGNATURE extends VMValidationStatusCode
  /* 1 */ @js.native
  object INVALIDSIGNATURE extends TopLevel[INVALIDSIGNATURE with Double]
  
  @js.native
  sealed trait INVALIDWRITESET extends VMValidationStatusCode
  /* 9 */ @js.native
  object INVALIDWRITESET extends TopLevel[INVALIDWRITESET with Double]
  
  @js.native
  sealed trait MAXGASUNITSBELOWMINTRANSACTIONGASUNITS extends VMValidationStatusCode
  /* 14 */ @js.native
  object MAXGASUNITSBELOWMINTRANSACTIONGASUNITS extends TopLevel[MAXGASUNITSBELOWMINTRANSACTIONGASUNITS with Double]
  
  @js.native
  sealed trait MAXGASUNITSEXCEEDSMAXGASUNITSBOUND extends VMValidationStatusCode
  /* 13 */ @js.native
  object MAXGASUNITSEXCEEDSMAXGASUNITSBOUND extends TopLevel[MAXGASUNITSEXCEEDSMAXGASUNITSBOUND with Double]
  
  @js.native
  sealed trait REJECTEDWRITESET extends VMValidationStatusCode
  /* 8 */ @js.native
  object REJECTEDWRITESET extends TopLevel[REJECTEDWRITESET with Double]
  
  @js.native
  sealed trait SENDINGACCOUNTDOESNOTEXIST extends VMValidationStatusCode
  /* 7 */ @js.native
  object SENDINGACCOUNTDOESNOTEXIST extends TopLevel[SENDINGACCOUNTDOESNOTEXIST with Double]
  
  @js.native
  sealed trait SEQUENCENUMBERTOONEW extends VMValidationStatusCode
  /* 4 */ @js.native
  object SEQUENCENUMBERTOONEW extends TopLevel[SEQUENCENUMBERTOONEW with Double]
  
  @js.native
  sealed trait SEQUENCENUMBERTOOOLD extends VMValidationStatusCode
  /* 3 */ @js.native
  object SEQUENCENUMBERTOOOLD extends TopLevel[SEQUENCENUMBERTOOOLD with Double]
  
  @js.native
  sealed trait TRANSACTIONEXPIRED extends VMValidationStatusCode
  /* 6 */ @js.native
  object TRANSACTIONEXPIRED extends TopLevel[TRANSACTIONEXPIRED with Double]
  
  @js.native
  sealed trait UNKNOWNMODULE extends VMValidationStatusCode
  /* 12 */ @js.native
  object UNKNOWNMODULE extends TopLevel[UNKNOWNMODULE with Double]
  
  @js.native
  sealed trait UNKNOWNSCRIPT extends VMValidationStatusCode
  /* 11 */ @js.native
  object UNKNOWNSCRIPT extends TopLevel[UNKNOWNSCRIPT with Double]
  
  @js.native
  sealed trait UNKNOWNVALIDATIONSTATUS extends VMValidationStatusCode
  /* 0 */ @js.native
  object UNKNOWNVALIDATIONSTATUS extends TopLevel[UNKNOWNVALIDATIONSTATUS with Double]
}
