package typings.injectionJs

import typings.injectionJs.injectorMod.Injector
import typings.injectionJs.providerMod.Provider
import typings.injectionJs.reflectiveProviderMod.ResolvedReflectiveProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectiveInjectorMod {
  
  @JSImport("injection-js/reflective_injector", "ReflectiveInjector")
  @js.native
  abstract class ReflectiveInjector () extends Injector {
    
    /**
      * Creates a child injector from previously resolved providers.
      *
      * <!-- TODO: Add a link to the section of the user guide talking about hierarchical injection.
      * -->
      *
      * This API is the recommended way to construct injectors in performance-sensitive parts.
      *
      * ### Example ([live demo](http://plnkr.co/edit/VhyfjN?p=preview))
      *
      * ```typescript
      * class ParentProvider {}
      * class ChildProvider {}
      *
      * var parentProviders = ReflectiveInjector.resolve([ParentProvider]);
      * var childProviders = ReflectiveInjector.resolve([ChildProvider]);
      *
      * var parent = ReflectiveInjector.fromResolvedProviders(parentProviders);
      * var child = parent.createChildFromResolved(childProviders);
      *
      * expect(child.get(ParentProvider) instanceof ParentProvider).toBe(true);
      * expect(child.get(ChildProvider) instanceof ChildProvider).toBe(true);
      * expect(child.get(ParentProvider)).toBe(parent.get(ParentProvider));
      * ```
      */
    def createChildFromResolved(providers: js.Array[ResolvedReflectiveProvider]): ReflectiveInjector = js.native
    
    /**
      * Instantiates an object using a resolved provider in the context of the injector.
      *
      * The created object does not get cached by the injector.
      *
      * ### Example ([live demo](http://plnkr.co/edit/ptCImQ?p=preview))
      *
      * ```typescript
      * @Injectable()
      * class Engine {
      * }
      *
      * @Injectable()
      * class Car {
      *   constructor(public engine:Engine) {}
      * }
      *
      * var injector = ReflectiveInjector.resolveAndCreate([Engine]);
      * var carProvider = ReflectiveInjector.resolve([Car])[0];
      * var car = injector.instantiateResolved(carProvider);
      * expect(car.engine).toBe(injector.get(Engine));
      * expect(car).not.toBe(injector.instantiateResolved(carProvider));
      * ```
      */
    def instantiateResolved(provider: ResolvedReflectiveProvider): Any = js.native
    
    /**
      * Parent of this injector.
      *
      * <!-- TODO: Add a link to the section of the user guide talking about hierarchical injection.
      * -->
      *
      * ### Example ([live demo](http://plnkr.co/edit/eosMGo?p=preview))
      *
      * ```typescript
      * var parent = ReflectiveInjector.resolveAndCreate([]);
      * var child = parent.resolveAndCreateChild([]);
      * expect(child.parent).toBe(parent);
      * ```
      */
    def parent: Injector | Null = js.native
    
    /**
      * Resolves an array of providers and creates a child injector from those providers.
      *
      * <!-- TODO: Add a link to the section of the user guide talking about hierarchical injection.
      * -->
      *
      * The passed-in providers can be an array of `Type`, {@link Provider},
      * or a recursive array of more providers.
      *
      * ### Example ([live demo](http://plnkr.co/edit/opB3T4?p=preview))
      *
      * ```typescript
      * class ParentProvider {}
      * class ChildProvider {}
      *
      * var parent = ReflectiveInjector.resolveAndCreate([ParentProvider]);
      * var child = parent.resolveAndCreateChild([ChildProvider]);
      *
      * expect(child.get(ParentProvider) instanceof ParentProvider).toBe(true);
      * expect(child.get(ChildProvider) instanceof ChildProvider).toBe(true);
      * expect(child.get(ParentProvider)).toBe(parent.get(ParentProvider));
      * ```
      *
      * This function is slower than the corresponding `createChildFromResolved`
      * because it needs to resolve the passed-in providers first.
      * See {@link Injector#resolve} and {@link Injector#createChildFromResolved}.
      */
    def resolveAndCreateChild(providers: js.Array[Provider]): ReflectiveInjector = js.native
    
    /**
      * Resolves a provider and instantiates an object in the context of the injector.
      *
      * The created object does not get cached by the injector.
      *
      * ### Example ([live demo](http://plnkr.co/edit/yvVXoB?p=preview))
      *
      * ```typescript
      * @Injectable()
      * class Engine {
      * }
      *
      * @Injectable()
      * class Car {
      *   constructor(public engine:Engine) {}
      * }
      *
      * var injector = ReflectiveInjector.resolveAndCreate([Engine]);
      *
      * var car = injector.resolveAndInstantiate(Car);
      * expect(car.engine).toBe(injector.get(Engine));
      * expect(car).not.toBe(injector.resolveAndInstantiate(Car));
      * ```
      */
    def resolveAndInstantiate(provider: Provider): Any = js.native
  }
  /* static members */
  object ReflectiveInjector {
    
    @JSImport("injection-js/reflective_injector", "ReflectiveInjector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an injector from previously resolved providers.
      *
      * This API is the recommended way to construct injectors in performance-sensitive parts.
      *
      * ### Example ([live demo](http://plnkr.co/edit/KrSMci?p=preview))
      *
      * ```typescript
      * @Injectable()
      * class Engine {
      * }
      *
      * @Injectable()
      * class Car {
      *   constructor(public engine:Engine) {}
      * }
      *
      * var providers = ReflectiveInjector.resolve([Car, Engine]);
      * var injector = ReflectiveInjector.fromResolvedProviders(providers);
      * expect(injector.get(Car) instanceof Car).toBe(true);
      * ```
      * @experimental
      */
    inline def fromResolvedProviders(providers: js.Array[ResolvedReflectiveProvider]): ReflectiveInjector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromResolvedProviders")(providers.asInstanceOf[js.Any]).asInstanceOf[ReflectiveInjector]
    inline def fromResolvedProviders(providers: js.Array[ResolvedReflectiveProvider], parent: Injector): ReflectiveInjector = (^.asInstanceOf[js.Dynamic].applyDynamic("fromResolvedProviders")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[ReflectiveInjector]
    
    /**
      * Turns an array of provider definitions into an array of resolved providers.
      *
      * A resolution is a process of flattening multiple nested arrays and converting individual
      * providers into an array of {@link ResolvedReflectiveProvider}s.
      *
      * ### Example ([live demo](http://plnkr.co/edit/AiXTHi?p=preview))
      *
      * ```typescript
      * @Injectable()
      * class Engine {
      * }
      *
      * @Injectable()
      * class Car {
      *   constructor(public engine:Engine) {}
      * }
      *
      * var providers = ReflectiveInjector.resolve([Car, [[Engine]]]);
      *
      * expect(providers.length).toEqual(2);
      *
      * expect(providers[0] instanceof ResolvedReflectiveProvider).toBe(true);
      * expect(providers[0].key.displayName).toBe("Car");
      * expect(providers[0].dependencies.length).toEqual(1);
      * expect(providers[0].factory).toBeDefined();
      *
      * expect(providers[1].key.displayName).toBe("Engine");
      * });
      * ```
      *
      * See {@link ReflectiveInjector#fromResolvedProviders} for more info.
      */
    inline def resolve(providers: js.Array[Provider]): js.Array[ResolvedReflectiveProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Array[ResolvedReflectiveProvider]]
    
    /**
      * Resolves an array of providers and creates an injector from those providers.
      *
      * The passed-in providers can be an array of `Type`, {@link Provider},
      * or a recursive array of more providers.
      *
      * ### Example ([live demo](http://plnkr.co/edit/ePOccA?p=preview))
      *
      * ```typescript
      * @Injectable()
      * class Engine {
      * }
      *
      * @Injectable()
      * class Car {
      *   constructor(public engine:Engine) {}
      * }
      *
      * var injector = ReflectiveInjector.resolveAndCreate([Car, Engine]);
      * expect(injector.get(Car) instanceof Car).toBe(true);
      * ```
      *
      * This function is slower than the corresponding `fromResolvedProviders`
      * because it needs to resolve the passed-in providers first.
      * See {@link Injector#resolve} and {@link Injector#fromResolvedProviders}.
      */
    inline def resolveAndCreate(providers: js.Array[Provider]): ReflectiveInjector = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAndCreate")(providers.asInstanceOf[js.Any]).asInstanceOf[ReflectiveInjector]
    inline def resolveAndCreate(providers: js.Array[Provider], parent: Injector): ReflectiveInjector = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAndCreate")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[ReflectiveInjector]
  }
  
  @JSImport("injection-js/reflective_injector", "ReflectiveInjector_")
  @js.native
  open class ReflectiveInjector_ protected () extends ReflectiveInjector {
    /**
      * Private
      */
    def this(_providers: js.Array[ResolvedReflectiveProvider]) = this()
    def this(_providers: js.Array[ResolvedReflectiveProvider], _parent: Injector) = this()
    
    /* private */ var _getByKey: Any = js.native
    
    /* private */ var _getByReflectiveDependency: Any = js.native
    
    /* private */ var _getMaxNumberOfObjects: Any = js.native
    
    /* private */ var _getObjByKeyId: Any = js.native
    
    /* private */ var _instantiate: Any = js.native
    
    /* private */ var _instantiateProvider: Any = js.native
    
    def displayName: String = js.native
    
    def getProviderAtIndex(index: Double): ResolvedReflectiveProvider = js.native
    
    var keyIds: js.Array[Double] = js.native
    
    var objs: js.Array[Any] = js.native
  }
}
