package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object b64Mod {
  
  @JSImport("matrix-bot-sdk/lib/b64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBase64(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decodeUnpaddedBase64(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnpaddedBase64")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decodeUnpaddedUrlSafeBase64(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnpaddedUrlSafeBase64")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeBase64(b: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeBase64(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeUnpaddedBase64(b: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnpaddedBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeUnpaddedBase64(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnpaddedBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeUnpaddedUrlSafeBase64(b: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnpaddedUrlSafeBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeUnpaddedUrlSafeBase64(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnpaddedUrlSafeBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]
}
