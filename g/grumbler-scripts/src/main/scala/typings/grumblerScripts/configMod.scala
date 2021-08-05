package typings.grumblerScripts

import typings.grumblerScripts.anon.Version
import typings.grumblerScripts.typesMod.WebpackConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("grumbler-scripts/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grumbler-scripts/config", "ENV")
  @js.native
  object ENV extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.grumblerScripts.constantsMod.ENV & String] = js.native
    
    /* "demo" */ val DEMO: typings.grumblerScripts.constantsMod.ENV.DEMO & String = js.native
    
    /* "local" */ val LOCAL: typings.grumblerScripts.constantsMod.ENV.LOCAL & String = js.native
    
    /* "production" */ val PRODUCTION: typings.grumblerScripts.constantsMod.ENV.PRODUCTION & String = js.native
    
    /* "sandbox" */ val SANDBOX: typings.grumblerScripts.constantsMod.ENV.SANDBOX & String = js.native
    
    /* "stage" */ val STAGE: typings.grumblerScripts.constantsMod.ENV.STAGE & String = js.native
    
    /* "test" */ val TEST: typings.grumblerScripts.constantsMod.ENV.TEST & String = js.native
  }
  
  inline def getCurrentVersion(pkg: Version): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentVersion")(pkg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getKarmaConfig(karma: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getKarmaConfig")(karma.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def getKarmaConfig(karma: js.Object, cfg: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getKarmaConfig")(karma.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getNextVersion(pkg: Version): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextVersion")(pkg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getNextVersion(pkg: Version, level: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextVersion")(pkg.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWebpackConfig(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebpackConfig")().asInstanceOf[js.Object]
  inline def getWebpackConfig(options: WebpackConfigOptions): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebpackConfig")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
