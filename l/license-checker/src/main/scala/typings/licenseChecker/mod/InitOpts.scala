package typings.licenseChecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOpts extends js.Object {
  /**
    * Output in csv format
    */
  var csv: js.UndefOr[Boolean] = js.undefined
  /**
    * Prefix column for component in csv format.
    */
  var csvComponentPrefix: js.UndefOr[String] = js.undefined
  /**
    * To add a custom Format file in JSON
    */
  var customPath: js.UndefOr[String | ModuleInfo] = js.undefined
  /**
    * Only show development dependencies
    */
  var development: js.UndefOr[Boolean] = js.undefined
  /**
    * Look for direct dependencies only
    */
  var direct: js.UndefOr[Boolean] = js.undefined
  /**
    * Exclude modules which licenses are in the comma-separated list from the output
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Restrict output to the packages (package@version) not in the semicolon-separated list
    */
  var excludePackages: js.UndefOr[String] = js.undefined
  /**
    * Restrict output to not include any package marked as private
    */
  var excludePrivatePackages: js.UndefOr[Boolean] = js.undefined
  /**
    * Fail (exit with code 1) on the first occurrence of the licenses of the semicolon-separated list
    */
  var failOn: js.UndefOr[String] = js.undefined
  /**
    * Output in json format
    */
  var json: js.UndefOr[Boolean] = js.undefined
  /**
    * Fail (exit with code 1) on the first occurrence of the licenses not in the semicolon-separated list
    */
  var onlyAllow: js.UndefOr[String] = js.undefined
  /**
    * Only list packages with unknown or guessed licenses
    */
  var onlyunknown: js.UndefOr[Boolean] = js.undefined
  /**
    * Write the data to a specific file.
    */
  var out: js.UndefOr[String] = js.undefined
  /**
    * Restrict output to the packages (package@version) in the semicolon-separated list
    */
  var packages: js.UndefOr[String] = js.undefined
  /**
    * Only show production dependencies
    */
  var production: js.UndefOr[Boolean] = js.undefined
  /**
    * Output the location of the license files as relative paths
    */
  var relativeLicensePath: js.UndefOr[Boolean] = js.undefined
  /**
    * Path to start checking dependencies from
    */
  var start: String
  /**
    * Output a summary of the license usage
    */
  var summary: js.UndefOr[Boolean] = js.undefined
  /**
    * Report guessed licenses as unknown licenses
    */
  var unknown: js.UndefOr[Boolean] = js.undefined
}

object InitOpts {
  @scala.inline
  def apply(
    start: String,
    csv: js.UndefOr[Boolean] = js.undefined,
    csvComponentPrefix: String = null,
    customPath: String | ModuleInfo = null,
    development: js.UndefOr[Boolean] = js.undefined,
    direct: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String] = null,
    excludePackages: String = null,
    excludePrivatePackages: js.UndefOr[Boolean] = js.undefined,
    failOn: String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    onlyAllow: String = null,
    onlyunknown: js.UndefOr[Boolean] = js.undefined,
    out: String = null,
    packages: String = null,
    production: js.UndefOr[Boolean] = js.undefined,
    relativeLicensePath: js.UndefOr[Boolean] = js.undefined,
    summary: js.UndefOr[Boolean] = js.undefined,
    unknown: js.UndefOr[Boolean] = js.undefined
  ): InitOpts = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (!js.isUndefined(csv)) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (csvComponentPrefix != null) __obj.updateDynamic("csvComponentPrefix")(csvComponentPrefix.asInstanceOf[js.Any])
    if (customPath != null) __obj.updateDynamic("customPath")(customPath.asInstanceOf[js.Any])
    if (!js.isUndefined(development)) __obj.updateDynamic("development")(development.asInstanceOf[js.Any])
    if (!js.isUndefined(direct)) __obj.updateDynamic("direct")(direct.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (excludePackages != null) __obj.updateDynamic("excludePackages")(excludePackages.asInstanceOf[js.Any])
    if (!js.isUndefined(excludePrivatePackages)) __obj.updateDynamic("excludePrivatePackages")(excludePrivatePackages.asInstanceOf[js.Any])
    if (failOn != null) __obj.updateDynamic("failOn")(failOn.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (onlyAllow != null) __obj.updateDynamic("onlyAllow")(onlyAllow.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyunknown)) __obj.updateDynamic("onlyunknown")(onlyunknown.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    if (packages != null) __obj.updateDynamic("packages")(packages.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeLicensePath)) __obj.updateDynamic("relativeLicensePath")(relativeLicensePath.asInstanceOf[js.Any])
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (!js.isUndefined(unknown)) __obj.updateDynamic("unknown")(unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOpts]
  }
}

