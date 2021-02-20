package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFile extends StObject {
  
  var extension: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object UploadFile {
  
  @scala.inline
  def apply(): UploadFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadFile]
  }
  
  @scala.inline
  implicit class UploadFileMutableBuilder[Self <: UploadFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
