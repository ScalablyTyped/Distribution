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

@JSImport("@ionic/angular/directives/proxies", "IonCheckbox")
@js.native
class IonCheckbox protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonCheckbox {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, the checkbox is selected.
    */
  /* CompleteClass */
  var checked: Boolean = js.native
  
  /**
    * If `true`, the user cannot interact with the checkbox.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * If `true`, the checkbox will visually appear as indeterminate.
    */
  /* CompleteClass */
  var indeterminate: Boolean = js.native
  
  var ionBlur: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionChange: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionFocus: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * The value of the checkbox does not mean if it's checked or not, use the `checked` property for that.  The value of a checkbox is analogous to the value of an `<input type="checkbox">`, it's only used when the checkbox participates in a native `<form>`.
    */
  /* CompleteClass */
  var value: String = js.native
  
  /* protected */ var z: NgZone = js.native
}
