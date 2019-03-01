package typings
package jqueryDotUiDotLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_East extends js.Object {
  var east: JQuery | scala.Boolean
  var north: JQuery | scala.Boolean
  var south: JQuery | scala.Boolean
  var west: JQuery | scala.Boolean
}

object Anon_East {
  @scala.inline
  def apply(
    east: JQuery | scala.Boolean,
    north: JQuery | scala.Boolean,
    south: JQuery | scala.Boolean,
    west: JQuery | scala.Boolean
  ): Anon_East = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("east")(east.asInstanceOf[js.Any])
    __obj.updateDynamic("north")(north.asInstanceOf[js.Any])
    __obj.updateDynamic("south")(south.asInstanceOf[js.Any])
    __obj.updateDynamic("west")(west.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_East]
  }
}

