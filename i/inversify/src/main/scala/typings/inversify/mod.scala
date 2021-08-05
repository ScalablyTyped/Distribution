package typings.inversify

import typings.inversify.injectMod.ServiceIdentifierOrFunc
import typings.inversify.interfacesMod.interfaces.Abstract
import typings.inversify.interfacesMod.interfaces.AsyncContainerModuleCallBack
import typings.inversify.interfacesMod.interfaces.ConstraintFunction
import typings.inversify.interfacesMod.interfaces.ContainerModuleCallBack
import typings.inversify.interfacesMod.interfaces.ContainerOptions
import typings.inversify.interfacesMod.interfaces.Newable
import typings.inversify.interfacesMod.interfaces.Request
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.std.ClassDecorator
import typings.std.MethodDecorator
import typings.std.ParameterDecorator
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inversify", "AsyncContainerModule")
  @js.native
  class AsyncContainerModule protected ()
    extends typings.inversify.containerModuleMod.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @JSImport("inversify", "BindingScopeEnum")
  @js.native
  val BindingScopeEnum: typings.inversify.interfacesMod.interfaces.BindingScopeEnum = js.native
  
  @JSImport("inversify", "BindingTypeEnum")
  @js.native
  val BindingTypeEnum: typings.inversify.interfacesMod.interfaces.BindingTypeEnum = js.native
  
  @JSImport("inversify", "Container")
  @js.native
  class Container ()
    extends typings.inversify.containerMod.Container {
    def this(containerOptions: ContainerOptions) = this()
  }
  object Container {
    
    @JSImport("inversify", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def merge(
      container1: typings.inversify.interfacesMod.interfaces.Container,
      container2: typings.inversify.interfacesMod.interfaces.Container
    ): typings.inversify.interfacesMod.interfaces.Container = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(container1.asInstanceOf[js.Any], container2.asInstanceOf[js.Any])).asInstanceOf[typings.inversify.interfacesMod.interfaces.Container]
  }
  
  @JSImport("inversify", "ContainerModule")
  @js.native
  class ContainerModule protected ()
    extends typings.inversify.containerModuleMod.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
  
  @JSImport("inversify", "LazyServiceIdentifer")
  @js.native
  class LazyServiceIdentifer[T] protected ()
    extends typings.inversify.injectMod.LazyServiceIdentifer[T] {
    def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
  }
  
  object METADATA_KEY {
    
    @JSImport("inversify", "METADATA_KEY.DESIGN_PARAM_TYPES")
    @js.native
    val DESIGN_PARAM_TYPES: /* "design:paramtypes" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.INJECT_TAG")
    @js.native
    val INJECT_TAG: /* "inject" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.MULTI_INJECT_TAG")
    @js.native
    val MULTI_INJECT_TAG: /* "multi_inject" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.NAMED_TAG")
    @js.native
    val NAMED_TAG: /* "named" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.NAME_TAG")
    @js.native
    val NAME_TAG: /* "name" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.OPTIONAL_TAG")
    @js.native
    val OPTIONAL_TAG: /* "optional" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.PARAM_TYPES")
    @js.native
    val PARAM_TYPES: /* "inversify:paramtypes" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.POST_CONSTRUCT")
    @js.native
    val POST_CONSTRUCT: /* "post_construct" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.TAGGED")
    @js.native
    val TAGGED: /* "inversify:tagged" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.TAGGED_PROP")
    @js.native
    val TAGGED_PROP: /* "inversify:tagged_props" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.UNMANAGED_TAG")
    @js.native
    val UNMANAGED_TAG: /* "unmanaged" */ String = js.native
  }
  
  @JSImport("inversify", "MetadataReader")
  @js.native
  class MetadataReader ()
    extends typings.inversify.metadataReaderMod.MetadataReader
  
  @JSImport("inversify", "TargetTypeEnum")
  @js.native
  val TargetTypeEnum: typings.inversify.interfacesMod.interfaces.TargetTypeEnum = js.native
  
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: ClassDecorator, target: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getServiceIdentifierAsString(serviceIdentifier: ServiceIdentifier[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceIdentifierAsString")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def id(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Double]
  
  inline def inject(serviceIdentifier: ServiceIdentifierOrFunc): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def injectable(): js.Function1[/* target */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")().asInstanceOf[js.Function1[/* target */ js.Any, js.Any]]
  
  inline def multiBindToService(container: typings.inversify.interfacesMod.interfaces.Container): js.Function1[
    /* service */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiBindToService")(container.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* service */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], Unit]
  ]]
  
  inline def multiInject(serviceIdentifier: ServiceIdentifier[js.Any]): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiInject")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def named(name: String): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  inline def named(name: js.Symbol): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  inline def named(name: Double): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def namedConstraint(value: js.Any): ConstraintFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("namedConstraint")(value.asInstanceOf[js.Any]).asInstanceOf[ConstraintFunction]
  
  inline def optional(): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")().asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def postConstruct(): js.Function3[
    /* target */ js.Any, 
    /* propertyKey */ String, 
    /* descriptor */ PropertyDescriptor, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("postConstruct")().asInstanceOf[js.Function3[
    /* target */ js.Any, 
    /* propertyKey */ String, 
    /* descriptor */ PropertyDescriptor, 
    Unit
  ]]
  
  inline def tagged(metadataKey: String, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  inline def tagged(metadataKey: js.Symbol, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  inline def tagged(metadataKey: Double, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def taggedConstraint(key: PropertyKey): js.Function1[/* value */ js.Any, ConstraintFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedConstraint")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ js.Any, ConstraintFunction]]
  
  inline def targetName(name: String): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("targetName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit]]
  
  inline def traverseAncerstors(request: Request, constraint: ConstraintFunction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseAncerstors")(request.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def typeConstraint(`type`: String): js.Function1[/* request */ Request | Null, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeConstraint")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* request */ Request | Null, Boolean]]
  inline def typeConstraint(`type`: js.Function): js.Function1[/* request */ Request | Null, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeConstraint")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* request */ Request | Null, Boolean]]
  
  inline def unmanaged(): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmanaged")().asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit]]
}
