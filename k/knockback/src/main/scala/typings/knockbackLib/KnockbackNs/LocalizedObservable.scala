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
  def apply(
    destroy: js.Function0[js.Any],
    observedValue: js.Function1[js.Any, js.Any],
    resetToCurrent: js.Function0[js.Any]
  ): LocalizedObservable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("observedValue")(observedValue)
    __obj.updateDynamic("resetToCurrent")(resetToCurrent)
    __obj.asInstanceOf[LocalizedObservable]
  }
}

