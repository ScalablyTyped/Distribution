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

@JSImport("@ionic/angular/dist/directives/proxies", "IonImg")
@js.native
class IonImg protected ()
  extends typings.ionicCore.componentsMod.Components.IonImg {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionError: EventEmitter[CustomEvent[_]] = js.native
  var ionImgDidLoad: EventEmitter[CustomEvent[_]] = js.native
  var ionImgWillLoad: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

