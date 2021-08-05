package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonList")
@js.native
class IonList protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonList {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `ion-item-sliding` are used inside the list, this method closes any open sliding item.  Returns `true` if an actual `ion-item-sliding` is closed.
    */
  /* CompleteClass */
  override def closeSlidingItems(): js.Promise[Boolean] = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * If `true`, the list will have margin around it and rounded corners.
    */
  /* CompleteClass */
  var inset: Boolean = js.native
  
  /* protected */ var z: NgZone = js.native
}
