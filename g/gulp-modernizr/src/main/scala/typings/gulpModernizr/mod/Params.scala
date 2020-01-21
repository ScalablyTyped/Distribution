package typings.gulpModernizr.mod

import typings.gulpModernizr.AnonClassPrefix
import typings.gulpModernizr.AnonSrc
import typings.gulpModernizr.gulpModernizrBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  /**
    * Avoid unnecessary builds (see Caching section below)
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, will crawl your project for references to Modernizr tests
    * Set to false to disable
    */
  var crawl: js.UndefOr[Boolean] = js.undefined
  /**
    * Have custom Modernizr tests? Add them here.
    */
  var customTests: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Path to save out the built file
    */
  var dest: js.UndefOr[String | `false`] = js.undefined
  /**
    * Path to the build you're using for development.
    */
  var devFile: js.UndefOr[String | `false`] = js.undefined
  /**
    * Useful for excluding any tests that this tool will match
    * e.g. you use .notification class for notification elements,
    * but don’t want the test for Notification API
    */
  var excludeTests: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * By default, this task will crawl all *.js, *.css, *.scss files.
    */
  var files: js.UndefOr[AnonSrc] = js.undefined
  /**
    * Based on default settings on http://modernizr.com/download/
    */
  var options: js.UndefOr[AnonClassPrefix] = js.undefined
  /**
    * Define any tests you want to explicitly include
    */
  var tests: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * By default, source is uglified before saving
    */
  var uglify: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to pass in buffers via the "files" parameter below
    */
  var useBuffers: js.UndefOr[Boolean] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    crawl: js.UndefOr[Boolean] = js.undefined,
    customTests: js.Array[String] = null,
    dest: String | `false` = null,
    devFile: String | `false` = null,
    excludeTests: js.Array[String] = null,
    files: AnonSrc = null,
    options: AnonClassPrefix = null,
    tests: js.Array[String] = null,
    uglify: js.UndefOr[Boolean] = js.undefined,
    useBuffers: js.UndefOr[Boolean] = js.undefined
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(crawl)) __obj.updateDynamic("crawl")(crawl.asInstanceOf[js.Any])
    if (customTests != null) __obj.updateDynamic("customTests")(customTests.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (devFile != null) __obj.updateDynamic("devFile")(devFile.asInstanceOf[js.Any])
    if (excludeTests != null) __obj.updateDynamic("excludeTests")(excludeTests.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tests != null) __obj.updateDynamic("tests")(tests.asInstanceOf[js.Any])
    if (!js.isUndefined(uglify)) __obj.updateDynamic("uglify")(uglify.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuffers)) __obj.updateDynamic("useBuffers")(useBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

