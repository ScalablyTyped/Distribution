package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaiaGroupProto extends StObject {
  
  var groupId: js.UndefOr[String] = js.undefined
}
object GaiaGroupProto {
  
  inline def apply(): GaiaGroupProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaiaGroupProto]
  }
  
  extension [Self <: GaiaGroupProto](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
  }
}
