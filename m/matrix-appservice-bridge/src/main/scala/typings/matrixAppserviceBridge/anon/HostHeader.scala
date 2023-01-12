package typings.matrixAppserviceBridge.anon

import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostHeader extends StObject {
  
  var hostHeader: String
  
  var url: URL_
}
object HostHeader {
  
  inline def apply(hostHeader: String, url: URL_): HostHeader = {
    val __obj = js.Dynamic.literal(hostHeader = hostHeader.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostHeader] (val x: Self) extends AnyVal {
    
    inline def setHostHeader(value: String): Self = StObject.set(x, "hostHeader", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
