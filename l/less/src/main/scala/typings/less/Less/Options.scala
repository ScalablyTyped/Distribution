package typings.less.Less

import org.scalablytyped.runtime.StringDictionary
import typings.less.lessStrings.`parens-division`
import typings.less.lessStrings.`strict-legacy`
import typings.less.lessStrings.always
import typings.less.lessStrings.comment
import typings.less.lessStrings.parens
import typings.less.lessStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to:
  * * https://github.com/less/less.js/blob/master/bin/lessc
  * * http://lesscss.org/usage/#less-options
  *
  * @interface Options
  */
trait Options extends js.Object {
  /** @deprecated If false, No color in compiling. */
  var color: js.UndefOr[Boolean] = js.undefined
  /** @deprecated If true, compress using less built-in compression. */
  var compress: js.UndefOr[Boolean] = js.undefined
  var depends: js.UndefOr[Boolean] = js.undefined
  /** Whether output file information and line numbers in compiled CSS code. */
  var dumpLineNumbers: js.UndefOr[comment | String] = js.undefined
  /** Filename of the main file to be passed to less.render() */
  var filename: js.UndefOr[String] = js.undefined
  /** Defines a variable that can be referenced by the file. */
  var globalVars: js.UndefOr[StringDictionary[String]] = js.undefined
  /** @deprecated False by default. */
  var ieCompat: js.UndefOr[Boolean] = js.undefined
  /** If true, allow imports from insecure https hosts. */
  var insecure: js.UndefOr[Boolean] = js.undefined
  /** @deprecated If true, enable evaluation of JavaScript inline in `.less` files. */
  var javascriptEnabled: js.UndefOr[Boolean] = js.undefined
  /** True, if run the less parser and just reports errors without any output. */
  var lint: js.UndefOr[Boolean] = js.undefined
  /** Math mode options for avoiding symbol conficts on math expressions. */
  var math: js.UndefOr[always | strict | `parens-division` | parens | `strict-legacy` | Double] = js.undefined
  var maxLineLen: js.UndefOr[Double] = js.undefined
  /** Puts Var declaration at the end of base file. */
  var modifyVars: js.UndefOr[StringDictionary[String]] = js.undefined
  /** The locations for less looking for files in @import rules */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  /** Pre-load global Less.js plugins */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  /** Add a path to every generated import and url in output css files. */
  var rootpath: js.UndefOr[String] = js.undefined
  /** If true, stops any warnings from being shown. */
  var silent: js.UndefOr[Boolean] = js.undefined
  var sourceMap: js.UndefOr[SourceMapOption] = js.undefined
  var strictImports: js.UndefOr[Boolean] = js.undefined
  /** Without this option, Less attempts to guess at the output unit when it does maths. */
  var strictUnits: js.UndefOr[Boolean] = js.undefined
  /** Read files synchronously in Node.js */
  var syncImport: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: js.UndefOr[Boolean] = js.undefined,
    compress: js.UndefOr[Boolean] = js.undefined,
    depends: js.UndefOr[Boolean] = js.undefined,
    dumpLineNumbers: comment | String = null,
    filename: String = null,
    globalVars: StringDictionary[String] = null,
    ieCompat: js.UndefOr[Boolean] = js.undefined,
    insecure: js.UndefOr[Boolean] = js.undefined,
    javascriptEnabled: js.UndefOr[Boolean] = js.undefined,
    lint: js.UndefOr[Boolean] = js.undefined,
    math: always | strict | `parens-division` | parens | `strict-legacy` | Double = null,
    maxLineLen: Int | Double = null,
    modifyVars: StringDictionary[String] = null,
    paths: js.Array[String] = null,
    plugins: js.Array[Plugin] = null,
    rootpath: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    sourceMap: SourceMapOption = null,
    strictImports: js.UndefOr[Boolean] = js.undefined,
    strictUnits: js.UndefOr[Boolean] = js.undefined,
    syncImport: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(depends)) __obj.updateDynamic("depends")(depends.asInstanceOf[js.Any])
    if (dumpLineNumbers != null) __obj.updateDynamic("dumpLineNumbers")(dumpLineNumbers.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (globalVars != null) __obj.updateDynamic("globalVars")(globalVars.asInstanceOf[js.Any])
    if (!js.isUndefined(ieCompat)) __obj.updateDynamic("ieCompat")(ieCompat.asInstanceOf[js.Any])
    if (!js.isUndefined(insecure)) __obj.updateDynamic("insecure")(insecure.asInstanceOf[js.Any])
    if (!js.isUndefined(javascriptEnabled)) __obj.updateDynamic("javascriptEnabled")(javascriptEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(lint)) __obj.updateDynamic("lint")(lint.asInstanceOf[js.Any])
    if (math != null) __obj.updateDynamic("math")(math.asInstanceOf[js.Any])
    if (maxLineLen != null) __obj.updateDynamic("maxLineLen")(maxLineLen.asInstanceOf[js.Any])
    if (modifyVars != null) __obj.updateDynamic("modifyVars")(modifyVars.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (rootpath != null) __obj.updateDynamic("rootpath")(rootpath.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(strictImports)) __obj.updateDynamic("strictImports")(strictImports.asInstanceOf[js.Any])
    if (!js.isUndefined(strictUnits)) __obj.updateDynamic("strictUnits")(strictUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(syncImport)) __obj.updateDynamic("syncImport")(syncImport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

