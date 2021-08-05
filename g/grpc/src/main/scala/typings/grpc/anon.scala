package typings.grpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait File extends StObject {
    
    var file: String
    
    var root: String
  }
  object File {
    
    inline def apply(file: String, root: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait Serviceurl extends StObject {
    
    var service_url: String
  }
  object Serviceurl {
    
    inline def apply(service_url: String): Serviceurl = {
      val __obj = js.Dynamic.literal(service_url = service_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Serviceurl]
    }
    
    extension [Self <: Serviceurl](x: Self) {
      
      inline def setService_url(value: String): Self = StObject.set(x, "service_url", value.asInstanceOf[js.Any])
    }
  }
}
