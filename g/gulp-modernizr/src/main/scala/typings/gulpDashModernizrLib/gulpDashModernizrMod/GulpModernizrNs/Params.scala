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

