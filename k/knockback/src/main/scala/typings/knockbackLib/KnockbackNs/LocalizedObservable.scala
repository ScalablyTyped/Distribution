package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedObservable extends js.Object {
  def destroy(): js.Any
  def observedValue(value: js.Any): js.Any
  def resetToCurrent(): js.Any
}

object LocalizedObservable {
  @scala.inline
  def apply(destroy: () => js.Any, observedValue: js.Any => js.Any, resetToCurrent: () => js.Any): LocalizedObservable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), observedValue = js.Any.fromFunction1(observedValue), resetToCurrent = js.Any.fromFunction0(resetToCurrent))
  
    __obj.asInstanceOf[LocalizedObservable]
  }
}

