package typings
package gulpDashTypedocLib.gulpDashTypedocMod.gulpTypedocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Typedoc options
  */
trait Options extends js.Object {
  /**
    * Specifies the fully qualified name of the root symbol. Defaults to global namespace.
    */
  var entryPoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Exclude files by the given pattern when a path is provided as source. Supports standard minimatch patterns
    * (see TypeStrong/typedoc#170)
    */
  var exclude: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Prevent externally resolved TypeScript files from being documented.
    */
  var excludeExternals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent private members from being included in the generated documentation.
    */
  var excludePrivate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent protected members from being included in the generated documentation.
    */
  var excludeProtected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Define a pattern for files that should be considered being external.
    */
  var externalPattern: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the Google Analytics tracking ID and activate tracking code.
    */
  var gaID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the site name for Google Analytics. Defaults to `auto`
    */
  var gaSite: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use specified revision or branch instead of the last revision for linking to GitHub source files.
    */
  var gitRevision: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Do not print the TypeDoc link at the end of the page.
    */
  var hideGenerator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Turn on parsing of .d.ts declaration files.
    */
  var includeDeclarations: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies the location to look for included documents. One may use [[include:FILENAME]] in comments to include
    * documents from this location.
    */
  var includes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the location and file name a json file describing the project is written to. When specified no
    * documentation will be generated.
    */
  var json: js.UndefOr[java.lang.String] = js.undefined
  var logger: js.UndefOr[Logger | gulpDashTypedocLib.gulpDashTypedocLibStrings.none] = js.undefined
  /**
    * Specifies the location with media files that should be copied to the output directory. In order to create a link
    * to media files use the pattern media://FILENAME in comments.
    */
  var media: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the output mode the project is used to be compiled with.
    */
  var mode: js.UndefOr[
    gulpDashTypedocLib.gulpDashTypedocLibStrings.file | gulpDashTypedocLib.gulpDashTypedocLibStrings.modules
  ] = js.undefined
  /**
    * Specify module code generation: "commonjs", "amd", "system" or "umd".
    */
  var module: js.UndefOr[
    gulpDashTypedocLib.gulpDashTypedocLibStrings.commonjs | gulpDashTypedocLib.gulpDashTypedocLibStrings.amd | gulpDashTypedocLib.gulpDashTypedocLibStrings.system | gulpDashTypedocLib.gulpDashTypedocLibStrings.umd
  ] = js.undefined
  /**
    * Set the name of the project that will be used in the header of the template.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the location the documentation should be written to.
    */
  var out: java.lang.String
  /**
    * Specify the npm plugins that should be loaded.
    */
  var plugins: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Path to the readme file that should be displayed on the index page. Pass `none` to disable the index page and
    * start the documentation on the globals page.
    */
  var readme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify ECMAScript target version: "ES3" (default), "ES5" or "ES6"
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the path to the theme that should be used.
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[scala.Boolean] = js.undefined
}

