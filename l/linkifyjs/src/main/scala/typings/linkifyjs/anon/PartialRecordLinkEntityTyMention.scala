package typings.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, (href : string): boolean>> */
trait PartialRecordLinkEntityTyMention extends js.Object {
  var email: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
  var hashtag: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
  var mention: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
  var url: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
}

object PartialRecordLinkEntityTyMention {
  @scala.inline
  def apply(
    email: /* href */ String => Boolean = null,
    hashtag: /* href */ String => Boolean = null,
    mention: /* href */ String => Boolean = null,
    url: /* href */ String => Boolean = null
  ): PartialRecordLinkEntityTyMention = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(js.Any.fromFunction1(email))
    if (hashtag != null) __obj.updateDynamic("hashtag")(js.Any.fromFunction1(hashtag))
    if (mention != null) __obj.updateDynamic("mention")(js.Any.fromFunction1(mention))
    if (url != null) __obj.updateDynamic("url")(js.Any.fromFunction1(url))
    __obj.asInstanceOf[PartialRecordLinkEntityTyMention]
  }
}

