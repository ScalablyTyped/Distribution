package typings.grumblerScripts

import typings.grumblerScripts.anon.Version
import typings.grumblerScripts.declarationsMod.Values
import typings.grumblerScripts.typesMod.WebpackConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grumbler-scripts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grumbler-scripts", "ENV")
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
  
  @JSImport("grumbler-scripts", "__DEBUG__")
  @js.native
  val __DEBUG__ : Boolean = js.native
  
  @JSImport("grumbler-scripts", "__ENV__")
  @js.native
  val __ENV__ : Values[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ENV */ js.Any
  ] = js.native
  
  @JSImport("grumbler-scripts", "__GLOBAL__")
  @js.native
  val __GLOBAL__ : js.Any = js.native
  
  @JSImport("grumbler-scripts", "__LOCAL__")
  @js.native
  val __LOCAL__ : Boolean = js.native
  
  @JSImport("grumbler-scripts", "__MIN__")
  @js.native
  val __MIN__ : Boolean = js.native
  
  @JSImport("grumbler-scripts", "__PRODUCTION__")
  @js.native
  val __PRODUCTION__ : Boolean = js.native
  
  @JSImport("grumbler-scripts", "__SANDBOX__")
  @js.native
  val __SANDBOX__ : Boolean = js.native
  
  @JSImport("grumbler-scripts", "__STAGE__")
  @js.native
  val __STAGE__ : Boolean = js.native
  
  @JSImport("grumbler-scripts", "__TEST__")
  @js.native
  val __TEST__ : Boolean = js.native
  
  @JSImport("grumbler-scripts", "__TREE_SHAKE__")
  @js.native
  val __TREE_SHAKE__ : Boolean = js.native
  
  @JSImport("grumbler-scripts", "__UID__")
  @js.native
  val __UID__ : String = js.native
  
  @JSImport("grumbler-scripts", "__WEB__")
  @js.native
  val __WEB__ : Boolean = js.native
  
  @JSImport("grumbler-scripts", "__WINDOW__")
  @js.native
  val __WINDOW__ : js.Any = js.native
  
  inline def getCurrentVersion(pkg: Version): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentVersion")(pkg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getKarmaConfig(karma: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getKarmaConfig")(karma.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def getKarmaConfig(karma: js.Object, cfg: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getKarmaConfig")(karma.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getNextVersion(pkg: Version): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextVersion")(pkg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getNextVersion(pkg: Version, level: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextVersion")(pkg.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWebpackConfig(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebpackConfig")().asInstanceOf[js.Object]
  inline def getWebpackConfig(options: WebpackConfigOptions): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebpackConfig")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
