package typings.atIonicAngular

import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.ViewContainerRef
import typings.atIonicAngular.distProvidersAngularDashDelegateMod.AngularDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/nav-delegate", JSImport.Namespace)
@js.native
object distDirectivesNavigationNavDashDelegateMod extends js.Object {
  @js.native
  class NavDelegate protected () extends js.Object {
    def this(
      ref: ElementRef[_],
      resolver: ComponentFactoryResolver,
      injector: Injector,
      angularDelegate: AngularDelegate,
      location: ViewContainerRef
    ) = this()
  }
  
}

