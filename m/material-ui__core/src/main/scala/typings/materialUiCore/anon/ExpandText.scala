package typings.materialUiCore.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandText extends StObject {
  
  /**
    * The breadcrumb children.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Override the default label for the expand button.
    *
    * For localization purposes, you can use the provided [translations](/guides/localization/).
    */
  var expandText: js.UndefOr[String] = js.undefined
  
  /**
    * If max items is exceeded, the number of items to show after the ellipsis.
    */
  var itemsAfterCollapse: js.UndefOr[Double] = js.undefined
  
  /**
    * If max items is exceeded, the number of items to show before the ellipsis.
    */
  var itemsBeforeCollapse: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the maximum number of breadcrumbs to display. When there are more
    * than the maximum number, only the first `itemsBeforeCollapse` and last `itemsAfterCollapse`
    * will be shown, with an ellipsis in between.
    */
  var maxItems: js.UndefOr[Double] = js.undefined
  
  /**
    * Custom separator node.
    */
  var separator: js.UndefOr[ReactNode] = js.undefined
}
object ExpandText {
  
  inline def apply(): ExpandText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandText]
  }
  
  extension [Self <: ExpandText](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setExpandText(value: String): Self = StObject.set(x, "expandText", value.asInstanceOf[js.Any])
    
    inline def setExpandTextUndefined: Self = StObject.set(x, "expandText", js.undefined)
    
    inline def setItemsAfterCollapse(value: Double): Self = StObject.set(x, "itemsAfterCollapse", value.asInstanceOf[js.Any])
    
    inline def setItemsAfterCollapseUndefined: Self = StObject.set(x, "itemsAfterCollapse", js.undefined)
    
    inline def setItemsBeforeCollapse(value: Double): Self = StObject.set(x, "itemsBeforeCollapse", value.asInstanceOf[js.Any])
    
    inline def setItemsBeforeCollapseUndefined: Self = StObject.set(x, "itemsBeforeCollapse", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setSeparator(value: ReactNode): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
