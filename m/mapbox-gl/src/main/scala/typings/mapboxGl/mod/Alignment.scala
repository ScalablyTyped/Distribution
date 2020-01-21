package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mapboxGlStrings.map
  - typings.mapboxGl.mapboxGlStrings.viewport
  - typings.mapboxGl.mapboxGlStrings.auto
*/
trait Alignment extends js.Object

object Alignment {
  @scala.inline
  def auto: typings.mapboxGl.mapboxGlStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def map: typings.mapboxGl.mapboxGlStrings.map = this.cast("map")
  @scala.inline
  def viewport: typings.mapboxGl.mapboxGlStrings.viewport = this.cast("viewport")
}

