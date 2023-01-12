package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridResponsive
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * When windowWidthToRenderVertically is null, determine minimal widths columns can take before
    * forcing vertical rendering for the grid
    *
    */
  var allowedColumnWidthPerType: js.UndefOr[IgGridResponsiveAllowedColumnWidthPerType] = js.undefined
  
  /**
    * A list of column settings that specifies how columns will react based on the environment the grid is run on.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridResponsiveColumnSetting]] = js.undefined
  
  /**
    * Enable or disable the responsive vertical rendering for the grid.
    *
    */
  var enableVerticalRendering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If this option is set to true the widget will ensure the grid's width is always set to 100%.
    *
    */
  var forceResponsiveGridWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The width of the properties column when vertical rendering is enabled
    *
    *
    * Valid values:
    * "string" The width in a (%) string
    * "number" The width as a number in percents
    */
  var propertiesColumnWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * If this option is set to true an igResponsiveContainer widget will be attached to the igGrid control which will notify the feature when changes in the width of the container occur.
    *
    */
  var reactOnContainerWidthChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired after a hiding operation is executed on the collection of columns.
    */
  var responsiveColumnHidden: js.UndefOr[ResponsiveColumnHiddenEvent] = js.undefined
  
  /**
    * Event fired before a hiding operation is executed on a collection of columns.
    */
  var responsiveColumnHiding: js.UndefOr[ResponsiveColumnHidingEvent] = js.undefined
  
  /**
    * Event fired before a showing operation is executed on a collection of columns.
    */
  var responsiveColumnShowing: js.UndefOr[ResponsiveColumnShowingEvent] = js.undefined
  
  /**
    * Event fired after a showing operation is executed on the collection of columns.
    */
  var responsiveColumnShown: js.UndefOr[ResponsiveColumnShownEvent] = js.undefined
  
  /**
    * Event which is fired when the widget detects an environment change.
    */
  var responsiveModeChanged: js.UndefOr[ResponsiveModeChangedEvent] = js.undefined
  
  /**
    * The recognized types of environments and their configuration.
    *
    */
  var responsiveModes: js.UndefOr[Any] = js.undefined
  
  /**
    * The amount of pixels the window needs to resize with for the grid to respond.
    *
    */
  var responsiveSensitivity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a template to render a record with in a list-view style layout per mode.
    *
    */
  var singleColumnTemplate: js.UndefOr[Any] = js.undefined
  
  /**
    * The width of the values column when vertical rendering is enabled
    *
    *
    * Valid values:
    * "string" The width in a (%) string
    * "number" The width as a number in percents
    */
  var valuesColumnWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The window's width under which the grid will render its contents vertically.
    *
    *
    * Valid values:
    * "string" The width in a (px) string
    * "number" The width as a number
    * "null" The grid will determine when to render this mode automatically.
    */
  var windowWidthToRenderVertically: js.UndefOr[String | Double] = js.undefined
}
object IgGridResponsive {
  
