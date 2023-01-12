package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotGridGridOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Enables/disables rendering of alternating row styles (odd and even rows receive different styling). Note that if a custom jQuery template is set, this has no effect and CSS for the row should be adjusted manually in the template contents.
    */
  var alternateRowStyles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Caption text that will be shown above the pivot grid header.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Default column width that will be set for all columns.
    */
  var defaultColumnWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Enables/disables rendering of ui-state-hover classes when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
    */
  var enableHoverStyles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of grid features definitions. The supported features are Resizing and Tooltips. Each feature goes with its separate options that are documented for the feature accordingly.
    *
    */
  var features: js.UndefOr[IgPivotGridGridOptionsFeatures] = js.undefined
  
  /**
    * Headers will be fixed if this option is set to true, and only the grid data will be scrollable.
    *
    */
  var fixedHeaders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Initial tabIndex attribute that will be set on the container element.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
}
object IgPivotGridGridOptions {
  
  inline def apply(): IgPivotGridGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridGridOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgPivotGridGridOptions] (val x: Self) extends AnyVal {
    
    inline def setAlternateRowStyles(value: Boolean): Self = StObject.set(x, "alternateRowStyles", value.asInstanceOf[js.Any])
    
    inline def setAlternateRowStylesUndefined: Self = StObject.set(x, "alternateRowStyles", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDefaultColumnWidth(value: String | Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultColumnWidthUndefined: Self = StObject.set(x, "defaultColumnWidth", js.undefined)
    
    inline def setEnableHoverStyles(value: Boolean): Self = StObject.set(x, "enableHoverStyles", value.asInstanceOf[js.Any])
    
    inline def setEnableHoverStylesUndefined: Self = StObject.set(x, "enableHoverStyles", js.undefined)
    
    inline def setFeatures(value: IgPivotGridGridOptionsFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFixedHeaders(value: Boolean): Self = StObject.set(x, "fixedHeaders", value.asInstanceOf[js.Any])
    
    inline def setFixedHeadersUndefined: Self = StObject.set(x, "fixedHeaders", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
