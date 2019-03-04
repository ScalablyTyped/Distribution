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

object InitOpts {
  @scala.inline
  def apply(
    start: java.lang.String,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    customPath: java.lang.String | ModuleInfo = null,
    development: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Array[java.lang.String] = null,
    failOn: js.Array[java.lang.String] = null,
    onlyunknown: js.UndefOr[scala.Boolean] = js.undefined,
    production: js.UndefOr[scala.Boolean] = js.undefined,
    relativeLicensePath: js.UndefOr[scala.Boolean] = js.undefined,
    summary: js.UndefOr[scala.Boolean] = js.undefined,
    unknown: js.UndefOr[scala.Boolean] = js.undefined
  ): InitOpts = {
    val __obj = js.Dynamic.literal(start = start)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (customPath != null) __obj.updateDynamic("customPath")(customPath.asInstanceOf[js.Any])
    if (!js.isUndefined(development)) __obj.updateDynamic("development")(development)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (failOn != null) __obj.updateDynamic("failOn")(failOn)
    if (!js.isUndefined(onlyunknown)) __obj.updateDynamic("onlyunknown")(onlyunknown)
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production)
    if (!js.isUndefined(relativeLicensePath)) __obj.updateDynamic("relativeLicensePath")(relativeLicensePath)
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary)
    if (!js.isUndefined(unknown)) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[InitOpts]
  }
}

