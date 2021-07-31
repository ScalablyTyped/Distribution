package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListMessages extends StObject {
  
  var commands: js.UndefOr[TreeListMessagesCommands] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
  
  var noRows: js.UndefOr[String] = js.undefined
  
  var requestFailed: js.UndefOr[String] = js.undefined
  
  var retry: js.UndefOr[String] = js.undefined
}
object TreeListMessages {
  
  @scala.inline
  def apply(): TreeListMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListMessages]
  }
  
  @scala.inline
  implicit class TreeListMessagesMutableBuilder[Self <: TreeListMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: TreeListMessagesCommands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setNoRows(value: String): Self = StObject.set(x, "noRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRowsUndefined: Self = StObject.set(x, "noRows", js.undefined)
    
    @scala.inline
    def setRequestFailed(value: String): Self = StObject.set(x, "requestFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestFailedUndefined: Self = StObject.set(x, "requestFailed", js.undefined)
    
    @scala.inline
    def setRetry(value: String): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
