package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[java.lang.String] = js.undefined
  var stick: js.UndefOr[java.lang.String] = js.undefined
  var unstick: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Close {
  @scala.inline
  def apply(close: java.lang.String = null, stick: java.lang.String = null, unstick: java.lang.String = null): Anon_Close = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (stick != null) __obj.updateDynamic("stick")(stick)
    if (unstick != null) __obj.updateDynamic("unstick")(unstick)
    __obj.asInstanceOf[Anon_Close]
  }
}

