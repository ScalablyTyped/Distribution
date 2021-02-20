package typings.instagramPrivateApi

import typings.instagramPrivateApi.postingOptionsMod.PostingLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingStoryOptions
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postingPhotoOptionsMod {
  
  @js.native
  trait PostingPhotoOptions extends StObject {
    
    var caption: js.UndefOr[String] = js.native
    
    var file: Buffer = js.native
    
    var location: js.UndefOr[PostingLocation] = js.native
    
    var usertags: js.UndefOr[PostingUsertags] = js.native
  }
  object PostingPhotoOptions {
    
    @scala.inline
    def apply(file: Buffer): PostingPhotoOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingPhotoOptions]
    }
    
    @scala.inline
    implicit class PostingPhotoOptionsMutableBuilder[Self <: PostingPhotoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: PostingLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setUsertags(value: PostingUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    }
  }
  
  @js.native
  trait PostingStoryPhotoOptions extends PostingStoryOptions {
    
    var file: Buffer = js.native
  }
  object PostingStoryPhotoOptions {
    
    @scala.inline
    def apply(file: Buffer): PostingStoryPhotoOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingStoryPhotoOptions]
    }
    
    @scala.inline
    implicit class PostingStoryPhotoOptionsMutableBuilder[Self <: PostingStoryPhotoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
