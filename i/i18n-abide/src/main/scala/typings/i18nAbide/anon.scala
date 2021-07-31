package typings.i18nAbide

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    def error(msg: String): Unit
    
    def warn(msg: String): Unit
  }
  object Error {
    
    @scala.inline
    def apply(error: String => Unit, warn: String => Unit): Error = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait Lang extends StObject {
    
    var lang: String
    
    var quality: Double
  }
  object Lang {
    
    @scala.inline
    def apply(lang: String, quality: Double): Lang = {
      val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lang]
    }
    
    @scala.inline
    implicit class LangMutableBuilder[Self <: Lang] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    }
  }
}
