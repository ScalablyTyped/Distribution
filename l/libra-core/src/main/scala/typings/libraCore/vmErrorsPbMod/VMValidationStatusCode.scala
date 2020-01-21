package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMValidationStatusCode with Double] = js.native
  /* 10 */ @js.native
  object EXCEEDEDMAXTRANSACTIONSIZE extends TopLevel[EXCEEDEDMAXTRANSACTIONSIZE with Double]
  
  /* 16 */ @js.native
  object GASUNITPRICEABOVEMAXBOUND extends TopLevel[GASUNITPRICEABOVEMAXBOUND with Double]
  
  /* 15 */ @js.native
  object GASUNITPRICEBELOWMINBOUND extends TopLevel[GASUNITPRICEBELOWMINBOUND with Double]
  
  /* 5 */ @js.native
  object INSUFFICIENTBALANCEFORTRANSACTIONFEE extends TopLevel[INSUFFICIENTBALANCEFORTRANSACTIONFEE with Double]
  
  /* 2 */ @js.native
  object INVALIDAUTHKEY extends TopLevel[INVALIDAUTHKEY with Double]
  
  /* 1 */ @js.native
  object INVALIDSIGNATURE extends TopLevel[INVALIDSIGNATURE with Double]
  
  /* 9 */ @js.native
  object INVALIDWRITESET extends TopLevel[INVALIDWRITESET with Double]
  
  /* 14 */ @js.native
  object MAXGASUNITSBELOWMINTRANSACTIONGASUNITS extends TopLevel[MAXGASUNITSBELOWMINTRANSACTIONGASUNITS with Double]
  
  /* 13 */ @js.native
  object MAXGASUNITSEXCEEDSMAXGASUNITSBOUND extends TopLevel[MAXGASUNITSEXCEEDSMAXGASUNITSBOUND with Double]
  
  /* 8 */ @js.native
  object REJECTEDWRITESET extends TopLevel[REJECTEDWRITESET with Double]
  
  /* 7 */ @js.native
  object SENDINGACCOUNTDOESNOTEXIST extends TopLevel[SENDINGACCOUNTDOESNOTEXIST with Double]
  
  /* 4 */ @js.native
  object SEQUENCENUMBERTOONEW extends TopLevel[SEQUENCENUMBERTOONEW with Double]
  
  /* 3 */ @js.native
  object SEQUENCENUMBERTOOOLD extends TopLevel[SEQUENCENUMBERTOOOLD with Double]
  
  /* 6 */ @js.native
  object TRANSACTIONEXPIRED extends TopLevel[TRANSACTIONEXPIRED with Double]
  
  /* 12 */ @js.native
  object UNKNOWNMODULE extends TopLevel[UNKNOWNMODULE with Double]
  
  /* 11 */ @js.native
  object UNKNOWNSCRIPT extends TopLevel[UNKNOWNSCRIPT with Double]
  
  /* 0 */ @js.native
  object UNKNOWNVALIDATIONSTATUS extends TopLevel[UNKNOWNVALIDATIONSTATUS with Double]
  
}

