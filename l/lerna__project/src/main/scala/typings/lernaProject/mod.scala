package typings.lernaProject

import typings.lernaPackage.mod.Package
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lerna/project", "Project")
  @js.native
  open class Project () extends StObject {
    def this(cwd: String) = this()
    
    var config: ProjectConfig = js.native
    
    def getPackageLicensePaths(): js.Array[String] = js.native
    
    def getPackages(): js.Promise[js.Array[Package]] = js.native
    
    def getPackagesSync(): js.Array[Package] = js.native
    
    def isIndependent(): Boolean = js.native
    
    def licensePath: String = js.native
    
    def manifest: Package = js.native
    
    def packageConfigs: js.Array[String] = js.native
    
    def packageParentDirs: js.Array[String] = js.native
    
    var rootConfigLocation: String = js.native
    
    var rootPath: String = js.native
    
    def version: String = js.native
    def version_=(`val`: String): Unit = js.native
  }
  /* static members */
  object Project {
    
    @JSImport("@lerna/project", "Project")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param cwd defaults to process.cwd()
      */
    inline def getPackages(): js.Promise[js.Array[Package]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackages")().asInstanceOf[js.Promise[js.Array[Package]]]
    inline def getPackages(cwd: String): js.Promise[js.Array[Package]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackages")(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Package]]]
    
    /**
      * @param cwd defaults to process.cwd()
      */
    inline def getPackagesSync(): js.Array[Package] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackagesSync")().asInstanceOf[js.Array[Package]]
    inline def getPackagesSync(cwd: String): js.Array[Package] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackagesSync")(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Array[Package]]
  }
  
  @JSImport("@lerna/project", "getPackages")
  @js.native
  val getPackages: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Project.getPackages */ Any = js.native
  
  @JSImport("@lerna/project", "getPackagesSync")
  @js.native
  val getPackagesSync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Project.getPackagesSync */ Any = js.native
  
  trait ProjectConfig extends StObject {
    
    var packages: js.Array[String]
    
    /** if Yarn workspaces are being used */
    var useWorkspaces: Boolean
    
    /**
      * Root Version
      */
    var version: String
  }
  object ProjectConfig {
    
    inline def apply(packages: js.Array[String], useWorkspaces: Boolean, version: String): ProjectConfig = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any], useWorkspaces = useWorkspaces.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectConfig]
    }
    
    extension [Self <: ProjectConfig](x: Self) {
      
      inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
      
      inline def setUseWorkspaces(value: Boolean): Self = StObject.set(x, "useWorkspaces", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
