package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListRoutesResponse is a list of Route resources.
  */
@js.native
trait SchemaListRoutesResponse extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * List of Routes.
    */
  var items: js.UndefOr[js.Array[SchemaRoute]] = js.native
  /**
    * The kind of this resource, in this case always &quot;RouteList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Route list.
    */
  var metadata: js.UndefOr[SchemaListMeta] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListRoutesResponse {
  @scala.inline
  def apply(
    apiVersion: String = null,
    items: js.Array[SchemaRoute] = null,
    kind: String = null,
    metadata: SchemaListMeta = null,
    unreachable: js.Array[String] = null
  ): SchemaListRoutesResponse = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (unreachable != null) __obj.updateDynamic("unreachable")(unreachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListRoutesResponse]
  }
}

