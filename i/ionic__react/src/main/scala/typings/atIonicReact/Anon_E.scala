package typings.atIonicReact

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var __events: js.UndefOr[StringDictionary[js.UndefOr[js.Function1[/* e */ Event, _]]]] = js.undefined
}

object Anon_E {
  @scala.inline
  def apply(__events: StringDictionary[js.UndefOr[js.Function1[/* e */ Event, _]]] = null): Anon_E = {
    val __obj = js.Dynamic.literal()
    if (__events != null) __obj.updateDynamic("__events")(__events)
    __obj.asInstanceOf[Anon_E]
  }
}

