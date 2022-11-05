package typings.lost

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreLgUtilitiesMod {
  
  @JSImport("lost/lib/core/lg-utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractRgbSubstring(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRgbSubstring")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getColorValue(string: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorValue")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def glueFractionMembers(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("glueFractionMembers")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hToD(h: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hToD")(h.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def safeHexToRgb(hex: String): js.Tuple3[Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeHexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, Double, Double]]
  
  inline def safeRgbToRgb(rgb: String): js.Tuple3[Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeRgbToRgb")(rgb.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, Double, Double]]
}
