package typings.atIonicAngular.atIonicAngularMod

import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "NavDelegate")
@js.native
class NavDelegate protected ()
  extends typings.atIonicAngular.distMod.NavDelegate {
  def this(
    ref: ElementRef[_],
    resolver: ComponentFactoryResolver,
    injector: Injector,
    angularDelegate: typings.atIonicAngular.distProvidersAngularDashDelegateMod.AngularDelegate,
    location: ViewContainerRef
  ) = this()
}

