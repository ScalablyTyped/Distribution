package typings.htmlToText

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ForceWrapOnLimit extends StObject {
    
    /**
      * defines whether to break long words on the limit if true.
      */
    var forceWrapOnLimit: Boolean = js.native
    
    /**
      * an array containing the characters that may be wrapped on.
      * These are used in order.
      */
    var wrapCharacters: js.Array[String] = js.native
  }
  object ForceWrapOnLimit {
    
    @scala.inline
    def apply(forceWrapOnLimit: Boolean, wrapCharacters: js.Array[String]): ForceWrapOnLimit = {
      val __obj = js.Dynamic.literal(forceWrapOnLimit = forceWrapOnLimit.asInstanceOf[js.Any], wrapCharacters = wrapCharacters.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceWrapOnLimit]
    }
    
    @scala.inline
    implicit class ForceWrapOnLimitMutableBuilder[Self <: ForceWrapOnLimit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceWrapOnLimit(value: Boolean): Self = StObject.set(x, "forceWrapOnLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapCharacters(value: js.Array[String]): Self = StObject.set(x, "wrapCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapCharactersVarargs(value: String*): Self = StObject.set(x, "wrapCharacters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IsAttributeValue extends StObject {
    
    var isAttributeValue: Boolean = js.native
    
    var strict: Boolean = js.native
  }
  object IsAttributeValue {
    
    @scala.inline
    def apply(isAttributeValue: Boolean, strict: Boolean): IsAttributeValue = {
      val __obj = js.Dynamic.literal(isAttributeValue = isAttributeValue.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsAttributeValue]
    }
    
    @scala.inline
    implicit class IsAttributeValueMutableBuilder[Self <: IsAttributeValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAttributeValue(value: Boolean): Self = StObject.set(x, "isAttributeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
}
