package typings.lzmaDashNative.lzmaDashNativeMod

import typings.lzmaDashNative.lzmaDashNativeStrings.CONCATENATED
import typings.lzmaDashNative.lzmaDashNativeStrings.TELL_ANY_CHECK
import typings.lzmaDashNative.lzmaDashNativeStrings.TELL_NO_CHECK
import typings.lzmaDashNative.lzmaDashNativeStrings.TELL_UNSUPPORTED_CHECK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LzmaOptions extends js.Object {
  var blockSize: js.UndefOr[Double] = js.undefined
  var bufsize: js.UndefOr[Double] = js.undefined
  var check: js.UndefOr[Check] = js.undefined
  var flags: js.UndefOr[TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED] = js.undefined
  var memlimit: js.UndefOr[Double] = js.undefined
  var preset: js.UndefOr[Preset] = js.undefined
  var synchronous: js.UndefOr[Boolean] = js.undefined
  var threads: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object LzmaOptions {
  @scala.inline
  def apply(
    blockSize: Int | Double = null,
    bufsize: Int | Double = null,
    check: Check = null,
    flags: TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED = null,
    memlimit: Int | Double = null,
    preset: Preset = null,
    synchronous: js.UndefOr[Boolean] = js.undefined,
    threads: Int | Double = null,
    timeout: Int | Double = null
  ): LzmaOptions = {
    val __obj = js.Dynamic.literal()
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (bufsize != null) __obj.updateDynamic("bufsize")(bufsize.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (memlimit != null) __obj.updateDynamic("memlimit")(memlimit.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LzmaOptions]
  }
}

