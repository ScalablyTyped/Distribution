package typings
package gulpDashModernizrLib.gulpDashModernizrMod.GulpModernizrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  /**
    * Avoid unnecessary builds (see Caching section below)
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, will crawl your project for references to Modernizr tests
    * Set to false to disable
    */
  var crawl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Have custom Modernizr tests? Add them here.
    */
  var customTests: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Path to save out the built file
    */
  var dest: js.UndefOr[java.lang.String | gulpDashModernizrLib.gulpDashModernizrLibNumbers.`false`] = js.undefined
  /**
    * Path to the build you're using for development.
    */
  var devFile: js.UndefOr[java.lang.String | gulpDashModernizrLib.gulpDashModernizrLibNumbers.`false`] = js.undefined
  /**
    * Useful for excluding any tests that this tool will match
    * e.g. you use .notification class for notification elements,
    * but don’t want the test for Notification API
    */
  var excludeTests: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * By default, this task will crawl all *.js, *.css, *.scss files.
    */
  var files: js.UndefOr[gulpDashModernizrLib.Anon_Src] = js.undefined
  /**
    * Based on default settings on http://modernizr.com/download/
    */
  var options: js.UndefOr[gulpDashModernizrLib.Anon_ClassPrefix] = js.undefined
  /**
    * Define any tests you want to explicitly include
    */
  var tests: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * By default, source is uglified before saving
    */
  var uglify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true to pass in buffers via the "files" parameter below
    */
  var useBuffers: js.UndefOr[scala.Boolean] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    crawl: js.UndefOr[scala.Boolean] = js.undefined,
    customTests: js.Array[java.lang.String] = null,
    dest: java.lang.String | gulpDashModernizrLib.gulpDashModernizrLibNumbers.`false` = null,
    devFile: java.lang.String | gulpDashModernizrLib.gulpDashModernizrLibNumbers.`false` = null,
    excludeTests: js.Array[java.lang.String] = null,
    files: gulpDashModernizrLib.Anon_Src = null,
    options: gulpDashModernizrLib.Anon_ClassPrefix = null,
    tests: js.Array[java.lang.String] = null,
    uglify: js.UndefOr[scala.Boolean] = js.undefined,
    useBuffers: js.UndefOr[scala.Boolean] = js.undefined
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(crawl)) __obj.updateDynamic("crawl")(crawl)
    if (customTests != null) __obj.updateDynamic("customTests")(customTests)
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (devFile != null) __obj.updateDynamic("devFile")(devFile.asInstanceOf[js.Any])
    if (excludeTests != null) __obj.updateDynamic("excludeTests")(excludeTests)
    if (files != null) __obj.updateDynamic("files")(files)
    if (options != null) __obj.updateDynamic("options")(options)
    if (tests != null) __obj.updateDynamic("tests")(tests)
    if (!js.isUndefined(uglify)) __obj.updateDynamic("uglify")(uglify)
    if (!js.isUndefined(useBuffers)) __obj.updateDynamic("useBuffers")(useBuffers)
    __obj.asInstanceOf[Params]
  }
}

