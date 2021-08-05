package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadRepositoryPhotoResponseMod {
  
  trait UploadRepositoryPhotoResponseRootObject extends StObject {
    
    var status: String
    
    var upload_id: String
    
    var xsharing_nonces: UploadRepositoryPhotoResponseXsharingNonces
  }
  object UploadRepositoryPhotoResponseRootObject {
    
    inline def apply(status: String, upload_id: String, xsharing_nonces: UploadRepositoryPhotoResponseXsharingNonces): UploadRepositoryPhotoResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadRepositoryPhotoResponseRootObject]
    }
    
    extension [Self <: UploadRepositoryPhotoResponseRootObject](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
      
      inline def setXsharing_nonces(value: UploadRepositoryPhotoResponseXsharingNonces): Self = StObject.set(x, "xsharing_nonces", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadRepositoryPhotoResponseXsharingNonces extends StObject
}
