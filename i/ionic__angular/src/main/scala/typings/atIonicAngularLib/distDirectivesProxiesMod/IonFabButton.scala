package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonFabButton")
@js.native
class IonFabButton protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonFabButton {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_], z: atAngularCoreLib.atAngularCoreMod.NgZone) = this()
  /**
    * If `true`, the fab button will be show a close icon.
    */
  /* CompleteClass */
  override var activated: scala.Boolean = js.native
  /**
    * If `true`, the user cannot interact with the fab button.
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
    * If `true`, the fab button will show when in a fab-list.
    */
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /**
    * If `true`, the fab button will be translucent. Only applies to `ios` mode on devices that support [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  /* CompleteClass */
  override var translucent: scala.Boolean = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button = js.native
  var z: atAngularCoreLib.atAngularCoreMod.NgZone = js.native
}

