package typings
package lozadLib.lozadMod.lozadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var load: js.UndefOr[js.Function1[/* element */ stdLib.Element, scala.Unit]] = js.undefined
  var loaded: js.UndefOr[js.Function1[/* element */ stdLib.Element, scala.Unit]] = js.undefined
  var rootMargin: js.UndefOr[java.lang.String] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    load: /* element */ stdLib.Element => scala.Unit = null,
    loaded: /* element */ stdLib.Element => scala.Unit = null,
    rootMargin: java.lang.String = null,
    threshold: scala.Int | scala.Double = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1(loaded))
    if (rootMargin != null) __obj.updateDynamic("rootMargin")(rootMargin)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

