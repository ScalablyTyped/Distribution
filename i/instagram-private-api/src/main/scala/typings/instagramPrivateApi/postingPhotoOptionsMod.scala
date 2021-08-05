package typings.instagramPrivateApi

import typings.instagramPrivateApi.postingOptionsMod.PostingLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingStoryOptions
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postingPhotoOptionsMod {
  
  trait PostingPhotoOptions extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var file: Buffer
    
    var location: js.UndefOr[PostingLocation] = js.undefined
    
    var usertags: js.UndefOr[PostingUsertags] = js.undefined
  }
  object PostingPhotoOptions {
    
    inline def apply(file: Buffer): PostingPhotoOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingPhotoOptions]
    }
    
    extension [Self <: PostingPhotoOptions](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: PostingLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setUsertags(value: PostingUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      inline def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    }
  }
  
  trait PostingStoryPhotoOptions
    extends StObject
       with PostingStoryOptions {
    
    var file: Buffer
  }
  object PostingStoryPhotoOptions {
    
    inline def apply(file: Buffer): PostingStoryPhotoOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingStoryPhotoOptions]
    }
    
    extension [Self <: PostingStoryPhotoOptions](x: Self) {
      
      inline def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
