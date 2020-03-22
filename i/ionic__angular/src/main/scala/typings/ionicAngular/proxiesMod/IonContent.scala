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

@JSImport("@ionic/angular/directives/proxies", "IonContent")
@js.native
class IonContent protected ()
  extends typings.ionicCore.componentsMod.Components.IonContent {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionScroll: EventEmitter[CustomEvent[_]] = js.native
  var ionScrollEnd: EventEmitter[CustomEvent[_]] = js.native
  var ionScrollStart: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

