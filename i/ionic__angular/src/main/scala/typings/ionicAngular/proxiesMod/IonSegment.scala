package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonSegment")
@js.native
class IonSegment protected ()
  extends typings.ionicCore.componentsMod.Components.IonSegment {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the user cannot interact with the segment.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionChange: EventEmitter[CustomEvent[_]] = js.native
  /**
    * If `true`, the segment buttons will overflow and the user can swipe to see them. In addition, this will disable the gesture to drag the indicator between the buttons in order to swipe to see hidden buttons.
    */
  /* CompleteClass */
  override var scrollable: Boolean = js.native
  var z: NgZone = js.native
}

