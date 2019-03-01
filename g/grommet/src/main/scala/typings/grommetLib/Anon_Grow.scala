package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grow extends js.Object {
  var grow: js.UndefOr[scala.Double] = js.undefined
  var shrink: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Grow {
  @scala.inline
  def apply(grow: scala.Int | scala.Double = null, shrink: scala.Int | scala.Double = null): Anon_Grow = {
    val __obj = js.Dynamic.literal()
    if (grow != null) __obj.updateDynamic("grow")(grow.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Grow]
  }
}

