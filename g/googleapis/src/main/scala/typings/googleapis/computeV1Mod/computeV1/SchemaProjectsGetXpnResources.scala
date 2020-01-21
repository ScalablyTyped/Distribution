package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectsGetXpnResources extends js.Object {
  /**
    * [Output Only] Type of resource. Always compute#projectsGetXpnResources
    * for lists of service resources (a.k.a service projects)
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] This token allows you to get the next page of results for
    * list requests. If the number of results is larger than maxResults, use
    * the nextPageToken as a value for the query parameter pageToken in the
    * next list request. Subsequent list requests will have their own
    * nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Service resources (a.k.a service projects) attached to this project as
    * their shared VPC host.
    */
  var resources: js.UndefOr[js.Array[SchemaXpnResourceId]] = js.native
}

object SchemaProjectsGetXpnResources {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, resources: js.Array[SchemaXpnResourceId] = null): SchemaProjectsGetXpnResources = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjectsGetXpnResources]
  }
}

