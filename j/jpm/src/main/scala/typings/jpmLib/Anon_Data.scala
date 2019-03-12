package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var iconURL: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* data */ java.lang.String, _]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    iconURL: java.lang.String = null,
    onClick: /* data */ java.lang.String => _ = null,
    text: java.lang.String = null,
    title: java.lang.String = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (iconURL != null) __obj.updateDynamic("iconURL")(iconURL)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Data]
  }
}

