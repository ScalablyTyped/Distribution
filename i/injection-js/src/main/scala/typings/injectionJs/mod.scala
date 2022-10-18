package typings.injectionJs

import org.scalablytyped.runtime.StringDictionary
import typings.injectionJs.forwardRefMod.ForwardRefFn
import typings.injectionJs.metadataMod.HostDecorator
import typings.injectionJs.metadataMod.InjectDecorator
import typings.injectionJs.metadataMod.InjectableDecorator
import typings.injectionJs.metadataMod.OptionalDecorator
import typings.injectionJs.metadataMod.SelfDecorator
import typings.injectionJs.metadataMod.SkipSelfDecorator
import typings.injectionJs.providerMod.Provider
import typings.injectionJs.reflectiveProviderMod.ReflectiveDependency
import typings.injectionJs.reflectiveProviderMod.ResolvedReflectiveProvider
import typings.injectionJs.utilDecoratorsMod.ClassDefinition
import typings.injectionJs.utilResolveDependenciesMod.Constructor
import typings.std.FunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("injection-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Class(clsDef: ClassDefinition): typings.injectionJs.facadeTypeMod.Type[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Class")(clsDef.asInstanceOf[js.Any]).asInstanceOf[typings.injectionJs.facadeTypeMod.Type[Any]]
  
  @JSImport("injection-js", "Host")
  @js.native
  val Host: HostDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js", "Host")
  @js.native
  open class HostCls ()
    extends StObject
       with typings.injectionJs.metadataMod.Host
  
  @JSImport("injection-js", "Inject")
  @js.native
  val Inject: InjectDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js", "Inject")
  @js.native
  open class InjectCls protected ()
    extends StObject
       with typings.injectionJs.metadataMod.Inject {
    def this(token: Any) = this()
    
    /* CompleteClass */
    var token: Any = js.native
  }
  
  @JSImport("injection-js", "Injectable")
  @js.native
  val Injectable: InjectableDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js", "Injectable")
  @js.native
  open class InjectableCls ()
    extends StObject
       with typings.injectionJs.metadataMod.Injectable
  
  @JSImport("injection-js", "InjectionToken")
  @js.native
  open class InjectionToken[T] protected ()
    extends typings.injectionJs.injectionTokenMod.InjectionToken[T] {
    def this(desc: String) = this()
  }
  
  /* note: abstract class */ @JSImport("injection-js", "Injector")
  @js.native
  open class Injector ()
    extends typings.injectionJs.injectorMod.Injector
  /* static members */
  object Injector {
    
    @JSImport("injection-js", "Injector")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("injection-js", "Injector.NULL")
    @js.native
    def NULL: typings.injectionJs.injectorMod.Injector = js.native
    inline def NULL_=(x: typings.injectionJs.injectorMod.Injector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    @JSImport("injection-js", "Injector.THROW_IF_NOT_FOUND")
    @js.native
    def THROW_IF_NOT_FOUND: js.Object = js.native
    inline def THROW_IF_NOT_FOUND_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THROW_IF_NOT_FOUND")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("injection-js", "OpaqueToken")
  @js.native
  open class OpaqueToken protected ()
    extends typings.injectionJs.injectionTokenMod.OpaqueToken {
    def this(_desc: String) = this()
  }
  
  @JSImport("injection-js", "Optional")
  @js.native
  val Optional: OptionalDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js", "Optional")
  @js.native
  open class OptionalCls ()
    extends StObject
       with typings.injectionJs.metadataMod.Optional
  
  /* note: abstract class */ @JSImport("injection-js", "ReflectiveInjector")
  @js.native
  open class ReflectiveInjector ()
    extends typings.injectionJs.reflectiveInjectorMod.ReflectiveInjector
  /* static members */
  object ReflectiveInjector {
    
    @JSImport("injection-js", "ReflectiveInjector")
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
    inline def fromResolvedProviders(providers: js.Array[ResolvedReflectiveProvider]): typings.injectionJs.reflectiveInjectorMod.ReflectiveInjector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromResolvedProviders")(providers.asInstanceOf[js.Any]).asInstanceOf[typings.injectionJs.reflectiveInjectorMod.ReflectiveInjector]
    inline def fromResolvedProviders(providers: js.Array[ResolvedReflectiveProvider], parent: typings.injectionJs.injectorMod.Injector): typings.injectionJs.reflectiveInjectorMod.ReflectiveInjector = (^.asInstanceOf[js.Dynamic].applyDynamic("fromResolvedProviders")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.injectionJs.reflectiveInjectorMod.ReflectiveInjector]
    
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
    inline def resolveAndCreate(providers: js.Array[Provider]): typings.injectionJs.reflectiveInjectorMod.ReflectiveInjector = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAndCreate")(providers.asInstanceOf[js.Any]).asInstanceOf[typings.injectionJs.reflectiveInjectorMod.ReflectiveInjector]
    inline def resolveAndCreate(providers: js.Array[Provider], parent: typings.injectionJs.injectorMod.Injector): typings.injectionJs.reflectiveInjectorMod.ReflectiveInjector = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAndCreate")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.injectionJs.reflectiveInjectorMod.ReflectiveInjector]
  }
  
  @JSImport("injection-js", "ReflectiveKey")
  @js.native
  open class ReflectiveKey protected ()
    extends typings.injectionJs.reflectiveKeyMod.ReflectiveKey {
    /**
      * Private
      */
    def this(token: js.Object, id: Double) = this()
  }
  /* static members */
  object ReflectiveKey {
    
    @JSImport("injection-js", "ReflectiveKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieves a `Key` for a token.
      */
    inline def get(token: js.Object): typings.injectionJs.reflectiveKeyMod.ReflectiveKey = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any]).asInstanceOf[typings.injectionJs.reflectiveKeyMod.ReflectiveKey]
  }
  
  @JSImport("injection-js", "ResolvedReflectiveFactory")
  @js.native
  open class ResolvedReflectiveFactory protected ()
    extends typings.injectionJs.reflectiveProviderMod.ResolvedReflectiveFactory {
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
  }
  
  @JSImport("injection-js", "Self")
  @js.native
  val Self: SelfDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js", "Self")
  @js.native
  open class SelfCls ()
    extends StObject
       with typings.injectionJs.metadataMod.Self
  
  @JSImport("injection-js", "SkipSelf")
  @js.native
  val SkipSelf: SkipSelfDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js", "SkipSelf")
  @js.native
  open class SkipSelfCls ()
    extends StObject
       with typings.injectionJs.metadataMod.SkipSelf
  
  @JSImport("injection-js", "Type")
  @js.native
  val Type: FunctionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js", "Type")
  @js.native
  open class TypeCls protected ()
    extends js.Function {
    /**
      * Creates a new function.
      * @param args A list of arguments the function accepts.
      */
    /* standard es5 */
    def this(args: String*) = this()
  }
  
  inline def forwardRef(forwardRefFn: ForwardRefFn): typings.injectionJs.facadeTypeMod.Type[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(forwardRefFn.asInstanceOf[js.Any]).asInstanceOf[typings.injectionJs.facadeTypeMod.Type[Any]]
  
  inline def isType(v: Any): /* is injection-js.injection-js/facade/type.Type<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isType")(v.asInstanceOf[js.Any]).asInstanceOf[/* is injection-js.injection-js/facade/type.Type<any> */ Boolean]
  
  inline def makeDecorator(name: String, props: StringDictionary[Any]): js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]]]
  inline def makeDecorator(name: String, props: StringDictionary[Any], parentClass: Any): js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]]]
  inline def makeDecorator(
    name: String,
    props: StringDictionary[Any],
    parentClass: Any,
    chainFn: js.Function1[/* fn */ js.Function, Unit]
  ): js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], chainFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]]]
  inline def makeDecorator(
    name: String,
    props: StringDictionary[Any],
    parentClass: Unit,
    chainFn: js.Function1[/* fn */ js.Function, Unit]
  ): js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], chainFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]]]
  
  inline def makeParamDecorator(name: String, props: js.Array[(js.Tuple2[String, Any]) | StringDictionary[Any]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeParamDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeParamDecorator(name: String, props: js.Array[(js.Tuple2[String, Any]) | StringDictionary[Any]], parentClass: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeParamDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makePropDecorator(name: String, props: js.Array[(js.Tuple2[String, Any]) | StringDictionary[Any]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makePropDecorator(name: String, props: js.Array[(js.Tuple2[String, Any]) | StringDictionary[Any]], parentClass: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def resolveDependencies(inputs: Constructor*): js.Array[Constructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDependencies")(inputs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Constructor]]
  
  inline def resolveForwardRef(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveForwardRef")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
