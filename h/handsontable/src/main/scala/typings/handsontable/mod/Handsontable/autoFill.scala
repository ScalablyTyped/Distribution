package typings.handsontable.mod.Handsontable

import typings.handsontable.handsontableStrings.horizontal
import typings.handsontable.handsontableStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoFill {
  
  @js.native
  trait Settings extends StObject {
    
    var autoInsertRow: js.UndefOr[Boolean] = js.native
    
    var direction: js.UndefOr[vertical | horizontal] = js.native
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
      def setAutoInsertRow(value: Boolean): Self = StObject.set(x, "autoInsertRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoInsertRowUndefined: Self = StObject.set(x, "autoInsertRow", js.undefined)
      
      @scala.inline
      def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
}
