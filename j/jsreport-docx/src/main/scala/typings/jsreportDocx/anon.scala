package typings.jsreportDocx

import typings.jsreportDocx.jsreportDocxBooleans.`false`
import typings.jsreportDocx.jsreportDocxBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Content extends StObject {
    
    var content: String = js.native
    
    var encoding: String = js.native
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
  
  @js.native
  trait Enabled extends StObject {
    
    var enabled: `true` = js.native
    
    var publicUri: String = js.native
    
    var showWarning: `false` = js.native
  }
  object Enabled {
    
    @scala.inline
    def apply(enabled: `true`, publicUri: String, showWarning: `false`): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], publicUri = publicUri.asInstanceOf[js.Any], showWarning = showWarning.asInstanceOf[js.Any])
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
