package typings.hapiCryptiles

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/cryptiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fixedTimeComparison(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedTimeComparison")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def fixedTimeComparison(a: String, b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedTimeComparison")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def fixedTimeComparison(a: js.Array[js.Any], b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedTimeComparison")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def fixedTimeComparison(a: js.Array[js.Any], b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedTimeComparison")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def randomAlphanumString(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomAlphanumString")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def randomBits(bits: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBits")(bits.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def randomDigits(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomDigits")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def randomString(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(size.asInstanceOf[js.Any]).asInstanceOf[String]
}
