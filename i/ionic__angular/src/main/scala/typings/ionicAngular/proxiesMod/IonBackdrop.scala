package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonBackdrop")
@js.native
class IonBackdrop protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonBackdrop {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  var ionBackdropTap: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  /* CompleteClass */
  var stopPropagation: Boolean = js.native
  
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  /* CompleteClass */
  var tappable: Boolean = js.native
  
  /**
    * If `true`, the backdrop will be visible.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
  
  var z: NgZone = js.native
}
