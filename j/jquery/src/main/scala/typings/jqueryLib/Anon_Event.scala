package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event[TTarget]
  extends jqueryLib.JQueryNs._SpecialEventHook[TTarget, js.Any] {
  def preDispatch(`this`: TTarget, event: jqueryLib.JQueryNs.Event): jqueryLib.jqueryLibNumbers.`false` | scala.Unit
}

object Anon_Event {
  @scala.inline
  def apply[TTarget](
    preDispatch: js.Function2[TTarget, jqueryLib.JQueryNs.Event, jqueryLib.jqueryLibNumbers.`false` | scala.Unit]
  ): Anon_Event[TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preDispatch")(preDispatch)
    __obj.asInstanceOf[Anon_Event[TTarget]]
  }
}

