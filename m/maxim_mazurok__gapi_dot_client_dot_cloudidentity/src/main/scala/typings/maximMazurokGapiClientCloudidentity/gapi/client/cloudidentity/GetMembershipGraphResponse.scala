package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembershipGraphResponse extends StObject {
  
  /** The membership graph's path information represented as an adjacency list. */
  var adjacencyList: js.UndefOr[js.Array[MembershipAdjacencyList]] = js.undefined
  
  /**
    * The resources representing each group in the adjacency list. Each group in this list can be correlated to a 'group' of the MembershipAdjacencyList using the 'name' of the Group
    * resource.
    */
  var groups: js.UndefOr[js.Array[Group]] = js.undefined
}
object GetMembershipGraphResponse {
  
  inline def apply(): GetMembershipGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMembershipGraphResponse]
  }
  
  extension [Self <: GetMembershipGraphResponse](x: Self) {
    
    inline def setAdjacencyList(value: js.Array[MembershipAdjacencyList]): Self = StObject.set(x, "adjacencyList", value.asInstanceOf[js.Any])
    
    inline def setAdjacencyListUndefined: Self = StObject.set(x, "adjacencyList", js.undefined)
    
    inline def setAdjacencyListVarargs(value: MembershipAdjacencyList*): Self = StObject.set(x, "adjacencyList", js.Array(value*))
    
    inline def setGroups(value: js.Array[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
