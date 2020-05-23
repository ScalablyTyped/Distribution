package typings.materialTextfield

import typings.materialTextfield.adapterMod.FoundationMapType
import typings.materialTextfield.adapterMod.MDCTextFieldAdapter
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCTextFieldFoundation
    extends typings.materialBase.foundationMod.default[MDCTextFieldAdapter] {
    val shouldFloat: Boolean = js.native
    val shouldShake: Boolean = js.native
    /**
      * Activates the text field focus state.
      */
    def activateFocus(): Unit = js.native
    /**
      * Activates the Text Field's focus state in cases when the input value
      * changes without user input (e.g. programatically).
      */
    def autoCompleteFocus(): Unit = js.native
    def deactivateFocus(): Unit = js.native
    def getValue(): String = js.native
    /**
      * Handles user interactions with the Text Field.
      */
    def handleTextFieldInteraction(): Unit = js.native
    def isDisabled(): Boolean = js.native
    def isValid(): Boolean = js.native
    /**
      * Opens/closes the notched outline.
      */
    def notchOutline(openNotch: Boolean): Unit = js.native
    def setDisabled(disabled: Boolean): Unit = js.native
    def setHelperTextContent(content: String): Unit = js.native
    /**
      * Sets the line ripple's transform origin, so that the line ripple activate
      * animation will animate out from the user's click location.
      */
    def setTransformOrigin(evt: Event): Unit = js.native
    def setUseNativeValidation(useNativeValidation: Boolean): Unit = js.native
    def setValid(isValid: Boolean): Unit = js.native
    def setValue(value: String): Unit = js.native
  }
  
  @js.native
  class default protected () extends MDCTextFieldFoundation {
    def this(adapter: MDCTextFieldAdapter) = this()
    def this(adapter: MDCTextFieldAdapter, foundationMap: FoundationMapType) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialTextfield.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldAdapter = js.native
    val numbers: typings.materialTextfield.constantsMod.numbers = js.native
    val strings: typings.materialTextfield.constantsMod.strings = js.native
  }
  
}

