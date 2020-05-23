package typings.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, string | (href : string): string>> */
trait PartialRecordLinkEntityTy extends js.Object {
  var email: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.undefined
  var hashtag: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.undefined
  var mention: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.undefined
  var url: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.undefined
}

object PartialRecordLinkEntityTy {
  @scala.inline
  def apply(
    email: String | (js.Function1[/* href */ String, String]) = null,
    hashtag: String | (js.Function1[/* href */ String, String]) = null,
    mention: String | (js.Function1[/* href */ String, String]) = null,
    url: String | (js.Function1[/* href */ String, String]) = null
  ): PartialRecordLinkEntityTy = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (mention != null) __obj.updateDynamic("mention")(mention.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecordLinkEntityTy]
  }
}

