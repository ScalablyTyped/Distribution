package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.atIonicCore.atIonicCoreStrings.bottom
import typings.atIonicCore.atIonicCoreStrings.end
import typings.atIonicCore.atIonicCoreStrings.start
import typings.atIonicCore.atIonicCoreStrings.top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonFabList")
@js.native
class IonFabList protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonFabList {
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

