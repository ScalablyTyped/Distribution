package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownTreeMessages extends StObject {
  
  var clear: js.UndefOr[String] = js.native
  
  var deleteTag: js.UndefOr[String] = js.native
  
  var singleTag: js.UndefOr[String] = js.native
}
object DropDownTreeMessages {
  
  @scala.inline
  def apply(): DropDownTreeMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeMessages]
  }
  
  @scala.inline
  implicit class DropDownTreeMessagesMutableBuilder[Self <: DropDownTreeMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setDeleteTag(value: String): Self = StObject.set(x, "deleteTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTagUndefined: Self = StObject.set(x, "deleteTag", js.undefined)
    
    @scala.inline
    def setSingleTag(value: String): Self = StObject.set(x, "singleTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleTagUndefined: Self = StObject.set(x, "singleTag", js.undefined)
  }
}
