package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a channel that a user subscribed to.
  */
trait SchemaActivityContentDetailsSubscription extends StObject {
  
  /**
    * The resourceId object contains information that identifies the resource
    * that the user subscribed to.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.undefined
}
object SchemaActivityContentDetailsSubscription {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsSubscription]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsSubscriptionMutableBuilder[Self <: SchemaActivityContentDetailsSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
