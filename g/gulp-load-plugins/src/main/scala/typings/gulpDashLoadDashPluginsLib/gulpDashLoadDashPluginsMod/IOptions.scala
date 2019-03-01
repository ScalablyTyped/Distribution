package typings
package gulpDashLoadDashPluginsLib.gulpDashLoadDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /** if true, transforms hyphenated plugin names to camel case, default true */
  var camelize: js.UndefOr[scala.Boolean] = js.undefined
  /** where to find the plugins, searched up from process.cwd(), default 'package.json' */
  var config: js.UndefOr[java.lang.String] = js.undefined
  /** whether the plugins should be lazy loaded on demand, default true */
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  /** the glob(s) to search for, default ['gulp-*', 'gulp.*'] */
  var pattern: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** a mapping of plugins to rename, the key being the NPM name of the package, and the value being an alias you define */
  var rename: js.UndefOr[IPluginNameMappings] = js.undefined
  /** what to remove from the name of the module when adding it to the context, default /^gulp(-|\.)/ */
  var replaceString: js.UndefOr[stdLib.RegExp] = js.undefined
  /** which keys in the config to look within, default ['dependencies', 'devDependencies', 'peerDependencies'] */
  var scope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    camelize: js.UndefOr[scala.Boolean] = js.undefined,
    config: java.lang.String = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: js.Array[java.lang.String] = null,
    rename: IPluginNameMappings = null,
    replaceString: stdLib.RegExp = null,
    scope: js.Array[java.lang.String] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(camelize)) __obj.updateDynamic("camelize")(camelize)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (rename != null) __obj.updateDynamic("rename")(rename)
    if (replaceString != null) __obj.updateDynamic("replaceString")(replaceString)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[IOptions]
  }
}

