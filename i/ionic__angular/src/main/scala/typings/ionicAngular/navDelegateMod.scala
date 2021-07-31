package typings.ionicAngular

import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.angularCore.mod.ViewContainerRef
import typings.ionicAngular.angularDelegateMod.AngularDelegate
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navDelegateMod {
  
  @JSImport("@ionic/angular/directives/navigation/nav-delegate", "NavDelegate")
  @js.native
  class NavDelegate protected () extends StObject {
    def this(
      ref: ElementRef[js.Any],
      resolver: ComponentFactoryResolver,
      injector: Injector,
      angularDelegate: AngularDelegate,
      location: ViewContainerRef
    ) = this()
    
    var el: HTMLElement = js.native
  }
}
