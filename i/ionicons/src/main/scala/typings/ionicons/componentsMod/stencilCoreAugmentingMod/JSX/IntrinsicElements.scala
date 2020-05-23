package typings.ionicons.componentsMod.stencilCoreAugmentingMod.JSX

import typings.ionicons.componentsMod.LocalJSX.IonIcon
import typings.ionicons.componentsMod.global.HTMLIonIconElement
import typings.ionicons.stencilCoreMod.JSXBase.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrinsicElements extends js.Object {
  var `ion-icon`: IonIcon with HTMLAttributes[HTMLIonIconElement]
}

object IntrinsicElements {
  @scala.inline
  def apply(`ion-icon`: IonIcon with HTMLAttributes[HTMLIonIconElement]): IntrinsicElements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ion-icon")(`ion-icon`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicElements]
  }
}

