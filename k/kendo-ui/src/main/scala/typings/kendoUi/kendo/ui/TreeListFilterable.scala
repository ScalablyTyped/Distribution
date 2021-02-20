package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListFilterable extends StObject {
  
  var extra: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[TreeListFilterableMessages] = js.native
  
  var operators: js.UndefOr[TreeListFilterableOperators] = js.native
}
object TreeListFilterable {
  
  @scala.inline
  def apply(): TreeListFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListFilterable]
  }
  
  @scala.inline
  implicit class TreeListFilterableMutableBuilder[Self <: TreeListFilterable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setMessages(value: TreeListFilterableMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setOperators(value: TreeListFilterableOperators): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
  }
}
