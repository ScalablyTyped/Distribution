package typings.grumblerScripts

import typings.grumblerScripts.anon.Version
import typings.grumblerScripts.declarationsMod.Values
import typings.grumblerScripts.typesMod.WebpackConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grumbler-scripts", "ENV")
  @js.native
  object ENV extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.grumblerScripts.constantsMod.ENV with String] = js.native
    
    /* "demo" */ val DEMO: typings.grumblerScripts.constantsMod.ENV.DEMO with String = js.native
    
    /* "local" */ val LOCAL: typings.grumblerScripts.constantsMod.ENV.LOCAL with String = js.native
    
    /* "production" */ val PRODUCTION: typings.grumblerScripts.constantsMod.ENV.PRODUCTION with String = js.native
    
    /* "sandbox" */ val SANDBOX: typings.grumblerScripts.constantsMod.ENV.SANDBOX with String = js.native
    
    /* "stage" */ val STAGE: typings.grumblerScripts.constantsMod.ENV.STAGE with String = js.native
    
    /* "test" */ val TEST: typings.grumblerScripts.constantsMod.ENV.TEST with String = js.native
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
  
  @JSImport("grumbler-scripts", "getCurrentVersion")
  @js.native
  def getCurrentVersion(pkg: Version): String = js.native
  
  @JSImport("grumbler-scripts", "getKarmaConfig")
  @js.native
  def getKarmaConfig(karma: js.Object): js.Object = js.native
  @JSImport("grumbler-scripts", "getKarmaConfig")
  @js.native
  def getKarmaConfig(karma: js.Object, cfg: js.Object): js.Object = js.native
  
  @JSImport("grumbler-scripts", "getNextVersion")
  @js.native
  def getNextVersion(pkg: Version): String = js.native
  @JSImport("grumbler-scripts", "getNextVersion")
  @js.native
  def getNextVersion(pkg: Version, level: String): String = js.native
  
  @JSImport("grumbler-scripts", "getWebpackConfig")
  @js.native
  def getWebpackConfig(): js.Object = js.native
  @JSImport("grumbler-scripts", "getWebpackConfig")
  @js.native
  def getWebpackConfig(options: WebpackConfigOptions): js.Object = js.native
}
