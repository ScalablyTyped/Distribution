package typings.lezerGenerator

import typings.lezerGenerator.anon.Dicti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEncodeMod {
  
  @JSImport("@lezer/generator/dist/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encode(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(value: Double, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeArray(values: Dicti): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeArray")(values.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeArray(values: Dicti, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeArray")(values.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
}
