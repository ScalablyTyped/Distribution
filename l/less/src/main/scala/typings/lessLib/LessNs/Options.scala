package typings
package lessLib.LessNs

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
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated If true, compress using less built-in compression. */
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var depends: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether output file information and line numbers in compiled CSS code. */
  var dumpLineNumbers: js.UndefOr[lessLib.lessLibStrings.comment | java.lang.String] = js.undefined
  /** Filename of the main file to be passed to less.render() */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Defines a variable that can be referenced by the file. */
  var globalVars: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** @deprecated False by default. */
  var ieCompat: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, allow imports from insecure https hosts. */
  var insecure: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated If true, enable evaluation of JavaScript inline in `.less` files. */
  var javascriptEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** True, if run the less parser and just reports errors without any output. */
  var lint: js.UndefOr[scala.Boolean] = js.undefined
  /** Math mode options for avoiding symbol conficts on math expressions. */
  var math: js.UndefOr[
    lessLib.lessLibStrings.always | lessLib.lessLibStrings.strict | lessLib.lessLibStrings.`parens-division` | lessLib.lessLibStrings.parens | lessLib.lessLibStrings.`strict-legacy` | scala.Double
  ] = js.undefined
  var maxLineLen: js.UndefOr[scala.Double] = js.undefined
  /** Puts Var declaration at the end of base file. */
  var modifyVars: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** The locations for less looking for files in @import rules */
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Pre-load global Less.js plugins */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  /** Add a path to every generated import and url in output css files. */
  var rootpath: js.UndefOr[java.lang.String] = js.undefined
  /** If true, stops any warnings from being shown. */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMap: js.UndefOr[SourceMapOption] = js.undefined
  var strictImports: js.UndefOr[scala.Boolean] = js.undefined
  /** Without this option, Less attempts to guess at the output unit when it does maths. */
  var strictUnits: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: js.UndefOr[scala.Boolean] = js.undefined,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    depends: js.UndefOr[scala.Boolean] = js.undefined,
    dumpLineNumbers: lessLib.lessLibStrings.comment | java.lang.String = null,
    filename: java.lang.String = null,
    globalVars: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    ieCompat: js.UndefOr[scala.Boolean] = js.undefined,
    insecure: js.UndefOr[scala.Boolean] = js.undefined,
    javascriptEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    lint: js.UndefOr[scala.Boolean] = js.undefined,
    math: lessLib.lessLibStrings.always | lessLib.lessLibStrings.strict | lessLib.lessLibStrings.`parens-division` | lessLib.lessLibStrings.parens | lessLib.lessLibStrings.`strict-legacy` | scala.Double = null,
    maxLineLen: scala.Int | scala.Double = null,
    modifyVars: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    paths: js.Array[java.lang.String] = null,
    plugins: js.Array[Plugin] = null,
    rootpath: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMap: SourceMapOption = null,
    strictImports: js.UndefOr[scala.Boolean] = js.undefined,
    strictUnits: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (!js.isUndefined(depends)) __obj.updateDynamic("depends")(depends)
    if (dumpLineNumbers != null) __obj.updateDynamic("dumpLineNumbers")(dumpLineNumbers.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (globalVars != null) __obj.updateDynamic("globalVars")(globalVars)
    if (!js.isUndefined(ieCompat)) __obj.updateDynamic("ieCompat")(ieCompat)
    if (!js.isUndefined(insecure)) __obj.updateDynamic("insecure")(insecure)
    if (!js.isUndefined(javascriptEnabled)) __obj.updateDynamic("javascriptEnabled")(javascriptEnabled)
    if (!js.isUndefined(lint)) __obj.updateDynamic("lint")(lint)
    if (math != null) __obj.updateDynamic("math")(math.asInstanceOf[js.Any])
    if (maxLineLen != null) __obj.updateDynamic("maxLineLen")(maxLineLen.asInstanceOf[js.Any])
    if (modifyVars != null) __obj.updateDynamic("modifyVars")(modifyVars)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (rootpath != null) __obj.updateDynamic("rootpath")(rootpath)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap)
    if (!js.isUndefined(strictImports)) __obj.updateDynamic("strictImports")(strictImports)
    if (!js.isUndefined(strictUnits)) __obj.updateDynamic("strictUnits")(strictUnits)
    __obj.asInstanceOf[Options]
  }
}

