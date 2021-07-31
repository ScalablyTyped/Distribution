package typings.logfmt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
  }
  object ContentType {
    
    @scala.inline
    def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    }
  }
  
  trait Contentlength extends StObject {
    
    var content_length: js.UndefOr[String] = js.undefined
    
    var content_type: js.UndefOr[String] = js.undefined
    
    var ip: String
    
    var method: String
    
    var path: String
    
    var request_id: js.UndefOr[String] = js.undefined
    
    var status: Double
    
    var time: String
  }
  object Contentlength {
    
    @scala.inline
    def apply(ip: String, method: String, path: String, status: Double, time: String): Contentlength = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contentlength]
    }
    
    @scala.inline
    implicit class ContentlengthMutableBuilder[Self <: Contentlength] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_length(value: String): Self = StObject.set(x, "content_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_lengthUndefined: Self = StObject.set(x, "content_length", js.undefined)
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delimiter extends StObject {
    
    var delimiter: js.UndefOr[String] = js.undefined
  }
  object Delimiter {
    
    @scala.inline
    def apply(): Delimiter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delimiter]
    }
    
    @scala.inline
    implicit class DelimiterMutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
  }
  object End {
    
    @scala.inline
    def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
}
