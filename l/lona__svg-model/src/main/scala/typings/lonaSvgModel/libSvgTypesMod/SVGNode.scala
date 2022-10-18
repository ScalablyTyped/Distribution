package typings.lonaSvgModel.libSvgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.desc
import typings.lonaSvgModel.lonaSvgModelStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.lonaSvgModel.libSvgTypesMod.SVGRoot
  - typings.lonaSvgModel.libSvgTypesMod.SVGChildNode
*/
trait SVGNode extends StObject
object SVGNode {
  
  inline def SVGCircle(attributes: SVGCircleAttributes): typings.lonaSvgModel.libSvgTypesMod.SVGCircle = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "circle")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGCircle]
  }
  
  inline def SVGDefs(children: js.Array[SVGChildNode]): typings.lonaSvgModel.libSvgTypesMod.SVGDefs = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = "defs")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGDefs]
  }
  
  inline def SVGGroup(attributes: SVGBaseAttributes, children: js.Array[SVGChildNode]): typings.lonaSvgModel.libSvgTypesMod.SVGGroup = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = "g")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGGroup]
  }
  
  inline def SVGMask(attributes: SVGBaseAttributes): typings.lonaSvgModel.libSvgTypesMod.SVGMask = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "mask")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGMask]
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
  
  inline def SVGRoot(attributes: SVGRootAttributes, children: js.Array[SVGChildNode | SVGDefs]): typings.lonaSvgModel.libSvgTypesMod.SVGRoot = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = "svg")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGRoot]
  }
  
  inline def SVGUnknown(name: title | desc): typings.lonaSvgModel.libSvgTypesMod.SVGUnknown = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGUnknown]
  }
  
  inline def SVGUse(attributes: SVGUseAttributes): typings.lonaSvgModel.libSvgTypesMod.SVGUse = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "use")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.lonaSvgModel.libSvgTypesMod.SVGUse]
  }
}
