package typings.lonaSvgModel.svgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.desc
import typings.lonaSvgModel.lonaSvgModelStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.lonaSvgModel.svgTypesMod.SVGDefs
  - typings.lonaSvgModel.svgTypesMod.SVGMask
  - typings.lonaSvgModel.svgTypesMod.SVGGroup
  - typings.lonaSvgModel.svgTypesMod.SVGDrawableNode
  - typings.lonaSvgModel.svgTypesMod.SVGUnknown
*/
trait SVGChildNode
  extends StObject
     with SVGNode
object SVGChildNode {
  
  inline def SVGCircle(attributes: SVGCircleAttributes): typings.lonaSvgModel.svgTypesMod.SVGCircle = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "circle")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGCircle]
  }
  
  inline def SVGDefs(children: js.Array[SVGChildNode]): typings.lonaSvgModel.svgTypesMod.SVGDefs = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = "defs")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGDefs]
  }
  
  inline def SVGGroup(attributes: SVGBaseAttributes, children: js.Array[SVGChildNode]): typings.lonaSvgModel.svgTypesMod.SVGGroup = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = "g")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGGroup]
  }
  
  inline def SVGMask(attributes: SVGBaseAttributes): typings.lonaSvgModel.svgTypesMod.SVGMask = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "mask")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGMask]
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
  
  inline def SVGUnknown(name: title | desc): typings.lonaSvgModel.svgTypesMod.SVGUnknown = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGUnknown]
  }
  
  inline def SVGUse(attributes: SVGUseAttributes): typings.lonaSvgModel.svgTypesMod.SVGUse = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "use")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.svgTypesMod.SVGUse]
  }
}
