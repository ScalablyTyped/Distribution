package typings.grommet

import typings.grommet.anon.Bottom
import typings.grommet.anon.Key
import typings.grommet.anon.Multiple
import typings.grommet.anon.Position
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
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("grommet/components/Select", "Select")
  @js.native
  val Select: FC[SelectExtendedProps] = js.native
  
  trait BasicSelectProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var children: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var disabled: js.UndefOr[Boolean | (js.Array[Double | String | js.Object])] = js.undefined
    
    var disabledKey: js.UndefOr[String | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var dropAlign: js.UndefOr[Bottom] = js.undefined
    
    var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
    
    var dropProps: js.UndefOr[DropProps] = js.undefined
    
    var dropTarget: js.UndefOr[js.Object] = js.undefined
    
    var emptySearchMessage: js.UndefOr[String | ReactNode] = js.undefined
    
    var focusIndicator: js.UndefOr[Boolean] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var icon: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactNode | FC[js.Object]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var labelKey: js.UndefOr[String | (js.Function1[/* repeated */ Any, String | ReactNode])] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var messages: js.UndefOr[Multiple] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onMore: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var options: js.Array[String | Boolean | Double | Element | js.Object]
    
    var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var searchPlaceholder: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
    
    var valueKey: js.UndefOr[String | Key | (js.Function1[/* repeated */ Any, String])] = js.undefined
    
    var valueLabel: js.UndefOr[ReactNode | (js.Function1[/* repeated */ Any, String | ReactNode])] = js.undefined
  }
  object BasicSelectProps {
    
    inline def apply(options: js.Array[String | Boolean | Double | Element | js.Object]): BasicSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicSelectProps]
    }
    
    extension [Self <: BasicSelectProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setChildren(value: /* repeated */ Any => Any): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean | (js.Array[Double | String | js.Object])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledKey(value: String | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "disabledKey", value.asInstanceOf[js.Any])
      
      inline def setDisabledKeyFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "disabledKey", js.Any.fromFunction1(value))
      
      inline def setDisabledKeyUndefined: Self = StObject.set(x, "disabledKey", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: (Double | String | js.Object)*): Self = StObject.set(x, "disabled", js.Array(value*))
      
      inline def setDropAlign(value: Bottom): Self = StObject.set(x, "dropAlign", value.asInstanceOf[js.Any])
      
      inline def setDropAlignUndefined: Self = StObject.set(x, "dropAlign", js.undefined)
      
      inline def setDropHeight(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
      
      inline def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
      
      inline def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      inline def setDropTarget(value: js.Object): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      inline def setEmptySearchMessage(value: String | ReactNode): Self = StObject.set(x, "emptySearchMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptySearchMessageUndefined: Self = StObject.set(x, "emptySearchMessage", js.undefined)
      
      inline def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      inline def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setIcon(value: Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactNode | FC[js.Object]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabelKey(value: String | (js.Function1[/* repeated */ Any, String | ReactNode])): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      inline def setLabelKeyFunction1(value: /* repeated */ Any => String | ReactNode): Self = StObject.set(x, "labelKey", js.Any.fromFunction1(value))
      
      inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMessages(value: Multiple): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMore(value: /* repeated */ Any => Any): Self = StObject.set(x, "onMore", js.Any.fromFunction1(value))
      
      inline def setOnMoreUndefined: Self = StObject.set(x, "onMore", js.undefined)
      
      inline def setOnOpen(value: /* repeated */ Any => Any): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnSearch(value: /* search */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptions(value: js.Array[String | Boolean | Double | Element | js.Object]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: (String | Boolean | Double | Element | js.Object)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: PlaceHolderType): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      inline def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValueKey(value: String | Key | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      inline def setValueKeyFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "valueKey", js.Any.fromFunction1(value))
      
      inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
      
      inline def setValueLabel(value: ReactNode | (js.Function1[/* repeated */ Any, String | ReactNode])): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
      
      inline def setValueLabelFunction1(value: /* repeated */ Any => String | ReactNode): Self = StObject.set(x, "valueLabel", js.Any.fromFunction1(value))
      
      inline def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'clear' | 'closeOnChange' | 'defaultValue' | 'multiple' | 'selected' | 'value'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait SelectExtendedProps
    extends StObject
       with SelectProps
  object SelectExtendedProps {
    
    inline def apply(options: js.Array[String | Boolean | Double | Element | js.Object]): SelectExtendedProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectExtendedProps]
    }
  }
  
  trait SelectProps
    extends StObject
       with BasicSelectProps {
    
    var clear: js.UndefOr[Boolean | Position] = js.undefined
    
    var closeOnChange: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Object | (js.Array[String | Double | js.Object])] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var value: js.UndefOr[String | Element | js.Object | (js.Array[String | Double | js.Object])] = js.undefined
  }
  object SelectProps {
    
    inline def apply(options: js.Array[String | Boolean | Double | Element | js.Object]): SelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
    
    extension [Self <: SelectProps](x: Self) {
      
      inline def setClear(value: Boolean | Position): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setCloseOnChange(value: Boolean): Self = StObject.set(x, "closeOnChange", value.asInstanceOf[js.Any])
      
      inline def setCloseOnChangeUndefined: Self = StObject.set(x, "closeOnChange", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Object | (js.Array[String | Double | js.Object])): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (String | Double | js.Object)*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setSelected(value: Double | js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setValue(value: String | Element | js.Object | (js.Array[String | Double | js.Object])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | Double | js.Object)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
