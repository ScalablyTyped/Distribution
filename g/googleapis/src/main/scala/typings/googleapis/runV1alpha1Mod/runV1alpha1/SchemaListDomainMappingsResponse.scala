package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListDomainMappingsResponse is a list of DomainMapping resources.
  */
@js.native
trait SchemaListDomainMappingsResponse extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * List of DomainMappings.
    */
  var items: js.UndefOr[js.Array[SchemaDomainMapping]] = js.native
  /**
    * The kind of this resource, in this case &quot;DomainMappingList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this DomainMapping list.
    */
  var metadata: js.UndefOr[SchemaListMeta] = js.native
}

object SchemaListDomainMappingsResponse {
  @scala.inline
  def apply(
    apiVersion: String = null,
    items: js.Array[SchemaDomainMapping] = null,
    kind: String = null,
    metadata: SchemaListMeta = null
  ): SchemaListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDomainMappingsResponse]
  }
}

