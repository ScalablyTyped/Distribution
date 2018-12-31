package typings
package maskedinputLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryMaskedInputOptions extends js.Object {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var autoUnmask: js.UndefOr[scala.Boolean] = js.undefined
  var clearIncomplete: js.UndefOr[scala.Boolean] = js.undefined
  var clearMaskOnLostFocus: js.UndefOr[scala.Boolean] = js.undefined
  var greedy: js.UndefOr[scala.Boolean] = js.undefined
  var isComplete: js.UndefOr[js.Function2[/* buffer */ js.Any, /* options */ js.Any, js.Object]] = js.undefined
  var mask: js.UndefOr[java.lang.String] = js.undefined
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  var onBeforeMask: js.UndefOr[js.Function1[/* initialValue */ js.Any, scala.Unit]] = js.undefined
  var onBeforePaste: js.UndefOr[js.Function1[/* pastedValue */ js.Any, scala.Unit]] = js.undefined
  var onKeyValidation: js.UndefOr[js.Function1[/* result */ js.Any, scala.Unit]] = js.undefined
  var onUnMask: js.UndefOr[js.Function2[/* maskedValue */ js.Any, /* unmaskedValue */ js.Any, scala.Unit]] = js.undefined
  var oncleared: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var oncomplete: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onincomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var radixPoint: js.UndefOr[java.lang.String] = js.undefined
  var repeat: js.UndefOr[scala.Double] = js.undefined
  var rightAlignNumerics: js.UndefOr[scala.Boolean] = js.undefined
  var showMaskOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var showMaskOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var showToolTip: js.UndefOr[scala.Boolean] = js.undefined
  var skipOptionalPartCharacter: js.UndefOr[java.lang.String] = js.undefined
}

