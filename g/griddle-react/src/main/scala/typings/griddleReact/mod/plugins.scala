package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugins {
  
  @JSImport("griddle-react", "plugins")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("griddle-react", "plugins.CorePlugin")
  @js.native
  def CorePlugin: GriddlePlugin = js.native
  @scala.inline
  def CorePlugin_=(x: GriddlePlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CorePlugin")(x.asInstanceOf[js.Any])
  
  @JSImport("griddle-react", "plugins.LegacyStylePlugin")
  @js.native
  def LegacyStylePlugin: GriddlePlugin = js.native
  @scala.inline
  def LegacyStylePlugin_=(x: GriddlePlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LegacyStylePlugin")(x.asInstanceOf[js.Any])
  
  @JSImport("griddle-react", "plugins.LocalPlugin")
  @js.native
  def LocalPlugin: GriddlePlugin = js.native
  @scala.inline
  def LocalPlugin_=(x: GriddlePlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalPlugin")(x.asInstanceOf[js.Any])
  
  @JSImport("griddle-react", "plugins.PositionPlugin")
  @js.native
  def PositionPlugin: js.Function1[/* settings */ PositionSettings, GriddlePlugin] = js.native
  @scala.inline
  def PositionPlugin_=(x: js.Function1[/* settings */ PositionSettings, GriddlePlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PositionPlugin")(x.asInstanceOf[js.Any])
  
  @js.native
  trait PositionSettings extends StObject {
    
    // TODO: Unused?
    // The minimum column width
    var defaultColumnWidth: js.UndefOr[Double | String] = js.native
    
    // TODO: Unused?
    // Disable pointer events while scrolling to improve performance
    var disablePointerEvents: js.UndefOr[Boolean] = js.native
    
    // TODO: Unused?
    // Whether or not the header should be fixed
    var fixedHeader: js.UndefOr[Boolean] = js.native
    
    // The minimum row height
    var rowHeight: js.UndefOr[Double | String] = js.native
    
    // The height of the table
    var tableHeight: js.UndefOr[Double | String] = js.native
    
    // The width of the table
    var tableWidth: js.UndefOr[Double | String] = js.native
  }
  object PositionSettings {
    
    @scala.inline
    def apply(): PositionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionSettings]
    }
    
    @scala.inline
    implicit class PositionSettingsMutableBuilder[Self <: PositionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultColumnWidth(value: Double | String): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColumnWidthUndefined: Self = StObject.set(x, "defaultColumnWidth", js.undefined)
      
      @scala.inline
      def setDisablePointerEvents(value: Boolean): Self = StObject.set(x, "disablePointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePointerEventsUndefined: Self = StObject.set(x, "disablePointerEvents", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setTableHeight(value: Double | String): Self = StObject.set(x, "tableHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeightUndefined: Self = StObject.set(x, "tableHeight", js.undefined)
      
      @scala.inline
      def setTableWidth(value: Double | String): Self = StObject.set(x, "tableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableWidthUndefined: Self = StObject.set(x, "tableWidth", js.undefined)
    }
  }
}
