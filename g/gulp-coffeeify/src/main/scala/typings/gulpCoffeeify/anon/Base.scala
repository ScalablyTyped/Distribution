package typings.gulpCoffeeify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
}

object Base {
  @scala.inline
  def apply(base: String = null, cwd: String = null): Base = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

