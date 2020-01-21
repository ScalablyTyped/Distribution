package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.end
import typings.ionicCore.ionicCoreStrings.start
import typings.ionicCore.ionicCoreStrings.top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonFabList")
@js.native
class IonFabList protected ()
  extends typings.ionicCore.componentsMod.Components.IonFabList {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  /* CompleteClass */
  override var activated: Boolean = js.native
  var el: HTMLElement = js.native
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  /* CompleteClass */
  override var side: start | end | top | bottom = js.native
  var z: NgZone = js.native
}

