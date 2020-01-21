package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListConfigurationsResponse is a list of Configuration resources.
  */
@js.native
trait SchemaListConfigurationsResponse extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * List of Configurations.
    */
  var items: js.UndefOr[js.Array[SchemaConfiguration]] = js.native
  /**
    * The kind of this resource, in this case &quot;ConfigurationList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Configuration list.
    */
  var metadata: js.UndefOr[SchemaListMeta] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListConfigurationsResponse {
  @scala.inline
  def apply(
    apiVersion: String = null,
    items: js.Array[SchemaConfiguration] = null,
    kind: String = null,
    metadata: SchemaListMeta = null,
    unreachable: js.Array[String] = null
  ): SchemaListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (unreachable != null) __obj.updateDynamic("unreachable")(unreachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListConfigurationsResponse]
  }
}

