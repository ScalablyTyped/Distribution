package typings.kdbxweb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsByteUtilsMod {
  
  @JSImport("kdbxweb/dist/types/utils/byte-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayBufferEquals(ab1: js.typedarray.ArrayBuffer, ab2: js.typedarray.ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferEquals")(ab1.asInstanceOf[js.Any], ab2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayToBuffer(arr: ArrayBufferOrArray): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToBuffer")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def base64ToBytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("base64ToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def bytesToBase64(arr: ArrayBufferOrArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToBase64")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bytesToHex(arr: ArrayBufferOrArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bytesToString(arr: ArrayBufferOrArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToString")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def stringToBytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def zeroBuffer(arr: ArrayBufferOrArray): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroBuffer")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ArrayBufferOrArray = js.typedarray.ArrayBuffer | js.typedarray.Uint8Array
}
