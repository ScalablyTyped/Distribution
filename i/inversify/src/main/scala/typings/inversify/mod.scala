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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AsyncContainerModule protected ()
    extends typings.inversify.containerModuleMod.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @js.native
  class Container ()
    extends typings.inversify.containerMod.Container {
    def this(containerOptions: ContainerOptions) = this()
  }
  
  @js.native
  class ContainerModule protected ()
    extends typings.inversify.containerModuleMod.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
  
  @js.native
  class LazyServiceIdentifer[T] protected ()
    extends typings.inversify.injectMod.LazyServiceIdentifer[T] {
    def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
  }
  
  @js.native
  class MetadataReader ()
    extends typings.inversify.metadataReaderMod.MetadataReader
  
  val BindingScopeEnum: typings.inversify.interfacesMod.interfaces.BindingScopeEnum = js.native
  val BindingTypeEnum: typings.inversify.interfacesMod.interfaces.BindingTypeEnum = js.native
  val TargetTypeEnum: typings.inversify.interfacesMod.interfaces.TargetTypeEnum = js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any): Unit = js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  def decorate(decorator: ClassDecorator, target: js.Any): Unit = js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  def getServiceIdentifierAsString(serviceIdentifier: ServiceIdentifier[_]): String = js.native
  def id(): Double = js.native
  def inject(serviceIdentifier: ServiceIdentifierOrFunc): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def injectable(): js.Function1[/* target */ js.Any, _] = js.native
  def multiBindToService(container: typings.inversify.interfacesMod.interfaces.Container): js.Function1[
    /* service */ String | js.Symbol | Newable[_] | Abstract[_], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[_] | Abstract[_], Unit]
  ] = js.native
  def multiInject(serviceIdentifier: ServiceIdentifier[_]): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def named(name: String): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def named(name: js.Symbol): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def named(name: Double): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def namedConstraint(value: js.Any): ConstraintFunction = js.native
  def optional(): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def postConstruct(): js.Function3[
    /* target */ js.Any, 
    /* propertyKey */ String, 
    /* descriptor */ PropertyDescriptor, 
    Unit
  ] = js.native
  def tagged(metadataKey: String, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def tagged(metadataKey: js.Symbol, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def tagged(metadataKey: Double, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def taggedConstraint(key: PropertyKey): js.Function1[/* value */ js.Any, ConstraintFunction] = js.native
  def targetName(name: String): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit] = js.native
  def traverseAncerstors(request: Request, constraint: ConstraintFunction): Boolean = js.native
  def typeConstraint(`type`: String): js.Function1[/* request */ Request | Null, Boolean] = js.native
  def typeConstraint(`type`: js.Function): js.Function1[/* request */ Request | Null, Boolean] = js.native
  def unmanaged(): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit] = js.native
  /* static members */
  @js.native
  object Container extends js.Object {
    def merge(
      container1: typings.inversify.interfacesMod.interfaces.Container,
      container2: typings.inversify.interfacesMod.interfaces.Container
    ): typings.inversify.interfacesMod.interfaces.Container = js.native
  }
  
  @js.native
  object METADATA_KEY extends js.Object {
    val DESIGN_PARAM_TYPES: /* "design:paramtypes" */ String = js.native
    val INJECT_TAG: /* "inject" */ String = js.native
    val MULTI_INJECT_TAG: /* "multi_inject" */ String = js.native
    val NAMED_TAG: /* "named" */ String = js.native
    val NAME_TAG: /* "name" */ String = js.native
    val OPTIONAL_TAG: /* "optional" */ String = js.native
    val PARAM_TYPES: /* "inversify:paramtypes" */ String = js.native
    val POST_CONSTRUCT: /* "post_construct" */ String = js.native
    val TAGGED: /* "inversify:tagged" */ String = js.native
    val TAGGED_PROP: /* "inversify:tagged_props" */ String = js.native
    val UNMANAGED_TAG: /* "unmanaged" */ String = js.native
  }
  
}