  inline def apply(): IgGridResponsive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResponsive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgGridResponsive] (val x: Self) extends AnyVal {
    
    inline def setAllowedColumnWidthPerType(value: IgGridResponsiveAllowedColumnWidthPerType): Self = StObject.set(x, "allowedColumnWidthPerType", value.asInstanceOf[js.Any])
    
    inline def setAllowedColumnWidthPerTypeUndefined: Self = StObject.set(x, "allowedColumnWidthPerType", js.undefined)
    
    inline def setColumnSettings(value: js.Array[IgGridResponsiveColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setColumnSettingsVarargs(value: IgGridResponsiveColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value*))
    
    inline def setEnableVerticalRendering(value: Boolean): Self = StObject.set(x, "enableVerticalRendering", value.asInstanceOf[js.Any])
    
    inline def setEnableVerticalRenderingUndefined: Self = StObject.set(x, "enableVerticalRendering", js.undefined)
    
    inline def setForceResponsiveGridWidth(value: Boolean): Self = StObject.set(x, "forceResponsiveGridWidth", value.asInstanceOf[js.Any])
    
    inline def setForceResponsiveGridWidthUndefined: Self = StObject.set(x, "forceResponsiveGridWidth", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    inline def setPropertiesColumnWidth(value: String | Double): Self = StObject.set(x, "propertiesColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setPropertiesColumnWidthUndefined: Self = StObject.set(x, "propertiesColumnWidth", js.undefined)
    
    inline def setReactOnContainerWidthChanges(value: Boolean): Self = StObject.set(x, "reactOnContainerWidthChanges", value.asInstanceOf[js.Any])
    
    inline def setReactOnContainerWidthChangesUndefined: Self = StObject.set(x, "reactOnContainerWidthChanges", js.undefined)
    
    inline def setResponsiveColumnHidden(value: (/* event */ Event, /* ui */ ResponsiveColumnHiddenEventUIParam) => Unit): Self = StObject.set(x, "responsiveColumnHidden", js.Any.fromFunction2(value))
    
    inline def setResponsiveColumnHiddenUndefined: Self = StObject.set(x, "responsiveColumnHidden", js.undefined)
    
    inline def setResponsiveColumnHiding(value: (/* event */ Event, /* ui */ ResponsiveColumnHidingEventUIParam) => Unit): Self = StObject.set(x, "responsiveColumnHiding", js.Any.fromFunction2(value))
    
    inline def setResponsiveColumnHidingUndefined: Self = StObject.set(x, "responsiveColumnHiding", js.undefined)
    
    inline def setResponsiveColumnShowing(value: (/* event */ Event, /* ui */ ResponsiveColumnShowingEventUIParam) => Unit): Self = StObject.set(x, "responsiveColumnShowing", js.Any.fromFunction2(value))
    
    inline def setResponsiveColumnShowingUndefined: Self = StObject.set(x, "responsiveColumnShowing", js.undefined)
    
    inline def setResponsiveColumnShown(value: (/* event */ Event, /* ui */ ResponsiveColumnShownEventUIParam) => Unit): Self = StObject.set(x, "responsiveColumnShown", js.Any.fromFunction2(value))
    
    inline def setResponsiveColumnShownUndefined: Self = StObject.set(x, "responsiveColumnShown", js.undefined)
    
    inline def setResponsiveModeChanged(value: (/* event */ Event, /* ui */ ResponsiveModeChangedEventUIParam) => Unit): Self = StObject.set(x, "responsiveModeChanged", js.Any.fromFunction2(value))
    
    inline def setResponsiveModeChangedUndefined: Self = StObject.set(x, "responsiveModeChanged", js.undefined)
    
    inline def setResponsiveModes(value: Any): Self = StObject.set(x, "responsiveModes", value.asInstanceOf[js.Any])
    
    inline def setResponsiveModesUndefined: Self = StObject.set(x, "responsiveModes", js.undefined)
    
    inline def setResponsiveSensitivity(value: Double): Self = StObject.set(x, "responsiveSensitivity", value.asInstanceOf[js.Any])
    
    inline def setResponsiveSensitivityUndefined: Self = StObject.set(x, "responsiveSensitivity", js.undefined)
    
    inline def setSingleColumnTemplate(value: Any): Self = StObject.set(x, "singleColumnTemplate", value.asInstanceOf[js.Any])
    
    inline def setSingleColumnTemplateUndefined: Self = StObject.set(x, "singleColumnTemplate", js.undefined)
    
    inline def setValuesColumnWidth(value: String | Double): Self = StObject.set(x, "valuesColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setValuesColumnWidthUndefined: Self = StObject.set(x, "valuesColumnWidth", js.undefined)
    
    inline def setWindowWidthToRenderVertically(value: String | Double): Self = StObject.set(x, "windowWidthToRenderVertically", value.asInstanceOf[js.Any])
    
    inline def setWindowWidthToRenderVerticallyUndefined: Self = StObject.set(x, "windowWidthToRenderVertically", js.undefined)
  }
}
