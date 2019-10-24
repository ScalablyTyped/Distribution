package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.EventEmitter
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.atIonicCore.atIonicCoreStrings.button
import typings.atIonicCore.atIonicCoreStrings.reset
import typings.atIonicCore.atIonicCoreStrings.submit
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSegmentButton")
@js.native
class IonSegmentButton protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonSegmentButton {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the segment button is selected.
    */
  /* CompleteClass */
  override var checked: Boolean = js.native
  /**
    * If `true`, the user cannot interact with the segment button.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionSelect: EventEmitter[CustomEvent[_]] = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: submit | reset | button = js.native
  /**
    * The value of the segment button.
    */
  /* CompleteClass */
  override var value: String = js.native
  var z: NgZone = js.native
}

