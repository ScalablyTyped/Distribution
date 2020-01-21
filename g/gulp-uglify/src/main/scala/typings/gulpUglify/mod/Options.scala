package typings.gulpUglify.mod

import typings.uglifyJs.mod.CompressOptions
import typings.uglifyJs.mod.MangleOptions
import typings.uglifyJs.mod.OutputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Pass an object to specify custom compressor options. Pass false to skip compression completely.
    */
  var compress: js.UndefOr[CompressOptions | Boolean] = js.undefined
  /**
    * Pass false to skip mangling names.
    */
  var mangle: js.UndefOr[MangleOptions | Boolean] = js.undefined
  /**
    * Pass if you wish to specify additional output options. The defaults are optimized for best compression.
    */
  var output: js.UndefOr[OutputOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compress: CompressOptions | Boolean = null,
    mangle: MangleOptions | Boolean = null,
    output: OutputOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

