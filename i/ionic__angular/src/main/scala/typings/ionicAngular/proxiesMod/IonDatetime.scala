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

@JSImport("@ionic/angular/directives/proxies", "IonDatetime")
@js.native
class IonDatetime protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonDatetime {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * The text to display on the picker's cancel button.
    */
  /* CompleteClass */
  var cancelText: String = js.native
  
  /**
    * If `true`, the user cannot interact with the datetime.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /**
    * The display format of the date and time as text that shows within the item. When the `pickerFormat` input is not used, then the `displayFormat` is used for both display the formatted text, and determining the datetime picker's columns. See the `pickerFormat` input description for more info. Defaults to `MMM D, YYYY`.
    */
  /* CompleteClass */
  var displayFormat: String = js.native
  
  /**
    * The text to display on the picker's "Done" button.
    */
  /* CompleteClass */
  var doneText: String = js.native
  
  var el: HTMLElement = js.native
  
  var ionBlur: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionCancel: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionChange: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionFocus: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Opens the datetime overlay.
    */
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, the datetime appears normal but is not interactive.
    */
  /* CompleteClass */
  var readonly: Boolean = js.native
  
  var z: NgZone = js.native
}
