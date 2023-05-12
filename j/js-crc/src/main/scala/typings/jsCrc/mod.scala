package typings.jsCrc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-crc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def crc16(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc16")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def crc16(message: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc16")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def crc16(message: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc16")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def crc16(message: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc16")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def crc32(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def crc32(message: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def crc32(message: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def crc32(message: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(message.asInstanceOf[js.Any]).asInstanceOf[String]
}
