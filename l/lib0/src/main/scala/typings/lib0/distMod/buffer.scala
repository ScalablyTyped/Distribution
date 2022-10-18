package typings.lib0.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buffer {
  
  @JSImport("lib0/dist", "buffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyUint8Array(uint8Array: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("copyUint8Array")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createUint8ArrayFromArrayBuffer(buffer: js.typedarray.ArrayBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createUint8ArrayFromArrayBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createUint8ArrayFromLen(len: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createUint8ArrayFromLen")(len.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createUint8ArrayViewFromArrayBuffer(buffer: js.typedarray.ArrayBuffer, byteOffset: Double, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createUint8ArrayViewFromArrayBuffer")(buffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decodeAny(buf: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeAny")(buf.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def encodeAny(data: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeAny")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromBase64(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toBase64(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
}
