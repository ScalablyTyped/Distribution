package typings.lyricist.mod

import typings.lyricist.AnonInteractions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  var api_path: String
  var authors: js.Array[Author]
  var body: Description
  var comment_count: Double
  var community: Boolean
  var cosigned_by: js.Array[_]
  var current_user_metadata: AnonInteractions
  var custom_preview: js.UndefOr[js.Any] = js.undefined
  var has_voters: Boolean
  var id: Double
  var pinned: Boolean
  var rejection_comment: js.UndefOr[js.Any] = js.undefined
  var share_url: String
  var source: js.UndefOr[js.Any] = js.undefined
  var state: String
  var url: String
  var verified: Boolean
  var verified_by: js.UndefOr[js.Any] = js.undefined
  var votes_total: Double
}

object Annotation {
  @scala.inline
  def apply(
    api_path: String,
    authors: js.Array[Author],
    body: Description,
    comment_count: Double,
    community: Boolean,
    cosigned_by: js.Array[_],
    current_user_metadata: AnonInteractions,
    has_voters: Boolean,
    id: Double,
    pinned: Boolean,
    share_url: String,
    state: String,
    url: String,
    verified: Boolean,
    votes_total: Double,
    custom_preview: js.Any = null,
    rejection_comment: js.Any = null,
    source: js.Any = null,
    verified_by: js.Any = null
  ): Annotation = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], community = community.asInstanceOf[js.Any], cosigned_by = cosigned_by.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], has_voters = has_voters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], share_url = share_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], votes_total = votes_total.asInstanceOf[js.Any])
    if (custom_preview != null) __obj.updateDynamic("custom_preview")(custom_preview.asInstanceOf[js.Any])
    if (rejection_comment != null) __obj.updateDynamic("rejection_comment")(rejection_comment.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (verified_by != null) __obj.updateDynamic("verified_by")(verified_by.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

