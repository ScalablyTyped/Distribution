package typings.humanizeDashDuration.humanizeDashDurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitTranslationOptions extends js.Object {
  var d: js.UndefOr[js.Function0[String]] = js.undefined
  var h: js.UndefOr[js.Function0[String]] = js.undefined
  var m: js.UndefOr[js.Function0[String]] = js.undefined
  var mo: js.UndefOr[js.Function0[String]] = js.undefined
  var ms: js.UndefOr[js.Function0[String]] = js.undefined
  var s: js.UndefOr[js.Function0[String]] = js.undefined
  var w: js.UndefOr[js.Function0[String]] = js.undefined
  var y: js.UndefOr[js.Function0[String]] = js.undefined
}

object UnitTranslationOptions {
  @scala.inline
  def apply(
    d: () => String = null,
    h: () => String = null,
    m: () => String = null,
    mo: () => String = null,
    ms: () => String = null,
    s: () => String = null,
    w: () => String = null,
    y: () => String = null
  ): UnitTranslationOptions = {
    val __obj = js.Dynamic.literal()
    if (d != null) __obj.updateDynamic("d")(js.Any.fromFunction0(d))
    if (h != null) __obj.updateDynamic("h")(js.Any.fromFunction0(h))
    if (m != null) __obj.updateDynamic("m")(js.Any.fromFunction0(m))
    if (mo != null) __obj.updateDynamic("mo")(js.Any.fromFunction0(mo))
    if (ms != null) __obj.updateDynamic("ms")(js.Any.fromFunction0(ms))
    if (s != null) __obj.updateDynamic("s")(js.Any.fromFunction0(s))
    if (w != null) __obj.updateDynamic("w")(js.Any.fromFunction0(w))
    if (y != null) __obj.updateDynamic("y")(js.Any.fromFunction0(y))
    __obj.asInstanceOf[UnitTranslationOptions]
  }
}

