package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorNodeUpdateDomOptions extends StObject {
  
  var recurse: js.UndefOr[Boolean] = js.native
  
  var updateIndexes: js.UndefOr[Boolean] = js.native
}
object JSONEditorNodeUpdateDomOptions {
  
  @scala.inline
  def apply(): JSONEditorNodeUpdateDomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorNodeUpdateDomOptions]
  }
  
  @scala.inline
  implicit class JSONEditorNodeUpdateDomOptionsMutableBuilder[Self <: JSONEditorNodeUpdateDomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    
    @scala.inline
    def setUpdateIndexes(value: Boolean): Self = StObject.set(x, "updateIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateIndexesUndefined: Self = StObject.set(x, "updateIndexes", js.undefined)
  }
}
