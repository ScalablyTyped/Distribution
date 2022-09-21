package typings.intlifyVueDevtools

import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-compilation`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-evaluation`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-resolve`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.global
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: js.UndefOr[Double] = js.undefined
    
    var error: String
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var message: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathValue */ Any
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object End {
    
    inline def apply(
      error: String,
      message: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathValue */ Any
    ): End = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setMessage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathValue */ Any
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait From extends StObject {
    
    var from: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locale */ Any
      ] = js.undefined
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    
    var to: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locale */ Any) | global
    
    var `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreMissingType */ Any
  }
  object From {
    
    inline def apply(
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      to: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locale */ Any) | global,
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreMissingType */ Any
    ): From = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locale */ Any
      ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTo(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locale */ Any) | global
      ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreMissingType */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GroupId extends StObject {
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    
    var locale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locale */ Any
    
    var `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreMissingType */ Any
  }
  object GroupId {
    
    inline def apply(
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      locale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locale */ Any,
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreMissingType */ Any
    ): GroupId = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupId]
    }
    
    extension [Self <: GroupId](x: Self) {
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLocale(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locale */ Any
      ): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreMissingType */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    
    var message: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathValue */ Any
    
    var time: Double
    
    var `type`: `message-resolve`
  }
  object Key {
    
    inline def apply(
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      message: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathValue */ Any,
      time: Double
    ): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("message-resolve")
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathValue */ Any
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setType(value: `message-resolve`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var message: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathValue */ Any
    
    var time: Double
    
    var `type`: `message-compilation`
  }
  object Message {
    
    inline def apply(
      message: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathValue */ Any,
      time: Double
    ): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("message-compilation")
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setMessage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathValue */ Any
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setType(value: `message-compilation`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Time extends StObject {
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var time: Double
    
    var `type`: `message-evaluation`
    
    var value: Any
  }
  object Time {
    
    inline def apply(time: Double, value: Any): Time = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("message-evaluation")
      __obj.asInstanceOf[Time]
    }
    
    extension [Self <: Time](x: Self) {
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setType(value: `message-evaluation`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
