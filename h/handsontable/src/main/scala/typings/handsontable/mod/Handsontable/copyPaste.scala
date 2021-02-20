package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.plugins.PasteModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyPaste {
  
  @js.native
  trait Settings extends StObject {
    
    var columnsLimit: js.UndefOr[Double] = js.native
    
    var pasteMode: js.UndefOr[PasteModeType] = js.native
    
    var rowsLimit: js.UndefOr[Double] = js.native
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
      def setColumnsLimit(value: Double): Self = StObject.set(x, "columnsLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsLimitUndefined: Self = StObject.set(x, "columnsLimit", js.undefined)
      
      @scala.inline
      def setPasteMode(value: PasteModeType): Self = StObject.set(x, "pasteMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasteModeUndefined: Self = StObject.set(x, "pasteMode", js.undefined)
      
      @scala.inline
      def setRowsLimit(value: Double): Self = StObject.set(x, "rowsLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsLimitUndefined: Self = StObject.set(x, "rowsLimit", js.undefined)
    }
  }
}
