package typings.materialFloatingLabel

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialFloatingLabel.adapterMod.MDCFloatingLabelAdapter
import typings.materialFloatingLabel.anon.LABELFLOATABOVE
import typings.materialFloatingLabel.anon.PartialMDCFloatingLabelAd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/floating-label/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCFloatingLabelFoundation () extends MDCFoundation[MDCFloatingLabelAdapter] {
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
  }
  /* static members */
  @js.native
  object MDCFloatingLabelFoundation extends js.Object {
    
    def cssClasses: LABELFLOATABOVE = js.native
    
    /**
      * See {@link MDCFloatingLabelAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCFloatingLabelAdapter = js.native
  }
  
  @js.native
  class default () extends MDCFloatingLabelFoundation {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: LABELFLOATABOVE = js.native
    
    /**
      * See {@link MDCFloatingLabelAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCFloatingLabelAdapter = js.native
  }
}
