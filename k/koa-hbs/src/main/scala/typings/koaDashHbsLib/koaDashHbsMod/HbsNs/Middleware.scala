package typings
package koaDashHbsLib.koaDashHbsMod.HbsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  var blockHelperName: js.UndefOr[java.lang.String] = js.undefined
  var contentHelperName: js.UndefOr[java.lang.String] = js.undefined
  var defaultLayout: js.UndefOr[java.lang.String] = js.undefined
  var disableCache: js.UndefOr[scala.Boolean] = js.undefined
  var extname: js.UndefOr[java.lang.String] = js.undefined
  var handlebars: js.UndefOr[js.Function] = js.undefined
  var layoutsPath: js.UndefOr[java.lang.String] = js.undefined
  var partialsPath: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var templateOptions: js.UndefOr[js.Object] = js.undefined
  var viewPath: js.Array[java.lang.String] | java.lang.String
}

object Middleware {
  @scala.inline
  def apply(
    viewPath: js.Array[java.lang.String] | java.lang.String,
    blockHelperName: java.lang.String = null,
    contentHelperName: java.lang.String = null,
    defaultLayout: java.lang.String = null,
    disableCache: js.UndefOr[scala.Boolean] = js.undefined,
    extname: java.lang.String = null,
    handlebars: js.Function = null,
    layoutsPath: java.lang.String = null,
    partialsPath: js.Array[java.lang.String] | java.lang.String = null,
    templateOptions: js.Object = null
  ): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("viewPath")(viewPath.asInstanceOf[js.Any])
    if (blockHelperName != null) __obj.updateDynamic("blockHelperName")(blockHelperName)
    if (contentHelperName != null) __obj.updateDynamic("contentHelperName")(contentHelperName)
    if (defaultLayout != null) __obj.updateDynamic("defaultLayout")(defaultLayout)
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    if (handlebars != null) __obj.updateDynamic("handlebars")(handlebars)
    if (layoutsPath != null) __obj.updateDynamic("layoutsPath")(layoutsPath)
    if (partialsPath != null) __obj.updateDynamic("partialsPath")(partialsPath.asInstanceOf[js.Any])
    if (templateOptions != null) __obj.updateDynamic("templateOptions")(templateOptions)
    __obj.asInstanceOf[Middleware]
  }
}

