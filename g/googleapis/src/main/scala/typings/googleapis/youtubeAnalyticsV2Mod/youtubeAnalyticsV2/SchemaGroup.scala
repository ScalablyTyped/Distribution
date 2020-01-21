package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group.
  */
@js.native
trait SchemaGroup extends js.Object {
  /**
    * The `contentDetails` object contains additional information about the
    * group, such as the number and type of items that it contains.
    */
  var contentDetails: js.UndefOr[SchemaGroupContentDetails] = js.native
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the group.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#group`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The `snippet` object contains basic information about the group,
    * including its creation date and name.
    */
  var snippet: js.UndefOr[SchemaGroupSnippet] = js.native
}

object SchemaGroup {
  @scala.inline
  def apply(
    contentDetails: SchemaGroupContentDetails = null,
    errors: SchemaErrors = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: SchemaGroupSnippet = null
  ): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroup]
  }
}

