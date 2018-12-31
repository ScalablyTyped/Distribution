package typings
package keypressDotJsLib.keypressDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Combo extends js.Object {
  var is_counting: js.UndefOr[scala.Boolean] = js.undefined
  var is_exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var is_sequence: js.UndefOr[scala.Boolean] = js.undefined
  var is_solitary: js.UndefOr[scala.Boolean] = js.undefined
  var is_unordered: js.UndefOr[scala.Boolean] = js.undefined
  var keys: js.UndefOr[java.lang.String] = js.undefined
  var on_keydown: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[stdLib.KeyboardEvent], 
      /* count */ js.UndefOr[scala.Double], 
      _
    ]
  ] = js.undefined
  var on_keyup: js.UndefOr[js.Function1[/* event */ js.UndefOr[stdLib.KeyboardEvent], _]] = js.undefined
  var on_release: js.UndefOr[js.Function1[/* event */ js.UndefOr[stdLib.KeyboardEvent], _]] = js.undefined
  var prevent_default: js.UndefOr[scala.Boolean] = js.undefined
  var prevent_repeat: js.UndefOr[scala.Boolean] = js.undefined
  var `this`: js.UndefOr[stdLib.Element] = js.undefined
}

