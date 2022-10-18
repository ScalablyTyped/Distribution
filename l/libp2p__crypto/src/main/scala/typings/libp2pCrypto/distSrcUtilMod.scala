package typings.libp2pCrypto

import typings.libp2pCrypto.anon.Abs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilMod {
  
  @JSImport("@libp2p/crypto/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64urlToBigInteger(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlToBigInteger")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def base64urlToBuffer(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlToBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def base64urlToBuffer(str: String, len: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("base64urlToBuffer")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def bigIntegerToUintBase64url(num: Abs): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntegerToUintBase64url")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def bigIntegerToUintBase64url(num: Abs, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bigIntegerToUintBase64url")(num.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
}
