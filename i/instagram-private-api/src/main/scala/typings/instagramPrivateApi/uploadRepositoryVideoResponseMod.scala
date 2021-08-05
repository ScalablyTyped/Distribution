package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadRepositoryVideoResponseMod {
  
  trait UploadRepositoryVideoResponseRootObject extends StObject {
    
    var status: String
    
    var xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces
  }
  object UploadRepositoryVideoResponseRootObject {
    
    inline def apply(status: String, xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces): UploadRepositoryVideoResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadRepositoryVideoResponseRootObject]
    }
    
    extension [Self <: UploadRepositoryVideoResponseRootObject](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setXsharing_nonces(value: UploadRepositoryVideoResponseXsharingNonces): Self = StObject.set(x, "xsharing_nonces", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadRepositoryVideoResponseXsharingNonces extends StObject
}
