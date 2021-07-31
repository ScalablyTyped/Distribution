package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonFab")
@js.native
class IonFab protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonFab {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, both the `ion-fab-button` and all `ion-fab-list` inside `ion-fab` will become active. That means `ion-fab-button` will become a `close` icon and `ion-fab-list` will become visible.
    */
  /* CompleteClass */
  var activated: Boolean = js.native
  
  /**
    * Close an active FAB list container.
    */
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, the fab will display on the edge of the header if `vertical` is `"top"`, and on the edge of the footer if it is `"bottom"`. Should be used with a `fixed` slot.
    */
  /* CompleteClass */
  var edge: Boolean = js.native
  
  var el: HTMLElement = js.native
  
  var z: NgZone = js.native
}
