package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapsibleColumns {
  
  @js.native
  trait Settings extends StObject {
    
    var col: Double = js.native
    
    var collapsible: Boolean = js.native
    
    var row: Double = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(col: Double, collapsible: Boolean, row: Double): Settings = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
}
