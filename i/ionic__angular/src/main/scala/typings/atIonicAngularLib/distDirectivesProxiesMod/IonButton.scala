package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonButton")
@js.native
class IonButton protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonButton {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_], z: atAngularCoreLib.atAngularCoreMod.NgZone) = this()
  /**
    * The type of button.
    */
  /* CompleteClass */
  override var buttonType: java.lang.String = js.native
  /**
    * If `true`, the user cannot interact with the button.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  var ionBlur: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionFocus: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  /* CompleteClass */
  override var routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any = js.native
  /**
    * If `true`, activates a button with a heavier font weight.
    */
  /* CompleteClass */
  override var strong: scala.Boolean = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button = js.native
  var z: atAngularCoreLib.atAngularCoreMod.NgZone = js.native
}

