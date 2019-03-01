package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: js.Any
  var left: js.Any
  var right: js.Any
  var top: js.Any
}

object Anon_Bottom {
  @scala.inline
  def apply(bottom: js.Any, left: js.Any, right: js.Any, top: js.Any): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Anon_Bottom]
  }
}

