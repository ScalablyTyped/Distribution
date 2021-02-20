package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridFilterable extends StObject {
  
  var extra: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[GridFilterableMessages] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var operators: js.UndefOr[GridFilterableOperators] = js.native
}
object GridFilterable {
  
  @scala.inline
  def apply(): GridFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFilterable]
  }
  
  @scala.inline
  implicit class GridFilterableMutableBuilder[Self <: GridFilterable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setMessages(value: GridFilterableMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOperators(value: GridFilterableOperators): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
  }
}
