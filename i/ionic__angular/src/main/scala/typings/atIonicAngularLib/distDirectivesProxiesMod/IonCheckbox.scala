package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonCheckbox")
@js.native
class IonCheckbox protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonCheckbox {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * If `true`, the checkbox is selected.
    */
  /* CompleteClass */
  override var checked: scala.Boolean = js.native
  /**
    * If `true`, the user cannot interact with the checkbox.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  /**
    * If `true`, the checkbox will visually appear as indeterminate.
    */
  /* CompleteClass */
  override var indeterminate: scala.Boolean = js.native
  var ionBlur: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionChange: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionFocus: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * The value of the toggle does not mean if it's checked or not, use the `checked` property for that.  The value of a toggle is analogous to the value of a `<input type="checkbox">`, it's only used when the toggle participates in a native `<form>`.
    */
  /* CompleteClass */
  override var value: java.lang.String = js.native
}

