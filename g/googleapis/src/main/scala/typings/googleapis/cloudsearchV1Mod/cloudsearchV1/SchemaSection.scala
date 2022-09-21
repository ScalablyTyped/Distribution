package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSection extends StObject {
  
  /**
    * Indicating whether this section is collapsable. If a section is collapsable, the description must be given.
    */
  var collapsable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The header of the section, text formatted supported.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of uncollapsable widgets. For example, when a section contains 5 widgets and the num_uncollapsable_widget are set to be 2, The first 2 widgets will always shown and the last 3 is collapsed as default. Only when collapsable is set to be true, the num_uncollapsable_widget will be taken into account.
    */
  var numUncollapsableWidgets: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A section must contain at least 1 widget.
    */
  var widgets: js.UndefOr[js.Array[SchemaWidgetMarkup]] = js.undefined
}
object SchemaSection {
  
  inline def apply(): SchemaSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSection]
  }
  
  extension [Self <: SchemaSection](x: Self) {
    
    inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableNull: Self = StObject.set(x, "collapsable", null)
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNumUncollapsableWidgets(value: Double): Self = StObject.set(x, "numUncollapsableWidgets", value.asInstanceOf[js.Any])
    
    inline def setNumUncollapsableWidgetsNull: Self = StObject.set(x, "numUncollapsableWidgets", null)
    
    inline def setNumUncollapsableWidgetsUndefined: Self = StObject.set(x, "numUncollapsableWidgets", js.undefined)
    
    inline def setWidgets(value: js.Array[SchemaWidgetMarkup]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: SchemaWidgetMarkup*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
