package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonCard")
@js.native
class IonCard protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonCard {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * If `true`, a button tag will be rendered and the card will be tappable.
    */
  /* CompleteClass */
  override var button: scala.Boolean = js.native
  /**
    * If `true`, the user cannot interact with the card.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  /* CompleteClass */
  override var routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any = js.native
  /**
    * The type of the button. Only used when an `onclick` or `button` property is present.
    */
  /* CompleteClass */
  override var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button = js.native
}

