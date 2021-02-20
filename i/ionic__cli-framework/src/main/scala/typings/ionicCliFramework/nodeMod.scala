package typings.ionicCliFramework

import typings.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@ionic/cli-framework/utils/node", "ERROR_BIN_NOT_FOUND")
  @js.native
  val ERROR_BIN_NOT_FOUND: /* "BIN_NOT_FOUND" */ String = js.native
  
  @JSImport("@ionic/cli-framework/utils/node", "ERROR_INVALID_PACKAGE_JSON")
  @js.native
  val ERROR_INVALID_PACKAGE_JSON: /* "INVALID_PACKAGE_JSON" */ String = js.native
  
  @JSImport("@ionic/cli-framework/utils/node", "compileNodeModulesPaths")
  @js.native
  def compileNodeModulesPaths(filePath: String): js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework/utils/node", "isValidPackageName")
  @js.native
  def isValidPackageName(name: String): Boolean = js.native
  
  @JSImport("@ionic/cli-framework/utils/node", "readPackageJsonFile")
  @js.native
  def readPackageJsonFile(p: String): js.Promise[PackageJson] = js.native
  
  @JSImport("@ionic/cli-framework/utils/node", "resolveBin")
  @js.native
  def resolveBin(m: String, bin: String): String = js.native
  @JSImport("@ionic/cli-framework/utils/node", "resolveBin")
  @js.native
  def resolveBin(m: String, bin: String, options: ResolveOptions): String = js.native
  
  @js.native
  trait ResolveOptions extends StObject {
    
    var paths: js.UndefOr[js.Array[String]] = js.native
  }
  object ResolveOptions {
    
    @scala.inline
    def apply(): ResolveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveOptions]
    }
    
    @scala.inline
    implicit class ResolveOptionsMutableBuilder[Self <: ResolveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
}
