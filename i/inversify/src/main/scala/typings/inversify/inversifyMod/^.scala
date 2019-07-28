package typings.inversify.inversifyMod

import typings.inversify.dtsAnnotationInjectMod.ServiceIdentifierOrFunc
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Request
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier
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
object ^ extends js.Object {
  val BindingScopeEnum: typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.BindingScopeEnum = js.native
  val BindingTypeEnum: typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.BindingTypeEnum = js.native
  val TargetTypeEnum: typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.TargetTypeEnum = js.native
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
}

