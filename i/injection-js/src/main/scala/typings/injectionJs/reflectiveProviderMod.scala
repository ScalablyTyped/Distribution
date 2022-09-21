package typings.injectionJs

import typings.injectionJs.metadataMod.Self
import typings.injectionJs.metadataMod.SkipSelf
import typings.injectionJs.providerMod.Provider
import typings.injectionJs.reflectiveKeyMod.ReflectiveKey
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectiveProviderMod {
  
  @JSImport("injection-js/reflective_provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("injection-js/reflective_provider", "ReflectiveDependency")
  @js.native
  open class ReflectiveDependency protected () extends StObject {
    def this(key: ReflectiveKey, optional: Boolean) = this()
    def this(key: ReflectiveKey, optional: Boolean, visibility: Self) = this()
    def this(key: ReflectiveKey, optional: Boolean, visibility: SkipSelf) = this()
    
    var key: ReflectiveKey = js.native
    
    var optional: Boolean = js.native
    
    var visibility: Self | SkipSelf | Null = js.native
  }
  /* static members */
  object ReflectiveDependency {
    
    @JSImport("injection-js/reflective_provider", "ReflectiveDependency")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromKey(key: ReflectiveKey): ReflectiveDependency = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKey")(key.asInstanceOf[js.Any]).asInstanceOf[ReflectiveDependency]
  }
  
  @JSImport("injection-js/reflective_provider", "ResolvedReflectiveFactory")
  @js.native
  open class ResolvedReflectiveFactory protected () extends StObject {
    def this(
      /**
      * Factory function which can return an instance of an object represented by a key.
      */
    factory: js.Function,
      /**
      * Arguments (dependencies) to the `factory` function.
      */
    dependencies: js.Array[ReflectiveDependency]
    ) = this()
    
    /**
      * Arguments (dependencies) to the `factory` function.
      */
    var dependencies: js.Array[ReflectiveDependency] = js.native
    
    /**
      * Factory function which can return an instance of an object represented by a key.
      */
    var factory: js.Function = js.native
  }
  
  @JSImport("injection-js/reflective_provider", "ResolvedReflectiveProvider_")
  @js.native
  open class ResolvedReflectiveProvider_ protected ()
    extends StObject
       with ResolvedReflectiveProvider {
    def this(key: ReflectiveKey, resolvedFactories: js.Array[ResolvedReflectiveFactory], multiProvider: Boolean) = this()
    
    /**
      * A key, usually a `Type<any>`.
      */
    /* CompleteClass */
    var key: ReflectiveKey = js.native
    
    /**
      * Indicates if the provider is a multi-provider or a regular provider.
      */
    /* CompleteClass */
    var multiProvider: Boolean = js.native
    
    /**
      * Factory function which can return an instance of an object represented by a key.
      */
    /* CompleteClass */
    var resolvedFactories: js.Array[ResolvedReflectiveFactory] = js.native
    
    def resolvedFactory: ResolvedReflectiveFactory = js.native
  }
  
  inline def constructDependencies(typeOrFunc: Any): js.Array[ReflectiveDependency] = ^.asInstanceOf[js.Dynamic].applyDynamic("constructDependencies")(typeOrFunc.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReflectiveDependency]]
  inline def constructDependencies(typeOrFunc: Any, dependencies: js.Array[Any]): js.Array[ReflectiveDependency] = (^.asInstanceOf[js.Dynamic].applyDynamic("constructDependencies")(typeOrFunc.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReflectiveDependency]]
  
  inline def mergeResolvedReflectiveProviders(
    providers: js.Array[ResolvedReflectiveProvider],
    normalizedProvidersMap: Map[Double, ResolvedReflectiveProvider]
  ): Map[Double, ResolvedReflectiveProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeResolvedReflectiveProviders")(providers.asInstanceOf[js.Any], normalizedProvidersMap.asInstanceOf[js.Any])).asInstanceOf[Map[Double, ResolvedReflectiveProvider]]
  
  inline def resolveReflectiveProviders(providers: js.Array[Provider]): js.Array[ResolvedReflectiveProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveReflectiveProviders")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Array[ResolvedReflectiveProvider]]
  
  trait ResolvedReflectiveProvider extends StObject {
    
    /**
      * A key, usually a `Type<any>`.
      */
    var key: ReflectiveKey
    
    /**
      * Indicates if the provider is a multi-provider or a regular provider.
      */
    var multiProvider: Boolean
    
    /**
      * Factory function which can return an instance of an object represented by a key.
      */
    var resolvedFactories: js.Array[ResolvedReflectiveFactory]
  }
  object ResolvedReflectiveProvider {
    
    inline def apply(key: ReflectiveKey, multiProvider: Boolean, resolvedFactories: js.Array[ResolvedReflectiveFactory]): ResolvedReflectiveProvider = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], multiProvider = multiProvider.asInstanceOf[js.Any], resolvedFactories = resolvedFactories.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedReflectiveProvider]
    }
    
    extension [Self <: ResolvedReflectiveProvider](x: Self) {
      
      inline def setKey(value: ReflectiveKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMultiProvider(value: Boolean): Self = StObject.set(x, "multiProvider", value.asInstanceOf[js.Any])
      
      inline def setResolvedFactories(value: js.Array[ResolvedReflectiveFactory]): Self = StObject.set(x, "resolvedFactories", value.asInstanceOf[js.Any])
      
      inline def setResolvedFactoriesVarargs(value: ResolvedReflectiveFactory*): Self = StObject.set(x, "resolvedFactories", js.Array(value*))
    }
  }
}
