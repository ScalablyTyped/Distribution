package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseHeadline extends StObject {
  
  var bit_flags: Double
  
  var content_type: String
  
  var created_at: Double
  
  var created_at_utc: Double
  
  var media_id: String
  
  var pk: String
  
  var status: String
  
  var text: String
  
  var `type`: Double
  
  var user: TimelineFeedResponseUser
  
  var user_id: Double
}
object TimelineFeedResponseHeadline {
  
  inline def apply(
    bit_flags: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    media_id: String,
    pk: String,
    status: String,
    text: String,
    `type`: Double,
    user: TimelineFeedResponseUser,
    user_id: Double
  ): TimelineFeedResponseHeadline = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseHeadline]
  }
  
  extension [Self <: TimelineFeedResponseHeadline](x: Self) {
    
    inline def setBit_flags(value: Double): Self = StObject.set(x, "bit_flags", value.asInstanceOf[js.Any])
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_at_utc(value: Double): Self = StObject.set(x, "created_at_utc", value.asInstanceOf[js.Any])
    
    inline def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser(value: TimelineFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
