package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.action
import typings.materialUiCore.materialUiCoreStrings.default
import typings.materialUiCore.materialUiCoreStrings.disabled
import typings.materialUiCore.materialUiCoreStrings.error
import typings.materialUiCore.materialUiCoreStrings.inherit
import typings.materialUiCore.materialUiCoreStrings.large
import typings.materialUiCore.materialUiCoreStrings.medium
import typings.materialUiCore.materialUiCoreStrings.primary
import typings.materialUiCore.materialUiCoreStrings.secondary
import typings.materialUiCore.materialUiCoreStrings.small
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlColor extends StObject {
  
  /**
    * Node passed into the SVG element.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * You can use the `htmlColor` prop to apply a color attribute to the SVG element.
    */
  var color: js.UndefOr[inherit | primary | secondary | action | disabled | error] = js.undefined
  
  /**
    * The fontSize applied to the icon. Defaults to 24px, but can be configure to inherit font size.
    */
  var fontSize: js.UndefOr[default | inherit | large | medium | small] = js.undefined
  
  /**
    * Applies a color attribute to the SVG element.
    */
  var htmlColor: js.UndefOr[String] = js.undefined
  
  /**
    * The shape-rendering attribute. The behavior of the different options is described on the
    * [MDN Web Docs](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/shape-rendering).
    * If you are having issues with blurry icons you should investigate this prop.
    * @document
    */
  var shapeRendering: js.UndefOr[String] = js.undefined
  
  /**
    * Provides a human-readable title for the element that contains it.
    * https://www.w3.org/TR/SVG-access/#Equivalent
    */
  var titleAccess: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to redefine what the coordinates without units mean inside an SVG element.
    * For example, if the SVG element is 500 (width) by 200 (height), and you pass viewBox="0 0 50 20",
    * this means that the coordinates inside the SVG will go from the top left corner (0,0)
    * to bottom right (50,20) and each unit will be worth 10px.
    */
  var viewBox: js.UndefOr[String] = js.undefined
}
object HtmlColor {
  
  inline def apply(): HtmlColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlColor] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: inherit | primary | secondary | action | disabled | error): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontSize(value: default | inherit | large | medium | small): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setHtmlColor(value: String): Self = StObject.set(x, "htmlColor", value.asInstanceOf[js.Any])
    
    inline def setHtmlColorUndefined: Self = StObject.set(x, "htmlColor", js.undefined)
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    inline def setTitleAccess(value: String): Self = StObject.set(x, "titleAccess", value.asInstanceOf[js.Any])
    
    inline def setTitleAccessUndefined: Self = StObject.set(x, "titleAccess", js.undefined)
    
    inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
  }
}
