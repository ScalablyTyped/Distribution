package typings.ionicCliFramework.stringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlugifyOptions extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
}

object SlugifyOptions {
  @scala.inline
  def apply(separator: String = null): SlugifyOptions = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlugifyOptions]
  }
}

