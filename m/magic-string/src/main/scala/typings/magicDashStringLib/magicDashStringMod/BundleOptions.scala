package typings
package magicDashStringLib.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleOptions extends js.Object {
  var intro: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object BundleOptions {
  @scala.inline
  def apply(intro: java.lang.String = null, separator: java.lang.String = null): BundleOptions = {
    val __obj = js.Dynamic.literal()
    if (intro != null) __obj.updateDynamic("intro")(intro)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[BundleOptions]
  }
}

