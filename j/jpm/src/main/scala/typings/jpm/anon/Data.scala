package typings.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var iconURL: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* data */ String, _]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    data: String = null,
    iconURL: String = null,
    onClick: /* data */ String => _ = null,
    text: String = null,
    title: String = null
  ): Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (iconURL != null) __obj.updateDynamic("iconURL")(iconURL.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

