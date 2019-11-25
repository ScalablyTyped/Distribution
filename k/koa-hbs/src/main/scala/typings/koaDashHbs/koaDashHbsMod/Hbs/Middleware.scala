package typings.koaDashHbs.koaDashHbsMod.Hbs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  var blockHelperName: js.UndefOr[String] = js.undefined
  var contentHelperName: js.UndefOr[String] = js.undefined
  var defaultLayout: js.UndefOr[String] = js.undefined
  var disableCache: js.UndefOr[Boolean] = js.undefined
  var extname: js.UndefOr[String] = js.undefined
  var handlebars: js.UndefOr[js.Function] = js.undefined
  var layoutsPath: js.UndefOr[String] = js.undefined
  var partialsPath: js.UndefOr[js.Array[String] | String] = js.undefined
  var templateOptions: js.UndefOr[js.Object] = js.undefined
  var viewPath: js.Array[String] | String
}

object Middleware {
  @scala.inline
  def apply(
    viewPath: js.Array[String] | String,
    blockHelperName: String = null,
    contentHelperName: String = null,
    defaultLayout: String = null,
    disableCache: js.UndefOr[Boolean] = js.undefined,
    extname: String = null,
    handlebars: js.Function = null,
    layoutsPath: String = null,
    partialsPath: js.Array[String] | String = null,
    templateOptions: js.Object = null
  ): Middleware = {
    val __obj = js.Dynamic.literal(viewPath = viewPath.asInstanceOf[js.Any])
    if (blockHelperName != null) __obj.updateDynamic("blockHelperName")(blockHelperName.asInstanceOf[js.Any])
    if (contentHelperName != null) __obj.updateDynamic("contentHelperName")(contentHelperName.asInstanceOf[js.Any])
    if (defaultLayout != null) __obj.updateDynamic("defaultLayout")(defaultLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache.asInstanceOf[js.Any])
    if (extname != null) __obj.updateDynamic("extname")(extname.asInstanceOf[js.Any])
    if (handlebars != null) __obj.updateDynamic("handlebars")(handlebars.asInstanceOf[js.Any])
    if (layoutsPath != null) __obj.updateDynamic("layoutsPath")(layoutsPath.asInstanceOf[js.Any])
    if (partialsPath != null) __obj.updateDynamic("partialsPath")(partialsPath.asInstanceOf[js.Any])
    if (templateOptions != null) __obj.updateDynamic("templateOptions")(templateOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
}

