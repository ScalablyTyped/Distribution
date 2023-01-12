package typings.injectionJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  trait Host extends StObject
  @JSImport("injection-js/metadata", "Host")
  @js.native
  val Host: HostDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js/metadata", "Host")
  @js.native
  open class HostCls ()
    extends StObject
       with typings.injectionJs.metadataMod.Host
  
  trait Inject extends StObject {
    
    var token: Any
  }
  object Inject {
    
    @JSImport("injection-js/metadata", "Inject")
    @js.native
    val ^ : InjectDecorator = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inject] (val x: Self) extends AnyVal {
      
      inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js/metadata", "Inject")
  @js.native
  open class InjectCls protected ()
    extends StObject
       with Inject {
    def this(token: Any) = this()
    
    /* CompleteClass */
    var token: Any = js.native
  }
  
  trait Injectable extends StObject
  @JSImport("injection-js/metadata", "Injectable")
  @js.native
  val Injectable: InjectableDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js/metadata", "Injectable")
  @js.native
  open class InjectableCls ()
    extends StObject
       with typings.injectionJs.metadataMod.Injectable
  
  trait Optional extends StObject
  @JSImport("injection-js/metadata", "Optional")
  @js.native
  val Optional: OptionalDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js/metadata", "Optional")
  @js.native
  open class OptionalCls ()
    extends StObject
       with typings.injectionJs.metadataMod.Optional
  
  trait Self extends StObject
  @JSImport("injection-js/metadata", "Self")
  @js.native
  val Self: SelfDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js/metadata", "Self")
  @js.native
  open class SelfCls ()
    extends StObject
       with typings.injectionJs.metadataMod.Self
  
  trait SkipSelf extends StObject
  @JSImport("injection-js/metadata", "SkipSelf")
  @js.native
  val SkipSelf: SkipSelfDecorator = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js/metadata", "SkipSelf")
  @js.native
  open class SkipSelfCls ()
    extends StObject
       with typings.injectionJs.metadataMod.SkipSelf
  
  @js.native
  trait HostDecorator
    extends StObject
       with Instantiable0[typings.injectionJs.metadataMod.Host] {
    
    /**
      * @whatItDoes Specifies that an injector should retrieve a dependency from any injector until
      * reaching the host element of the current component.
      * @howToUse
      * ```
      * @Injectable()
      * class Car {
      *   constructor(@Host() public engine:Engine) {}
      * }
      * ```
      *
      * @description
      * For more details, see the {@linkDocs guide/dependency-injection "Dependency Injection Guide"}.
      *
      * ### Example
      *
      * {@example core/di/ts/metadata_spec.ts region='Host'}
      *
      * @stable
      */
    def apply(): Any = js.native
  }
  
  @js.native
  trait InjectDecorator
    extends StObject
       with Instantiable1[/* token */ Any, Inject] {
    
    /**
      * @whatItDoes A parameter decorator that specifies a dependency.
      * @howToUse
      * ```
      * @Injectable()
      * class Car {
      *   constructor(@Inject("MyEngine") public engine:Engine) {}
      * }
      * ```
      *
      * @description
      * For more details, see the {@linkDocs guide/dependency-injection "Dependency Injection Guide"}.
      *
      * ### Example
      *
      * {@example core/di/ts/metadata_spec.ts region='Inject'}
      *
      * When `@Inject()` is not present, {@link Injector} will use the type annotation of the
      * parameter.
      *
      * ### Example
      *
      * {@example core/di/ts/metadata_spec.ts region='InjectWithoutDecorator'}
      *
      * @stable
      */
    def apply(token: Any): Any = js.native
  }
  
  @js.native
  trait InjectableDecorator
    extends StObject
       with Instantiable0[typings.injectionJs.metadataMod.Injectable] {
    
    /**
      * @whatItDoes A marker metadata that marks a class as available to {@link Injector} for creation.
      * @howToUse
      * ```
      * @Injectable()
      * class Car {}
      * ```
      *
      * @description
      * For more details, see the {@linkDocs guide/dependency-injection "Dependency Injection Guide"}.
      *
      * ### Example
      *
      * {@example core/di/ts/metadata_spec.ts region='Injectable'}
      *
      * {@link Injector} will throw {@link NoAnnotationError} when trying to instantiate a class that
      * does not have `@Injectable` marker, as shown in the example below.
      *
      * {@example core/di/ts/metadata_spec.ts region='InjectableThrows'}
      *
      * @stable
      */
    def apply(): Any = js.native
  }
  
  @js.native
  trait OptionalDecorator
    extends StObject
       with Instantiable0[typings.injectionJs.metadataMod.Optional] {
    
    /**
      * @whatItDoes A parameter metadata that marks a dependency as optional.
      * {@link Injector} provides `null` if the dependency is not found.
      * @howToUse
      * ```
      * @Injectable()
      * class Car {
      *   constructor(@Optional() public engine:Engine) {}
      * }
      * ```
      *
      * @description
      * For more details, see the {@linkDocs guide/dependency-injection "Dependency Injection Guide"}.
      *
      * ### Example
      *
      * {@example core/di/ts/metadata_spec.ts region='Optional'}
      *
      * @stable
      */
    def apply(): Any = js.native
  }
  
  @js.native
  trait SelfDecorator
    extends StObject
       with Instantiable0[typings.injectionJs.metadataMod.Self] {
    
    /**
      * @whatItDoes Specifies that an {@link Injector} should retrieve a dependency only from itself.
      * @howToUse
      * ```
      * @Injectable()
      * class Car {
      *   constructor(@Self() public engine:Engine) {}
      * }
      * ```
      *
      * @description
      * For more details, see the {@linkDocs guide/dependency-injection "Dependency Injection Guide"}.
      *
      * ### Example
      *
      * {@example core/di/ts/metadata_spec.ts region='Self'}
      *
      * @stable
      */
    def apply(): Any = js.native
  }
  
  @js.native
  trait SkipSelfDecorator
    extends StObject
       with Instantiable0[typings.injectionJs.metadataMod.SkipSelf] {
    
    /**
      * @whatItDoes Specifies that the dependency resolution should start from the parent injector.
      * @howToUse
      * ```
      * @Injectable()
      * class Car {
      *   constructor(@SkipSelf() public engine:Engine) {}
      * }
      * ```
      *
      * @description
      * For more details, see the {@linkDocs guide/dependency-injection "Dependency Injection Guide"}.
      *
      * ### Example
      *
      * {@example core/di/ts/metadata_spec.ts region='SkipSelf'}
      *
      * @stable
      */
    def apply(): Any = js.native
  }
}
