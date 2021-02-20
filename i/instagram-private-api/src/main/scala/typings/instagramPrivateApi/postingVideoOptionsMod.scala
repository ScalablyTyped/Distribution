package typings.instagramPrivateApi

import typings.instagramPrivateApi.postingOptionsMod.PostingLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingStoryOptions
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postingVideoOptionsMod {
  
  @js.native
  trait PostingStoryVideoOptions extends PostingStoryOptions {
    
    var coverImage: Buffer = js.native
    
    var transcodeDelay: js.UndefOr[Double] = js.native
    
    var video: Buffer = js.native
  }
  object PostingStoryVideoOptions {
    
    @scala.inline
    def apply(coverImage: Buffer, video: Buffer): PostingStoryVideoOptions = {
      val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingStoryVideoOptions]
    }
    
    @scala.inline
    implicit class PostingStoryVideoOptionsMutableBuilder[Self <: PostingStoryVideoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverImage(value: Buffer): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      @scala.inline
      def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostingVideoOptions extends StObject {
    
    var caption: js.UndefOr[String] = js.native
    
    var coverImage: Buffer = js.native
    
    var location: js.UndefOr[PostingLocation] = js.native
    
    var transcodeDelay: js.UndefOr[Double] = js.native
    
    var usertags: js.UndefOr[PostingUsertags] = js.native
    
    var video: Buffer = js.native
  }
  object PostingVideoOptions {
    
    @scala.inline
    def apply(coverImage: Buffer, video: Buffer): PostingVideoOptions = {
      val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingVideoOptions]
    }
    
    @scala.inline
    implicit class PostingVideoOptionsMutableBuilder[Self <: PostingVideoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setCoverImage(value: Buffer): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: PostingLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      @scala.inline
      def setUsertags(value: PostingUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
      
      @scala.inline
      def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
}
