package typings.keycloakJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RedirectUri extends StObject {
    
    var redirectUri: String
  }
  object RedirectUri {
    
    inline def apply(redirectUri: String): RedirectUri = {
      val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectUri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedirectUri] (val x: Self) extends AnyVal {
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rptendpoint extends StObject {
    
    var rpt_endpoint: String
  }
  object Rptendpoint {
    
    inline def apply(rpt_endpoint: String): Rptendpoint = {
      val __obj = js.Dynamic.literal(rpt_endpoint = rpt_endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rptendpoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rptendpoint] (val x: Self) extends AnyVal {
      
      inline def setRpt_endpoint(value: String): Self = StObject.set(x, "rpt_endpoint", value.asInstanceOf[js.Any])
    }
  }
}
