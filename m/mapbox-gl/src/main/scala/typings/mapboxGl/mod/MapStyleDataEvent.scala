package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.style_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStyleDataEvent
  extends MapboxEvent[js.UndefOr[scala.Nothing]]
     with MapDataEvent {
  var dataType: style_ = js.native
}

