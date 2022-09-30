package typings.matrixBotSdk.synapseAdminApisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseUserList extends StObject {
  
  /**
    * The token to use to get the next set of users.
    */
  var next_token: String
  
  /**
    * The total number of users on the Synapse instance.
    */
  var total: Double
  
  /**
    * A set of users matching the criteria.
    */
  var users: js.Array[SynapseUserListing]
}
object SynapseUserList {
  
  inline def apply(next_token: String, total: Double, users: js.Array[SynapseUserListing]): SynapseUserList = {
    val __obj = js.Dynamic.literal(next_token = next_token.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynapseUserList]
  }
  
  extension [Self <: SynapseUserList](x: Self) {
    
    inline def setNext_token(value: String): Self = StObject.set(x, "next_token", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[SynapseUserListing]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: SynapseUserListing*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
