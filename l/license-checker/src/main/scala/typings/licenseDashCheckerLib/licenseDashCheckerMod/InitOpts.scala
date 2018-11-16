package typings
package licenseDashCheckerLib.licenseDashCheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InitOpts extends js.Object {
  /**
       * Use chalk to colorize the licenses member of each returned module info. Unknown licenses become red.
       */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * to add a custom Format file in JSON
       */
  var customPath: js.UndefOr[java.lang.String | ModuleInfo] = js.undefined
  /**
       * Only show development dependencies
       */
  var development: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Exclude modules which licenses are in the comma-separated list from the output
       */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Fail (exit with code 1) on the first occurrence of the licenses of the comma-separated list
       */
  var failOn: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Only list packages with unknown or guessed licenses
       */
  var onlyunknown: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Only show production dependencies
       */
  var production: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Output the location of the license files as relative paths
       */
  var relativeLicensePath: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Path to start checking dependencies from
       */
  var start: java.lang.String
  /**
       * Output a summary of the license usage
       */
  var summary: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Report guessed licenses as unknown licenses
       */
  var unknown: js.UndefOr[scala.Boolean] = js.undefined
}

