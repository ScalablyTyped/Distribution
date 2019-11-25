package typings.hopscotch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hopscotch.hopscotchStrings.top
  - typings.hopscotch.hopscotchStrings.bottom
  - typings.hopscotch.hopscotchStrings.right
  - typings.hopscotch.hopscotchStrings.left
*/
trait placementTypes extends js.Object

object placementTypes {
  @scala.inline
  def bottom: typings.hopscotch.hopscotchStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.hopscotch.hopscotchStrings.left = this.cast("left")
  @scala.inline
  def right: typings.hopscotch.hopscotchStrings.right = this.cast("right")
  @scala.inline
  def top: typings.hopscotch.hopscotchStrings.top = this.cast("top")
}

