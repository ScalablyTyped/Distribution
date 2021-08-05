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
    
    inline def apply(download: Boolean, format: String, path: String): Download = {
      val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Download]
    }
    
    extension [Self <: Download](x: Self) {
      
      inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Raw extends StObject {
    
    var raw: String
    
    var rule: RegExp
  }
  object Raw {
    
    inline def apply(raw: String, rule: RegExp): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    extension [Self <: Raw](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRule(value: RegExp): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
}
