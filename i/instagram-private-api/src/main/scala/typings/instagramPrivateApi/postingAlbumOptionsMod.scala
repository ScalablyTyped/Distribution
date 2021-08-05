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
    
    inline def apply(): PostingAlbumItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostingAlbumItem]
    }
    
    extension [Self <: PostingAlbumItem](x: Self) {
      
      inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      inline def setUsertags(value: PostingUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      inline def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    }
  }
  
  trait PostingAlbumOptions extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]
    
    var location: js.UndefOr[PostingLocation] = js.undefined
  }
  object PostingAlbumOptions {
    
    inline def apply(items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]): PostingAlbumOptions = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingAlbumOptions]
    }
    
    extension [Self <: PostingAlbumOptions](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setItems(value: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: (PostingAlbumPhotoItem | PostingAlbumVideoItem)*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setLocation(value: PostingLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
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
    
    inline def apply(file: Buffer): PostingAlbumPhotoItem = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingAlbumPhotoItem]
    }
    
    extension [Self <: PostingAlbumPhotoItem](x: Self) {
      
      inline def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    inline def apply(coverImage: Buffer, video: Buffer): PostingAlbumVideoItem = {
      val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingAlbumVideoItem]
    }
    
    extension [Self <: PostingAlbumVideoItem](x: Self) {
      
      inline def setCoverImage(value: Buffer): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
      
      inline def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      inline def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      inline def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoInfo(value: Duration): Self = StObject.set(x, "videoInfo", value.asInstanceOf[js.Any])
      
      inline def setVideoInfoUndefined: Self = StObject.set(x, "videoInfo", js.undefined)
    }
  }
}
