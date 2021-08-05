package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A subscription resource contains information about a YouTube user
  * subscription. A subscription notifies a user when new videos are added to a
  * channel or when another user takes one of several actions on YouTube, such
  * as uploading a video, rating a video, or commenting on a video.
  */
trait SchemaSubscription extends StObject {
  
  /**
    * The contentDetails object contains basic statistics about the
    * subscription.
    */
  var contentDetails: js.UndefOr[SchemaSubscriptionContentDetails] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the subscription.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#subscription&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The snippet object contains basic details about the subscription,
    * including its title and the channel that the user subscribed to.
    */
  var snippet: js.UndefOr[SchemaSubscriptionSnippet] = js.undefined
  
  /**
    * The subscriberSnippet object contains basic details about the sbuscriber.
    */
  var subscriberSnippet: js.UndefOr[SchemaSubscriptionSubscriberSnippet] = js.undefined
}
object SchemaSubscription {
  
  inline def apply(): SchemaSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscription]
  }
  
  extension [Self <: SchemaSubscription](x: Self) {
    
    inline def setContentDetails(value: SchemaSubscriptionContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSnippet(value: SchemaSubscriptionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setSubscriberSnippet(value: SchemaSubscriptionSubscriberSnippet): Self = StObject.set(x, "subscriberSnippet", value.asInstanceOf[js.Any])
    
    inline def setSubscriberSnippetUndefined: Self = StObject.set(x, "subscriberSnippet", js.undefined)
  }
}
