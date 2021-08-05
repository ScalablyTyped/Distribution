package typings.htmlToText

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ForceWrapOnLimit extends StObject {
    
    /**
      * defines whether to break long words on the limit if true.
      */
    var forceWrapOnLimit: Boolean
    
    /**
      * an array containing the characters that may be wrapped on.
      * These are used in order.
      */
    var wrapCharacters: js.Array[String]
  }
  object ForceWrapOnLimit {
    
    inline def apply(forceWrapOnLimit: Boolean, wrapCharacters: js.Array[String]): ForceWrapOnLimit = {
      val __obj = js.Dynamic.literal(forceWrapOnLimit = forceWrapOnLimit.asInstanceOf[js.Any], wrapCharacters = wrapCharacters.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceWrapOnLimit]
    }
    
    extension [Self <: ForceWrapOnLimit](x: Self) {
      
      inline def setForceWrapOnLimit(value: Boolean): Self = StObject.set(x, "forceWrapOnLimit", value.asInstanceOf[js.Any])
      
      inline def setWrapCharacters(value: js.Array[String]): Self = StObject.set(x, "wrapCharacters", value.asInstanceOf[js.Any])
      
      inline def setWrapCharactersVarargs(value: String*): Self = StObject.set(x, "wrapCharacters", js.Array(value :_*))
    }
  }
  
  trait IsAttributeValue extends StObject {
    
    var isAttributeValue: Boolean
    
    var strict: Boolean
  }
  object IsAttributeValue {
    
    inline def apply(isAttributeValue: Boolean, strict: Boolean): IsAttributeValue = {
      val __obj = js.Dynamic.literal(isAttributeValue = isAttributeValue.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsAttributeValue]
    }
    
    extension [Self <: IsAttributeValue](x: Self) {
      
      inline def setIsAttributeValue(value: Boolean): Self = StObject.set(x, "isAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
}
