package typings.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, string | null>> */
trait PartialRecordLinkEntityTyHashtag extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var hashtag: js.UndefOr[String] = js.undefined
  var mention: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PartialRecordLinkEntityTyHashtag {
  @scala.inline
  def apply(email: String = null, hashtag: String = null, mention: String = null, url: String = null): PartialRecordLinkEntityTyHashtag = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (mention != null) __obj.updateDynamic("mention")(mention.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecordLinkEntityTyHashtag]
  }
}

