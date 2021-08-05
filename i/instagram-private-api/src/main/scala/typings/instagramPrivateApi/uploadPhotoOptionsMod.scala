package typings.instagramPrivateApi

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadPhotoOptionsMod {
  
  trait UploadPhotoOptions extends StObject {
    
    var file: Buffer
    
    var isSidecar: js.UndefOr[Boolean] = js.undefined
    
    var uploadId: js.UndefOr[String] = js.undefined
    
    var waterfallId: js.UndefOr[String] = js.undefined
  }
  object UploadPhotoOptions {
    
    inline def apply(file: Buffer): UploadPhotoOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadPhotoOptions]
    }
    
    extension [Self <: UploadPhotoOptions](x: Self) {
      
      inline def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setIsSidecar(value: Boolean): Self = StObject.set(x, "isSidecar", value.asInstanceOf[js.Any])
      
      inline def setIsSidecarUndefined: Self = StObject.set(x, "isSidecar", js.undefined)
      
      inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      inline def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
      
      inline def setWaterfallIdUndefined: Self = StObject.set(x, "waterfallId", js.undefined)
    }
  }
}
