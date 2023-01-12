package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZwiebackSessionProto extends StObject {
  
  var zwiebackSessionId: js.UndefOr[String] = js.undefined
}
object ZwiebackSessionProto {
  
  inline def apply(): ZwiebackSessionProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZwiebackSessionProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZwiebackSessionProto] (val x: Self) extends AnyVal {
    
    inline def setZwiebackSessionId(value: String): Self = StObject.set(x, "zwiebackSessionId", value.asInstanceOf[js.Any])
    
    inline def setZwiebackSessionIdUndefined: Self = StObject.set(x, "zwiebackSessionId", js.undefined)
  }
}
