package typings.atIonicAngular

import typings.atAngularCore.atAngularCoreMod.ApplicationRef
import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.atAngularCore.atAngularCoreMod.ViewContainerRef
import typings.atIonicAngular.distProvidersAngularDashDelegateMod.AngularFrameworkDelegate
import typings.atIonicCore.distTypesInterfaceMod.FrameworkDelegate
import typings.std.HTMLElement
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/angular-delegate", JSImport.Namespace)
@js.native
object distProvidersAngularDashDelegateMod extends js.Object {
  @js.native
  class AngularDelegate protected () extends js.Object {
    def this(zone: NgZone, appRef: ApplicationRef) = this()
    var appRef: js.Any = js.native
    var zone: js.Any = js.native
    def create(resolver: ComponentFactoryResolver, injector: Injector): AngularFrameworkDelegate = js.native
    def create(resolver: ComponentFactoryResolver, injector: Injector, location: ViewContainerRef): AngularFrameworkDelegate = js.native
  }
  
  @js.native
  class AngularFrameworkDelegate protected () extends FrameworkDelegate {
    def this(
      resolver: ComponentFactoryResolver,
      injector: Injector,
      location: js.UndefOr[scala.Nothing],
      appRef: ApplicationRef,
      zone: NgZone
    ) = this()
    def this(
      resolver: ComponentFactoryResolver,
      injector: Injector,
      location: ViewContainerRef,
      appRef: ApplicationRef,
      zone: NgZone
    ) = this()
    var appRef: js.Any = js.native
    var elEventsMap: js.Any = js.native
    var elRefMap: js.Any = js.native
    var injector: js.Any = js.native
    var location: js.Any = js.native
    var resolver: js.Any = js.native
    var zone: js.Any = js.native
  }
  
  def attachView(
    zone: NgZone,
    resolver: ComponentFactoryResolver,
    injector: Injector,
    location: js.UndefOr[scala.Nothing],
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, _],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: js.Any,
    component: js.Any,
    params: js.Any
  ): js.Any = js.native
  def attachView(
    zone: NgZone,
    resolver: ComponentFactoryResolver,
    injector: Injector,
    location: js.UndefOr[scala.Nothing],
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, _],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: js.Any,
    component: js.Any,
    params: js.Any,
    cssClasses: js.Array[String]
  ): js.Any = js.native
  def attachView(
    zone: NgZone,
    resolver: ComponentFactoryResolver,
    injector: Injector,
    location: ViewContainerRef,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, _],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: js.Any,
    component: js.Any,
    params: js.Any
  ): js.Any = js.native
  def attachView(
    zone: NgZone,
    resolver: ComponentFactoryResolver,
    injector: Injector,
    location: ViewContainerRef,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, _],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: js.Any,
    component: js.Any,
    params: js.Any,
    cssClasses: js.Array[String]
  ): js.Any = js.native
  def bindLifecycleEvents(zone: NgZone, instance: js.Any, element: HTMLElement): js.Function0[Unit] = js.native
}

