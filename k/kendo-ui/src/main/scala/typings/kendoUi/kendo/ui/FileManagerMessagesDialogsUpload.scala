package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerMessagesDialogsUpload extends StObject {
  
  var clear: js.UndefOr[String] = js.native
  
  var done: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object FileManagerMessagesDialogsUpload {
  
  @scala.inline
  def apply(): FileManagerMessagesDialogsUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesDialogsUpload]
  }
  
  @scala.inline
  implicit class FileManagerMessagesDialogsUploadMutableBuilder[Self <: FileManagerMessagesDialogsUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setDone(value: String): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
