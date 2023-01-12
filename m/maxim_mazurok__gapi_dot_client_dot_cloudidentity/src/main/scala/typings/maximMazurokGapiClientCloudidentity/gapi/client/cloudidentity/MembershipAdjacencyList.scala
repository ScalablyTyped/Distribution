package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipAdjacencyList extends StObject {
  
  /**
    * Each edge contains information about the member that belongs to this group. Note: Fields returned here will help identify the specific Membership resource (e.g name,
    * preferred_member_key and role), but may not be a comprehensive list of all fields.
    */
  var edges: js.UndefOr[js.Array[Membership]] = js.undefined
  
  /** Resource name of the group that the members belong to. */
  var group: js.UndefOr[String] = js.undefined
}
object MembershipAdjacencyList {
  
  inline def apply(): MembershipAdjacencyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipAdjacencyList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MembershipAdjacencyList] (val x: Self) extends AnyVal {
    
    inline def setEdges(value: js.Array[Membership]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setEdgesVarargs(value: Membership*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
