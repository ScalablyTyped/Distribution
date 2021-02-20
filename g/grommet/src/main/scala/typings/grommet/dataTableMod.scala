package typings.grommet

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.anon.Aggregate
import typings.grommet.anon.Background
import typings.grommet.anon.Direction
import typings.grommet.anon.DirectionProperty
import typings.grommet.anon.Error
import typings.grommet.anon.Expand
import typings.grommet.grommetStrings.avg
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.footer
import typings.grommet.grommetStrings.header
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.max
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.middle
import typings.grommet.grommetStrings.min
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.sum
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import typings.react.mod.AbstractView
import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.NativeKeyboardEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TableHTMLAttributes
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLTableElement
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod {
  
  @JSImport("grommet/components/DataTable", "DataTable")
  @js.native
  class DataTable[TRowType] protected ()
    extends Component[
          DataTableProps[TRowType] with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: DataTableProps[TRowType] with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(
      props: DataTableProps[TRowType] with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]),
      context: js.Any
    ) = this()
  }
  
  @js.native
  trait ColumnConfig[TRowType] extends StObject {
    
    var aggregate: js.UndefOr[avg | max | min | sum] = js.native
    
    var align: js.UndefOr[center | start | end] = js.native
    
    var footer: js.UndefOr[ReactNode | Aggregate] = js.native
    
    var header: js.UndefOr[String | ReactNode | Aggregate] = js.native
    
    var pin: js.UndefOr[Boolean] = js.native
    
    var primary: js.UndefOr[Boolean] = js.native
    
    var property: String = js.native
    
    var render: js.UndefOr[js.Function1[/* datum */ TRowType, ReactNode]] = js.native
    
    var search: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[ColumnSizeType | String] = js.native
    
    var sortable: js.UndefOr[Boolean] = js.native
    
    var verticalAlign: js.UndefOr[middle | top | bottom] = js.native
  }
  object ColumnConfig {
    
    @scala.inline
    def apply[TRowType](property: String): ColumnConfig[TRowType] = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnConfig[TRowType]]
    }
    
    @scala.inline
    implicit class ColumnConfigMutableBuilder[Self <: ColumnConfig[_], TRowType] (val x: Self with ColumnConfig[TRowType]) extends AnyVal {
      
      @scala.inline
      def setAggregate(value: avg | max | min | sum): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
      
      @scala.inline
      def setAlign(value: center | start | end): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactNode | Aggregate): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: String | ReactNode | Aggregate): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: /* datum */ TRowType => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setSize(value: ColumnSizeType | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: middle | top | bottom): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - typings.grommet.grommetStrings.`1Slash2`
    - typings.grommet.grommetStrings.`1Slash4`
    - typings.grommet.grommetStrings.`2Slash4`
    - typings.grommet.grommetStrings.`3Slash4`
    - typings.grommet.grommetStrings.`1Slash3`
    - typings.grommet.grommetStrings.`2Slash3`
  */
  trait ColumnSizeType extends StObject
  object ColumnSizeType {
    
    @scala.inline
    def `1Slash2`: typings.grommet.grommetStrings.`1Slash2` = "1/2".asInstanceOf[typings.grommet.grommetStrings.`1Slash2`]
    
    @scala.inline
    def `1Slash3`: typings.grommet.grommetStrings.`1Slash3` = "1/3".asInstanceOf[typings.grommet.grommetStrings.`1Slash3`]
    
    @scala.inline
    def `1Slash4`: typings.grommet.grommetStrings.`1Slash4` = "1/4".asInstanceOf[typings.grommet.grommetStrings.`1Slash4`]
    
    @scala.inline
    def `2Slash3`: typings.grommet.grommetStrings.`2Slash3` = "2/3".asInstanceOf[typings.grommet.grommetStrings.`2Slash3`]
    
    @scala.inline
    def `2Slash4`: typings.grommet.grommetStrings.`2Slash4` = "2/4".asInstanceOf[typings.grommet.grommetStrings.`2Slash4`]
    
    @scala.inline
    def `3Slash4`: typings.grommet.grommetStrings.`3Slash4` = "3/4".asInstanceOf[typings.grommet.grommetStrings.`3Slash4`]
    
    @scala.inline
    def large: typings.grommet.grommetStrings.large = "large".asInstanceOf[typings.grommet.grommetStrings.large]
    
    @scala.inline
    def medium: typings.grommet.grommetStrings.medium = "medium".asInstanceOf[typings.grommet.grommetStrings.medium]
    
    @scala.inline
    def small: typings.grommet.grommetStrings.small = "small".asInstanceOf[typings.grommet.grommetStrings.small]
    
    @scala.inline
    def xlarge: typings.grommet.grommetStrings.xlarge = "xlarge".asInstanceOf[typings.grommet.grommetStrings.xlarge]
  }
  
  @js.native
  trait DataTableProps[TRowType] extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    // Appearance
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var background: js.UndefOr[
        BackgroundType | (Sections[
          BackgroundType | js.Array[String], 
          BackgroundType, 
          BackgroundType, 
          BackgroundType | js.Array[String]
        ])
      ] = js.native
    
    var border: js.UndefOr[BorderType | (Sections[BorderType, BorderType, BorderType, BorderType])] = js.native
    
    var columns: js.UndefOr[js.Array[ColumnConfig[TRowType]]] = js.native
    
    // Data
    var data: js.UndefOr[js.Array[TRowType]] = js.native
    
    var fill: js.UndefOr[Boolean | vertical | horizontal] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var groupBy: js.UndefOr[String | Expand] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    // Events
    var onClickRow: js.UndefOr[js.Function1[/* event */ MouseClick[TRowType] | KeyPress[TRowType], Unit]] = js.native
    
    var onMore: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* select */ js.Array[String | Double], Unit]] = js.native
    
    var onSort: js.UndefOr[js.Function1[/* sort */ DirectionProperty, Unit]] = js.native
    
    var pad: js.UndefOr[PadType | (Sections[PadType, PadType, PadType, PadType])] = js.native
    
    var pin: js.UndefOr[Boolean | header | footer] = js.native
    
    var primaryKey: js.UndefOr[String | Boolean] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var resizeable: js.UndefOr[Boolean] = js.native
    
    var rowProps: js.UndefOr[StringDictionary[Background]] = js.native
    
    var select: js.UndefOr[js.Array[String | Double]] = js.native
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
    
    var sort: js.UndefOr[Direction] = js.native
    
    var sortable: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object DataTableProps {
    
    @scala.inline
    def apply[TRowType](): DataTableProps[TRowType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableProps[TRowType]]
    }
    
    @scala.inline
    implicit class DataTablePropsMutableBuilder[Self <: DataTableProps[_], TRowType] (val x: Self with DataTableProps[TRowType]) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setBackground(
        value: BackgroundType | (Sections[
              BackgroundType | js.Array[String], 
              BackgroundType, 
              BackgroundType, 
              BackgroundType | js.Array[String]
            ])
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorder(value: BorderType | (Sections[BorderType, BorderType, BorderType, BorderType])): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderVarargs(value: Error*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setColumns(value: js.Array[ColumnConfig[TRowType]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnConfig[TRowType]*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[TRowType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: TRowType*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: Boolean | vertical | horizontal): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setGroupBy(value: String | Expand): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnClickRow(value: /* event */ MouseClick[TRowType] | KeyPress[TRowType] => Unit): Self = StObject.set(x, "onClickRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickRowUndefined: Self = StObject.set(x, "onClickRow", js.undefined)
      
      @scala.inline
      def setOnMore(value: () => Unit): Self = StObject.set(x, "onMore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMoreUndefined: Self = StObject.set(x, "onMore", js.undefined)
      
      @scala.inline
      def setOnSearch(value: /* search */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* select */ js.Array[String | Double] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnSort(value: /* sort */ DirectionProperty => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      @scala.inline
      def setPad(value: PadType | (Sections[PadType, PadType, PadType, PadType])): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setPin(value: Boolean | header | footer): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      @scala.inline
      def setPrimaryKey(value: String | Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setResizeable(value: Boolean): Self = StObject.set(x, "resizeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeableUndefined: Self = StObject.set(x, "resizeable", js.undefined)
      
      @scala.inline
      def setRowProps(value: StringDictionary[Background]): Self = StObject.set(x, "rowProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowPropsUndefined: Self = StObject.set(x, "rowProps", js.undefined)
      
      @scala.inline
      def setSelect(value: js.Array[String | Double]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSelectVarargs(value: (String | Double)*): Self = StObject.set(x, "select", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSort(value: Direction): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  /* Inlined react.react.KeyboardEvent<std.Element> & {  datum :TRowType} */
  @js.native
  trait KeyPress[TRowType] extends StObject {
    
    var altKey: Boolean = js.native
    
    var bubbles: Boolean = js.native
    
    var cancelable: Boolean = js.native
    
    /** @deprecated */
    var charCode: Double = js.native
    
    var code: String = js.native
    
    var ctrlKey: Boolean = js.native
    
    var currentTarget: EventTarget with Element = js.native
    
    var datum: TRowType = js.native
    
    var defaultPrevented: Boolean = js.native
    
    var eventPhase: Double = js.native
    
    /**
      * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
      */
    def getModifierState(key: String): Boolean = js.native
    
    def isDefaultPrevented(): Boolean = js.native
    
    def isPropagationStopped(): Boolean = js.native
    
    var isTrusted: Boolean = js.native
    
    /**
      * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
      */
    var key: String = js.native
    
    /** @deprecated */
    var keyCode: Double = js.native
    
    var locale: String = js.native
    
    var location: Double = js.native
    
    var metaKey: Boolean = js.native
    
    var nativeEvent: NativeKeyboardEvent = js.native
    
    def persist(): Unit = js.native
    
    def preventDefault(): Unit = js.native
    
    var repeat: Boolean = js.native
    
    var shiftKey: Boolean = js.native
    
    def stopPropagation(): Unit = js.native
    
    var target: EventTarget = js.native
    
    var timeStamp: Double = js.native
    
    var `type`: String = js.native
    
    /** @deprecated */
    var which: Double = js.native
  }
  object KeyPress {
    
    @scala.inline
    def apply[TRowType](
      altKey: Boolean,
      bubbles: Boolean,
      cancelable: Boolean,
      charCode: Double,
      code: String,
      ctrlKey: Boolean,
      currentTarget: EventTarget with Element,
      datum: TRowType,
      defaultPrevented: Boolean,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      key: String,
      keyCode: Double,
      locale: String,
      location: Double,
      metaKey: Boolean,
      nativeEvent: NativeKeyboardEvent,
      persist: () => Unit,
      preventDefault: () => Unit,
      repeat: Boolean,
      shiftKey: Boolean,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      which: Double
    ): KeyPress[TRowType] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPress[TRowType]]
    }
    
    @scala.inline
    implicit class KeyPressMutableBuilder[Self <: KeyPress[_], TRowType] (val x: Self with KeyPress[TRowType]) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTarget(value: EventTarget with Element): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: TRowType): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetModifierState(value: String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeEvent(value: NativeKeyboardEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.MouseEvent<std.HTMLTableRowElement, react.react.NativeMouseEvent> & {  datum :TRowType,   index :number} */
  @js.native
  trait MouseClick[TRowType] extends StObject {
    
    var altKey: Boolean = js.native
    
    var bubbles: Boolean = js.native
    
    var button: Double = js.native
    
    var buttons: Double = js.native
    
    var cancelable: Boolean = js.native
    
    var clientX: Double = js.native
    
    var clientY: Double = js.native
    
    var ctrlKey: Boolean = js.native
    
    var currentTarget: EventTarget with HTMLTableRowElement = js.native
    
    var datum: TRowType = js.native
    
    var defaultPrevented: Boolean = js.native
    
    var detail: Double = js.native
    
    var eventPhase: Double = js.native
    
    /**
      * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
      */
    def getModifierState(key: String): Boolean = js.native
    
    var index: Double = js.native
    
    def isDefaultPrevented(): Boolean = js.native
    
    def isPropagationStopped(): Boolean = js.native
    
    var isTrusted: Boolean = js.native
    
    var metaKey: Boolean = js.native
    
    var movementX: Double = js.native
    
    var movementY: Double = js.native
    
    var nativeEvent: NativeMouseEvent = js.native
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
    
    def persist(): Unit = js.native
    
    def preventDefault(): Unit = js.native
    
    var relatedTarget: EventTarget | Null = js.native
    
    var screenX: Double = js.native
    
    var screenY: Double = js.native
    
    var shiftKey: Boolean = js.native
    
    def stopPropagation(): Unit = js.native
    
    var target: EventTarget = js.native
    
    var timeStamp: Double = js.native
    
    var `type`: String = js.native
    
    var view: AbstractView = js.native
  }
  object MouseClick {
    
    @scala.inline
    def apply[TRowType](
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget with HTMLTableRowElement,
      datum: TRowType,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      index: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      preventDefault: () => Unit,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      view: AbstractView
    ): MouseClick[TRowType] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), index = index.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MouseClick[TRowType]]
    }
    
    @scala.inline
    implicit class MouseClickMutableBuilder[Self <: MouseClick[_], TRowType] (val x: Self with MouseClick[TRowType]) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTarget(value: EventTarget with HTMLTableRowElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: TRowType): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetModifierState(value: String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeEvent(value: NativeMouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
      
      @scala.inline
      def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Sections[TBody, THeader, TFooter, TPinned] extends StObject {
    
    var body: js.UndefOr[TBody] = js.native
    
    var footer: js.UndefOr[TFooter] = js.native
    
    var header: js.UndefOr[THeader] = js.native
    
    var pinned: js.UndefOr[TPinned] = js.native
  }
  object Sections {
    
    @scala.inline
    def apply[TBody, THeader, TFooter, TPinned](): Sections[TBody, THeader, TFooter, TPinned] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sections[TBody, THeader, TFooter, TPinned]]
    }
    
    @scala.inline
    implicit class SectionsMutableBuilder[Self <: Sections[_, _, _, _], TBody, THeader, TFooter, TPinned] (val x: Self with (Sections[TBody, THeader, TFooter, TPinned])) extends AnyVal {
      
      @scala.inline
      def setBody(value: TBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setFooter(value: TFooter): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: THeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setPinned(value: TPinned): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    }
  }
}
