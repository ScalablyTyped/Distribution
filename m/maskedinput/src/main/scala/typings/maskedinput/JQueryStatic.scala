package typings.maskedinput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var mask: MaskedInputStatic
}

object JQueryStatic {
  @scala.inline
  def apply(mask: MaskedInputStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
}

