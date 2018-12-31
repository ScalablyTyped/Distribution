package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HammerOptions extends js.Object {
  var cssProps: js.UndefOr[CssProps] = js.undefined
  var domEvents: js.UndefOr[scala.Boolean] = js.undefined
  var enable: js.UndefOr[scala.Boolean | (js.Function1[/* manager */ HammerManager, scala.Boolean])] = js.undefined
  var inputClass: js.UndefOr[HammerInput] = js.undefined
  var inputTarget: js.UndefOr[stdLib.EventTarget] = js.undefined
  var preset: js.UndefOr[js.Array[RecognizerTuple]] = js.undefined
  var recognizers: js.UndefOr[js.Array[RecognizerTuple]] = js.undefined
  var touchAction: js.UndefOr[java.lang.String] = js.undefined
}

