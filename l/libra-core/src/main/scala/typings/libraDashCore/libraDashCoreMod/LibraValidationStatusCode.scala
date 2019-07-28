package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraValidationStatusCode extends js.Object

@JSImport("libra-core", "LibraValidationStatusCode")
@js.native
object LibraValidationStatusCode extends js.Object {
  @js.native
  sealed trait EXCEEDEDMAXTRANSACTIONSIZE extends LibraValidationStatusCode
  
  @js.native
  sealed trait GASUNITPRICEABOVEMAXBOUND extends LibraValidationStatusCode
  
  @js.native
  sealed trait GASUNITPRICEBELOWMINBOUND extends LibraValidationStatusCode
  
  @js.native
  sealed trait INSUFFICIENTBALANCEFORTRANSACTIONFEE extends LibraValidationStatusCode
  
  @js.native
  sealed trait INVALIDAUTHKEY extends LibraValidationStatusCode
  
  @js.native
  sealed trait INVALIDSIGNATURE extends LibraValidationStatusCode
  
  @js.native
  sealed trait INVALIDWRITESET extends LibraValidationStatusCode
  
  @js.native
  sealed trait MAXGASUNITSBELOWMINTRANSACTIONGASUNITS extends LibraValidationStatusCode
  
  @js.native
  sealed trait MAXGASUNITSEXCEEDSMAXGASUNITSBOUND extends LibraValidationStatusCode
  
  @js.native
  sealed trait REJECTEDWRITESET extends LibraValidationStatusCode
  
  @js.native
  sealed trait SENDINGACCOUNTDOESNOTEXIST extends LibraValidationStatusCode
  
  @js.native
  sealed trait SEQUENCENUMBERTOONEW extends LibraValidationStatusCode
  
  @js.native
  sealed trait SEQUENCENUMBERTOOOLD extends LibraValidationStatusCode
  
  @js.native
  sealed trait TRANSACTIONEXPIRED extends LibraValidationStatusCode
  
  @js.native
  sealed trait UNKNOWNMODULE extends LibraValidationStatusCode
  
  @js.native
  sealed trait UNKNOWNSCRIPT extends LibraValidationStatusCode
  
  @js.native
  sealed trait UNKNOWNVALIDATIONSTATUS extends LibraValidationStatusCode
  
  /* 10 */ val EXCEEDEDMAXTRANSACTIONSIZE: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.EXCEEDEDMAXTRANSACTIONSIZE with Double = js.native
  /* 16 */ val GASUNITPRICEABOVEMAXBOUND: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.GASUNITPRICEABOVEMAXBOUND with Double = js.native
  /* 15 */ val GASUNITPRICEBELOWMINBOUND: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.GASUNITPRICEBELOWMINBOUND with Double = js.native
  /* 5 */ val INSUFFICIENTBALANCEFORTRANSACTIONFEE: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.INSUFFICIENTBALANCEFORTRANSACTIONFEE with Double = js.native
  /* 2 */ val INVALIDAUTHKEY: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.INVALIDAUTHKEY with Double = js.native
  /* 1 */ val INVALIDSIGNATURE: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.INVALIDSIGNATURE with Double = js.native
  /* 9 */ val INVALIDWRITESET: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.INVALIDWRITESET with Double = js.native
  /* 14 */ val MAXGASUNITSBELOWMINTRANSACTIONGASUNITS: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.MAXGASUNITSBELOWMINTRANSACTIONGASUNITS with Double = js.native
  /* 13 */ val MAXGASUNITSEXCEEDSMAXGASUNITSBOUND: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.MAXGASUNITSEXCEEDSMAXGASUNITSBOUND with Double = js.native
  /* 8 */ val REJECTEDWRITESET: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.REJECTEDWRITESET with Double = js.native
  /* 7 */ val SENDINGACCOUNTDOESNOTEXIST: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.SENDINGACCOUNTDOESNOTEXIST with Double = js.native
  /* 4 */ val SEQUENCENUMBERTOONEW: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.SEQUENCENUMBERTOONEW with Double = js.native
  /* 3 */ val SEQUENCENUMBERTOOOLD: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.SEQUENCENUMBERTOOOLD with Double = js.native
  /* 6 */ val TRANSACTIONEXPIRED: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.TRANSACTIONEXPIRED with Double = js.native
  /* 12 */ val UNKNOWNMODULE: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.UNKNOWNMODULE with Double = js.native
  /* 11 */ val UNKNOWNSCRIPT: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.UNKNOWNSCRIPT with Double = js.native
  /* 0 */ val UNKNOWNVALIDATIONSTATUS: typings.libraDashCore.libraDashCoreMod.LibraValidationStatusCode.UNKNOWNVALIDATIONSTATUS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraValidationStatusCode with Double] = js.native
}

