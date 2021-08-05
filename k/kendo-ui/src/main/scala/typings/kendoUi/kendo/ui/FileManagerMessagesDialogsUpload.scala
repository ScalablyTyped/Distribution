package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerMessagesDialogsUpload extends StObject {
  
  var clear: js.UndefOr[String] = js.undefined
  
  var done: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object FileManagerMessagesDialogsUpload {
  
  inline def apply(): FileManagerMessagesDialogsUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesDialogsUpload]
  }
  
  extension [Self <: FileManagerMessagesDialogsUpload](x: Self) {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setDone(value: String): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
