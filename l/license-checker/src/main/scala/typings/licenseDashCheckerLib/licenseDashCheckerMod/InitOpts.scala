package typings
package licenseDashCheckerLib.licenseDashCheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOpts extends js.Object {
  /**
    * Output in csv format
    */
  var csv: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prefix column for component in csv format.
    */
  var csvComponentPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * To add a custom Format file in JSON
    */
  var customPath: js.UndefOr[java.lang.String | ModuleInfo] = js.undefined
  /**
    * Only show development dependencies
    */
  var development: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Look for direct dependencies only
    */
  var direct: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Exclude modules which licenses are in the comma-separated list from the output
    */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Restrict output to the packages (package@version) not in the semicolon-separated list
    */
  var excludePackages: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Restrict output to not include any package marked as private
    */
  var excludePrivatePackages: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Fail (exit with code 1) on the first occurrence of the licenses of the semicolon-separated list
    */
  var failOn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Output in json format
    */
  var json: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Fail (exit with code 1) on the first occurrence of the licenses not in the semicolon-separated list
    */
  var onlyAllow: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only list packages with unknown or guessed licenses
    */
  var onlyunknown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Write the data to a specific file.
    */
  var out: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Restrict output to the packages (package@version) in the semicolon-separated list
    */
  var packages: js.UndefOr[java.lang.String] = js.undefined
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
    csv: js.UndefOr[scala.Boolean] = js.undefined,
    csvComponentPrefix: java.lang.String = null,
    customPath: java.lang.String | ModuleInfo = null,
    development: js.UndefOr[scala.Boolean] = js.undefined,
    direct: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Array[java.lang.String] = null,
    excludePackages: java.lang.String = null,
    excludePrivatePackages: js.UndefOr[scala.Boolean] = js.undefined,
    failOn: java.lang.String = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    onlyAllow: java.lang.String = null,
    onlyunknown: js.UndefOr[scala.Boolean] = js.undefined,
    out: java.lang.String = null,
    packages: java.lang.String = null,
    production: js.UndefOr[scala.Boolean] = js.undefined,
    relativeLicensePath: js.UndefOr[scala.Boolean] = js.undefined,
    summary: js.UndefOr[scala.Boolean] = js.undefined,
    unknown: js.UndefOr[scala.Boolean] = js.undefined
  ): InitOpts = {
    val __obj = js.Dynamic.literal(start = start)
    if (!js.isUndefined(csv)) __obj.updateDynamic("csv")(csv)
    if (csvComponentPrefix != null) __obj.updateDynamic("csvComponentPrefix")(csvComponentPrefix)
    if (customPath != null) __obj.updateDynamic("customPath")(customPath.asInstanceOf[js.Any])
    if (!js.isUndefined(development)) __obj.updateDynamic("development")(development)
    if (!js.isUndefined(direct)) __obj.updateDynamic("direct")(direct)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (excludePackages != null) __obj.updateDynamic("excludePackages")(excludePackages)
    if (!js.isUndefined(excludePrivatePackages)) __obj.updateDynamic("excludePrivatePackages")(excludePrivatePackages)
    if (failOn != null) __obj.updateDynamic("failOn")(failOn)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (onlyAllow != null) __obj.updateDynamic("onlyAllow")(onlyAllow)
    if (!js.isUndefined(onlyunknown)) __obj.updateDynamic("onlyunknown")(onlyunknown)
    if (out != null) __obj.updateDynamic("out")(out)
    if (packages != null) __obj.updateDynamic("packages")(packages)
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production)
    if (!js.isUndefined(relativeLicensePath)) __obj.updateDynamic("relativeLicensePath")(relativeLicensePath)
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary)
    if (!js.isUndefined(unknown)) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[InitOpts]
  }
}

