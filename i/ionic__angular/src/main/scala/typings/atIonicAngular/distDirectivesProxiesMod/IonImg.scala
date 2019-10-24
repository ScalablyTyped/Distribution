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

@JSImport("@ionic/angular/dist/directives/proxies", "IonImg")
@js.native
class IonImg protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonImg {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionError: EventEmitter[CustomEvent[_]] = js.native
  var ionImgDidLoad: EventEmitter[CustomEvent[_]] = js.native
  var ionImgWillLoad: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

