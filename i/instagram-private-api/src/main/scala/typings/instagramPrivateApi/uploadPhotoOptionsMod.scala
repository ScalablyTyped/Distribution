package typings.instagramPrivateApi

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadPhotoOptionsMod {
  
  @js.native
  trait UploadPhotoOptions extends StObject {
    
    var file: Buffer = js.native
    
    var isSidecar: js.UndefOr[Boolean] = js.native
    
    var uploadId: js.UndefOr[String] = js.native
    
    var waterfallId: js.UndefOr[String] = js.native
  }
  object UploadPhotoOptions {
    
    @scala.inline
    def apply(file: Buffer): UploadPhotoOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadPhotoOptions]
    }
    
    @scala.inline
    implicit class UploadPhotoOptionsMutableBuilder[Self <: UploadPhotoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSidecar(value: Boolean): Self = StObject.set(x, "isSidecar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSidecarUndefined: Self = StObject.set(x, "isSidecar", js.undefined)
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      @scala.inline
      def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaterfallIdUndefined: Self = StObject.set(x, "waterfallId", js.undefined)
    }
  }
}
