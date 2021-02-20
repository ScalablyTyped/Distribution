package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnXHRLoadEventUIParam extends StObject {
  
  /**
    * Gets the unique identifier of the file.
    */
  var fileId: js.UndefOr[Double] = js.native
  
  /**
    * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from the server-side), etc.
    */
  var fileInfo: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to the original XMLHttpRequest object.
    */
  var xhr: js.UndefOr[js.Any] = js.native
}
object OnXHRLoadEventUIParam {
  
  @scala.inline
  def apply(): OnXHRLoadEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnXHRLoadEventUIParam]
  }
  
  @scala.inline
  implicit class OnXHRLoadEventUIParamMutableBuilder[Self <: OnXHRLoadEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setFileInfo(value: js.Any): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInfoUndefined: Self = StObject.set(x, "fileInfo", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setXhr(value: js.Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
