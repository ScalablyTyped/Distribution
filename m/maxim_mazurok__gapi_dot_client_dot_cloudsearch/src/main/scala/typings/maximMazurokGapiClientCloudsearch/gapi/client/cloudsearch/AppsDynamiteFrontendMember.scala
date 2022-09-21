package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteFrontendMember extends StObject {
  
  var roster: js.UndefOr[AppsDynamiteFrontendRoster] = js.undefined
  
  var user: js.UndefOr[AppsDynamiteFrontendUser] = js.undefined
}
object AppsDynamiteFrontendMember {
  
  inline def apply(): AppsDynamiteFrontendMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteFrontendMember]
  }
  
  extension [Self <: AppsDynamiteFrontendMember](x: Self) {
    
    inline def setRoster(value: AppsDynamiteFrontendRoster): Self = StObject.set(x, "roster", value.asInstanceOf[js.Any])
    
    inline def setRosterUndefined: Self = StObject.set(x, "roster", js.undefined)
    
    inline def setUser(value: AppsDynamiteFrontendUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
