package typings.atIonicAngular.distMod

import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist", "NavDelegate")
@js.native
class NavDelegate protected ()
  extends typings.atIonicAngular.distDirectivesNavigationNavDashDelegateMod.NavDelegate {
  def this(
    ref: ElementRef[_],
    resolver: ComponentFactoryResolver,
    injector: Injector,
    angularDelegate: typings.atIonicAngular.distProvidersAngularDashDelegateMod.AngularDelegate,
    location: ViewContainerRef
  ) = this()
}

