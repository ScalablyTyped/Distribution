package typings
package lzmaDashNativeLib.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LzmaOptions extends js.Object {
  var blockSize: js.UndefOr[scala.Double] = js.undefined
  var bufsize: js.UndefOr[scala.Double] = js.undefined
  var check: js.UndefOr[Check] = js.undefined
  var flags: js.UndefOr[
    lzmaDashNativeLib.lzmaDashNativeLibStrings.TELL_NO_CHECK | lzmaDashNativeLib.lzmaDashNativeLibStrings.TELL_UNSUPPORTED_CHECK | lzmaDashNativeLib.lzmaDashNativeLibStrings.TELL_ANY_CHECK | lzmaDashNativeLib.lzmaDashNativeLibStrings.CONCATENATED
  ] = js.undefined
  var memlimit: js.UndefOr[scala.Double] = js.undefined
  var preset: js.UndefOr[Preset] = js.undefined
  var synchronous: js.UndefOr[scala.Boolean] = js.undefined
  var threads: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

