package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(
    end: js.Array[scala.Double] = null,
    name: java.lang.String = null,
    start: js.Array[scala.Double] = null
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (name != null) __obj.updateDynamic("name")(name)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}

