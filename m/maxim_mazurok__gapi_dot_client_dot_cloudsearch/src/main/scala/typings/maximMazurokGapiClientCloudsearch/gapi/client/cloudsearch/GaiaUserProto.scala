package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaiaUserProto extends StObject {
  
  var userId: js.UndefOr[String] = js.undefined
}
object GaiaUserProto {
  
  inline def apply(): GaiaUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaiaUserProto]
  }
  
  extension [Self <: GaiaUserProto](x: Self) {
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
