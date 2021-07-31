package typings.ionicCliFramework

import typings.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@ionic/cli-framework/utils/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/cli-framework/utils/node", "ERROR_BIN_NOT_FOUND")
  @js.native
  val ERROR_BIN_NOT_FOUND: /* "BIN_NOT_FOUND" */ String = js.native
  
  @JSImport("@ionic/cli-framework/utils/node", "ERROR_INVALID_PACKAGE_JSON")
  @js.native
  val ERROR_INVALID_PACKAGE_JSON: /* "INVALID_PACKAGE_JSON" */ String = js.native
  
  @scala.inline
  def compileNodeModulesPaths(filePath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileNodeModulesPaths")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def isValidPackageName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPackageName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def readPackageJsonFile(p: String): js.Promise[PackageJson] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageJsonFile")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PackageJson]]
  
  @scala.inline
  def resolveBin(m: String, bin: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBin")(m.asInstanceOf[js.Any], bin.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def resolveBin(m: String, bin: String, options: ResolveOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBin")(m.asInstanceOf[js.Any], bin.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ResolveOptions extends StObject {
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
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
