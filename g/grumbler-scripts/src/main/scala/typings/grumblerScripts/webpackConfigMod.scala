package typings.grumblerScripts

import typings.grumblerScripts.anon.Version
import typings.grumblerScripts.typesMod.WebpackConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackConfigMod {
  
  @JSImport("grumbler-scripts/config/webpack.config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCurrentVersion(pkg: Version): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentVersion")(pkg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getNextVersion(pkg: Version): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextVersion")(pkg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getNextVersion(pkg: Version, level: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextVersion")(pkg.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWebpackConfig(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebpackConfig")().asInstanceOf[js.Object]
  inline def getWebpackConfig(options: WebpackConfigOptions): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebpackConfig")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
