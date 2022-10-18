package typings.lonaSvgModel.libSvgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.lonaSvgModel.libSvgTypesMod.SVGPathConvertibleNode
  - typings.lonaSvgModel.libSvgTypesMod.SVGUse
*/
trait SVGDrawableNode
  extends StObject
     with SVGChildNode
object SVGDrawableNode {
  
  inline def SVGCircle(attributes: SVGCircleAttributes): typings.lonaSvgModel.libSvgTypesMod.SVGCircle = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "circle")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGCircle]
  }
  
  inline def SVGPath(attributes: SVGPathAttributes): typings.lonaSvgModel.libSvgTypesMod.SVGPath = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "path")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGPath]
  }
  
  inline def SVGPolygon(attributes: SVGPolygonAttributes): typings.lonaSvgModel.libSvgTypesMod.SVGPolygon = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "polygon")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGPolygon]
  }
  
  inline def SVGPolyline(attributes: SVGPolylineAttributes): typings.lonaSvgModel.libSvgTypesMod.SVGPolyline = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "polyline")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGPolyline]
  }
  
  inline def SVGRect(attributes: SVGRectAttributes): typings.lonaSvgModel.libSvgTypesMod.SVGRect = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "rect")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGRect]
  }
  
  inline def SVGUse(attributes: SVGUseAttributes): typings.lonaSvgModel.libSvgTypesMod.SVGUse = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "use")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGUse]
  }
}
