package typings.lyricist.mod

import typings.lyricist.anon.Interactions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation extends js.Object {
  var api_path: String = js.native
  var authors: js.Array[Author] = js.native
  var body: Description = js.native
  var comment_count: Double = js.native
  var community: Boolean = js.native
  var cosigned_by: js.Array[_] = js.native
  var current_user_metadata: Interactions = js.native
  var custom_preview: js.UndefOr[js.Any] = js.native
  var has_voters: Boolean = js.native
  var id: Double = js.native
  var pinned: Boolean = js.native
  var rejection_comment: js.UndefOr[js.Any] = js.native
  var share_url: String = js.native
  var source: js.UndefOr[js.Any] = js.native
  var state: String = js.native
  var url: String = js.native
  var verified: Boolean = js.native
  var verified_by: js.UndefOr[js.Any] = js.native
  var votes_total: Double = js.native
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
    current_user_metadata: Interactions,
    has_voters: Boolean,
    id: Double,
    pinned: Boolean,
    share_url: String,
    state: String,
    url: String,
    verified: Boolean,
    votes_total: Double
  ): Annotation = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], community = community.asInstanceOf[js.Any], cosigned_by = cosigned_by.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], has_voters = has_voters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], share_url = share_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], votes_total = votes_total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApi_path(value: String): Self = this.set("api_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorsVarargs(value: Author*): Self = this.set("authors", js.Array(value :_*))
    @scala.inline
    def setAuthors(value: js.Array[Author]): Self = this.set("authors", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: Description): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommunity(value: Boolean): Self = this.set("community", value.asInstanceOf[js.Any])
    @scala.inline
    def setCosigned_byVarargs(value: js.Any*): Self = this.set("cosigned_by", js.Array(value :_*))
    @scala.inline
    def setCosigned_by(value: js.Array[_]): Self = this.set("cosigned_by", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent_user_metadata(value: Interactions): Self = this.set("current_user_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setHas_voters(value: Boolean): Self = this.set("has_voters", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def setShare_url(value: String): Self = this.set("share_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    @scala.inline
    def setVotes_total(value: Double): Self = this.set("votes_total", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_preview(value: js.Any): Self = this.set("custom_preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_preview: Self = this.set("custom_preview", js.undefined)
    @scala.inline
    def setRejection_comment(value: js.Any): Self = this.set("rejection_comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejection_comment: Self = this.set("rejection_comment", js.undefined)
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setVerified_by(value: js.Any): Self = this.set("verified_by", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerified_by: Self = this.set("verified_by", js.undefined)
  }
  
}

