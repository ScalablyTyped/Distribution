package typings.karmaBrowserify.mod

import org.scalablytyped.runtime.StringDictionary
import typings.browserify.mod.BrowserifyObject
import typings.browserify.mod.InputFile
import typings.browserify.mod.Options
import typings.insertModuleGlobals.mod.VarsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserifyOptions extends Options {
  /**
    * You may perform additional configuration in a function passed as the configure option
    * and that receives the browserify instance as an argument.
    * See {@link https://github.com/nikku/karma-browserify#additional-bundle-configuration}
    */
  var configure: js.UndefOr[js.Function1[/* bundle */ BrowserifyObject, Unit]] = js.undefined
}

object BrowserifyOptions {
  @scala.inline
  def apply(
    basedir: String = null,
    builtins: js.Array[String] | StringDictionary[String] | Boolean = null,
    bundleExternal: js.UndefOr[Boolean] = js.undefined,
    commondir: js.UndefOr[Boolean] = js.undefined,
    configure: /* bundle */ BrowserifyObject => Unit = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    detectGlobals: js.UndefOr[Boolean] = js.undefined,
    entries: InputFile | js.Array[InputFile] = null,
    extensions: js.Array[String] = null,
    externalRequireName: String = null,
    fullPaths: js.UndefOr[Boolean] = js.undefined,
    insertGlobalVars: VarsOption = null,
    insertGlobals: js.UndefOr[Boolean] = js.undefined,
    noParse: js.Array[String] = null,
    paths: js.Array[String] = null,
    standalone: String = null
  ): BrowserifyOptions = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (builtins != null) __obj.updateDynamic("builtins")(builtins.asInstanceOf[js.Any])
    if (!js.isUndefined(bundleExternal)) __obj.updateDynamic("bundleExternal")(bundleExternal.asInstanceOf[js.Any])
    if (!js.isUndefined(commondir)) __obj.updateDynamic("commondir")(commondir.asInstanceOf[js.Any])
    if (configure != null) __obj.updateDynamic("configure")(js.Any.fromFunction1(configure))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(detectGlobals)) __obj.updateDynamic("detectGlobals")(detectGlobals.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (externalRequireName != null) __obj.updateDynamic("externalRequireName")(externalRequireName.asInstanceOf[js.Any])
    if (!js.isUndefined(fullPaths)) __obj.updateDynamic("fullPaths")(fullPaths.asInstanceOf[js.Any])
    if (insertGlobalVars != null) __obj.updateDynamic("insertGlobalVars")(insertGlobalVars.asInstanceOf[js.Any])
    if (!js.isUndefined(insertGlobals)) __obj.updateDynamic("insertGlobals")(insertGlobals.asInstanceOf[js.Any])
    if (noParse != null) __obj.updateDynamic("noParse")(noParse.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (standalone != null) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserifyOptions]
  }
}

