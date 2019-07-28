package typings.jquery.JQueryNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region Speed
// #region Speed
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
trait SpeedSettings[TElement]
  extends /* key */ StringDictionary[scala.Nothing] {
  /**
    * A function to call once the animation is complete.
    */
  var complete: js.UndefOr[js.ThisFunction0[/* this */ TElement, Unit]] = js.undefined
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: js.UndefOr[Duration] = js.undefined
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: js.UndefOr[String] = js.undefined
}

object SpeedSettings {
  @scala.inline
  def apply[TElement](
    StringDictionary: /* key */ StringDictionary[scala.Nothing] = null,
    complete: js.ThisFunction0[/* this */ TElement, Unit] = null,
    duration: Duration = null,
    easing: String = null
  ): SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[SpeedSettings[TElement]]
  }
}

