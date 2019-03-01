package typings
package htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateParametersAssets extends js.Object {
  /** Will contain all css files */
  var css: js.Array[java.lang.String]
  /** Will contain a favicon if it exists */
  var favicon: js.UndefOr[java.lang.String] = js.undefined
  /** Will contain all js files */
  @JSName("js")
  var `js_`: js.Array[java.lang.String]
  /** Will contain amn appcache manifest file if it exists */
  var manifest: js.UndefOr[java.lang.String] = js.undefined
  /** The public path */
  var publicPath: java.lang.String
}

object TemplateParametersAssets {
  @scala.inline
  def apply(
    css: js.Array[java.lang.String],
    `js_`: js.Array[java.lang.String],
    publicPath: java.lang.String,
    favicon: java.lang.String = null,
    manifest: java.lang.String = null
  ): TemplateParametersAssets = {
    val __obj = js.Dynamic.literal(`js_` = `js_`)
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("publicPath")(publicPath)
    if (favicon != null) __obj.updateDynamic("favicon")(favicon)
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    __obj.asInstanceOf[TemplateParametersAssets]
  }
}

