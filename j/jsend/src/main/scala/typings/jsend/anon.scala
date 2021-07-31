package typings.jsend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var message: String
  }
  object Code {
    
    @scala.inline
    def apply(message: String): Code = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Strict extends StObject {
    
    var strict: Boolean
  }
  object Strict {
    
    @scala.inline
    def apply(strict: Boolean): Strict = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[Strict]
    }
    
    @scala.inline
    implicit class StrictMutableBuilder[Self <: Strict] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
}
