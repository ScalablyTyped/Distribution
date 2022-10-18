package typings.jose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilBase64urlMod {
  
  @JSImport("jose/dist/types/util/base64url", "decode")
  @js.native
  val decode: Base64UrlDecode = js.native
  
  @JSImport("jose/dist/types/util/base64url", "encode")
  @js.native
  val encode: Base64UrlEncode = js.native
  
  /**
    * Utility function to decode a base64url encoded string.
    *
    * @param input Value that will be base64url-decoded.
    */
  type Base64UrlDecode = js.Function1[/* input */ js.typedarray.Uint8Array | String, js.typedarray.Uint8Array]
  
  type Base64UrlEncode = js.Function1[/* input */ js.typedarray.Uint8Array | String, String]
}
