package typings.grommet

import typings.grommet.anon.Bottom
import typings.grommet.anon.EnterSelect
import typings.grommet.anon.LabelValue
import typings.grommet.anon.Suggestion
import typings.grommet.dropMod.DropProps
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.onSelect
import typings.grommet.grommetStrings.placeholder
import typings.grommet.grommetStrings.size
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.Omit
import typings.grommet.utilsMod.PlaceHolderType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textInputMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/TextInput", "TextInput")
  @js.native
  class TextInput protected ()
    extends Component[
          TextInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: TextInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ])) = this()
    def this(
      props: TextInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/TextInput", "TextInput")
  @js.native
  val TextInput: ComponentClass[
    TextInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ]), 
    ComponentState
  ] = js.native
  
  @js.native
  trait TextInputProps extends StObject {
    
    var dropAlign: js.UndefOr[Bottom] = js.native
    
    var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
    
    var dropProps: js.UndefOr[DropProps] = js.native
    
    var dropTarget: js.UndefOr[js.Object] = js.native
    
    var focusIndicator: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[Element] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var messages: js.UndefOr[EnterSelect] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* x */ Suggestion, Unit]] = js.native
    
    var onSuggestionsClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSuggestionsOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var placeholder: js.UndefOr[PlaceHolderType] = js.native
    
    var plain: js.UndefOr[Boolean | full] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
    
    var suggestions: js.UndefOr[js.Array[LabelValue | String]] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object TextInputProps {
    
    @scala.inline
    def apply(): TextInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputProps]
    }
    
    @scala.inline
    implicit class TextInputPropsMutableBuilder[Self <: TextInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropAlign(value: Bottom): Self = StObject.set(x, "dropAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropAlignUndefined: Self = StObject.set(x, "dropAlign", js.undefined)
      
      @scala.inline
      def setDropHeight(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
      
      @scala.inline
      def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      @scala.inline
      def setDropTarget(value: js.Object): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      @scala.inline
      def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      @scala.inline
      def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMessages(value: EnterSelect): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* x */ Suggestion => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnSuggestionsClose(value: () => Unit): Self = StObject.set(x, "onSuggestionsClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuggestionsCloseUndefined: Self = StObject.set(x, "onSuggestionsClose", js.undefined)
      
      @scala.inline
      def setOnSuggestionsOpen(value: () => Unit): Self = StObject.set(x, "onSuggestionsOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuggestionsOpenUndefined: Self = StObject.set(x, "onSuggestionsOpen", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: PlaceHolderType): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean | full): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
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
      def setSuggestions(value: js.Array[LabelValue | String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      @scala.inline
      def setSuggestionsVarargs(value: (LabelValue | String)*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
