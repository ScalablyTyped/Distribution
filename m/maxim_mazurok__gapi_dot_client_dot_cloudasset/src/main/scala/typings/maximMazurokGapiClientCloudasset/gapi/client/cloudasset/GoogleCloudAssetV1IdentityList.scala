package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssetV1IdentityList extends StObject {
  
  /**
    * Group identity edges of the graph starting from the binding's group members to any node of the identities. The Edge.source_node contains a group, such as `group:parent@google.com`.
    * The Edge.target_node contains a member of the group, such as `group:child@google.com` or `user:foo@google.com`. This field is present only if the output_group_edges option is
    * enabled in request.
    */
  var groupEdges: js.UndefOr[js.Array[GoogleCloudAssetV1Edge]] = js.native
  
  /**
    * Only the identities that match one of the following conditions will be presented: - The identity_selector, if it is specified in request; - Otherwise, identities reachable from the
    * policy binding's members.
    */
  var identities: js.UndefOr[js.Array[GoogleCloudAssetV1Identity]] = js.native
}
object GoogleCloudAssetV1IdentityList {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1IdentityList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1IdentityList]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1IdentityListMutableBuilder[Self <: GoogleCloudAssetV1IdentityList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupEdges(value: js.Array[GoogleCloudAssetV1Edge]): Self = StObject.set(x, "groupEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupEdgesUndefined: Self = StObject.set(x, "groupEdges", js.undefined)
    
    @scala.inline
    def setGroupEdgesVarargs(value: GoogleCloudAssetV1Edge*): Self = StObject.set(x, "groupEdges", js.Array(value :_*))
    
    @scala.inline
    def setIdentities(value: js.Array[GoogleCloudAssetV1Identity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    @scala.inline
    def setIdentitiesVarargs(value: GoogleCloudAssetV1Identity*): Self = StObject.set(x, "identities", js.Array(value :_*))
  }
}
