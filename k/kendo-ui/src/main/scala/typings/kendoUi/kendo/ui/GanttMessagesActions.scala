package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttMessagesActions extends StObject {
  
  var addChild: js.UndefOr[String] = js.native
  
  var append: js.UndefOr[String] = js.native
  
  var insertAfter: js.UndefOr[String] = js.native
  
  var insertBefore: js.UndefOr[String] = js.native
  
  var pdf: js.UndefOr[String] = js.native
}
object GanttMessagesActions {
  
  @scala.inline
  def apply(): GanttMessagesActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessagesActions]
  }
  
  @scala.inline
  implicit class GanttMessagesActionsMutableBuilder[Self <: GanttMessagesActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddChild(value: String): Self = StObject.set(x, "addChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddChildUndefined: Self = StObject.set(x, "addChild", js.undefined)
    
    @scala.inline
    def setAppend(value: String): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    @scala.inline
    def setInsertAfter(value: String): Self = StObject.set(x, "insertAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
    
    @scala.inline
    def setInsertBefore(value: String): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    @scala.inline
    def setPdf(value: String): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
  }
}
