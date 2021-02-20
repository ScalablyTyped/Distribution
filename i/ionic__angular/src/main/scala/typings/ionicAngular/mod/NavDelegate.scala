package typings.ionicAngular.mod

import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.angularCore.mod.ViewContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "NavDelegate")
@js.native
class NavDelegate protected ()
  extends typings.ionicAngular.navDelegateMod.NavDelegate {
  def this(
    ref: ElementRef[_],
    resolver: ComponentFactoryResolver,
    injector: Injector,
    angularDelegate: typings.ionicAngular.angularDelegateMod.AngularDelegate,
    location: ViewContainerRef
  ) = this()
}
