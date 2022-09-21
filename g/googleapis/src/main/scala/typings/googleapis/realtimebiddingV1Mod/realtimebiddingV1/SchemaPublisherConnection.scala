package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublisherConnection extends StObject {
  
  /**
    * Whether the publisher has been approved by the bidder.
    */
  var biddingState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the publisher initiated a connection with the bidder (irrespective of if or when the bidder approves it). This is subsequently updated if the publisher revokes and re-initiates the connection.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Publisher display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the publisher connection. This follows the pattern `bidders/{bidder\}/publisherConnections/{publisher\}`, where `{bidder\}` represents the account ID of the bidder, and `{publisher\}` is the ads.txt/app-ads.txt publisher ID.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether the publisher is an Ad Manager or AdMob publisher.
    */
  var publisherPlatform: js.UndefOr[String | Null] = js.undefined
}
object SchemaPublisherConnection {
  
  inline def apply(): SchemaPublisherConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherConnection]
  }
  
  extension [Self <: SchemaPublisherConnection](x: Self) {
    
    inline def setBiddingState(value: String): Self = StObject.set(x, "biddingState", value.asInstanceOf[js.Any])
    
    inline def setBiddingStateNull: Self = StObject.set(x, "biddingState", null)
    
    inline def setBiddingStateUndefined: Self = StObject.set(x, "biddingState", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisherPlatform(value: String): Self = StObject.set(x, "publisherPlatform", value.asInstanceOf[js.Any])
    
    inline def setPublisherPlatformNull: Self = StObject.set(x, "publisherPlatform", null)
    
    inline def setPublisherPlatformUndefined: Self = StObject.set(x, "publisherPlatform", js.undefined)
  }
}
