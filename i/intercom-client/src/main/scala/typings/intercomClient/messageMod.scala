package typings.intercomClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @js.native
  trait Avatar extends StObject {
    
    var image_url: String = js.native
  }
  object Avatar {
    
    @scala.inline
    def apply(image_url: String): Avatar = {
      val __obj = js.Dynamic.literal(image_url = image_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    @scala.inline
    implicit class AvatarMutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateMessage extends MessageModel {
    
    var from: FromToObject = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var to: FromToObject = js.native
  }
  object CreateMessage {
    
    @scala.inline
    def apply(body: String, from: FromToObject, message_type: String, to: FromToObject): CreateMessage = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateMessage]
    }
    
    @scala.inline
    implicit class CreateMessageMutableBuilder[Self <: CreateMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: FromToObject): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTo(value: FromToObject): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FromToObject extends StObject {
    
    var id: String = js.native
    
    var `type`: String = js.native
  }
  object FromToObject {
    
    @scala.inline
    def apply(id: String, `type`: String): FromToObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromToObject]
    }
    
    @scala.inline
    implicit class FromToObjectMutableBuilder[Self <: FromToObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Message extends MessageModel {
    
    var created_at: Double = js.native
    
    var id: String = js.native
    
    var owner: Owner = js.native
    
    var `type`: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(body: String, created_at: Double, id: String, message_type: String, owner: Owner, `type`: String): Message = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageModel extends StObject {
    
    var body: String = js.native
    
    var message_type: String = js.native
    
    var subject: js.UndefOr[String] = js.native
  }
  object MessageModel {
    
    @scala.inline
    def apply(body: String, message_type: String): MessageModel = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageModel]
    }
    
    @scala.inline
    implicit class MessageModelMutableBuilder[Self <: MessageModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage_type(value: String): Self = StObject.set(x, "message_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  @js.native
  trait Owner extends StObject {
    
    var avatar: Avatar = js.native
    
    var away_mode_enabled: Boolean = js.native
    
    var away_mode_reassign: Boolean = js.native
    
    var email: String = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object Owner {
    
    @scala.inline
    def apply(
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
    implicit class OwnerMutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAway_mode_enabled(value: Boolean): Self = StObject.set(x, "away_mode_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAway_mode_reassign(value: Boolean): Self = StObject.set(x, "away_mode_reassign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
