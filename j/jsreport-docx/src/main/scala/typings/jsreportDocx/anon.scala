package typings.jsreportDocx

import typings.jsreportDocx.jsreportDocxBooleans.`false`
import typings.jsreportDocx.jsreportDocxBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: String
    
    var encoding: String
  }
  object Content {
    
    @scala.inline
    def apply(content: String, encoding: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: `true`
    
    var publicUri: String
    
    var showWarning: `false`
  }
  object Enabled {
    
    @scala.inline
    def apply(publicUri: String): Enabled = {
      val __obj = js.Dynamic.literal(enabled = true, publicUri = publicUri.asInstanceOf[js.Any], showWarning = false)
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: `true`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUri(value: String): Self = StObject.set(x, "publicUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWarning(value: `false`): Self = StObject.set(x, "showWarning", value.asInstanceOf[js.Any])
    }
  }
}
