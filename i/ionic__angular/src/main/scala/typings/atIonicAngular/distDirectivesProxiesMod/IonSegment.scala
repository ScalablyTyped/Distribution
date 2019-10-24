package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.EventEmitter
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSegment")
@js.native
class IonSegment protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonSegment {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the user cannot interact with the segment.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionChange: EventEmitter[CustomEvent[_]] = js.native
  /**
    * If `true`, the segment buttons will overflow and the user can swipe to see them.
    */
  /* CompleteClass */
  override var scrollable: Boolean = js.native
  var z: NgZone = js.native
}

