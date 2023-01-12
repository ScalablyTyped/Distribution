package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadValidation extends StObject {
  
  var allowedExtensions: js.UndefOr[Any] = js.undefined
  
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  var minFileSize: js.UndefOr[Double] = js.undefined
}
object UploadValidation {
  
  inline def apply(): UploadValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadValidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadValidation] (val x: Self) extends AnyVal {
    
    inline def setAllowedExtensions(value: Any): Self = StObject.set(x, "allowedExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowedExtensionsUndefined: Self = StObject.set(x, "allowedExtensions", js.undefined)
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setMinFileSize(value: Double): Self = StObject.set(x, "minFileSize", value.asInstanceOf[js.Any])
    
    inline def setMinFileSizeUndefined: Self = StObject.set(x, "minFileSize", js.undefined)
  }
}
