package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecognizerOptions extends js.Object {
  var direction: js.UndefOr[scala.Double] = js.undefined
  var enable: js.UndefOr[
    scala.Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, scala.Boolean])
  ] = js.undefined
  var event: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var pointers: js.UndefOr[scala.Double] = js.undefined
  var posThreshold: js.UndefOr[scala.Double] = js.undefined
  var taps: js.UndefOr[scala.Double] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
  var time: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[scala.Double] = js.undefined
}

