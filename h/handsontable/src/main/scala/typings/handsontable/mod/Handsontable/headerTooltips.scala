package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerTooltips {
  
  @js.native
  trait Settings extends StObject {
    
    var columns: js.UndefOr[Boolean] = js.native
    
    var onlyTrimmed: js.UndefOr[Boolean] = js.native
    
    var rows: js.UndefOr[Boolean] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: Boolean): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setOnlyTrimmed(value: Boolean): Self = StObject.set(x, "onlyTrimmed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyTrimmedUndefined: Self = StObject.set(x, "onlyTrimmed", js.undefined)
      
      @scala.inline
      def setRows(value: Boolean): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
}
