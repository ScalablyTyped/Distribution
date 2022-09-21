package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnXHRLoadEventUIParam extends StObject {
  
  /**
    * Gets the unique identifier of the file.
    */
  var fileId: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from the server-side), etc.
    */
  var fileInfo: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to the original XMLHttpRequest object.
    */
  var xhr: js.UndefOr[Any] = js.undefined
}
object OnXHRLoadEventUIParam {
  
  inline def apply(): OnXHRLoadEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnXHRLoadEventUIParam]
  }
  
  extension [Self <: OnXHRLoadEventUIParam](x: Self) {
    
    inline def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setFileInfo(value: Any): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
    
    inline def setFileInfoUndefined: Self = StObject.set(x, "fileInfo", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
