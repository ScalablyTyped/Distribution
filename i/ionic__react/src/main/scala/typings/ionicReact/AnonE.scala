package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonE extends js.Object {
  var __events: js.UndefOr[StringDictionary[js.UndefOr[js.Function1[/* e */ Event_, _]]]] = js.undefined
}

object AnonE {
  @scala.inline
  def apply(__events: StringDictionary[js.UndefOr[js.Function1[/* e */ Event_, _]]] = null): AnonE = {
    val __obj = js.Dynamic.literal()
    if (__events != null) __obj.updateDynamic("__events")(__events.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonE]
  }
}

