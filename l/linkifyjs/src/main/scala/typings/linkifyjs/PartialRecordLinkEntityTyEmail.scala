package typings.linkifyjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, (href : string): string>> */
trait PartialRecordLinkEntityTyEmail extends js.Object {
  var email: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  var hashtag: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  var mention: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  var url: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
}

object PartialRecordLinkEntityTyEmail {
  @scala.inline
  def apply(
    email: /* value */ String => String = null,
    hashtag: /* value */ String => String = null,
    mention: /* value */ String => String = null,
    url: /* value */ String => String = null
  ): PartialRecordLinkEntityTyEmail = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(js.Any.fromFunction1(email))
    if (hashtag != null) __obj.updateDynamic("hashtag")(js.Any.fromFunction1(hashtag))
    if (mention != null) __obj.updateDynamic("mention")(js.Any.fromFunction1(mention))
    if (url != null) __obj.updateDynamic("url")(js.Any.fromFunction1(url))
    __obj.asInstanceOf[PartialRecordLinkEntityTyEmail]
  }
}

