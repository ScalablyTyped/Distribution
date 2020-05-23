package typings.lusca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var options: js.UndefOr[js.Object] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String, options: js.Object = null): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

