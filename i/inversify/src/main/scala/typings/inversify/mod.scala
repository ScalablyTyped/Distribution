package typings.inversify

import org.scalablytyped.runtime.Instantiable1
import typings.inversify.anon.Constructor
import typings.inversify.libAnnotationDecoratorUtilsMod.DecoratorTarget
import typings.inversify.libAnnotationLazyServiceIdentifierMod.ServiceIdentifierOrFunc
import typings.inversify.libInterfacesInterfacesMod.interfaces.AsyncContainerModuleCallBack
import typings.inversify.libInterfacesInterfacesMod.interfaces.ConstraintFunction
import typings.inversify.libInterfacesInterfacesMod.interfaces.ContainerModuleCallBack
import typings.inversify.libInterfacesInterfacesMod.interfaces.ContainerOptions
import typings.inversify.libInterfacesInterfacesMod.interfaces.MetadataOrMetadataArray
import typings.inversify.libInterfacesInterfacesMod.interfaces.Request
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.std.MethodDecorator
import typings.std.NewableFunction
import typings.std.ParameterDecorator
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inversify", "AsyncContainerModule")
  @js.native
  open class AsyncContainerModule protected ()
    extends typings.inversify.libContainerContainerModuleMod.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @JSImport("inversify", "BindingScopeEnum")
  @js.native
  val BindingScopeEnum: typings.inversify.libInterfacesInterfacesMod.interfaces.BindingScopeEnum = js.native
  
  @JSImport("inversify", "BindingTypeEnum")
  @js.native
  val BindingTypeEnum: typings.inversify.libInterfacesInterfacesMod.interfaces.BindingTypeEnum = js.native
  
  @JSImport("inversify", "Container")
  @js.native
  open class Container ()
    extends StObject
       with typings.inversify.libContainerContainerMod.Container {
    def this(containerOptions: ContainerOptions) = this()
  }
  object Container {
    
    @JSImport("inversify", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def merge(
      container1: typings.inversify.libInterfacesInterfacesMod.interfaces.Container,
      container2: typings.inversify.libInterfacesInterfacesMod.interfaces.Container,
      containers: typings.inversify.libInterfacesInterfacesMod.interfaces.Container*
    ): typings.inversify.libInterfacesInterfacesMod.interfaces.Container = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")((scala.List(container1.asInstanceOf[js.Any], container2.asInstanceOf[js.Any])).`++`(containers.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.inversify.libInterfacesInterfacesMod.interfaces.Container]
  }
  
  @JSImport("inversify", "ContainerModule")
  @js.native
  open class ContainerModule protected ()
    extends typings.inversify.libContainerContainerModuleMod.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
  
  @JSImport("inversify", "LazyServiceIdentifer")
  @js.native
  open class LazyServiceIdentifer[T] protected ()
    extends typings.inversify.libAnnotationLazyServiceIdentifierMod.LazyServiceIdentifer[T] {
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
    
    @JSImport("inversify", "METADATA_KEY.NON_CUSTOM_TAG_KEYS")
    @js.native
    val NON_CUSTOM_TAG_KEYS: js.Array[String] = js.native
    
    @JSImport("inversify", "METADATA_KEY.OPTIONAL_TAG")
    @js.native
    val OPTIONAL_TAG: /* "optional" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.PARAM_TYPES")
    @js.native
    val PARAM_TYPES: /* "inversify:paramtypes" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.POST_CONSTRUCT")
    @js.native
    val POST_CONSTRUCT: /* "post_construct" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.PRE_DESTROY")
    @js.native
    val PRE_DESTROY: /* "pre_destroy" */ String = js.native
    
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
  open class MetadataReader ()
    extends typings.inversify.libPlanningMetadataReaderMod.MetadataReader
  
  @JSImport("inversify", "TargetTypeEnum")
  @js.native
  val TargetTypeEnum: typings.inversify.libInterfacesInterfacesMod.interfaces.TargetTypeEnum = js.native
  
  inline def createTaggedDecorator(metadata: MetadataOrMetadataArray): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedDecorator")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getServiceIdentifierAsString(serviceIdentifier: ServiceIdentifier[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceIdentifierAsString")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def id(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Double]
  
  inline def inject[T](serviceIdentifier: ServiceIdentifierOrFunc[T]): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  
  inline def injectable(): js.Function1[
    /* target */ Instantiable1[/* args */ scala.Nothing, Any], 
    Instantiable1[/* args */ scala.Nothing, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")().asInstanceOf[js.Function1[
    /* target */ Instantiable1[/* args */ scala.Nothing, Any], 
    Instantiable1[/* args */ scala.Nothing, Any]
  ]]
  
  inline def multiBindToService(container: typings.inversify.libInterfacesInterfacesMod.interfaces.Container): js.Function1[
    /* service */ ServiceIdentifier[Any], 
    js.Function1[/* repeated */ ServiceIdentifier[Any], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiBindToService")(container.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* service */ ServiceIdentifier[Any], 
    js.Function1[/* repeated */ ServiceIdentifier[Any], Unit]
  ]]
  
  inline def multiInject[T](serviceIdentifier: ServiceIdentifierOrFunc[T]): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiInject")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  
  inline def named(name: String): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  inline def named(name: js.Symbol): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  inline def named(name: Double): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  
  inline def namedConstraint(value: Any): ConstraintFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("namedConstraint")(value.asInstanceOf[js.Any]).asInstanceOf[ConstraintFunction]
  
  inline def optional(): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")().asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  
  inline def postConstruct(): js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("postConstruct")().asInstanceOf[js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit]]
  
  inline def preDestroy(): js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("preDestroy")().asInstanceOf[js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit]]
  
  inline def tagged[T](metadataKey: String, metadataValue: Any): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  inline def tagged[T](metadataKey: js.Symbol, metadataValue: Any): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  inline def tagged[T](metadataKey: Double, metadataValue: Any): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  
  inline def taggedConstraint(key: String): js.Function1[/* value */ Any, ConstraintFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedConstraint")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, ConstraintFunction]]
  inline def taggedConstraint(key: js.Symbol): js.Function1[/* value */ Any, ConstraintFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedConstraint")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, ConstraintFunction]]
  inline def taggedConstraint(key: Double): js.Function1[/* value */ Any, ConstraintFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedConstraint")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, ConstraintFunction]]
  
  inline def targetName(name: String): js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("targetName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit]]
  
  inline def traverseAncerstors(request: Request, constraint: ConstraintFunction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseAncerstors")(request.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def typeConstraint(`type`: String): js.Function1[/* request */ Request | Null, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeConstraint")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* request */ Request | Null, Boolean]]
  inline def typeConstraint(`type`: NewableFunction): js.Function1[/* request */ Request | Null, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeConstraint")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* request */ Request | Null, Boolean]]
  
  inline def unmanaged(): js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmanaged")().asInstanceOf[js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit]]
}
