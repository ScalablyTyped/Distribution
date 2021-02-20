package typings.grommet

import typings.grommet.anon.Fixed
import typings.grommet.grommetStrings.icon
import typings.grommet.grommetStrings.id
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.mask
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.name
import typings.grommet.grommetStrings.onBlur
import typings.grommet.grommetStrings.plain
import typings.grommet.grommetStrings.reverse
import typings.grommet.grommetStrings.size
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.value
import typings.grommet.grommetStrings.xlarge
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FocusEvent
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maskedInputMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/MaskedInput", "MaskedInput")
  @js.native
  class MaskedInput protected ()
    extends Component[
          MaskedInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: MaskedInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ])) = this()
    def this(
      props: MaskedInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/MaskedInput", "MaskedInput")
  @js.native
  val MaskedInput: ComponentClass[
    MaskedInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      icon | id | mask | name | onBlur | plain | reverse | size | value
    ]), 
    ComponentState
  ] = js.native
  
  @js.native
  trait MaskedInputProps extends StObject {
    
    var icon: js.UndefOr[Element] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var mask: js.UndefOr[js.Array[Fixed]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[typings.std.Element], _]] = js.native
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object MaskedInputProps {
    
    @scala.inline
    def apply(): MaskedInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskedInputProps]
    }
    
    @scala.inline
    implicit class MaskedInputPropsMutableBuilder[Self <: MaskedInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMask(value: js.Array[Fixed]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskVarargs(value: Fixed*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ FocusEvent[typings.std.Element] => _): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type MaskedInputType = MaskedInputProps with (Omit[
    DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
    icon | id | mask | name | onBlur | plain | reverse | size | value
  ])
}
