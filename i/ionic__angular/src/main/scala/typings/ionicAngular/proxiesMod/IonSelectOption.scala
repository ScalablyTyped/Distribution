package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonSelectOption")
@js.native
class IonSelectOption protected ()
  extends typings.ionicCore.componentsMod.Components.IonSelectOption {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the user cannot interact with the select option.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var z: NgZone = js.native
}

