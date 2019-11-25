package typings.magicDashString.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleOptions extends js.Object {
  var intro: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object BundleOptions {
  @scala.inline
  def apply(intro: String = null, separator: String = null): BundleOptions = {
    val __obj = js.Dynamic.literal()
    if (intro != null) __obj.updateDynamic("intro")(intro.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleOptions]
  }
}

