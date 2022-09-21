package typings.gradientParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.gradientParser.mod.LiteralNode
  - typings.gradientParser.mod.HexNode
  - typings.gradientParser.mod.RgbNode
  - typings.gradientParser.mod.RgbaNode
*/
trait ColorStop extends StObject
object ColorStop {
  
  inline def HexNode(value: String): typings.gradientParser.mod.HexNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hex")
    __obj.asInstanceOf[typings.gradientParser.mod.HexNode]
  }
  
  inline def LiteralNode(value: String): typings.gradientParser.mod.LiteralNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typings.gradientParser.mod.LiteralNode]
  }
  
  inline def RgbNode(value: js.Tuple3[String, String, String]): typings.gradientParser.mod.RgbNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgb")
    __obj.asInstanceOf[typings.gradientParser.mod.RgbNode]
  }
  
  inline def RgbaNode(value: js.Tuple4[String, String, String, js.UndefOr[String]]): typings.gradientParser.mod.RgbaNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgba")
    __obj.asInstanceOf[typings.gradientParser.mod.RgbaNode]
  }
}
