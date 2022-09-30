package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugins {
  
  @JSImport("griddle-react", "plugins")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("griddle-react", "plugins.CorePlugin")
  @js.native
  def CorePlugin: GriddlePlugin = js.native
  inline def CorePlugin_=(x: GriddlePlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CorePlugin")(x.asInstanceOf[js.Any])
  
  @JSImport("griddle-react", "plugins.LegacyStylePlugin")
  @js.native
  def LegacyStylePlugin: GriddlePlugin = js.native
  inline def LegacyStylePlugin_=(x: GriddlePlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LegacyStylePlugin")(x.asInstanceOf[js.Any])
  
  @JSImport("griddle-react", "plugins.LocalPlugin")
  @js.native
  def LocalPlugin: GriddlePlugin = js.native
  inline def LocalPlugin_=(x: GriddlePlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalPlugin")(x.asInstanceOf[js.Any])
  
  @JSImport("griddle-react", "plugins.PositionPlugin")
  @js.native
  def PositionPlugin: js.Function1[/* settings */ PositionSettings, GriddlePlugin] = js.native
  inline def PositionPlugin_=(x: js.Function1[/* settings */ PositionSettings, GriddlePlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PositionPlugin")(x.asInstanceOf[js.Any])
  
  trait PositionSettings extends StObject {
    
    // TODO: Unused?
    // The minimum column width
    var defaultColumnWidth: js.UndefOr[Double | String] = js.undefined
    
    // TODO: Unused?
    // Disable pointer events while scrolling to improve performance
    var disablePointerEvents: js.UndefOr[Boolean] = js.undefined
    
    // TODO: Unused?
    // Whether or not the header should be fixed
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    // The minimum row height
    var rowHeight: js.UndefOr[Double | String] = js.undefined
    
    // The height of the table
    var tableHeight: js.UndefOr[Double | String] = js.undefined
    
    // The width of the table
    var tableWidth: js.UndefOr[Double | String] = js.undefined
  }
  object PositionSettings {
    
    inline def apply(): PositionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionSettings]
    }
    
    extension [Self <: PositionSettings](x: Self) {
      
      inline def setDefaultColumnWidth(value: Double | String): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultColumnWidthUndefined: Self = StObject.set(x, "defaultColumnWidth", js.undefined)
      
      inline def setDisablePointerEvents(value: Boolean): Self = StObject.set(x, "disablePointerEvents", value.asInstanceOf[js.Any])
      
      inline def setDisablePointerEventsUndefined: Self = StObject.set(x, "disablePointerEvents", js.undefined)
      
      inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setTableHeight(value: Double | String): Self = StObject.set(x, "tableHeight", value.asInstanceOf[js.Any])
      
      inline def setTableHeightUndefined: Self = StObject.set(x, "tableHeight", js.undefined)
      
      inline def setTableWidth(value: Double | String): Self = StObject.set(x, "tableWidth", value.asInstanceOf[js.Any])
      
      inline def setTableWidthUndefined: Self = StObject.set(x, "tableWidth", js.undefined)
    }
  }
}
