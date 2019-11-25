package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxDashGl.mapboxDashGlStrings.visible
  - typings.mapboxDashGl.mapboxDashGlStrings.none
*/
trait Visibility extends js.Object

object Visibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.mapboxDashGl.mapboxDashGlStrings.none = this.cast("none")
  @scala.inline
  def visible: typings.mapboxDashGl.mapboxDashGlStrings.visible = this.cast("visible")
}

