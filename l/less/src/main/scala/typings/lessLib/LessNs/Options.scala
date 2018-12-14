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

