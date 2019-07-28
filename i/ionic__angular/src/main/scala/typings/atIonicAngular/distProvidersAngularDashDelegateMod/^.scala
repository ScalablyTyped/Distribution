package typings.atIonicAngular.distProvidersAngularDashDelegateMod

import typings.atAngularCore.atAngularCoreMod.ApplicationRef
import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.atAngularCore.atAngularCoreMod.ViewContainerRef
import typings.std.HTMLElement
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/angular-delegate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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

