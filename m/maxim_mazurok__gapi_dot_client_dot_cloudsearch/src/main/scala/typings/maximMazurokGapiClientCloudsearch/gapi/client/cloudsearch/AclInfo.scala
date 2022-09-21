package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclInfo extends StObject {
  
  /** Number of groups which have at least read access to the document. */
  var groupsCount: js.UndefOr[Double] = js.undefined
  
  /** The scope to which the content was shared. */
  var scope: js.UndefOr[String] = js.undefined
  
  /** Number of users which have at least read access to the document. */
  var usersCount: js.UndefOr[Double] = js.undefined
}
object AclInfo {
  
  inline def apply(): AclInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AclInfo]
  }
  
  extension [Self <: AclInfo](x: Self) {
    
    inline def setGroupsCount(value: Double): Self = StObject.set(x, "groupsCount", value.asInstanceOf[js.Any])
    
    inline def setGroupsCountUndefined: Self = StObject.set(x, "groupsCount", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setUsersCount(value: Double): Self = StObject.set(x, "usersCount", value.asInstanceOf[js.Any])
    
    inline def setUsersCountUndefined: Self = StObject.set(x, "usersCount", js.undefined)
  }
}
