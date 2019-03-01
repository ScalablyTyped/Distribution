package typings
package jqueryuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Selecting extends js.Object {
  var selecting: js.UndefOr[stdLib.Element] = js.undefined
}

object Anon_Selecting {
  @scala.inline
  def apply(selecting: stdLib.Element = null): Anon_Selecting = {
    val __obj = js.Dynamic.literal()
    if (selecting != null) __obj.updateDynamic("selecting")(selecting)
    __obj.asInstanceOf[Anon_Selecting]
  }
}

