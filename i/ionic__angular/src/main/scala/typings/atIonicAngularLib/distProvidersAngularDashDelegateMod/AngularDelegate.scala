package typings
package atIonicAngularLib.distProvidersAngularDashDelegateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/angular-delegate", "AngularDelegate")
@js.native
class AngularDelegate protected () extends js.Object {
  def this(zone: atAngularCoreLib.atAngularCoreMod.NgZone, appRef: atAngularCoreLib.atAngularCoreMod.ApplicationRef) = this()
  var appRef: js.Any = js.native
  var zone: js.Any = js.native
  def create(
    resolver: atAngularCoreLib.atAngularCoreMod.ComponentFactoryResolver,
    injector: atAngularCoreLib.atAngularCoreMod.Injector
  ): AngularFrameworkDelegate = js.native
  def create(
    resolver: atAngularCoreLib.atAngularCoreMod.ComponentFactoryResolver,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    location: atAngularCoreLib.atAngularCoreMod.ViewContainerRef
  ): AngularFrameworkDelegate = js.native
}

