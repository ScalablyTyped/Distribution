package typings.hapiCryptiles

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/cryptiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixedTimeComparison(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedTimeComparison")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def fixedTimeComparison(a: String, b: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedTimeComparison")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def fixedTimeComparison(a: js.Array[Any], b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedTimeComparison")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def fixedTimeComparison(a: js.Array[Any], b: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedTimeComparison")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def randomAlphanumString(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomAlphanumString")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def randomBits(bits: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBits")(bits.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def randomDigits(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomDigits")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def randomString(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(size.asInstanceOf[js.Any]).asInstanceOf[String]
}
