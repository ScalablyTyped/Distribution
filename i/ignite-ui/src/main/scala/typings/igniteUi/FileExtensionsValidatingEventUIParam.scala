package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileExtensionsValidatingEventUIParam extends StObject {
  
  /**
    * Gets the file extension.
    */
  var fileExtension: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the full file name.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object FileExtensionsValidatingEventUIParam {
  
  @scala.inline
  def apply(): FileExtensionsValidatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileExtensionsValidatingEventUIParam]
  }
  
  @scala.inline
  implicit class FileExtensionsValidatingEventUIParamMutableBuilder[Self <: FileExtensionsValidatingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
