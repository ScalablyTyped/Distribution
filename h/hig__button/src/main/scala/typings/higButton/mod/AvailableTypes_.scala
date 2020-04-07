package typings.higButton.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @hig/button.@hig/button.Types[keyof @hig/button.@hig/button.Types] */
/* Rewritten from type alias, can be one of: 
  - typings.higButton.higButtonStrings.solid
  - typings.higButton.higButtonStrings.outline
  - typings.higButton.higButtonStrings.secondary
  - typings.higButton.higButtonStrings.primary
  - typings.higButton.higButtonStrings.flat
*/
trait AvailableTypes_ extends js.Object

object AvailableTypes_ {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def flat: typings.higButton.higButtonStrings.flat = this.cast("flat")
  @scala.inline
  def outline: typings.higButton.higButtonStrings.outline = this.cast("outline")
  @scala.inline
  def primary: typings.higButton.higButtonStrings.primary = this.cast("primary")
  @scala.inline
  def secondary: typings.higButton.higButtonStrings.secondary = this.cast("secondary")
  @scala.inline
  def solid: typings.higButton.higButtonStrings.solid = this.cast("solid")
}

