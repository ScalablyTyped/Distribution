package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraValidationStatusCode extends js.Object

@JSImport("libra-core", "LibraValidationStatusCode")
@js.native
object LibraValidationStatusCode extends js.Object {
  @js.native
  sealed trait EXCEEDEDMAXTRANSACTIONSIZE
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait GASUNITPRICEABOVEMAXBOUND
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait GASUNITPRICEBELOWMINBOUND
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait INSUFFICIENTBALANCEFORTRANSACTIONFEE
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait INVALIDAUTHKEY
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait INVALIDSIGNATURE
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait INVALIDWRITESET
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait MAXGASUNITSBELOWMINTRANSACTIONGASUNITS
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait MAXGASUNITSEXCEEDSMAXGASUNITSBOUND
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait REJECTEDWRITESET
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait SENDINGACCOUNTDOESNOTEXIST
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait SEQUENCENUMBERTOONEW
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait SEQUENCENUMBERTOOOLD
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait TRANSACTIONEXPIRED
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait UNKNOWNMODULE
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait UNKNOWNSCRIPT
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  @js.native
  sealed trait UNKNOWNVALIDATIONSTATUS
    extends libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode
  
  /* 10 */ val EXCEEDEDMAXTRANSACTIONSIZE: EXCEEDEDMAXTRANSACTIONSIZE with scala.Double = js.native
  /* 16 */ val GASUNITPRICEABOVEMAXBOUND: GASUNITPRICEABOVEMAXBOUND with scala.Double = js.native
  /* 15 */ val GASUNITPRICEBELOWMINBOUND: GASUNITPRICEBELOWMINBOUND with scala.Double = js.native
  /* 5 */ val INSUFFICIENTBALANCEFORTRANSACTIONFEE: INSUFFICIENTBALANCEFORTRANSACTIONFEE with scala.Double = js.native
  /* 2 */ val INVALIDAUTHKEY: INVALIDAUTHKEY with scala.Double = js.native
  /* 1 */ val INVALIDSIGNATURE: INVALIDSIGNATURE with scala.Double = js.native
  /* 9 */ val INVALIDWRITESET: INVALIDWRITESET with scala.Double = js.native
  /* 14 */ val MAXGASUNITSBELOWMINTRANSACTIONGASUNITS: MAXGASUNITSBELOWMINTRANSACTIONGASUNITS with scala.Double = js.native
  /* 13 */ val MAXGASUNITSEXCEEDSMAXGASUNITSBOUND: MAXGASUNITSEXCEEDSMAXGASUNITSBOUND with scala.Double = js.native
  /* 8 */ val REJECTEDWRITESET: REJECTEDWRITESET with scala.Double = js.native
  /* 7 */ val SENDINGACCOUNTDOESNOTEXIST: SENDINGACCOUNTDOESNOTEXIST with scala.Double = js.native
  /* 4 */ val SEQUENCENUMBERTOONEW: SEQUENCENUMBERTOONEW with scala.Double = js.native
  /* 3 */ val SEQUENCENUMBERTOOOLD: SEQUENCENUMBERTOOOLD with scala.Double = js.native
  /* 6 */ val TRANSACTIONEXPIRED: TRANSACTIONEXPIRED with scala.Double = js.native
  /* 12 */ val UNKNOWNMODULE: UNKNOWNMODULE with scala.Double = js.native
  /* 11 */ val UNKNOWNSCRIPT: UNKNOWNSCRIPT with scala.Double = js.native
  /* 0 */ val UNKNOWNVALIDATIONSTATUS: UNKNOWNVALIDATIONSTATUS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraValidationStatusCode with scala.Double] = js.native
}

