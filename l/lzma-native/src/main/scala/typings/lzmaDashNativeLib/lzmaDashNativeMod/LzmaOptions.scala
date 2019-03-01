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

object LzmaOptions {
  @scala.inline
  def apply(
    blockSize: scala.Int | scala.Double = null,
    bufsize: scala.Int | scala.Double = null,
    check: Check = null,
    flags: lzmaDashNativeLib.lzmaDashNativeLibStrings.TELL_NO_CHECK | lzmaDashNativeLib.lzmaDashNativeLibStrings.TELL_UNSUPPORTED_CHECK | lzmaDashNativeLib.lzmaDashNativeLibStrings.TELL_ANY_CHECK | lzmaDashNativeLib.lzmaDashNativeLibStrings.CONCATENATED = null,
    memlimit: scala.Int | scala.Double = null,
    preset: Preset = null,
    synchronous: js.UndefOr[scala.Boolean] = js.undefined,
    threads: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): LzmaOptions = {
    val __obj = js.Dynamic.literal()
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (bufsize != null) __obj.updateDynamic("bufsize")(bufsize.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check)
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (memlimit != null) __obj.updateDynamic("memlimit")(memlimit.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous)
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LzmaOptions]
  }
}

