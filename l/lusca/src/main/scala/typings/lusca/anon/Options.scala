package typings.lusca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(options: js.Object = null): Options = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

