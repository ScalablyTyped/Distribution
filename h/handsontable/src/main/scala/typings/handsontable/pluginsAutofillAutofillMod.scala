package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsAutofillAutofillMod {
  
  @JSImport("handsontable/plugins/autofill/autofill", "Autofill")
  @js.native
  open class Autofill protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    var autoInsertRow: Boolean = js.native
    
    def isEnabled(): Boolean = js.native
  }
  
  trait DetailedSettings
    extends StObject
       with _Settings {
    
    var autoInsertRow: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetailedSettings] (val x: Self) extends AnyVal {
      
      inline def setAutoInsertRow(value: Boolean): Self = StObject.set(x, "autoInsertRow", value.asInstanceOf[js.Any])
      
      inline def setAutoInsertRowUndefined: Self = StObject.set(x, "autoInsertRow", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.vertical
    - typings.handsontable.handsontableStrings.horizontal
  */
  trait Direction
    extends StObject
       with _Settings
  object Direction {
    
    inline def horizontal: typings.handsontable.handsontableStrings.horizontal = "horizontal".asInstanceOf[typings.handsontable.handsontableStrings.horizontal]
    
    inline def vertical: typings.handsontable.handsontableStrings.vertical = "vertical".asInstanceOf[typings.handsontable.handsontableStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.handsontable.pluginsAutofillAutofillMod.Direction
    - typings.handsontable.pluginsAutofillAutofillMod.DetailedSettings
  */
  type Settings = _Settings | Boolean
  
  trait _Settings extends StObject
}
