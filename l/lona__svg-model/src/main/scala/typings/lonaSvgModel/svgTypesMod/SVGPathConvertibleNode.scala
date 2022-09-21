package typings.lonaSvgModel.svgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.lonaSvgModel.svgTypesMod.SVGPath
  - typings.lonaSvgModel.svgTypesMod.SVGPolyline
  - typings.lonaSvgModel.svgTypesMod.SVGPolygon
  - typings.lonaSvgModel.svgTypesMod.SVGCircle
  - typings.lonaSvgModel.svgTypesMod.SVGRect
*/
trait SVGPathConvertibleNode
  extends StObject
     with SVGDrawableNode
object SVGPathConvertibleNode {
  
  inline def SVGCircle(attributes: SVGCircleAttributes): typings.lonaSvgModel.svgTypesMod.SVGCircle = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "circle")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGCircle]
  }
  
  inline def SVGPath(attributes: SVGPathAttributes): typings.lonaSvgModel.svgTypesMod.SVGPath = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "path")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGPath]
  }
  
  inline def SVGPolygon(attributes: SVGPolygonAttributes): typings.lonaSvgModel.svgTypesMod.SVGPolygon = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "polygon")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGPolygon]
  }
  
  inline def SVGPolyline(attributes: SVGPolylineAttributes): typings.lonaSvgModel.svgTypesMod.SVGPolyline = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "polyline")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGPolyline]
  }
  
  inline def SVGRect(attributes: SVGRectAttributes): typings.lonaSvgModel.svgTypesMod.SVGRect = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "rect")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGRect]
  }
}
