package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.entityMod.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newsFeedResponseMod {
  
  @JSImport("instagram-private-api/dist/responses/news.feed.response", "NewsFeedResponseStoriesItem")
  @js.native
  class NewsFeedResponseStoriesItem protected () extends Entity {
    def this(client: IgApiClient) = this()
    
    var args: NewsFeedResponseArgs = js.native
    
    var counts: NewsFeedResponseCounts = js.native
    
    var pk: String = js.native
    
    var story_type: Double = js.native
    
    var `type`: Double = js.native
  }
  
  @js.native
  trait NewsFeedResponseArgs extends StObject {
    
    var comment_id: js.UndefOr[String] = js.native
    
    var comment_ids: js.UndefOr[js.Array[String]] = js.native
    
    var links: js.Array[NewsFeedResponseLinksItem] = js.native
    
    var media: js.UndefOr[js.Array[NewsFeedResponseMediaItem]] = js.native
    
    var profile_id: Double = js.native
    
    var profile_image: String = js.native
    
    var profile_image_destination: js.UndefOr[String] = js.native
    
    var second_profile_id: js.UndefOr[Double] = js.native
    
    var second_profile_image: js.UndefOr[String] = js.native
    
    var text: String = js.native
    
    var timestamp: Double = js.native
    
    var tuuid: String = js.native
  }
  object NewsFeedResponseArgs {
    
    @scala.inline
    def apply(
      links: js.Array[NewsFeedResponseLinksItem],
      profile_id: Double,
      profile_image: String,
      text: String,
      timestamp: Double,
      tuuid: String
    ): NewsFeedResponseArgs = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], profile_id = profile_id.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tuuid = tuuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewsFeedResponseArgs]
    }
    
    @scala.inline
    implicit class NewsFeedResponseArgsMutableBuilder[Self <: NewsFeedResponseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment_id(value: String): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_idUndefined: Self = StObject.set(x, "comment_id", js.undefined)
      
      @scala.inline
      def setComment_ids(value: js.Array[String]): Self = StObject.set(x, "comment_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_idsUndefined: Self = StObject.set(x, "comment_ids", js.undefined)
      
      @scala.inline
      def setComment_idsVarargs(value: String*): Self = StObject.set(x, "comment_ids", js.Array(value :_*))
      
      @scala.inline
      def setLinks(value: js.Array[NewsFeedResponseLinksItem]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksVarargs(value: NewsFeedResponseLinksItem*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setMedia(value: js.Array[NewsFeedResponseMediaItem]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMediaVarargs(value: NewsFeedResponseMediaItem*): Self = StObject.set(x, "media", js.Array(value :_*))
      
      @scala.inline
      def setProfile_id(value: Double): Self = StObject.set(x, "profile_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_image(value: String): Self = StObject.set(x, "profile_image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_image_destination(value: String): Self = StObject.set(x, "profile_image_destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_image_destinationUndefined: Self = StObject.set(x, "profile_image_destination", js.undefined)
      
      @scala.inline
      def setSecond_profile_id(value: Double): Self = StObject.set(x, "second_profile_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond_profile_idUndefined: Self = StObject.set(x, "second_profile_id", js.undefined)
      
      @scala.inline
      def setSecond_profile_image(value: String): Self = StObject.set(x, "second_profile_image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond_profile_imageUndefined: Self = StObject.set(x, "second_profile_image", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTuuid(value: String): Self = StObject.set(x, "tuuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewsFeedResponseCounts extends StObject
  
  @js.native
  trait NewsFeedResponseLinksItem extends StObject {
    
    var end: Double = js.native
    
    var id: String = js.native
    
    var start: Double = js.native
    
    var `type`: String = js.native
  }
  object NewsFeedResponseLinksItem {
    
    @scala.inline
    def apply(end: Double, id: String, start: Double, `type`: String): NewsFeedResponseLinksItem = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewsFeedResponseLinksItem]
    }
    
    @scala.inline
    implicit class NewsFeedResponseLinksItemMutableBuilder[Self <: NewsFeedResponseLinksItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewsFeedResponseMediaItem extends StObject {
    
    var comment_threading_enabled: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var image: String = js.native
  }
  object NewsFeedResponseMediaItem {
    
    @scala.inline
    def apply(id: String, image: String): NewsFeedResponseMediaItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewsFeedResponseMediaItem]
    }
    
    @scala.inline
    implicit class NewsFeedResponseMediaItemMutableBuilder[Self <: NewsFeedResponseMediaItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_threading_enabledUndefined: Self = StObject.set(x, "comment_threading_enabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewsFeedResponseRootObject extends StObject {
    
    var auto_load_more_enabled: Boolean = js.native
    
    var next_max_id: Double = js.native
    
    var status: String = js.native
    
    var stories: js.Array[NewsFeedResponseStoriesItem] = js.native
  }
  object NewsFeedResponseRootObject {
    
    @scala.inline
    def apply(
      auto_load_more_enabled: Boolean,
      next_max_id: Double,
      status: String,
      stories: js.Array[NewsFeedResponseStoriesItem]
    ): NewsFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewsFeedResponseRootObject]
    }
    
    @scala.inline
    implicit class NewsFeedResponseRootObjectMutableBuilder[Self <: NewsFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_id(value: Double): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStories(value: js.Array[NewsFeedResponseStoriesItem]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesVarargs(value: NewsFeedResponseStoriesItem*): Self = StObject.set(x, "stories", js.Array(value :_*))
    }
  }
}
