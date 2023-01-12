package typings.intercomClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  trait Avatar extends StObject {
    
    var image_url: String
  }
  object Avatar {
    
    inline def apply(image_url: String): Avatar = {
      val __obj = js.Dynamic.literal(image_url = image_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateMessage
    extends StObject
       with MessageModel {
    
    var from: FromToObject
    
    var template: js.UndefOr[String] = js.undefined
    
    var to: FromToObject
  }
  object CreateMessage {
    
    inline def apply(body: String, from: FromToObject, message_type: String, to: FromToObject): CreateMessage = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateMessage] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: FromToObject): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTo(value: FromToObject): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromToObject extends StObject {
    
    var id: String
    
    var `type`: String
  }
  object FromToObject {
    
    inline def apply(id: String, `type`: String): FromToObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromToObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromToObject] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message
    extends StObject
       with MessageModel {
    
    var created_at: Double
    
    var id: String
    
    var owner: Owner
    
    var `type`: String
  }
  object Message {
    
    inline def apply(body: String, created_at: Double, id: String, message_type: String, owner: Owner, `type`: String): Message = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageModel extends StObject {
    
    var body: String
    
    var message_type: String
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object MessageModel {
    
    inline def apply(body: String, message_type: String): MessageModel = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageModel] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setMessage_type(value: String): Self = StObject.set(x, "message_type", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  trait Owner extends StObject {
    
    var avatar: Avatar
    
    var away_mode_enabled: Boolean
    
    var away_mode_reassign: Boolean
    
    var email: String
    
    var id: String
    
    var name: String
    
    var `type`: String
  }
  object Owner {
    
    inline def apply(
      avatar: Avatar,
      away_mode_enabled: Boolean,
      away_mode_reassign: Boolean,
      email: String,
      id: String,
      name: String,
      `type`: String
    ): Owner = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], away_mode_enabled = away_mode_enabled.asInstanceOf[js.Any], away_mode_reassign = away_mode_reassign.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Owner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
      
      inline def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAway_mode_enabled(value: Boolean): Self = StObject.set(x, "away_mode_enabled", value.asInstanceOf[js.Any])
      
      inline def setAway_mode_reassign(value: Boolean): Self = StObject.set(x, "away_mode_reassign", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
