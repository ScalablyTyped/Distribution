package typings.lyricist.lyricistMod

import typings.lyricist.Anon_ExcludedpermissionsInteractions
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
  var current_user_metadata: Anon_ExcludedpermissionsInteractions
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
    current_user_metadata: Anon_ExcludedpermissionsInteractions,
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
    val __obj = js.Dynamic.literal(api_path = api_path, authors = authors, body = body, comment_count = comment_count, community = community, cosigned_by = cosigned_by, current_user_metadata = current_user_metadata, has_voters = has_voters, id = id, pinned = pinned, share_url = share_url, state = state, url = url, verified = verified, votes_total = votes_total)
    if (custom_preview != null) __obj.updateDynamic("custom_preview")(custom_preview)
    if (rejection_comment != null) __obj.updateDynamic("rejection_comment")(rejection_comment)
    if (source != null) __obj.updateDynamic("source")(source)
    if (verified_by != null) __obj.updateDynamic("verified_by")(verified_by)
    __obj.asInstanceOf[Annotation]
  }
}

