package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mapboxGlStrings.unavailable
  - typings.mapboxGl.mapboxGlStrings.loading
  - typings.mapboxGl.mapboxGlStrings.loaded
  - typings.mapboxGl.mapboxGlStrings.error
*/
trait PluginStatus extends js.Object

object PluginStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.mapboxGl.mapboxGlStrings.error = this.cast("error")
  @scala.inline
  def loaded: typings.mapboxGl.mapboxGlStrings.loaded = this.cast("loaded")
  @scala.inline
  def loading: typings.mapboxGl.mapboxGlStrings.loading = this.cast("loading")
  @scala.inline
  def unavailable: typings.mapboxGl.mapboxGlStrings.unavailable = this.cast("unavailable")
}

