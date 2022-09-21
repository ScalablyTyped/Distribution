package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MdbGroupProto extends StObject {
  
  var groupName: js.UndefOr[String] = js.undefined
}
object MdbGroupProto {
  
  inline def apply(): MdbGroupProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MdbGroupProto]
  }
  
  extension [Self <: MdbGroupProto](x: Self) {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
