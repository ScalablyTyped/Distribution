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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularDelegateMod {
  
  @JSImport("@ionic/angular/providers/angular-delegate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/providers/angular-delegate", "AngularDelegate")
  @js.native
  class AngularDelegate protected () extends StObject {
    def this(zone: NgZone, appRef: ApplicationRef) = this()
    
    /* private */ var appRef: js.Any = js.native
    
    def create(resolver: ComponentFactoryResolver, injector: Injector): AngularFrameworkDelegate = js.native
    def create(resolver: ComponentFactoryResolver, injector: Injector, location: ViewContainerRef): AngularFrameworkDelegate = js.native
    
    /* private */ var zone: js.Any = js.native
  }
  
  @JSImport("@ionic/angular/providers/angular-delegate", "AngularFrameworkDelegate")
  @js.native
  class AngularFrameworkDelegate protected ()
    extends StObject
       with FrameworkDelegate {
    def this(
      resolver: ComponentFactoryResolver,
      injector: Injector,
      location: Unit,
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
    
    /* private */ var appRef: js.Any = js.native
    
    /* private */ var elEventsMap: js.Any = js.native
    
    /* private */ var elRefMap: js.Any = js.native
    
    /* private */ var injector: js.Any = js.native
    
    /* private */ var location: js.Any = js.native
    
    /* private */ var resolver: js.Any = js.native
    
    /* private */ var zone: js.Any = js.native
  }
  
  inline def attachView(
    zone: NgZone,
    resolver: ComponentFactoryResolver,
    injector: Injector,
    location: ViewContainerRef,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, js.Any],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: js.Any,
    component: js.Any,
    params: js.Any,
    cssClasses: js.Array[String]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachView")(zone.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], location.asInstanceOf[js.Any], appRef.asInstanceOf[js.Any], elRefMap.asInstanceOf[js.Any], elEventsMap.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], params.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def bindLifecycleEvents(zone: NgZone, instance: js.Any, element: HTMLElement): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindLifecycleEvents")(zone.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
