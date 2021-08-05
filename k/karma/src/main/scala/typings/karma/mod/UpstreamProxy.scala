package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpstreamProxy extends StObject {
  
  /**
    * Will be used as the hostname when launching browsers
    * @default 'localhost'
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * Will be prepended to the base url when launching browsers and prepended to internal urls as loaded by the browsers
    * @default '/'
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Will be used as the port when launching browsers
    * @default 9875
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Will be used as the protocol when launching browsers
    * @default 'http'
    */
  var protocol: js.UndefOr[String] = js.undefined
}
object UpstreamProxy {
  
  inline def apply(): UpstreamProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpstreamProxy]
  }
  
  extension [Self <: UpstreamProxy](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
