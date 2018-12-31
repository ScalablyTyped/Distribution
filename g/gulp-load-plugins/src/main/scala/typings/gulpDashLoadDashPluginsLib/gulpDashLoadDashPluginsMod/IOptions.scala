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

