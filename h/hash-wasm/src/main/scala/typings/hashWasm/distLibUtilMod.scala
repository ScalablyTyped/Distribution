package typings.hashWasm

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilMod {
  
  @JSImport("hash-wasm/dist/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBase64(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeBase64(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeBase64(data: js.typedarray.Uint8Array, pad: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(data.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDecodeBase64Length(data: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecodeBase64Length")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDigestHex(tmpBuffer: js.typedarray.Uint8Array, input: js.typedarray.Uint8Array, hashLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDigestHex")(tmpBuffer.asInstanceOf[js.Any], input.asInstanceOf[js.Any], hashLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getUInt8Buffer(data: IDataType): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getUInt8Buffer")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def hexStringEqualsUInt8(str: String, buf: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hexStringEqualsUInt8")(str.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intArrayToString(arr: js.typedarray.Uint8Array, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intArrayToString")(arr.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def writeHexToUInt8(buf: js.typedarray.Uint8Array, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeHexToUInt8")(buf.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type IDataType = String | Buffer | ITypedArray
  
  type ITypedArray = js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array
}
