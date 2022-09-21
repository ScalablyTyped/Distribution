package typings.gradientParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.gradientParser.mod.LinearGradientNode
  - typings.gradientParser.mod.RepeatingLinearGradientNode
  - typings.gradientParser.mod.RadialGradientNode
  - typings.gradientParser.mod.RepeatingRadialGradientNode
*/
trait GradientNode extends StObject
object GradientNode {
  
  inline def LinearGradientNode(colorStops: js.Array[ColorStop]): typings.gradientParser.mod.LinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[typings.gradientParser.mod.LinearGradientNode]
  }
  
  inline def RadialGradientNode(colorStops: js.Array[ColorStop]): typings.gradientParser.mod.RadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("radial-gradient")
    __obj.asInstanceOf[typings.gradientParser.mod.RadialGradientNode]
  }
  
  inline def RepeatingLinearGradientNode(colorStops: js.Array[ColorStop]): typings.gradientParser.mod.RepeatingLinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-linear-gradient")
    __obj.asInstanceOf[typings.gradientParser.mod.RepeatingLinearGradientNode]
  }
  
  inline def RepeatingRadialGradientNode(colorStops: js.Array[ColorStop]): typings.gradientParser.mod.RepeatingRadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-radial-gradient")
    __obj.asInstanceOf[typings.gradientParser.mod.RepeatingRadialGradientNode]
  }
}
