package typings.jqueryDotUiDotLayout

import typings.jqueryDotUiDotLayout.JQueryUILayout.PaneState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EastNorth extends js.Object {
  var east: PaneState
  var north: PaneState
  var south: PaneState
  var west: PaneState
}

object Anon_EastNorth {
  @scala.inline
  def apply(east: PaneState, north: PaneState, south: PaneState, west: PaneState): Anon_EastNorth = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EastNorth]
  }
}

