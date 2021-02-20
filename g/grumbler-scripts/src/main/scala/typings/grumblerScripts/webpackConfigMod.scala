package typings.grumblerScripts

import typings.grumblerScripts.anon.Version
import typings.grumblerScripts.typesMod.WebpackConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackConfigMod {
  
  @JSImport("grumbler-scripts/config/webpack.config", "getCurrentVersion")
  @js.native
  def getCurrentVersion(pkg: Version): String = js.native
  
  @JSImport("grumbler-scripts/config/webpack.config", "getNextVersion")
  @js.native
  def getNextVersion(pkg: Version): String = js.native
  @JSImport("grumbler-scripts/config/webpack.config", "getNextVersion")
  @js.native
  def getNextVersion(pkg: Version, level: String): String = js.native
  
  @JSImport("grumbler-scripts/config/webpack.config", "getWebpackConfig")
  @js.native
  def getWebpackConfig(): js.Object = js.native
  @JSImport("grumbler-scripts/config/webpack.config", "getWebpackConfig")
  @js.native
  def getWebpackConfig(options: WebpackConfigOptions): js.Object = js.native
}
