package typings.jqueryFileupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuerySupport extends StObject {
  
  var fileInput: js.UndefOr[Boolean] = js.undefined
}
object JQuerySupport {
  
  inline def apply(): JQuerySupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQuerySupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    
    inline def setFileInput(value: Boolean): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    inline def setFileInputUndefined: Self = StObject.set(x, "fileInput", js.undefined)
  }
}
