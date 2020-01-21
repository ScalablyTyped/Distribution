package typings.jqueryUiLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEast extends js.Object {
  var east: JQuery | Boolean
  var north: JQuery | Boolean
  var south: JQuery | Boolean
  var west: JQuery | Boolean
}

object AnonEast {
  @scala.inline
  def apply(east: JQuery | Boolean, north: JQuery | Boolean, south: JQuery | Boolean, west: JQuery | Boolean): AnonEast = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEast]
  }
}

