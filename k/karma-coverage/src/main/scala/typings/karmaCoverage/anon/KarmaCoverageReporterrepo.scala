package typings.karmaCoverage.anon

import org.scalablytyped.runtime.StringDictionary
import typings.istanbul.mod.Store
import typings.karmaCoverage.mod.KarmaCoverageReporter
import typings.karmaCoverage.mod.Reporter
import typings.karmaCoverage.mod.ReporterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined karma-coverage.karma.KarmaCoverageReporter & {  reporters ? :std.Array<karma-coverage.karma.KarmaCoverageReporter>} */
trait KarmaCoverageReporterrepo
  extends /* moreSettings */ StringDictionary[js.Any] {
  /** This will be used to configure minimum threshold enforcement for coverage results */
  var check: js.UndefOr[js.Any] = js.undefined
  /** This will be used to output coverage reports. When you set a relative path, the directory is resolved against the basePath. */
  var dir: js.UndefOr[String] = js.undefined
  /** If you use one of these reporters, `cobertura`, `lcovonly`, `teamcity`, `text` or `text-summary`, you may set the file option to specify the output file */
  var file: js.UndefOr[String] = js.undefined
  /**
    * You can opt to include all sources files, as indicated by the coverage preprocessor,
    * in your code coverage data, even if there are no tests covering them
    */
  var includeAllSources: js.UndefOr[Boolean] = js.undefined
  /**
    * Karma-coverage can infers the instrumenter regarding of the file extension.
    * It is possible to override this behavior and point out an instrumenter
    * for the files matching a specific pattern.
    */
  var instrumenter: js.UndefOr[js.Any] = js.undefined
  /** You can use multiple reporters, by providing array of options */
  var reporters: js.UndefOr[js.Array[Reporter] with js.Array[KarmaCoverageReporter]] = js.undefined
  /** You can opt to specify a source store allowing for external coverage collectors access to the instrumented code. */
  var sourceStore: js.UndefOr[Store] = js.undefined
  /** This will be used in complement of the coverageReporter.dir option to generate the full output directory path */
  var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.undefined
  /** Specify a reporter type */
  var `type`: js.UndefOr[ReporterType] = js.undefined
  /**
    * If set to true, then CoffeeScript files instrumented with Ibrik will use
    * the .js extension for the transpiled source (without this option,
    * the JavaScript files will keep the original .coffee extension)
    */
  var useJSExtensionForCoffeeScript: js.UndefOr[Boolean] = js.undefined
  /** This will be used to set the coverage threshold colors */
  var watermarks: js.UndefOr[js.Any] = js.undefined
}

object KarmaCoverageReporterrepo {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    check: js.Any = null,
    dir: String = null,
    file: String = null,
    includeAllSources: js.UndefOr[Boolean] = js.undefined,
    instrumenter: js.Any = null,
    reporters: js.Array[Reporter] with js.Array[KarmaCoverageReporter] = null,
    sourceStore: Store = null,
    subdir: String | (js.Function1[/* browser */ String, String]) = null,
    `type`: ReporterType = null,
    useJSExtensionForCoffeeScript: js.UndefOr[Boolean] = js.undefined,
    watermarks: js.Any = null
  ): KarmaCoverageReporterrepo = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAllSources)) __obj.updateDynamic("includeAllSources")(includeAllSources.get.asInstanceOf[js.Any])
    if (instrumenter != null) __obj.updateDynamic("instrumenter")(instrumenter.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (sourceStore != null) __obj.updateDynamic("sourceStore")(sourceStore.asInstanceOf[js.Any])
    if (subdir != null) __obj.updateDynamic("subdir")(subdir.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useJSExtensionForCoffeeScript)) __obj.updateDynamic("useJSExtensionForCoffeeScript")(useJSExtensionForCoffeeScript.get.asInstanceOf[js.Any])
    if (watermarks != null) __obj.updateDynamic("watermarks")(watermarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[KarmaCoverageReporterrepo]
  }
}

