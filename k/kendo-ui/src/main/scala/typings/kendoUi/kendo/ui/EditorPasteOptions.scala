package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorPasteOptions extends StObject {
  
  var split: js.UndefOr[Boolean] = js.native
}
object EditorPasteOptions {
  
  @scala.inline
  def apply(): EditorPasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPasteOptions]
  }
  
  @scala.inline
  implicit class EditorPasteOptionsMutableBuilder[Self <: EditorPasteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
