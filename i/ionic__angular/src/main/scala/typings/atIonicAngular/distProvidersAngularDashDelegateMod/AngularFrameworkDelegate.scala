package typings.atIonicAngular.distProvidersAngularDashDelegateMod

import typings.atAngularCore.atAngularCoreMod.ApplicationRef
import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.atAngularCore.atAngularCoreMod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@ionic/angular/dist/providers/angular-delegate", "AngularFrameworkDelegate")
@js.native
class AngularFrameworkDelegate protected () extends js.Object {
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
  def attachViewToDom(container: js.Any, component: js.Any): js.Promise[_] = js.native
  def attachViewToDom(container: js.Any, component: js.Any, params: js.Any): js.Promise[_] = js.native
  def attachViewToDom(container: js.Any, component: js.Any, params: js.Any, cssClasses: js.Array[String]): js.Promise[_] = js.native
  def removeViewFromDom(_container: js.Any, component: js.Any): js.Promise[Unit] = js.native
}

