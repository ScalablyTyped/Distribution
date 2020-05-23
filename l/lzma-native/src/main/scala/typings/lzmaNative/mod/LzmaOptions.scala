package typings.lzmaNative.mod

import typings.lzmaNative.lzmaNativeStrings.CONCATENATED
import typings.lzmaNative.lzmaNativeStrings.TELL_ANY_CHECK
import typings.lzmaNative.lzmaNativeStrings.TELL_NO_CHECK
import typings.lzmaNative.lzmaNativeStrings.TELL_UNSUPPORTED_CHECK
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
    blockSize: js.UndefOr[Double] = js.undefined,
    bufsize: js.UndefOr[Double] = js.undefined,
    check: Check = null,
    flags: TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED = null,
    memlimit: js.UndefOr[Double] = js.undefined,
    preset: Preset = null,
    synchronous: js.UndefOr[Boolean] = js.undefined,
    threads: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): LzmaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockSize)) __obj.updateDynamic("blockSize")(blockSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bufsize)) __obj.updateDynamic("bufsize")(bufsize.get.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (!js.isUndefined(memlimit)) __obj.updateDynamic("memlimit")(memlimit.get.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threads)) __obj.updateDynamic("threads")(threads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LzmaOptions]
  }
}

