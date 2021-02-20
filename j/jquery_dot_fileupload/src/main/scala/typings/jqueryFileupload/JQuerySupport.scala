package typings.jqueryFileupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySupport extends StObject {
  
  var fileInput: js.UndefOr[Boolean] = js.native
}
object JQuerySupport {
  
  @scala.inline
  def apply(): JQuerySupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQuerySupport]
  }
  
  @scala.inline
  implicit class JQuerySupportMutableBuilder[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileInput(value: Boolean): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInputUndefined: Self = StObject.set(x, "fileInput", js.undefined)
  }
}
