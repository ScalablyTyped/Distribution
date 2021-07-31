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

@JSImport("@ionic/angular/directives/proxies", "IonRadio")
@js.native
class IonRadio protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonRadio {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, the user cannot interact with the radio.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  var el: HTMLElement = js.native
  
  var ionBlur: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionFocus: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def setButtonTabindex(value: Double): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
  
  var z: NgZone = js.native
}
