package typings
package atHapiVisionLib.atHapiVisionMod.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerViewsConfiguration
  extends ViewHandlerOrReplyOptions
     with EnginesConfiguration {
  /**
    * The directory path, or array of directory paths, where helpers are located.
    * Helpers are functions used within templates to perform transformations and other data manipulations using the template context or other inputs.
    * Each '.js' file in the helpers directory is loaded and the file name is used as the helper name.
    * The files must export a single method with the signature function(context) and return a string.
    * Sub-folders are not supported and are ignored. Defaults to no helpers support (empty path).
    * Note that jade does not support loading helpers this way.
    */
  var helpersPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** if set to false, templates will not be cached (thus will be read from file on every use). Defaults to true. */
  var isCached: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The root file path, or array of file paths, where partials are located.
    * Partials are small segments of template code that can be nested and reused throughout other templates.
    * Defaults to no partials support (empty path).
    */
  var partialsPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ServerViewsConfiguration {
  @scala.inline
  def apply(
    engines: org.scalablytyped.runtime.StringDictionary[NpmModule] | ServerViewsEnginesOptions,
    allowAbsolutePaths: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsecureAccess: js.UndefOr[scala.Boolean] = js.undefined,
    compileMode: atHapiVisionLib.atHapiVisionLibStrings.sync | atHapiVisionLib.atHapiVisionLibStrings.async = null,
    compileOptions: CompileOptions = null,
    contentType: java.lang.String = null,
    context: js.Object | (js.Function1[/* request */ atHapiHapiLib.atHapiHapiMod.Request, js.Object]) = null,
    defaultExtension: java.lang.String = null,
    encoding: java.lang.String = null,
    helpersPath: java.lang.String | js.Array[java.lang.String] = null,
    isCached: js.UndefOr[scala.Boolean] = js.undefined,
    layout: scala.Boolean | java.lang.String = null,
    layoutKeyword: java.lang.String = null,
    layoutPath: java.lang.String | js.Array[java.lang.String] = null,
    partialsPath: java.lang.String | js.Array[java.lang.String] = null,
    path: java.lang.String | js.Array[java.lang.String] = null,
    relativeTo: java.lang.String = null,
    runtimeOptions: RuntimeOptions = null
  ): ServerViewsConfiguration = {
    val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAbsolutePaths)) __obj.updateDynamic("allowAbsolutePaths")(allowAbsolutePaths)
    if (!js.isUndefined(allowInsecureAccess)) __obj.updateDynamic("allowInsecureAccess")(allowInsecureAccess)
    if (compileMode != null) __obj.updateDynamic("compileMode")(compileMode.asInstanceOf[js.Any])
    if (compileOptions != null) __obj.updateDynamic("compileOptions")(compileOptions)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (defaultExtension != null) __obj.updateDynamic("defaultExtension")(defaultExtension)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (helpersPath != null) __obj.updateDynamic("helpersPath")(helpersPath.asInstanceOf[js.Any])
    if (!js.isUndefined(isCached)) __obj.updateDynamic("isCached")(isCached)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutKeyword != null) __obj.updateDynamic("layoutKeyword")(layoutKeyword)
    if (layoutPath != null) __obj.updateDynamic("layoutPath")(layoutPath.asInstanceOf[js.Any])
    if (partialsPath != null) __obj.updateDynamic("partialsPath")(partialsPath.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo)
    if (runtimeOptions != null) __obj.updateDynamic("runtimeOptions")(runtimeOptions)
    __obj.asInstanceOf[ServerViewsConfiguration]
  }
}

