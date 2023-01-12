package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttMessagesActions extends StObject {
  
  var addChild: js.UndefOr[String] = js.undefined
  
  var append: js.UndefOr[String] = js.undefined
  
  var insertAfter: js.UndefOr[String] = js.undefined
  
  var insertBefore: js.UndefOr[String] = js.undefined
  
  var pdf: js.UndefOr[String] = js.undefined
}
object GanttMessagesActions {
  
  inline def apply(): GanttMessagesActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessagesActions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GanttMessagesActions] (val x: Self) extends AnyVal {
    
    inline def setAddChild(value: String): Self = StObject.set(x, "addChild", value.asInstanceOf[js.Any])
    
    inline def setAddChildUndefined: Self = StObject.set(x, "addChild", js.undefined)
    
    inline def setAppend(value: String): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setInsertAfter(value: String): Self = StObject.set(x, "insertAfter", value.asInstanceOf[js.Any])
    
    inline def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
    
    inline def setInsertBefore(value: String): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
    
    inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    inline def setPdf(value: String): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
  }
}
