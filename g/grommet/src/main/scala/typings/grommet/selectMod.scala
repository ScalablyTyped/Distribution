package typings.grommet

import typings.grommet.anon.Bottom
import typings.grommet.anon.Key
import typings.grommet.anon.Multiple
import typings.grommet.dropMod.DropProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PlaceHolderType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Select", "Select")
  @js.native
  class Select protected ()
    extends Component[SelectProps, ComponentState, js.Any] {
    def this(props: SelectProps) = this()
    def this(props: SelectProps, context: js.Any) = this()
  }
  @JSImport("grommet/components/Select", "Select")
  @js.native
  val Select: ComponentClass[SelectProps, ComponentState] = js.native
  
  @js.native
  trait SelectProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var closeOnChange: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean | (js.Array[Double | String | js.Object])] = js.native
    
    var disabledKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.native
    
    var dropAlign: js.UndefOr[Bottom] = js.native
    
    var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
    
    var dropProps: js.UndefOr[DropProps] = js.native
    
    var dropTarget: js.UndefOr[js.Object] = js.native
    
    var emptySearchMessage: js.UndefOr[String] = js.native
    
    var focusIndicator: js.UndefOr[Boolean] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var icon: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, _]) | ReactNode] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var labelKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var messages: js.UndefOr[Multiple] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var options: js.Array[String | Boolean | Double | Element | js.Object] = js.native
    
    var placeholder: js.UndefOr[PlaceHolderType] = js.native
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var searchPlaceholder: js.UndefOr[String] = js.native
    
    var selected: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
    
    var value: js.UndefOr[String | Element | js.Object | (js.Array[String | Double | js.Object])] = js.native
    
    var valueKey: js.UndefOr[String | Key | (js.Function1[/* repeated */ js.Any, _])] = js.native
    
    var valueLabel: js.UndefOr[ReactNode] = js.native
  }
  object SelectProps {
    
    @scala.inline
    def apply(options: js.Array[String | Boolean | Double | Element | js.Object]): SelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
    
    @scala.inline
    implicit class SelectPropsMutableBuilder[Self <: SelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setChildren(value: /* repeated */ js.Any => _): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCloseOnChange(value: Boolean): Self = StObject.set(x, "closeOnChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnChangeUndefined: Self = StObject.set(x, "closeOnChange", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean | (js.Array[Double | String | js.Object])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledKey(value: String | (js.Function1[/* repeated */ js.Any, _])): Self = StObject.set(x, "disabledKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledKeyFunction1(value: /* repeated */ js.Any => _): Self = StObject.set(x, "disabledKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledKeyUndefined: Self = StObject.set(x, "disabledKey", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisabledVarargs(value: (Double | String | js.Object)*): Self = StObject.set(x, "disabled", js.Array(value :_*))
      
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
      def setEmptySearchMessage(value: String): Self = StObject.set(x, "emptySearchMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptySearchMessageUndefined: Self = StObject.set(x, "emptySearchMessage", js.undefined)
      
      @scala.inline
      def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setIcon(value: Boolean | (js.Function1[/* repeated */ js.Any, _]) | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* repeated */ js.Any => _): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabelKey(value: String | (js.Function1[/* repeated */ js.Any, _])): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelKeyFunction1(value: /* repeated */ js.Any => _): Self = StObject.set(x, "labelKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMessages(value: Multiple): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnMore(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onMore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoreUndefined: Self = StObject.set(x, "onMore", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnSearch(value: /* search */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[String | Boolean | Double | Element | js.Object]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: (String | Boolean | Double | Element | js.Object)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: PlaceHolderType): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      @scala.inline
      def setSelected(value: Double | js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: String | Element | js.Object | (js.Array[String | Double | js.Object])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueKey(value: String | Key | (js.Function1[/* repeated */ js.Any, _])): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueKeyFunction1(value: /* repeated */ js.Any => _): Self = StObject.set(x, "valueKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
      
      @scala.inline
      def setValueLabel(value: ReactNode): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | Double | js.Object)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
