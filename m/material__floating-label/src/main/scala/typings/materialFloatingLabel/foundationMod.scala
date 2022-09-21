package typings.materialFloatingLabel

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialFloatingLabel.adapterMod.MDCFloatingLabelAdapter
import typings.materialFloatingLabel.anon.PartialMDCFloatingLabelAd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/floating-label/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCFloatingLabelFoundation {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
  }
  
  @JSImport("@material/floating-label/foundation", "MDCFloatingLabelFoundation")
  @js.native
  open class MDCFloatingLabelFoundation () extends MDCFoundation[MDCFloatingLabelAdapter] {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
    
    /**
      * Styles the label to float or dock.
      * @param shouldFloat If true, adds the float CSS class; otherwise, removes float and shake classes to dock the label.
      */
    def float(shouldFloat: Boolean): Unit = js.native
    
    /**
      * Returns the width of the label element.
      */
    def getWidth(): Double = js.native
    
    /* private */ var handleShakeAnimationEnd: Any = js.native
    
    /**
      * Styles the label as required.
      * @param isRequired If true, adds an asterisk to the label, indicating that it is required.
      */
    def setRequired(isRequired: Boolean): Unit = js.native
    
    /**
      * Styles the label to produce a shake animation to indicate an error.
      * @param shouldShake If true, adds the shake CSS class; otherwise, removes shake class.
      */
    def shake(shouldShake: Boolean): Unit = js.native
    
    /* private */ val shakeAnimationEndHandler: Any = js.native
  }
}
