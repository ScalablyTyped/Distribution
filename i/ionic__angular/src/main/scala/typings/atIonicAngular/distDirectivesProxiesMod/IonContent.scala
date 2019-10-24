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

@JSImport("@ionic/angular/dist/directives/proxies", "IonContent")
@js.native
class IonContent protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonContent {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionScroll: EventEmitter[CustomEvent[_]] = js.native
  var ionScrollEnd: EventEmitter[CustomEvent[_]] = js.native
  var ionScrollStart: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

