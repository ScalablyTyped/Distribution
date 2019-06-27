package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSegment")
@js.native
class IonSegment protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonSegment {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * If `true`, the user cannot interact with the segment.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  var ionChange: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionStyle: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * If `true`, the segment buttons will overflow and the user can swipe to see them.
    */
  /* CompleteClass */
  override var scrollable: scala.Boolean = js.native
}

