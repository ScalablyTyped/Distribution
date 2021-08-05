package typings.localtunnel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined localtunnel.localtunnel.TunnelConfig & {  port :number} */
  trait TunnelConfigportnumber extends StObject {
    
    var allow_invalid_cert: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var local_ca: js.UndefOr[String] = js.undefined
    
    var local_cert: js.UndefOr[String] = js.undefined
    
    var local_host: js.UndefOr[String] = js.undefined
    
    var local_https: js.UndefOr[Boolean] = js.undefined
    
    var local_key: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var subdomain: js.UndefOr[String] = js.undefined
  }
  object TunnelConfigportnumber {
    
    inline def apply(port: Double): TunnelConfigportnumber = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[TunnelConfigportnumber]
    }
    
    extension [Self <: TunnelConfigportnumber](x: Self) {
      
      inline def setAllow_invalid_cert(value: Boolean): Self = StObject.set(x, "allow_invalid_cert", value.asInstanceOf[js.Any])
      
      inline def setAllow_invalid_certUndefined: Self = StObject.set(x, "allow_invalid_cert", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocal_ca(value: String): Self = StObject.set(x, "local_ca", value.asInstanceOf[js.Any])
      
      inline def setLocal_caUndefined: Self = StObject.set(x, "local_ca", js.undefined)
      
      inline def setLocal_cert(value: String): Self = StObject.set(x, "local_cert", value.asInstanceOf[js.Any])
      
      inline def setLocal_certUndefined: Self = StObject.set(x, "local_cert", js.undefined)
      
      inline def setLocal_host(value: String): Self = StObject.set(x, "local_host", value.asInstanceOf[js.Any])
      
      inline def setLocal_hostUndefined: Self = StObject.set(x, "local_host", js.undefined)
      
      inline def setLocal_https(value: Boolean): Self = StObject.set(x, "local_https", value.asInstanceOf[js.Any])
      
      inline def setLocal_httpsUndefined: Self = StObject.set(x, "local_https", js.undefined)
      
      inline def setLocal_key(value: String): Self = StObject.set(x, "local_key", value.asInstanceOf[js.Any])
      
      inline def setLocal_keyUndefined: Self = StObject.set(x, "local_key", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setSubdomainUndefined: Self = StObject.set(x, "subdomain", js.undefined)
    }
  }
}
