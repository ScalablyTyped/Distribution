package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apipath extends StObject {
  
  var `api-path`: String
  
  var host: String
  
  var pathname: String
  
  var port: String
  
  var protocol: String
}
object Apipath {
  
  @scala.inline
  def apply(`api-path`: String, host: String, pathname: String, port: String, protocol: String): Apipath = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("api-path")(`api-path`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apipath]
  }
  
  @scala.inline
  implicit class ApipathMutableBuilder[Self <: Apipath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setApi-path`(value: String): Self = StObject.set(x, "api-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
