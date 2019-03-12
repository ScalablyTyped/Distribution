package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hide extends js.Object {
  def hide(): scala.Unit
  def isEnabled(): scala.Boolean
  def show(): scala.Unit
}

object Anon_Hide {
  @scala.inline
  def apply(hide: () => scala.Unit, isEnabled: () => scala.Boolean, show: () => scala.Unit): Anon_Hide = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isEnabled = js.Any.fromFunction0(isEnabled), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Anon_Hide]
  }
}

