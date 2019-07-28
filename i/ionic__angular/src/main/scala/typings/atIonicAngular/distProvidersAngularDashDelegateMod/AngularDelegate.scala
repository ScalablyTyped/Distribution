package typings.atIonicAngular.distProvidersAngularDashDelegateMod

import typings.atAngularCore.atAngularCoreMod.ApplicationRef
import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.atAngularCore.atAngularCoreMod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/angular-delegate", "AngularDelegate")
@js.native
class AngularDelegate protected () extends js.Object {
  def this(zone: NgZone, appRef: ApplicationRef) = this()
  var appRef: js.Any = js.native
  var zone: js.Any = js.native
  def create(resolver: ComponentFactoryResolver, injector: Injector): AngularFrameworkDelegate = js.native
  def create(resolver: ComponentFactoryResolver, injector: Injector, location: ViewContainerRef): AngularFrameworkDelegate = js.native
}

