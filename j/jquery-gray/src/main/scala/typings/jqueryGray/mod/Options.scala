package typings.jqueryGray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  fade  :boolean,   classes  :jquery-gray.jquery-gray.Classes}> */
trait Options extends js.Object {
  var classes: js.UndefOr[Classes] = js.undefined
  var fade: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(classes: Classes = null, fade: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

