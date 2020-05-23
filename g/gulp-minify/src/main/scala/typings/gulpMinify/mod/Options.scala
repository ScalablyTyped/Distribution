package typings.gulpMinify.mod

import typings.gulpMinify.anon.Asciionly
import typings.gulpMinify.anon.Booleans
import typings.gulpMinify.anon.Min
import typings.gulpMinify.gulpMinifyStrings.all
import typings.gulpMinify.gulpMinifyStrings.some
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Pass an object to specify custom compressor options. Pass false to skip compression completely.
    */
  var compress: js.UndefOr[Booleans | Boolean] = js.undefined
  /**
    * Will not minify files in the dirs.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An object that specifies output src and minified file extensions.
    */
  var ext: js.UndefOr[Min] = js.undefined
  /**
    * Will not minify files which matches the pattern.
    */
  var ignoreFiles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If true, will mangle variable names.
    */
  var mangle: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, will not output the source code in the dest dirs.
    */
  var noSource: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass an object if you wish to specify additional output options.The defaults are optimized for best compression.
    */
  var output: js.UndefOr[Asciionly] = js.undefined
  /**
    * A convenience option for options.output.comments. Defaults to preserving no comments.
    *
    * * **all**: Preserve all comments in code blocks.
    *
    * * **some**: preserve comments that start with a bang(!) or include a Closure Compiler directive(@preserve, @license, @cc_on).
    *
    * * **function**: specify your own comment preservation function. You will be passed the current node and the current comment and are expected to return a boolean.
    */
  var preserveComments: js.UndefOr[
    all | some | (js.Function2[/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any], Boolean])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compress: Booleans | Boolean = null,
    exclude: js.Array[String] = null,
    ext: Min = null,
    ignoreFiles: js.Array[String] = null,
    mangle: js.UndefOr[Boolean] = js.undefined,
    noSource: js.UndefOr[Boolean] = js.undefined,
    output: Asciionly = null,
    preserveComments: all | some | (js.Function2[/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any], Boolean]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (ignoreFiles != null) __obj.updateDynamic("ignoreFiles")(ignoreFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(mangle)) __obj.updateDynamic("mangle")(mangle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSource)) __obj.updateDynamic("noSource")(noSource.get.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (preserveComments != null) __obj.updateDynamic("preserveComments")(preserveComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

