package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an item to be pushed to the indexing queue.
  */
@js.native
trait SchemaPushItem extends js.Object {
  /**
    * Content hash of the item according to the repository. If specified, this
    * is used to determine how to modify this item&#39;s status. Setting this
    * field and the type field results in argument error. The maximum length is
    * 2048 characters.
    */
  var contentHash: js.UndefOr[String] = js.native
  /**
    * Metadata hash of the item according to the repository. If specified, this
    * is used to determine how to modify this item&#39;s status. Setting this
    * field and the type field results in argument error. The maximum length is
    * 2048 characters.
    */
  var metadataHash: js.UndefOr[String] = js.native
  /**
    * Provides additional document state information for the connector, such as
    * an alternate repository ID and other metadata. The maximum length is 8192
    * bytes.
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * Queue to which this item belongs to.  The
    * &lt;code&gt;default&lt;/code&gt; queue is chosen if this field is not
    * specified. The maximum length is 512 characters.
    */
  var queue: js.UndefOr[String] = js.native
  /**
    * Populate this field to store Connector or repository error details. This
    * information is displayed in the Admin Console. This field may only be
    * populated when the Type is REPOSITORY_ERROR.
    */
  var repositoryError: js.UndefOr[SchemaRepositoryError] = js.native
  /**
    * Structured data hash of the item according to the repository. If
    * specified, this is used to determine how to modify this item&#39;s
    * status. Setting this field and the type field results in argument error.
    * The maximum length is 2048 characters.
    */
  var structuredDataHash: js.UndefOr[String] = js.native
  /**
    * The type of the push operation that defines the push behavior.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPushItem {
  @scala.inline
  def apply(
    contentHash: String = null,
    metadataHash: String = null,
    payload: String = null,
    queue: String = null,
    repositoryError: SchemaRepositoryError = null,
    structuredDataHash: String = null,
    `type`: String = null
  ): SchemaPushItem = {
    val __obj = js.Dynamic.literal()
    if (contentHash != null) __obj.updateDynamic("contentHash")(contentHash.asInstanceOf[js.Any])
    if (metadataHash != null) __obj.updateDynamic("metadataHash")(metadataHash.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (repositoryError != null) __obj.updateDynamic("repositoryError")(repositoryError.asInstanceOf[js.Any])
    if (structuredDataHash != null) __obj.updateDynamic("structuredDataHash")(structuredDataHash.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPushItem]
  }
}

