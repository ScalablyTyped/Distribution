package typings.inversify

import typings.inversify.dtsAnnotationInjectMod.ServiceIdentifierOrFunc
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.AsyncContainerModuleCallBack
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ConstraintFunction
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ContainerModuleCallBack
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ContainerOptions
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Request
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversify.inversifyStrings.`design:paramtypes`
import typings.inversify.inversifyStrings.`inversify:paramtypes`
import typings.inversify.inversifyStrings.`inversify:tagged_props`
import typings.inversify.inversifyStrings.`inversify:tagged`
import typings.inversify.inversifyStrings.inject
import typings.inversify.inversifyStrings.multi_inject
import typings.inversify.inversifyStrings.name
import typings.inversify.inversifyStrings.named
import typings.inversify.inversifyStrings.optional
import typings.inversify.inversifyStrings.post_construct
import typings.inversify.inversifyStrings.unmanaged
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
object inversifyMod extends js.Object {
  @js.native
  class AsyncContainerModule protected ()
    extends typings.inversify.dtsContainerContainerUnderscoreModuleMod.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @js.native
  class Container ()
    extends typings.inversify.dtsContainerContainerMod.Container {
    def this(containerOptions: ContainerOptions) = this()
  }
  
  @js.native
  class ContainerModule protected ()
    extends typings.inversify.dtsContainerContainerUnderscoreModuleMod.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
  
  @js.native
  class LazyServiceIdentifer[T] protected ()
    extends typings.inversify.dtsAnnotationInjectMod.LazyServiceIdentifer[T] {
    def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
  }
  
  @js.native
  class MetadataReader ()
    extends typings.inversify.dtsPlanningMetadataUnderscoreReaderMod.MetadataReader
  
  val BindingScopeEnum: typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingScopeEnum = js.native
  val BindingTypeEnum: typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingTypeEnum = js.native
  val TargetTypeEnum: typings.inversify.dtsInterfacesInterfacesMod.interfaces.TargetTypeEnum = js.native
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
  def multiBindToService(
    container: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify interfaces.Container */ js.Any
  ): js.Function1[
    /* service */ String | js.Symbol | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify interfaces.Newable<any> */ js.Any), 
    js.Function1[
      /* repeated */ String | js.Symbol | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify interfaces.Newable<any> */ _), 
      Unit
    ]
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
      container1: typings.inversify.dtsInterfacesInterfacesMod.interfaces.Container,
      container2: typings.inversify.dtsInterfacesInterfacesMod.interfaces.Container
    ): typings.inversify.dtsInterfacesInterfacesMod.interfaces.Container = js.native
  }
  
  @js.native
  object METADATA_KEY extends js.Object {
    val DESIGN_PARAM_TYPES: `design:paramtypes` = js.native
    val INJECT_TAG: inject = js.native
    val MULTI_INJECT_TAG: multi_inject = js.native
    val NAMED_TAG: named = js.native
    val NAME_TAG: name = js.native
    val OPTIONAL_TAG: optional = js.native
    val PARAM_TYPES: `inversify:paramtypes` = js.native
    val POST_CONSTRUCT: post_construct = js.native
    val TAGGED: `inversify:tagged` = js.native
    val TAGGED_PROP: `inversify:tagged_props` = js.native
    val UNMANAGED_TAG: unmanaged = js.native
  }
  
}

