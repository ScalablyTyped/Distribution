package typings.jupyterlabCoreutils

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Download extends StObject {
    
    var download: Boolean
    
    var format: String
    
    var path: String
  }
  object Download {
    
    @scala.inline
    def apply(download: Boolean, format: String, path: String): Download = {
      val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Download]
    }
    
    @scala.inline
    implicit class DownloadMutableBuilder[Self <: Download] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Raw extends StObject {
    
    var raw: String
    
    var rule: RegExp
  }
  object Raw {
    
    @scala.inline
    def apply(raw: String, rule: RegExp): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    @scala.inline
    implicit class RawMutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: RegExp): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
}
