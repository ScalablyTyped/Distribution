package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadValidation extends StObject {
  
  var allowedExtensions: js.UndefOr[js.Any] = js.native
  
  var maxFileSize: js.UndefOr[Double] = js.native
  
  var minFileSize: js.UndefOr[Double] = js.native
}
object UploadValidation {
  
  @scala.inline
  def apply(): UploadValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadValidation]
  }
  
  @scala.inline
  implicit class UploadValidationMutableBuilder[Self <: UploadValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedExtensions(value: js.Any): Self = StObject.set(x, "allowedExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedExtensionsUndefined: Self = StObject.set(x, "allowedExtensions", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    @scala.inline
    def setMinFileSize(value: Double): Self = StObject.set(x, "minFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFileSizeUndefined: Self = StObject.set(x, "minFileSize", js.undefined)
  }
}
