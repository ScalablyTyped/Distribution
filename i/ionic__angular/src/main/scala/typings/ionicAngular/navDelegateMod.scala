package typings.ionicAngular

import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.angularCore.mod.ViewContainerRef
import typings.ionicAngular.angularDelegateMod.AngularDelegate
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/navigation/nav-delegate", JSImport.Namespace)
@js.native
object navDelegateMod extends js.Object {
  @js.native
  class NavDelegate protected () extends js.Object {
    def this(
      ref: ElementRef[_],
      resolver: ComponentFactoryResolver,
      injector: Injector,
      angularDelegate: AngularDelegate,
      location: ViewContainerRef
    ) = this()
    var el: HTMLElement = js.native
  }
  
}

