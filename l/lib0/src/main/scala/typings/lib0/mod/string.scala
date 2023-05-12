package typings.lib0.mod

import typings.std.TextDecoder
import typings.std.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object string {
  
  @JSImport("lib0", "string")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeUtf8(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUtf8")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeUtf8Native(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_decodeUtf8Native")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeUtf8Polyfill(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_decodeUtf8Polyfill")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeUtf8(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUtf8")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeUtf8Native(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_encodeUtf8Native")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeUtf8Polyfill(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_encodeUtf8Polyfill")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromCamelCase(s: String, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCamelCase")(s.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromCharCode(codes: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCharCode")(codes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def fromCodePoint(codePoints: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def repeat(source: String, n: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(source.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def splice(str: String, index: Double, remove: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], remove.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def splice(str: String, index: Double, remove: Double, insert: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], remove.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def trimLeft(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimLeft")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def utf8ByteLength(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8ByteLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("lib0", "string.utf8TextDecoder")
  @js.native
  def utf8TextDecoder: TextDecoder | Null = js.native
  inline def utf8TextDecoder_=(x: TextDecoder | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf8TextDecoder")(x.asInstanceOf[js.Any])
  
  @JSImport("lib0", "string.utf8TextEncoder")
  @js.native
  val utf8TextEncoder: TextEncoder = js.native
}
