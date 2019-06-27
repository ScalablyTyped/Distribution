package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonDatetime")
@js.native
class IonDatetime protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonDatetime {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * The text to display on the picker's cancel button.
    */
  /* CompleteClass */
  override var cancelText: java.lang.String = js.native
  /**
    * If `true`, the user cannot interact with the datetime.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  /**
    * The display format of the date and time as text that shows within the item. When the `pickerFormat` input is not used, then the `displayFormat` is used for both display the formatted text, and determining the datetime picker's columns. See the `pickerFormat` input description for more info. Defaults to `MMM D, YYYY`.
    */
  /* CompleteClass */
  override var displayFormat: java.lang.String = js.native
  /**
    * The text to display on the picker's "Done" button.
    */
  /* CompleteClass */
  override var doneText: java.lang.String = js.native
  var el: stdLib.HTMLElement = js.native
  var ionBlur: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionCancel: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionChange: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionFocus: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * If `true`, the datetime appears normal but is not interactive.
    */
  /* CompleteClass */
  override var readonly: scala.Boolean = js.native
  /**
    * Opens the datetime overlay.
    */
  /* CompleteClass */
  override def open(): js.Promise[scala.Unit] = js.native
}

