package typings.ipfsCoreTypes.distSrcConfigMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIConfig extends StObject {
  
  var HTTPHeaders: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
}
object APIConfig {
  
  inline def apply(): APIConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIConfig]
  }
  
  extension [Self <: APIConfig](x: Self) {
    
    inline def setHTTPHeaders(value: Record[String, js.Array[String]]): Self = StObject.set(x, "HTTPHeaders", value.asInstanceOf[js.Any])
    
    inline def setHTTPHeadersUndefined: Self = StObject.set(x, "HTTPHeaders", js.undefined)
  }
}
