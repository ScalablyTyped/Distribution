package typings.karmaJunitReporter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JUnitReporterConfiguration extends js.Object {
  /** function (browser, result) to customize the classname attribute in xml testcase element */
  var classNameFormatter: js.UndefOr[js.Function2[/* browser */ js.Any, /* result */ js.Any, String]] = js.undefined
  /** function (browser, result) to customize the name attribute in xml testcase element */
  var nameFormatter: js.UndefOr[js.Function2[/* browser */ js.Any, /* result */ js.Any, String]] = js.undefined
  /** results will be saved as $outputDir/$browserName.xml */
  var outputDir: js.UndefOr[String] = js.undefined
  /** if included, results will be saved as $outputDir/$browserName/$outputFile */
  var outputFile: js.UndefOr[String] = js.undefined
  /** key value pair of properties to add to the <properties> section of the report */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** suite will become the package name attribute in xml testsuite element */
  var suite: js.UndefOr[String] = js.undefined
  /** add browser name to report and classes names */
  var useBrowserName: js.UndefOr[Boolean] = js.undefined
  /** use '1' if reporting to be per SonarQube 6.2 XML format */
  var xmlVersion: js.UndefOr[Double | Null] = js.undefined
}

object JUnitReporterConfiguration {
  @scala.inline
  def apply(
    classNameFormatter: (/* browser */ js.Any, /* result */ js.Any) => String = null,
    nameFormatter: (/* browser */ js.Any, /* result */ js.Any) => String = null,
    outputDir: String = null,
    outputFile: String = null,
    properties: StringDictionary[js.Any] = null,
    suite: String = null,
    useBrowserName: js.UndefOr[Boolean] = js.undefined,
    xmlVersion: js.UndefOr[Null | Double] = js.undefined
  ): JUnitReporterConfiguration = {
    val __obj = js.Dynamic.literal()
    if (classNameFormatter != null) __obj.updateDynamic("classNameFormatter")(js.Any.fromFunction2(classNameFormatter))
    if (nameFormatter != null) __obj.updateDynamic("nameFormatter")(js.Any.fromFunction2(nameFormatter))
    if (outputDir != null) __obj.updateDynamic("outputDir")(outputDir.asInstanceOf[js.Any])
    if (outputFile != null) __obj.updateDynamic("outputFile")(outputFile.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (suite != null) __obj.updateDynamic("suite")(suite.asInstanceOf[js.Any])
    if (!js.isUndefined(useBrowserName)) __obj.updateDynamic("useBrowserName")(useBrowserName.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlVersion)) __obj.updateDynamic("xmlVersion")(xmlVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[JUnitReporterConfiguration]
  }
}

