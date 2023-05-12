package typings.importMetaResolve

import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPackageConfigMod {
  
  @JSImport("import-meta-resolve/lib/package-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPackageConfig(path: String, specifier: String): PackageConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageConfig")(path.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any])).asInstanceOf[PackageConfig]
  inline def getPackageConfig(path: String, specifier: String, base: URL): PackageConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageConfig")(path.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[PackageConfig]
  inline def getPackageConfig(path: String, specifier: URL): PackageConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageConfig")(path.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any])).asInstanceOf[PackageConfig]
  inline def getPackageConfig(path: String, specifier: URL, base: URL): PackageConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageConfig")(path.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[PackageConfig]
  
  inline def getPackageScopeConfig(resolved: URL): PackageConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageScopeConfig")(resolved.asInstanceOf[js.Any]).asInstanceOf[PackageConfig]
  
  type ErrnoException = typings.importMetaResolve.libErrorsMod.ErrnoException
  
  trait PackageConfig extends StObject {
    
    var exists: Boolean
    
    var exports: js.UndefOr[Record[String, Any]] = js.undefined
    
    var imports: js.UndefOr[Record[String, Any]] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var pjsonPath: String
    
    var `type`: PackageType
  }
  object PackageConfig {
    
    inline def apply(exists: Boolean, pjsonPath: String, `type`: PackageType): PackageConfig = {
      val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], pjsonPath = pjsonPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageConfig] (val x: Self) extends AnyVal {
      
      inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExports(value: Record[String, Any]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
      
      inline def setImports(value: Record[String, Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPjsonPath(value: String): Self = StObject.set(x, "pjsonPath", value.asInstanceOf[js.Any])
      
      inline def setType(value: PackageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.importMetaResolve.importMetaResolveStrings.commonjs
    - typings.importMetaResolve.importMetaResolveStrings.module
    - typings.importMetaResolve.importMetaResolveStrings.none
  */
  trait PackageType extends StObject
  object PackageType {
    
    inline def commonjs: typings.importMetaResolve.importMetaResolveStrings.commonjs = "commonjs".asInstanceOf[typings.importMetaResolve.importMetaResolveStrings.commonjs]
    
    inline def module: typings.importMetaResolve.importMetaResolveStrings.module = "module".asInstanceOf[typings.importMetaResolve.importMetaResolveStrings.module]
    
    inline def none: typings.importMetaResolve.importMetaResolveStrings.none = "none".asInstanceOf[typings.importMetaResolve.importMetaResolveStrings.none]
  }
}
