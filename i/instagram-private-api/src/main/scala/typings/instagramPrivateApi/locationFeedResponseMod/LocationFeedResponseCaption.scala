package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseCaption extends StObject {
  
  var bit_flags: Double
  
  var content_type: String
  
  var created_at: Double
  
  var created_at_utc: Double
  
  var did_report_as_spam: Boolean
  
  var has_translation: js.UndefOr[Boolean] = js.undefined
  
  var media_id: String
  
  var pk: String
  
  var share_enabled: Boolean
  
  var status: String
  
  var text: String
  
  var `type`: Double
  
  var user: LocationFeedResponseUser
  
  var user_id: Double
}
object LocationFeedResponseCaption {
  
  @scala.inline
  def apply(
    bit_flags: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    media_id: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: LocationFeedResponseUser,
    user_id: Double
  ): LocationFeedResponseCaption = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseCaption]
  }
  
  @scala.inline
  implicit class LocationFeedResponseCaptionMutableBuilder[Self <: LocationFeedResponseCaption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBit_flags(value: Double): Self = StObject.set(x, "bit_flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at_utc(value: Double): Self = StObject.set(x, "created_at_utc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDid_report_as_spam(value: Boolean): Self = StObject.set(x, "did_report_as_spam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_translation(value: Boolean): Self = StObject.set(x, "has_translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_translationUndefined: Self = StObject.set(x, "has_translation", js.undefined)
    
    @scala.inline
    def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare_enabled(value: Boolean): Self = StObject.set(x, "share_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: LocationFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
