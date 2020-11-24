package typings.ionicons.componentsMod.stencilCoreAugmentingMod.JSX

import typings.ionicons.componentsMod.LocalJSX.IonIcon
import typings.ionicons.componentsMod.global.HTMLIonIconElement
import typings.ionicons.stencilPublicRuntimeMod.JSXBase.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrinsicElements extends js.Object {
  
  var `ion-icon`: IonIcon with HTMLAttributes[HTMLIonIconElement] = js.native
}
object IntrinsicElements {
  
  @scala.inline
  def apply(`ion-icon`: IonIcon with HTMLAttributes[HTMLIonIconElement]): IntrinsicElements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ion-icon")(`ion-icon`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicElements]
  }
  
  @scala.inline
  implicit class IntrinsicElementsOps[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setIon-icon`(value: IonIcon with HTMLAttributes[HTMLIonIconElement]): Self = this.set("ion-icon", value.asInstanceOf[js.Any])
  }
}
