package typings.grommet

import typings.grommet.componentsAccordionMod.AccordionProps
import typings.grommet.componentsAccordionPanelMod.AccordionPanelProps
import typings.grommet.componentsAnchorMod.AnchorProps
import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.componentsBoxMod.BoxTypes
import typings.grommet.componentsButtonMod.ButtonProps
import typings.grommet.componentsCalendarMod.CalendarProps
import typings.grommet.componentsCarouselMod.CarouselProps
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
import typings.grommet.componentsLayerMod.LayerProps
import typings.grommet.componentsListMod.ListProps
import typings.grommet.componentsMarkdownMod.MarkdownProps
import typings.grommet.componentsMaskedInputMod.MaskedInputProps
import typings.grommet.componentsMenuMod.MenuProps
import typings.grommet.componentsParagraphMod.ParagraphProps
import typings.grommet.componentsRadioButtonGroupMod.RadioButtonGroupProps
import typings.grommet.componentsRadioButtonMod.RadioButtonProps
import typings.grommet.componentsRangeInputMod.RangeInputProps
import typings.grommet.componentsRangeSelectorMod.RangeSelectorProps
import typings.grommet.componentsRoutedAnchorMod.RoutedAnchorProps
import typings.grommet.componentsRoutedButtonMod.RoutedButtonProps
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
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.ComponentType
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FormHTMLAttributes
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ImgHTMLAttributes
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.SVGProps
import typings.react.reactMod.TableHTMLAttributes
import typings.react.reactMod.TdHTMLAttributes
import typings.react.reactMod.TextareaHTMLAttributes
import typings.react.reactMod.VideoHTMLAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLFormElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.HTMLParagraphElement
import typings.std.HTMLSpanElement
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTextAreaElement
import typings.std.HTMLUListElement
import typings.std.HTMLVideoElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object grommetComponents extends grommetProps {
  @scala.inline
  def Accordion: ComponentType[
    AccordionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.grommetMod.Accordion.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsAccordionMod.AccordionProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def AccordionPanel: ComponentType[
    AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.grommetMod.AccordionPanel].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsAccordionPanelMod.AccordionPanelProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Anchor: ComponentType[
    AnchorProps with (Omit[
      DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
      color
    ])
  ] = typings.grommet.grommetMod.Anchor.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsAnchorMod.AnchorProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.AnchorHTMLAttributes[typings.std.HTMLAnchorElement], 
      typings.std.HTMLAnchorElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def Box: ComponentType[
    BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.grommetMod.Box.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsBoxMod.BoxProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Button: ComponentType[
    ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = typings.grommet.grommetMod.Button.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsButtonMod.ButtonProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.ButtonHTMLAttributes[typings.std.HTMLButtonElement], 
      typings.std.HTMLButtonElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def Calendar: ComponentType[
    CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Calendar].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsCalendarMod.CalendarProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Carousel: ComponentType[
    CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Carousel].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsCarouselMod.CarouselProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Chart: ComponentType[ChartProps] = js.constructorOf[typings.grommet.grommetMod.Chart].asInstanceOf[typings.react.reactMod.ComponentType[ChartProps]]
  @scala.inline
  def CheckBox: ComponentType[
    CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = typings.grommet.grommetMod.CheckBox.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsCheckBoxMod.CheckBoxProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ])]]
  @scala.inline
  def Clock: ComponentType[
    ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Clock].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsClockMod.ClockProps with ((typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ]) | typings.react.reactMod.SVGProps[typings.std.SVGSVGElement])]]
  @scala.inline
  def Collapsible: ComponentType[
    CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Collapsible].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsCollapsibleMod.CollapsibleProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def DataTable: ComponentType[
    DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = js.constructorOf[typings.grommet.grommetMod.DataTable].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsDataTableMod.DataTableProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.TableHTMLAttributes[typings.std.HTMLTableElement], 
    typings.std.HTMLTableElement
  ])]]
  @scala.inline
  def Diagram: ComponentType[DiagramProps with SVGProps[SVGSVGElement]] = typings.grommet.grommetMod.Diagram.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsDiagramMod.DiagramProps with typings.react.reactMod.SVGProps[typings.std.SVGSVGElement]]]
  @scala.inline
  def Distribution: ComponentType[
    DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Distribution].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsDistributionMod.DistributionProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Drop: ComponentType[
    DropProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Drop].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsDropMod.DropProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def DropButton: ComponentType[
    DropButtonProps with ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = js.constructorOf[typings.grommet.grommetMod.DropButton].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsDropButtonMod.DropButtonProps with typings.grommet.componentsButtonMod.ButtonProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.ButtonHTMLAttributes[typings.std.HTMLButtonElement], 
      typings.std.HTMLButtonElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def Footer: ComponentType[FooterProps] = typings.grommet.grommetMod.Footer.asInstanceOf[typings.react.reactMod.ComponentType[FooterProps]]
  @scala.inline
  def Form: ComponentType[
    FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Form].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsFormMod.FormProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.FormHTMLAttributes[typings.std.HTMLFormElement], 
    typings.std.HTMLFormElement
  ])]]
  @scala.inline
  def FormField: ComponentType[
    FormFieldProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      placeholder
    ])
  ] = js.constructorOf[typings.grommet.grommetMod.FormField].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsFormFieldMod.FormFieldProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement], 
      typings.std.HTMLInputElement
    ], 
    typings.grommet.grommetStrings.placeholder
  ])]]
  @scala.inline
  def Grid: ComponentType[
    GridProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.grommetMod.Grid.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsGridMod.GridProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Grommet: ComponentType[
    GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Grommet].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsGrommetMod.GrommetProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Header: ComponentType[HeaderProps] = typings.grommet.grommetMod.Header.asInstanceOf[typings.react.reactMod.ComponentType[HeaderProps]]
  @scala.inline
  def Heading: ComponentType[
    HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
  ] = typings.grommet.grommetMod.Heading.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsHeadingMod.HeadingProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.HTMLAttributes[typings.std.HTMLHeadingElement], 
      typings.std.HTMLHeadingElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def Image: ComponentType[
    ImageProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = typings.grommet.grommetMod.Image.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsImageMod.ImageProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.ImgHTMLAttributes[typings.std.HTMLImageElement], 
    typings.std.HTMLImageElement
  ])]]
  @scala.inline
  def InfiniteScroll: ComponentType[InfiniteScrollProps] = js.constructorOf[typings.grommet.grommetMod.InfiniteScroll].asInstanceOf[typings.react.reactMod.ComponentType[InfiniteScrollProps]]
  @scala.inline
  def Keyboard: ComponentType[KeyboardProps] = typings.grommet.grommetMod.Keyboard.asInstanceOf[typings.react.reactMod.ComponentType[KeyboardProps]]
  @scala.inline
  def Layer: ComponentType[
    LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Layer].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsLayerMod.LayerProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def List: ComponentType[
    ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])
  ] = js.constructorOf[typings.grommet.grommetMod.List].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsListMod.ListProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLUListElement], 
    typings.std.HTMLUListElement
  ])]]
  @scala.inline
  def Main: ComponentType[MainProps] = typings.grommet.grommetMod.Main.asInstanceOf[typings.react.reactMod.ComponentType[MainProps]]
  @scala.inline
  def Markdown: ComponentType[
    MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Markdown].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsMarkdownMod.MarkdownProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def MaskedInput: ComponentType[
    MaskedInputProps with (typings.std.Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      id | mask | name | plain | size | value
    ])
  ] = js.constructorOf[typings.grommet.grommetMod.MaskedInput].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsMaskedInputMod.MaskedInputProps with (typings.std.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement], 
      typings.std.HTMLInputElement
    ], 
    typings.grommet.grommetStrings.id | typings.grommet.grommetStrings.mask | typings.grommet.grommetStrings.name | typings.grommet.grommetStrings.plain | typings.grommet.grommetStrings.size | typings.grommet.grommetStrings.value
  ])]]
  @scala.inline
  def Menu: ComponentType[
    MenuProps with (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement])
  ] = js.constructorOf[typings.grommet.grommetMod.Menu].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsMenuMod.MenuProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.ButtonHTMLAttributes[typings.std.HTMLButtonElement], 
    typings.std.HTMLButtonElement
  ])]]
  @scala.inline
  def Meter: ComponentType[MeterProps] = js.constructorOf[typings.grommet.grommetMod.Meter].asInstanceOf[typings.react.reactMod.ComponentType[MeterProps]]
  @scala.inline
  def Paragraph: ComponentType[
    ParagraphProps with (Omit[
      DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
      color
    ])
  ] = typings.grommet.grommetMod.Paragraph.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsParagraphMod.ParagraphProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.HTMLAttributes[typings.std.HTMLParagraphElement], 
      typings.std.HTMLParagraphElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def RadioButton: ComponentType[
    RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.constructorOf[typings.grommet.grommetMod.RadioButton].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsRadioButtonMod.RadioButtonProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ])]]
  @scala.inline
  def RadioButtonGroup: ComponentType[RadioButtonGroupProps with BoxProps] = js.constructorOf[typings.grommet.grommetMod.RadioButtonGroup].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsRadioButtonGroupMod.RadioButtonGroupProps with typings.grommet.componentsBoxMod.BoxProps]]
  @scala.inline
  def RangeInput: ComponentType[
    RangeInputProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = typings.grommet.grommetMod.RangeInput.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsRangeInputMod.RangeInputProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ])]]
  @scala.inline
  def RangeSelector: ComponentType[
    RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])
  ] = js.constructorOf[typings.grommet.grommetMod.RangeSelector].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsRangeSelectorMod.RangeSelectorProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
      typings.std.HTMLDivElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def RoutedAnchor: ComponentType[RoutedAnchorProps with (Omit[AnchorProps, href])] = js.constructorOf[typings.grommet.grommetMod.RoutedAnchor].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsRoutedAnchorMod.RoutedAnchorProps with (typings.grommet.utilsMod.Omit[
    typings.grommet.componentsAnchorMod.AnchorProps, 
    typings.grommet.grommetStrings.href
  ])]]
  @scala.inline
  def RoutedButton: ComponentType[RoutedButtonProps with ButtonProps] = js.constructorOf[typings.grommet.grommetMod.RoutedButton].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsRoutedButtonMod.RoutedButtonProps with typings.grommet.componentsButtonMod.ButtonProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = js.constructorOf[typings.grommet.grommetMod.Select].asInstanceOf[typings.react.reactMod.ComponentType[SelectProps]]
  @scala.inline
  def SkipLink: ComponentType[SkipLinkProps] = typings.grommet.grommetMod.SkipLink.asInstanceOf[typings.react.reactMod.ComponentType[SkipLinkProps]]
  @scala.inline
  def SkipLinkTarget: ComponentType[SkipLinkTargetProps] = typings.grommet.grommetMod.SkipLinkTarget.asInstanceOf[typings.react.reactMod.ComponentType[SkipLinkTargetProps]]
  @scala.inline
  def SkipLinks: ComponentType[SkipLinksProps] = typings.grommet.grommetMod.SkipLinks.asInstanceOf[typings.react.reactMod.ComponentType[SkipLinksProps]]
  @scala.inline
  def Stack: ComponentType[
    StackProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.grommetMod.Stack.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsStackMod.StackProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Tab: ComponentType[
    TabProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      title
    ])
  ] = js.constructorOf[typings.grommet.grommetMod.Tab].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTabMod.TabProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.ButtonHTMLAttributes[typings.std.HTMLButtonElement], 
      typings.std.HTMLButtonElement
    ], 
    typings.grommet.grommetStrings.title
  ])]]
  @scala.inline
  def Table: ComponentType[
    TableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = typings.grommet.grommetMod.Table.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTableMod.TableProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.TableHTMLAttributes[typings.std.HTMLTableElement], 
    typings.std.HTMLTableElement
  ])]]
  @scala.inline
  def TableBody: ComponentType[
    TableBodyProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = typings.grommet.grommetMod.TableBody.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTableBodyMod.TableBodyProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLTableSectionElement], 
    typings.std.HTMLTableSectionElement
  ])]]
  @scala.inline
  def TableCell: ComponentType[
    TableCellProps with BoxTypes with (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
  ] = typings.grommet.grommetMod.TableCell.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTableCellMod.TableCellProps with typings.grommet.componentsBoxMod.BoxTypes with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.TdHTMLAttributes[typings.std.HTMLTableDataCellElement], 
    typings.std.HTMLTableDataCellElement
  ])]]
  @scala.inline
  def TableFooter: ComponentType[
    TableFooterProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = typings.grommet.grommetMod.TableFooter.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTableFooterMod.TableFooterProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLTableSectionElement], 
    typings.std.HTMLTableSectionElement
  ])]]
  @scala.inline
  def TableHeader: ComponentType[
    TableHeaderProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = typings.grommet.grommetMod.TableHeader.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTableHeaderMod.TableHeaderProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLTableSectionElement], 
    typings.std.HTMLTableSectionElement
  ])]]
  @scala.inline
  def TableRow: ComponentType[
    TableRowProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement])
  ] = typings.grommet.grommetMod.TableRow.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTableRowMod.TableRowProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLTableRowElement], 
    typings.std.HTMLTableRowElement
  ])]]
  @scala.inline
  def Tabs: ComponentType[
    TabsProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.grommetMod.Tabs.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTabsMod.TabsProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Text: ComponentType[
    TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
  ] = typings.grommet.grommetMod.Text.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTextMod.TextProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.HTMLAttributes[typings.std.HTMLSpanElement], 
      typings.std.HTMLSpanElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def TextArea: ComponentType[
    TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement])
  ] = typings.grommet.grommetMod.TextArea.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTextAreaMod.TextAreaProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement], 
    typings.std.HTMLTextAreaElement
  ])]]
  @scala.inline
  def TextInput: ComponentType[
    TextInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ])
  ] = js.constructorOf[typings.grommet.grommetMod.TextInput].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsTextInputMod.TextInputProps with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement], 
      typings.std.HTMLInputElement
    ], 
    typings.grommet.grommetStrings.onSelect | typings.grommet.grommetStrings.size | typings.grommet.grommetStrings.placeholder
  ])]]
  @scala.inline
  def Video: ComponentType[
    VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
      DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
      controls
    ])
  ] = js.constructorOf[typings.grommet.grommetMod.Video].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsVideoMod.VideoProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.VideoHTMLAttributes[typings.std.HTMLVideoElement], 
    typings.std.HTMLVideoElement
  ]) with (typings.grommet.utilsMod.Omit[
    typings.react.reactMod.DetailedHTMLProps[
      typings.react.reactMod.VideoHTMLAttributes[typings.std.HTMLVideoElement], 
      typings.std.HTMLVideoElement
    ], 
    typings.grommet.grommetStrings.controls
  ])]]
  @scala.inline
  def WorldMap: ComponentType[WorldMapProps with SVGProps[SVGSVGElement]] = js.constructorOf[typings.grommet.grommetMod.WorldMap].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.grommet.componentsWorldMapMod.WorldMapProps with typings.react.reactMod.SVGProps[typings.std.SVGSVGElement]]]
}

