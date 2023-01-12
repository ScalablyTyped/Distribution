package typings.lernaPackage

import org.scalablytyped.runtime.StringDictionary
import typings.lernaPackage.anon.Packages
import typings.lernaPackage.lernaPackageStrings.`private`
import typings.lernaPackage.lernaPackageStrings.bin
import typings.lernaPackage.lernaPackageStrings.dependencies
import typings.lernaPackage.lernaPackageStrings.devDependencies
import typings.lernaPackage.lernaPackageStrings.name
import typings.lernaPackage.lernaPackageStrings.optionalDependencies
import typings.lernaPackage.lernaPackageStrings.peerDependencies
import typings.lernaPackage.lernaPackageStrings.publishConfig
import typings.lernaPackage.lernaPackageStrings.scripts
import typings.lernaPackage.lernaPackageStrings.version
import typings.lernaPackage.lernaPackageStrings.workspaces
import typings.npmPackageArg.mod.Result
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lerna/package", "Package")
  @js.native
  open class Package protected () extends StObject {
    def this(pkg: RawManifest, location: String) = this()
    def this(pkg: RawManifest, location: String, rootPath: String) = this()
    
    def __isLernaPackage: Boolean = js.native
    
    def bin: js.UndefOr[Record[String, String]] = js.native
    
    def binLocation: String = js.native
    
    def contents: String = js.native
    def contents_=(subDirectory: String): Unit = js.native
    
    def dependencies: js.UndefOr[Record[String, String]] = js.native
    
    def devDependencies: js.UndefOr[Record[String, String]] = js.native
    
    def get(key: String): /* import warning: importer.ImportType#apply Failed type conversion: @lerna/package.@lerna/package.RawManifest[string] */ js.Any = js.native
    @JSName("get")
    def get_bin(key: bin): js.UndefOr[(Record[String, String]) | String] = js.native
    @JSName("get")
    def get_dependencies(key: dependencies): js.UndefOr[Record[String, String]] = js.native
    @JSName("get")
    def get_devDependencies(key: devDependencies): js.UndefOr[Record[String, String]] = js.native
    @JSName("get")
    def get_name(key: name): String = js.native
    @JSName("get")
    def get_optionalDependencies(key: optionalDependencies): js.UndefOr[Record[String, String]] = js.native
    @JSName("get")
    def get_peerDependencies(key: peerDependencies): js.UndefOr[Record[String, String]] = js.native
    @JSName("get")
    def get_private(key: `private`): js.UndefOr[Boolean] = js.native
    @JSName("get")
    def get_publishConfig(key: publishConfig): js.UndefOr[Record[String, String]] = js.native
    @JSName("get")
    def get_scripts(key: scripts): js.UndefOr[Record[String, String]] = js.native
    @JSName("get")
    def get_version(key: version): String = js.native
    @JSName("get")
    def get_workspaces(key: workspaces): js.UndefOr[js.Array[String] | Packages] = js.native
    
    def location: String = js.native
    
    def manifestLocation: String = js.native
    
    var name: String = js.native
    
    def nodeModuleLocation: String = js.native
    
    def optionalDependencies: js.UndefOr[Record[String, String]] = js.native
    
    def peerDependencies: js.UndefOr[Record[String, String]] = js.native
    
    def `private`: Boolean = js.native
    
    /**
      * Refresh internal state from disk (e.g., changed by external lifecycles)
      */
    def refresh(): js.Promise[this.type] = js.native
    
    def resolved: Result = js.native
    
    def rootPath: String = js.native
    
    def scripts: js.UndefOr[Record[String, String]] = js.native
    
    /**
      * Write manifest changes to disk
      */
    def serialize(): js.Promise[this.type] = js.native
    
    def set(
      key: String,
      `val`: /* import warning: importer.ImportType#apply Failed type conversion: @lerna/package.@lerna/package.RawManifest[string] */ js.Any
    ): this.type = js.native
    @JSName("set")
    def set_bin(key: bin): this.type = js.native
    @JSName("set")
    def set_bin(key: bin, `val`: String): this.type = js.native
    @JSName("set")
    def set_bin(key: bin, `val`: Record[String, String]): this.type = js.native
    @JSName("set")
    def set_dependencies(key: dependencies): this.type = js.native
    @JSName("set")
    def set_dependencies(key: dependencies, `val`: Record[String, String]): this.type = js.native
    @JSName("set")
    def set_devDependencies(key: devDependencies): this.type = js.native
    @JSName("set")
    def set_devDependencies(key: devDependencies, `val`: Record[String, String]): this.type = js.native
    @JSName("set")
    def set_name(key: name, `val`: String): this.type = js.native
    @JSName("set")
    def set_optionalDependencies(key: optionalDependencies): this.type = js.native
    @JSName("set")
    def set_optionalDependencies(key: optionalDependencies, `val`: Record[String, String]): this.type = js.native
    @JSName("set")
    def set_peerDependencies(key: peerDependencies): this.type = js.native
    @JSName("set")
    def set_peerDependencies(key: peerDependencies, `val`: Record[String, String]): this.type = js.native
    @JSName("set")
    def set_private(key: `private`): this.type = js.native
    @JSName("set")
    def set_private(key: `private`, `val`: Boolean): this.type = js.native
    @JSName("set")
    def set_publishConfig(key: publishConfig): this.type = js.native
    @JSName("set")
    def set_publishConfig(key: publishConfig, `val`: Record[String, String]): this.type = js.native
    @JSName("set")
    def set_scripts(key: scripts): this.type = js.native
    @JSName("set")
    def set_scripts(key: scripts, `val`: Record[String, String]): this.type = js.native
    @JSName("set")
    def set_version(key: version, `val`: String): this.type = js.native
    @JSName("set")
    def set_workspaces(key: workspaces): this.type = js.native
    @JSName("set")
    def set_workspaces(key: workspaces, `val`: js.Array[String]): this.type = js.native
    @JSName("set")
    def set_workspaces(key: workspaces, `val`: Packages): this.type = js.native
    
    /**
      * Provide shallow copy for munging elsewhere
      */
    def toJSON(): RawManifest = js.native
    
    /**
      * Mutate local dependency spec according to type
      */
    def updateLocalDependency(resolved: Result, depVersion: String, savePrefix: String): Unit = js.native
    
    def version: String = js.native
    def version_=(v: String): Unit = js.native
  }
  /* static members */
  object Package {
    
    @JSImport("@lerna/package", "Package")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a Package instance from parameters, possibly reusing existing instance.
      * @param ref A path to a package.json file, Package instance, or JSON object
      * @param [dir] If `ref` is a JSON object, this is the location of the manifest
      */
    inline def `lazy`(ref: String): Package = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(ref.asInstanceOf[js.Any]).asInstanceOf[Package]
    inline def `lazy`(ref: String, dir: String): Package = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(ref.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Package]
    inline def `lazy`(ref: Package): Package = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(ref.asInstanceOf[js.Any]).asInstanceOf[Package]
    inline def `lazy`(ref: Package, dir: String): Package = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(ref.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Package]
    inline def `lazy`(ref: RawManifest): Package = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(ref.asInstanceOf[js.Any]).asInstanceOf[Package]
    inline def `lazy`(ref: RawManifest, dir: String): Package = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(ref.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Package]
  }
  
  trait RawManifest
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var bin: js.UndefOr[(Record[String, String]) | String] = js.undefined
    
    var dependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: String
    
    var optionalDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var peerDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    var publishConfig: js.UndefOr[Record[String, String]] = js.undefined
    
    var scripts: js.UndefOr[Record[String, String]] = js.undefined
    
    var version: String
    
    var workspaces: js.UndefOr[js.Array[String] | Packages] = js.undefined
  }
  object RawManifest {
    
    inline def apply(name: String, version: String): RawManifest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawManifest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawManifest] (val x: Self) extends AnyVal {
      
      inline def setBin(value: (Record[String, String]) | String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDevDependencies(value: Record[String, String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependencies(value: Record[String, String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setPeerDependencies(value: Record[String, String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setPublishConfig(value: Record[String, String]): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
      inline def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
      
      inline def setScripts(value: Record[String, String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWorkspaces(value: js.Array[String] | Packages): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      
      inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
      
      inline def setWorkspacesVarargs(value: String*): Self = StObject.set(x, "workspaces", js.Array(value*))
    }
  }
}
