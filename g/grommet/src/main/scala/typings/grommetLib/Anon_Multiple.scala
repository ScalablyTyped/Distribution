package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Multiple extends js.Object {
  var multiple: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Multiple {
  @scala.inline
  def apply(multiple: java.lang.String = null): Anon_Multiple = {
    val __obj = js.Dynamic.literal()
    if (multiple != null) __obj.updateDynamic("multiple")(multiple)
    __obj.asInstanceOf[Anon_Multiple]
  }
}

