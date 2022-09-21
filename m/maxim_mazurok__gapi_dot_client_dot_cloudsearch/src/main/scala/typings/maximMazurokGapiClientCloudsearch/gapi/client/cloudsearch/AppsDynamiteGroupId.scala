package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteGroupId extends StObject {
  
  /** Unique, immutable ID of the Direct Message Space */
  var dmId: js.UndefOr[AppsDynamiteDmId] = js.undefined
  
  /** Unique, immutable ID of the Space */
  var spaceId: js.UndefOr[AppsDynamiteSpaceId] = js.undefined
}
object AppsDynamiteGroupId {
  
  inline def apply(): AppsDynamiteGroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteGroupId]
  }
  
  extension [Self <: AppsDynamiteGroupId](x: Self) {
    
    inline def setDmId(value: AppsDynamiteDmId): Self = StObject.set(x, "dmId", value.asInstanceOf[js.Any])
    
    inline def setDmIdUndefined: Self = StObject.set(x, "dmId", js.undefined)
    
    inline def setSpaceId(value: AppsDynamiteSpaceId): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
    
    inline def setSpaceIdUndefined: Self = StObject.set(x, "spaceId", js.undefined)
  }
}
