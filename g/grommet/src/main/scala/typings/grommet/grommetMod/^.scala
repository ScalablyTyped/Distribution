package typings.grommet.grommetMod

import typings.grommet.componentsAccordionMod.AccordionProps
import typings.grommet.componentsAccordionPanelMod.AccordionPanelProps
import typings.grommet.componentsAnchorMod.AnchorProps
import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.componentsButtonMod.ButtonProps
import typings.grommet.componentsCalendarMod.CalendarProps
import typings.grommet.componentsCarouselMod.CarouselProps
import typings.grommet.componentsChartMod.ChartProps
import typings.grommet.componentsCheckBoxMod.CheckBoxProps
import typings.grommet.componentsClockMod.ClockProps
import typings.grommet.componentsCollapsibleMod.CollapsibleProps
import typings.grommet.componentsDataTableMod.DataTableProps
import typings.grommet.componentsDiagramMod.DiagramProps
import typings.grommet.componentsDistributionMod.DistributionProps
import typings.grommet.componentsDropButtonMod.DropButtonProps
import typings.grommet.componentsDropMod.DropProps
import typings.grommet.componentsFormFieldMod.FormFieldProps
import typings.grommet.componentsFormMod.FormProps
import typings.grommet.componentsGridMod.GridProps
import typings.grommet.componentsGrommetMod.GrommetProps
import typings.grommet.componentsHeadingMod.HeadingProps
import typings.grommet.componentsImageMod.ImageProps
import typings.grommet.componentsInfiniteScrollMod.InfiniteScrollProps
import typings.grommet.componentsKeyboardMod.KeyboardProps
import typings.grommet.componentsLayerMod.LayerProps
import typings.grommet.componentsMarkdownMod.MarkdownProps
import typings.grommet.componentsMaskedInputMod.MaskedInputProps
import typings.grommet.componentsMenuMod.MenuProps
import typings.grommet.componentsMeterMod.MeterProps
import typings.grommet.componentsParagraphMod.ParagraphProps
import typings.grommet.componentsRadioButtonGroupMod.RadioButtonGroupProps
import typings.grommet.componentsRadioButtonMod.RadioButtonProps
import typings.grommet.componentsRangeInputMod.RangeInputProps
import typings.grommet.componentsRangeSelectorMod.RangeSelectorProps
import typings.grommet.componentsRoutedAnchorMod.RoutedAnchorProps
import typings.grommet.componentsRoutedButtonMod.RoutedButtonProps
import typings.grommet.componentsSelectMod.SelectProps
import typings.grommet.componentsSkipLinkMod.SkipLinkProps
import typings.grommet.componentsSkipLinkTargetMod.SkipLinkTargetProps
import typings.grommet.componentsSkipLinksMod.SkipLinksProps
import typings.grommet.componentsStackMod.StackProps
import typings.grommet.componentsTabMod.TabProps
import typings.grommet.componentsTableBodyMod.TableBodyProps
import typings.grommet.componentsTableCellMod.TableCellProps
import typings.grommet.componentsTableFooterMod.TableFooterProps
import typings.grommet.componentsTableHeaderMod.TableHeaderProps
import typings.grommet.componentsTableMod.TableProps
import typings.grommet.componentsTableRowMod.TableRowProps
import typings.grommet.componentsTabsMod.TabsProps
import typings.grommet.componentsTextAreaMod.TextAreaProps
import typings.grommet.componentsTextInputMod.TextInputProps
import typings.grommet.componentsTextMod.TextProps
import typings.grommet.componentsVideoMod.VideoProps
import typings.grommet.componentsWorldMapMod.WorldMapProps
import typings.grommet.contextsAnnounceContextMod.AnnounceValue
import typings.grommet.contextsResponsiveContextMod.ResponsiveValue
import typings.grommet.contextsThemeContextMod.ThemeContextI
import typings.grommet.grommetStrings.color
import typings.grommet.grommetStrings.controls
import typings.grommet.grommetStrings.href
import typings.grommet.grommetStrings.id
import typings.grommet.grommetStrings.mask
import typings.grommet.grommetStrings.name
import typings.grommet.grommetStrings.onSelect
import typings.grommet.grommetStrings.placeholder
import typings.grommet.grommetStrings.plain
import typings.grommet.grommetStrings.size
import typings.grommet.grommetStrings.title
import typings.grommet.grommetStrings.value
import typings.grommet.utilsMod.Omit
import typings.react.HTMLAnchorElement
import typings.react.HTMLButtonElement
import typings.react.HTMLDivElement
import typings.react.HTMLFormElement
import typings.react.HTMLHeadingElement
import typings.react.HTMLImageElement
import typings.react.HTMLInputElement
import typings.react.HTMLParagraphElement
import typings.react.HTMLSpanElement
import typings.react.HTMLTableDataCellElement
import typings.react.HTMLTableElement
import typings.react.HTMLTableRowElement
import typings.react.HTMLTableSectionElement
import typings.react.HTMLTextAreaElement
import typings.react.HTMLVideoElement
import typings.react.SVGSVGElement
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Context
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FC
import typings.react.reactMod.FormHTMLAttributes
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ImgHTMLAttributes
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.SVGProps
import typings.react.reactMod.TableHTMLAttributes
import typings.react.reactMod.TdHTMLAttributes
import typings.react.reactMod.TextareaHTMLAttributes
import typings.react.reactMod.VideoHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Accordion: ComponentClass[
    AccordionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val AccordionPanel: ComponentClass[
    AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val Anchor: ComponentClass[
    AnchorProps with (Omit[
      DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
      color
    ]), 
    ComponentState
  ] = js.native
  val AnnounceContext: Context[AnnounceValue] = js.native
  val Box: ComponentClass[
    BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val Button: ComponentClass[
    ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ]), 
    ComponentState
  ] = js.native
  val Calendar: ComponentClass[
    CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val Carousel: ComponentClass[
    CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val Chart: ComponentClass[ChartProps, ComponentState] = js.native
  val CheckBox: ComponentClass[
    CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
    ComponentState
  ] = js.native
  val Clock: ComponentClass[
    ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
    ComponentState
  ] = js.native
  val Collapsible: ComponentClass[
    CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val DataTable: ComponentClass[
    DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
    ComponentState
  ] = js.native
  val Diagram: ComponentClass[DiagramProps with SVGProps[SVGSVGElement], ComponentState] = js.native
  val Distribution: ComponentClass[
    DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val Drop: ComponentClass[
    DropProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val DropButton: ComponentClass[
    DropButtonProps with ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ]), 
    ComponentState
  ] = js.native
  val Form: ComponentClass[
    FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]), 
    ComponentState
  ] = js.native
  val FormField: ComponentClass[
    FormFieldProps with (typings.std.Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      placeholder
    ]), 
    ComponentState
  ] = js.native
  val Grid: FC[
    GridProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  val Grommet: ComponentClass[
    GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val Heading: FC[
    HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
  ] = js.native
  val Image: FC[
    ImageProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = js.native
  val InfiniteScroll: ComponentClass[InfiniteScrollProps, ComponentState] = js.native
  val Keyboard: ComponentClass[KeyboardProps, ComponentState] = js.native
  val Layer: ComponentClass[
    LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val Markdown: ComponentClass[
    MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val MaskedInput: ComponentClass[
    MaskedInputProps with (typings.std.Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      id | name | mask | plain | size | value
    ]), 
    ComponentState
  ] = js.native
  val Menu: ComponentClass[
    MenuProps with (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]), 
    ComponentState
  ] = js.native
  val Meter: ComponentClass[MeterProps, ComponentState] = js.native
  val Paragraph: FC[
    ParagraphProps with (Omit[
      DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
      color
    ])
  ] = js.native
  val RadioButton: ComponentClass[
    RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
    ComponentState
  ] = js.native
  val RadioButtonGroup: ComponentClass[RadioButtonGroupProps with BoxProps, ComponentState] = js.native
  val RangeInput: ComponentClass[
    RangeInputProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
    ComponentState
  ] = js.native
  val RangeSelector: ComponentClass[
    RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
    ComponentState
  ] = js.native
  val ResponsiveContext: Context[ResponsiveValue] = js.native
  val RoutedAnchor: ComponentClass[RoutedAnchorProps with (Omit[AnchorProps, href]), ComponentState] = js.native
  val RoutedButton: ComponentClass[RoutedButtonProps with ButtonProps, ComponentState] = js.native
  val Select: ComponentClass[SelectProps, ComponentState] = js.native
  val SkipLink: FC[SkipLinkProps] = js.native
  val SkipLinkTarget: FC[SkipLinkTargetProps] = js.native
  val SkipLinks: ComponentClass[SkipLinksProps, ComponentState] = js.native
  val Stack: ComponentClass[
    StackProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val Tab: ComponentClass[
    TabProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      title
    ]), 
    ComponentState
  ] = js.native
  val Table: FC[
    TableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = js.native
  val TableBody: FC[
    TableBodyProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = js.native
  val TableCell: FC[
    TableCellProps with (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
  ] = js.native
  val TableFooter: FC[
    TableFooterProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = js.native
  val TableHeader: FC[
    TableHeaderProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = js.native
  val TableRow: FC[
    TableRowProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement])
  ] = js.native
  val Tabs: ComponentClass[
    TabsProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  val Text: FC[
    TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
  ] = js.native
  val TextArea: ComponentClass[
    TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]), 
    ComponentState
  ] = js.native
  val TextInput: ComponentClass[
    TextInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ]), 
    ComponentState
  ] = js.native
  val ThemeContext: ThemeContextI = js.native
  val Video: ComponentClass[
    VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
      DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
      controls
    ]), 
    ComponentState
  ] = js.native
  val WorldMap: ComponentClass[WorldMapProps with SVGProps[SVGSVGElement], ComponentState] = js.native
}

