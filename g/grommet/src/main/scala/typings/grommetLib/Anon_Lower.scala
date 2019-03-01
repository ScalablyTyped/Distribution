package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lower extends js.Object {
  var lower: js.UndefOr[java.lang.String] = js.undefined
  var upper: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Lower {
  @scala.inline
  def apply(lower: java.lang.String = null, upper: java.lang.String = null): Anon_Lower = {
    val __obj = js.Dynamic.literal()
    if (lower != null) __obj.updateDynamic("lower")(lower)
    if (upper != null) __obj.updateDynamic("upper")(upper)
    __obj.asInstanceOf[Anon_Lower]
  }
}

