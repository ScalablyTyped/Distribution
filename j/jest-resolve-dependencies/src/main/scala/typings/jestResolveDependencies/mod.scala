package typings.jestResolveDependencies

import typings.jestHasteMap.mod.IHasteFS
import typings.jestResolve.mod.ResolveModuleConfig
import typings.jestResolve.mod.default
import typings.jestSnapshot.mod.SnapshotResolver
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-resolve-dependencies", "DependencyResolver")
  @js.native
  open class DependencyResolver protected () extends StObject {
    def this(resolver: default, hasteFS: IHasteFS, snapshotResolver: SnapshotResolver) = this()
    
    /* private */ var _hasteFS: Any = js.native
    
    /* private */ var _resolver: Any = js.native
    
    /* private */ var _snapshotResolver: Any = js.native
    
    def resolve(file: String): js.Array[String] = js.native
    def resolve(file: String, options: ResolveModuleConfig): js.Array[String] = js.native
    
    def resolveInverse(paths: Set[String], filter: js.Function1[/* file */ String, Boolean]): js.Array[String] = js.native
    def resolveInverse(paths: Set[String], filter: js.Function1[/* file */ String, Boolean], options: ResolveModuleConfig): js.Array[String] = js.native
    
    def resolveInverseModuleMap(paths: Set[String], filter: js.Function1[/* file */ String, Boolean]): js.Array[ResolvedModule] = js.native
    def resolveInverseModuleMap(paths: Set[String], filter: js.Function1[/* file */ String, Boolean], options: ResolveModuleConfig): js.Array[ResolvedModule] = js.native
  }
  
  trait ResolvedModule extends StObject {
    
    var dependencies: js.Array[String]
    
    var file: String
  }
  object ResolvedModule {
    
    inline def apply(dependencies: js.Array[String], file: String): ResolvedModule = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedModule]
    }
    
    extension [Self <: ResolvedModule](x: Self) {
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
