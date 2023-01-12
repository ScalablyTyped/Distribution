package typings.grommet

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.anon.Aggregate
import typings.grommet.anon.Body
import typings.grommet.anon.Border
import typings.grommet.anon.ColorError
import typings.grommet.anon.Count
import typings.grommet.anon.Direction
import typings.grommet.anon.DirectionProperty
import typings.grommet.anon.Expand
import typings.grommet.anon.Page
import typings.grommet.componentsPaginationMod.PaginationType
import typings.grommet.grommetStrings.avg
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.footer
import typings.grommet.grommetStrings.header
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.max
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.min
import typings.grommet.grommetStrings.select
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.sum
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
import typings.react.mod.KeyboardEvent
import typings.react.mod.ModifierKey
import typings.react.mod.MouseEvent
import typings.react.mod.NativeKeyboardEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDataTableMod {
  
  @JSImport("grommet/components/DataTable", "DataTable")
  @js.native
  open class DataTable[TRowType] protected ()
    extends Component[DataTableExtendedProps[TRowType], js.Object, Any] {
    def this(props: DataTableExtendedProps[TRowType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DataTableExtendedProps[TRowType], context: Any) = this()
  }
  
  trait ColumnConfig[TRowType] extends StObject {
    
    var aggregate: js.UndefOr[avg | max | min | sum] = js.undefined
    
    var align: js.UndefOr[center | start | end] = js.undefined
    
    var footer: js.UndefOr[ReactNode | Aggregate] = js.undefined
    
    var header: js.UndefOr[String | ReactNode | Aggregate] = js.undefined
    
    var pin: js.UndefOr[Boolean] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var primary: js.UndefOr[Boolean] = js.undefined
    
    var property: String
    
    var render: js.UndefOr[js.Function1[/* datum */ TRowType, ReactNode]] = js.undefined
    
    var search: js.UndefOr[Boolean] = js.undefined
    
    var show: js.UndefOr[Double | Page] = js.undefined
    
    var size: js.UndefOr[ColumnSizeType | String] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var units: js.UndefOr[String] = js.undefined
    
    var verticalAlign: js.UndefOr[VerticalAlignType] = js.undefined
  }
  object ColumnConfig {
    
    inline def apply[TRowType](property: String): ColumnConfig[TRowType] = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnConfig[TRowType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnConfig[?], TRowType] (val x: Self & ColumnConfig[TRowType]) extends AnyVal {
      
      inline def setAggregate(value: avg | max | min | sum): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
      
      inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
      
      inline def setAlign(value: center | start | end): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setFooter(value: ReactNode | Aggregate): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: String | ReactNode | Aggregate): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* datum */ TRowType => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setShow(value: Double | Page): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSize(value: ColumnSizeType | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setVerticalAlign(value: VerticalAlignType): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
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
    
    inline def `1Slash2`: typings.grommet.grommetStrings.`1Slash2` = "1/2".asInstanceOf[typings.grommet.grommetStrings.`1Slash2`]
    
    inline def `1Slash3`: typings.grommet.grommetStrings.`1Slash3` = "1/3".asInstanceOf[typings.grommet.grommetStrings.`1Slash3`]
    
    inline def `1Slash4`: typings.grommet.grommetStrings.`1Slash4` = "1/4".asInstanceOf[typings.grommet.grommetStrings.`1Slash4`]
    
    inline def `2Slash3`: typings.grommet.grommetStrings.`2Slash3` = "2/3".asInstanceOf[typings.grommet.grommetStrings.`2Slash3`]
    
    inline def `2Slash4`: typings.grommet.grommetStrings.`2Slash4` = "2/4".asInstanceOf[typings.grommet.grommetStrings.`2Slash4`]
    
    inline def `3Slash4`: typings.grommet.grommetStrings.`3Slash4` = "3/4".asInstanceOf[typings.grommet.grommetStrings.`3Slash4`]
    
    inline def large: typings.grommet.grommetStrings.large = "large".asInstanceOf[typings.grommet.grommetStrings.large]
    
    inline def medium: typings.grommet.grommetStrings.medium = "medium".asInstanceOf[typings.grommet.grommetStrings.medium]
    
    inline def small: typings.grommet.grommetStrings.small = "small".asInstanceOf[typings.grommet.grommetStrings.small]
    
    inline def xlarge: typings.grommet.grommetStrings.xlarge = "xlarge".asInstanceOf[typings.grommet.grommetStrings.xlarge]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.TableHTMLAttributes<std.HTMLTableElement>, std.HTMLTableElement>, 'onSelect' | 'placeholder' | 'border'> ]: react.react.DetailedHTMLProps<react.react.TableHTMLAttributes<std.HTMLTableElement>, std.HTMLTableElement>[P]} */ trait DataTableExtendedProps[TRowType]
    extends StObject
       with DataTableProps[TRowType]
  object DataTableExtendedProps {
    
    inline def apply[TRowType](): DataTableExtendedProps[TRowType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableExtendedProps[TRowType]]
    }
  }
  
  trait DataTableProps[TRowType] extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    // Appearance
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var background: js.UndefOr[
        BackgroundType | (Sections[
          BackgroundType | js.Array[String], 
          BackgroundType, 
          BackgroundType, 
          BackgroundType | js.Array[String]
        ])
      ] = js.undefined
    
    var border: js.UndefOr[BorderType | (Sections[BorderType, BorderType, BorderType, BorderType])] = js.undefined
    
    var columns: js.UndefOr[js.Array[ColumnConfig[TRowType]]] = js.undefined
    
    // Data
    var data: js.UndefOr[js.Array[TRowType]] = js.undefined
    
    var disabled: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var fill: js.UndefOr[Boolean | vertical | horizontal] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var groupBy: js.UndefOr[String | Expand[TRowType]] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    // Events
    var onClickRow: js.UndefOr[
        select | (js.Function1[/* event */ MouseClick[TRowType] | KeyPress[TRowType], Unit])
      ] = js.undefined
    
    var onMore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* select */ js.Array[String | Double], /* datum */ TRowType, Unit]] = js.undefined
    
    var onSort: js.UndefOr[js.Function1[/* sort */ DirectionProperty, Unit]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* datatableState */ Count, Unit]] = js.undefined
    
    var pad: js.UndefOr[PadType | (Sections[PadType, PadType, PadType, PadType])] = js.undefined
    
    var paginate: js.UndefOr[Boolean | PaginationType] = js.undefined
    
    var pin: js.UndefOr[Boolean | header | footer] = js.undefined
    
    var placeholder: js.UndefOr[String | ReactNode] = js.undefined
    
    var primaryKey: js.UndefOr[String | Boolean] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var resizeable: js.UndefOr[Boolean] = js.undefined
    
    var rowDetails: js.UndefOr[ReactNode] = js.undefined
    
    var rowProps: js.UndefOr[StringDictionary[Border]] = js.undefined
    
    var select: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
    
    var sort: js.UndefOr[Direction] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var verticalAlign: js.UndefOr[VerticalAlignType | Body] = js.undefined
  }
  object DataTableProps {
    
    inline def apply[TRowType](): DataTableProps[TRowType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableProps[TRowType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableProps[?], TRowType] (val x: Self & DataTableProps[TRowType]) extends AnyVal {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setBackground(
        value: BackgroundType | (Sections[
              BackgroundType | js.Array[String], 
              BackgroundType, 
              BackgroundType, 
              BackgroundType | js.Array[String]
            ])
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: BorderType | (Sections[BorderType, BorderType, BorderType, BorderType])): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: ColorError*): Self = StObject.set(x, "border", js.Array(value*))
      
      inline def setColumns(value: js.Array[ColumnConfig[TRowType]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ColumnConfig[TRowType]*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: js.Array[TRowType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: TRowType*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDisabled(value: js.Array[String | Double]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: (String | Double)*): Self = StObject.set(x, "disabled", js.Array(value*))
      
      inline def setFill(value: Boolean | vertical | horizontal): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGroupBy(value: String | Expand[TRowType]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnClickRow(value: select | (js.Function1[/* event */ MouseClick[TRowType] | KeyPress[TRowType], Unit])): Self = StObject.set(x, "onClickRow", value.asInstanceOf[js.Any])
      
      inline def setOnClickRowFunction1(value: /* event */ MouseClick[TRowType] | KeyPress[TRowType] => Unit): Self = StObject.set(x, "onClickRow", js.Any.fromFunction1(value))
      
      inline def setOnClickRowUndefined: Self = StObject.set(x, "onClickRow", js.undefined)
      
      inline def setOnMore(value: () => Unit): Self = StObject.set(x, "onMore", js.Any.fromFunction0(value))
      
      inline def setOnMoreUndefined: Self = StObject.set(x, "onMore", js.undefined)
      
      inline def setOnSearch(value: /* search */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSelect(value: (/* select */ js.Array[String | Double], /* datum */ TRowType) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSort(value: /* sort */ DirectionProperty => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOnUpdate(value: /* datatableState */ Count => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPad(value: PadType | (Sections[PadType, PadType, PadType, PadType])): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPaginate(value: Boolean | PaginationType): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
      
      inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
      
      inline def setPin(value: Boolean | header | footer): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      inline def setPlaceholder(value: String | ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrimaryKey(value: String | Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setResizeable(value: Boolean): Self = StObject.set(x, "resizeable", value.asInstanceOf[js.Any])
      
      inline def setResizeableUndefined: Self = StObject.set(x, "resizeable", js.undefined)
      
      inline def setRowDetails(value: ReactNode): Self = StObject.set(x, "rowDetails", value.asInstanceOf[js.Any])
      
      inline def setRowDetailsUndefined: Self = StObject.set(x, "rowDetails", js.undefined)
      
      inline def setRowProps(value: StringDictionary[Border]): Self = StObject.set(x, "rowProps", value.asInstanceOf[js.Any])
      
      inline def setRowPropsUndefined: Self = StObject.set(x, "rowProps", js.undefined)
      
      inline def setSelect(value: js.Array[String | Double]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectVarargs(value: (String | Double)*): Self = StObject.set(x, "select", js.Array(value*))
      
      inline def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSort(value: Direction): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setVerticalAlign(value: VerticalAlignType | Body): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  trait KeyPress[TRowType]
    extends StObject
       with KeyboardEvent[Element] {
    
    var datum: TRowType
  }
  object KeyPress {
    
    inline def apply[TRowType](
      altKey: Boolean,
      bubbles: Boolean,
      cancelable: Boolean,
      charCode: Double,
      code: String,
      ctrlKey: Boolean,
      currentTarget: EventTarget & Element,
      datum: TRowType,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: ModifierKey => Boolean,
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
      view: AbstractView,
      which: Double
    ): KeyPress[TRowType] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPress[TRowType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyPress[?], TRowType] (val x: Self & KeyPress[TRowType]) extends AnyVal {
      
      inline def setDatum(value: TRowType): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    }
  }
  
  trait MouseClick[TRowType]
    extends StObject
       with MouseEvent[HTMLTableRowElement, NativeMouseEvent] {
    
    var datum: TRowType
    
    var index: Double
  }
  object MouseClick {
    
    inline def apply[TRowType](
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLTableRowElement,
      datum: TRowType,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: ModifierKey => Boolean,
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
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), index = index.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], relatedTarget = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MouseClick[TRowType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseClick[?], TRowType] (val x: Self & MouseClick[TRowType]) extends AnyVal {
      
      inline def setDatum(value: TRowType): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sections[TBody, THeader, TFooter, TPinned] extends StObject {
    
    var body: js.UndefOr[TBody] = js.undefined
    
    var footer: js.UndefOr[TFooter] = js.undefined
    
    var header: js.UndefOr[THeader] = js.undefined
    
    var pinned: js.UndefOr[TPinned] = js.undefined
  }
  object Sections {
    
    inline def apply[TBody, THeader, TFooter, TPinned](): Sections[TBody, THeader, TFooter, TPinned] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sections[TBody, THeader, TFooter, TPinned]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sections[?, ?, ?, ?], TBody, THeader, TFooter, TPinned] (val x: Self & (Sections[TBody, THeader, TFooter, TPinned])) extends AnyVal {
      
      inline def setBody(value: TBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFooter(value: TFooter): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: THeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setPinned(value: TPinned): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.middle
    - typings.grommet.grommetStrings.top
    - typings.grommet.grommetStrings.bottom
  */
  trait VerticalAlignType extends StObject
  object VerticalAlignType {
    
    inline def bottom: typings.grommet.grommetStrings.bottom = "bottom".asInstanceOf[typings.grommet.grommetStrings.bottom]
    
    inline def middle: typings.grommet.grommetStrings.middle = "middle".asInstanceOf[typings.grommet.grommetStrings.middle]
    
    inline def top: typings.grommet.grommetStrings.top = "top".asInstanceOf[typings.grommet.grommetStrings.top]
  }
}
