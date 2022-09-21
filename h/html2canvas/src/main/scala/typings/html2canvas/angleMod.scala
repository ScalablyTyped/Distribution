package typings.html2canvas

import typings.html2canvas.imageMod.GradientCorner
import typings.html2canvas.itypedescriptorMod.ITypeDescriptor
import typings.html2canvas.parserMod.CSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angleMod {
  
  @JSImport("html2canvas/dist/types/css/types/angle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/css/types/angle", "angle")
  @js.native
  val angle: ITypeDescriptor[Double] = js.native
  
  inline def deg(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isAngle(value: CSSValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngle")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseNamedSide(tokens: js.Array[CSSValue]): Double | GradientCorner = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNamedSide")(tokens.asInstanceOf[js.Any]).asInstanceOf[Double | GradientCorner]
}
