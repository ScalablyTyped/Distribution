package typings.htmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateParametersAssets extends js.Object {
  /** Will contain all css files */
  var css: js.Array[String]
  /** Will contain a favicon if it exists */
  var favicon: js.UndefOr[String] = js.undefined
  /** Will contain all js files */
  @JSName("js")
  var js_ : js.Array[String]
  /** Will contain amn appcache manifest file if it exists */
  var manifest: js.UndefOr[String] = js.undefined
  /** The public path */
  var publicPath: String
}

object TemplateParametersAssets {
  @scala.inline
  def apply(
    css: js.Array[String],
    js_ : js.Array[String],
    publicPath: String,
    favicon: String = null,
    manifest: String = null
  ): TemplateParametersAssets = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    if (favicon != null) __obj.updateDynamic("favicon")(favicon.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateParametersAssets]
  }
}

