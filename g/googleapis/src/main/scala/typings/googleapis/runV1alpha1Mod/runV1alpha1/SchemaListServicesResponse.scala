package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Service resources.
  */
@js.native
trait SchemaListServicesResponse extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * List of Services.
    */
  var items: js.UndefOr[js.Array[SchemaService]] = js.native
  /**
    * The kind of this resource, in this case &quot;ServiceList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Service list.
    */
  var metadata: js.UndefOr[SchemaListMeta] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListServicesResponse {
  @scala.inline
  def apply(
    apiVersion: String = null,
    items: js.Array[SchemaService] = null,
    kind: String = null,
    metadata: SchemaListMeta = null,
    unreachable: js.Array[String] = null
  ): SchemaListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (unreachable != null) __obj.updateDynamic("unreachable")(unreachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListServicesResponse]
  }
}

