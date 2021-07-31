package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Duration
import typings.instagramPrivateApi.postingOptionsMod.PostingLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postingAlbumOptionsMod {
  
  trait PostingAlbumItem extends StObject {
    
    var uploadId: js.UndefOr[String] = js.undefined
    
    var usertags: js.UndefOr[PostingUsertags] = js.undefined
  }
  object PostingAlbumItem {
    
    @scala.inline
    def apply(): PostingAlbumItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostingAlbumItem]
    }
    
    @scala.inline
    implicit class PostingAlbumItemMutableBuilder[Self <: PostingAlbumItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      @scala.inline
      def setUsertags(value: PostingUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    }
  }
  
  trait PostingAlbumOptions extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]
    
    var location: js.UndefOr[PostingLocation] = js.undefined
  }
  object PostingAlbumOptions {
    
    @scala.inline
    def apply(items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]): PostingAlbumOptions = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingAlbumOptions]
    }
    
    @scala.inline
    implicit class PostingAlbumOptionsMutableBuilder[Self <: PostingAlbumOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: (PostingAlbumPhotoItem | PostingAlbumVideoItem)*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: PostingLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  trait PostingAlbumPhotoItem
    extends StObject
       with PostingAlbumItem {
    
    var file: Buffer
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PostingAlbumPhotoItem {
    
    @scala.inline
    def apply(file: Buffer): PostingAlbumPhotoItem = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingAlbumPhotoItem]
    }
    
    @scala.inline
    implicit class PostingAlbumPhotoItemMutableBuilder[Self <: PostingAlbumPhotoItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PostingAlbumVideoItem
    extends StObject
       with PostingAlbumItem {
    
    var coverImage: Buffer
    
    var transcodeDelay: js.UndefOr[Double] = js.undefined
    
    var video: Buffer
    
    var videoInfo: js.UndefOr[Duration] = js.undefined
  }
  object PostingAlbumVideoItem {
    
    @scala.inline
    def apply(coverImage: Buffer, video: Buffer): PostingAlbumVideoItem = {
      val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingAlbumVideoItem]
    }
    
    @scala.inline
    implicit class PostingAlbumVideoItemMutableBuilder[Self <: PostingAlbumVideoItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverImage(value: Buffer): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      @scala.inline
      def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoInfo(value: Duration): Self = StObject.set(x, "videoInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoInfoUndefined: Self = StObject.set(x, "videoInfo", js.undefined)
    }
  }
}
