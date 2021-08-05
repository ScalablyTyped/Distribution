package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.ionicCore.mod.Side
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonItemOptions")
@js.native
class IonItemOptions protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonItemOptions {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /* CompleteClass */
  override def fireSwipeEvent(): js.Promise[Unit] = js.native
  
  var ionSwipe: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  /* CompleteClass */
  var side: Side = js.native
  
  /* protected */ var z: NgZone = js.native
}
