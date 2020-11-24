package typings.grumblerScripts

import typings.grumblerScripts.anon.Version
import typings.grumblerScripts.typesMod.WebpackConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grumbler-scripts/config/webpack.config", JSImport.Namespace)
@js.native
object webpackConfigMod extends js.Object {
  
  def getCurrentVersion(pkg: Version): String = js.native
  
  def getNextVersion(pkg: Version): String = js.native
  def getNextVersion(pkg: Version, level: String): String = js.native
  
  def getWebpackConfig(): js.Object = js.native
  def getWebpackConfig(options: WebpackConfigOptions): js.Object = js.native
}
