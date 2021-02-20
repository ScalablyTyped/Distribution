package typings.ionicAngular

import typings.angularCore.mod.ApplicationRef
import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.Injector
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.ViewContainerRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularDelegateMod {
  
  @JSImport("@ionic/angular/providers/angular-delegate", "AngularDelegate")
  @js.native
  class AngularDelegate protected () extends StObject {
    def this(zone: NgZone, appRef: ApplicationRef) = this()
    
    var appRef: js.Any = js.native
    
    def create(resolver: ComponentFactoryResolver, injector: Injector): AngularFrameworkDelegate = js.native
    def create(resolver: ComponentFactoryResolver, injector: Injector, location: ViewContainerRef): AngularFrameworkDelegate = js.native
    
    var zone: js.Any = js.native
  }
  
  @JSImport("@ionic/angular/providers/angular-delegate", "AngularFrameworkDelegate")
  @js.native
  class AngularFrameworkDelegate protected () extends FrameworkDelegate {
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
  }
  
  @JSImport("@ionic/angular/providers/angular-delegate", "attachView")
  @js.native
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
  
  @JSImport("@ionic/angular/providers/angular-delegate", "bindLifecycleEvents")
  @js.native
  def bindLifecycleEvents(zone: NgZone, instance: js.Any, element: HTMLElement): js.Function0[Unit] = js.native
}
