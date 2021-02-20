package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadRepositoryPhotoResponseMod {
  
  @js.native
  trait UploadRepositoryPhotoResponseRootObject extends StObject {
    
    var status: String = js.native
    
    var upload_id: String = js.native
    
    var xsharing_nonces: UploadRepositoryPhotoResponseXsharingNonces = js.native
  }
  object UploadRepositoryPhotoResponseRootObject {
    
    @scala.inline
    def apply(status: String, upload_id: String, xsharing_nonces: UploadRepositoryPhotoResponseXsharingNonces): UploadRepositoryPhotoResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadRepositoryPhotoResponseRootObject]
    }
    
    @scala.inline
    implicit class UploadRepositoryPhotoResponseRootObjectMutableBuilder[Self <: UploadRepositoryPhotoResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsharing_nonces(value: UploadRepositoryPhotoResponseXsharingNonces): Self = StObject.set(x, "xsharing_nonces", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UploadRepositoryPhotoResponseXsharingNonces extends StObject
}
