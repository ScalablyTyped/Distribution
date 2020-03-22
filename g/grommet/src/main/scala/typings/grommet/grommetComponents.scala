package typings.grommet

import typings.grommet.accordionMod.AccordionProps
import typings.grommet.accordionPanelMod.AccordionPanelProps
import typings.grommet.anchorMod.AnchorProps
import typings.grommet.boxMod.BoxProps
import typings.grommet.boxMod.BoxTypes
import typings.grommet.buttonMod.ButtonProps
import typings.grommet.buttonMod.ButtonType
import typings.grommet.calendarMod.CalendarProps
import typings.grommet.carouselMod.CarouselProps
import typings.grommet.checkBoxMod.CheckBoxProps
import typings.grommet.clockMod.ClockProps
import typings.grommet.collapsibleMod.CollapsibleProps
import typings.grommet.dataTableMod.DataTableProps
import typings.grommet.diagramMod.DiagramProps
import typings.grommet.distributionMod.DistributionProps
import typings.grommet.dropButtonMod.DropButtonProps
import typings.grommet.dropMod.DropProps
import typings.grommet.formFieldMod.FormFieldProps
import typings.grommet.formMod.FormProps
import typings.grommet.gridMod.GridProps
import typings.grommet.grommetMod.GrommetProps
import typings.grommet.grommetStrings.color
import typings.grommet.grommetStrings.controls
import typings.grommet.grommetStrings.icon
import typings.grommet.grommetStrings.id
import typings.grommet.grommetStrings.mask
import typings.grommet.grommetStrings.name
import typings.grommet.grommetStrings.onSelect
import typings.grommet.grommetStrings.placeholder
import typings.grommet.grommetStrings.plain
import typings.grommet.grommetStrings.reverse
import typings.grommet.grommetStrings.size
import typings.grommet.grommetStrings.title
import typings.grommet.grommetStrings.value
import typings.grommet.headingMod.HeadingProps
import typings.grommet.imageMod.ImageProps
import typings.grommet.layerMod.LayerProps
import typings.grommet.listMod.ListProps
import typings.grommet.markdownMod.MarkdownProps
import typings.grommet.maskedInputMod.MaskedInputProps
import typings.grommet.menuMod.MenuProps
import typings.grommet.paragraphMod.ParagraphProps
import typings.grommet.radioButtonGroupMod.RadioButtonGroupProps
import typings.grommet.radioButtonMod.RadioButtonProps
import typings.grommet.rangeInputMod.RangeInputProps
import typings.grommet.rangeSelectorMod.RangeSelectorProps
import typings.grommet.routedButtonMod.RoutedButtonProps
import typings.grommet.stackMod.StackProps
import typings.grommet.tabMod.TabProps
import typings.grommet.tableBodyMod.TableBodyProps
import typings.grommet.tableCellMod.TableCellProps
import typings.grommet.tableFooterMod.TableFooterProps
import typings.grommet.tableHeaderMod.TableHeaderProps
import typings.grommet.tableMod.TableProps
import typings.grommet.tableRowMod.TableRowProps
import typings.grommet.tabsMod.TabsProps
import typings.grommet.textAreaMod.TextAreaProps
import typings.grommet.textInputMod.TextInputProps
import typings.grommet.textMod.TextProps
import typings.grommet.utilsMod.Omit
import typings.grommet.videoMod.VideoProps
import typings.grommet.worldMapMod.WorldMapProps
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ComponentType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FormHTMLAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.SVGProps
import typings.react.mod.TableHTMLAttributes
import typings.react.mod.TdHTMLAttributes
import typings.react.mod.TextareaHTMLAttributes
import typings.react.mod.VideoHTMLAttributes
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
  ] = typings.grommet.mod.Accordion.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.accordionMod.AccordionProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def AccordionPanel: ComponentType[
    AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.AccordionPanel].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.accordionPanelMod.AccordionPanelProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Anchor: ComponentType[
    AnchorProps with (Omit[
      DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
      color
    ])
  ] = typings.grommet.mod.Anchor.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.anchorMod.AnchorProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.AnchorHTMLAttributes[typings.std.HTMLAnchorElement], 
      typings.std.HTMLAnchorElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def Box: ComponentType[
    BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.mod.Box.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.boxMod.BoxProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Button: ComponentType[
    ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = typings.grommet.mod.Button.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.buttonMod.ButtonProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.ButtonHTMLAttributes[typings.std.HTMLButtonElement], 
      typings.std.HTMLButtonElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def Calendar: ComponentType[
    CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Calendar].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.calendarMod.CalendarProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Carousel: ComponentType[
    CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Carousel].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.carouselMod.CarouselProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Chart: ComponentType[ChartProps] = js.constructorOf[typings.grommet.mod.Chart].asInstanceOf[typings.react.mod.ComponentType[ChartProps]]
  @scala.inline
  def CheckBox: ComponentType[
    CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = typings.grommet.mod.CheckBox.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.checkBoxMod.CheckBoxProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ])]]
  @scala.inline
  def Clock: ComponentType[
    ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])
  ] = js.constructorOf[typings.grommet.mod.Clock].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.clockMod.ClockProps with ((typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ]) | typings.react.mod.SVGProps[typings.std.SVGSVGElement])]]
  @scala.inline
  def Collapsible: ComponentType[
    CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Collapsible].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.collapsibleMod.CollapsibleProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def DataTable: ComponentType[
    DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = js.constructorOf[typings.grommet.mod.DataTable].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.dataTableMod.DataTableProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.TableHTMLAttributes[typings.std.HTMLTableElement], 
    typings.std.HTMLTableElement
  ])]]
  @scala.inline
  def Diagram: ComponentType[DiagramProps with SVGProps[SVGSVGElement]] = typings.grommet.mod.Diagram.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.diagramMod.DiagramProps with typings.react.mod.SVGProps[typings.std.SVGSVGElement]]]
  @scala.inline
  def Distribution: ComponentType[
    DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Distribution].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.distributionMod.DistributionProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Drop: ComponentType[
    DropProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Drop].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.dropMod.DropProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def DropButton: ComponentType[
    DropButtonProps with ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = js.constructorOf[typings.grommet.mod.DropButton].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.dropButtonMod.DropButtonProps with typings.grommet.buttonMod.ButtonProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.ButtonHTMLAttributes[typings.std.HTMLButtonElement], 
      typings.std.HTMLButtonElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def Footer: ComponentType[FooterProps] = typings.grommet.mod.Footer.asInstanceOf[typings.react.mod.ComponentType[FooterProps]]
  @scala.inline
  def Form: ComponentType[
    FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement])
  ] = js.constructorOf[typings.grommet.mod.Form].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.formMod.FormProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.FormHTMLAttributes[typings.std.HTMLFormElement], 
    typings.std.HTMLFormElement
  ])]]
  @scala.inline
  def FormField: ComponentType[
    FormFieldProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      placeholder
    ])
  ] = js.constructorOf[typings.grommet.mod.FormField].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.formFieldMod.FormFieldProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
      typings.std.HTMLInputElement
    ], 
    typings.grommet.grommetStrings.placeholder
  ])]]
  @scala.inline
  def Grid: ComponentType[
    GridProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.mod.Grid.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.gridMod.GridProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Grommet: ComponentType[
    GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Grommet_].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.grommetMod.GrommetProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Header: ComponentType[HeaderProps] = typings.grommet.mod.Header.asInstanceOf[typings.react.mod.ComponentType[HeaderProps]]
  @scala.inline
  def Heading: ComponentType[
    HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
  ] = typings.grommet.mod.Heading.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.headingMod.HeadingProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.HTMLAttributes[typings.std.HTMLHeadingElement], 
      typings.std.HTMLHeadingElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def Image: ComponentType[
    ImageProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = typings.grommet.mod.Image.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.imageMod.ImageProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.ImgHTMLAttributes[typings.std.HTMLImageElement], 
    typings.std.HTMLImageElement
  ])]]
  @scala.inline
  def InfiniteScroll: ComponentType[InfiniteScrollProps] = js.constructorOf[typings.grommet.mod.InfiniteScroll].asInstanceOf[typings.react.mod.ComponentType[InfiniteScrollProps]]
  @scala.inline
  def Keyboard: ComponentType[KeyboardProps] = typings.grommet.mod.Keyboard.asInstanceOf[typings.react.mod.ComponentType[KeyboardProps]]
  @scala.inline
  def Layer: ComponentType[
    LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Layer].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.layerMod.LayerProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def List: ComponentType[
    ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])
  ] = js.constructorOf[typings.grommet.mod.List].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.listMod.ListProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLUListElement], 
    typings.std.HTMLUListElement
  ])]]
  @scala.inline
  def Main: ComponentType[MainProps] = typings.grommet.mod.Main.asInstanceOf[typings.react.mod.ComponentType[MainProps]]
  @scala.inline
  def Markdown: ComponentType[
    MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Markdown].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.markdownMod.MarkdownProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def MaskedInput: ComponentType[
    MaskedInputProps with (typings.std.Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      icon | id | mask | name | plain | reverse | size | value
    ])
  ] = js.constructorOf[typings.grommet.mod.MaskedInput].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.maskedInputMod.MaskedInputProps with (typings.std.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
      typings.std.HTMLInputElement
    ], 
    typings.grommet.grommetStrings.icon | typings.grommet.grommetStrings.id | typings.grommet.grommetStrings.mask | typings.grommet.grommetStrings.name | typings.grommet.grommetStrings.plain | typings.grommet.grommetStrings.reverse | typings.grommet.grommetStrings.size | typings.grommet.grommetStrings.value
  ])]]
  @scala.inline
  def Menu: ComponentType[MenuProps with (Omit[ButtonType, icon])] = typings.grommet.mod.Menu.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.menuMod.MenuProps with (typings.grommet.utilsMod.Omit[typings.grommet.buttonMod.ButtonType, typings.grommet.grommetStrings.icon])]]
  @scala.inline
  def Meter: ComponentType[MeterProps] = js.constructorOf[typings.grommet.mod.Meter].asInstanceOf[typings.react.mod.ComponentType[MeterProps]]
  @scala.inline
  def Nav: ComponentType[NavProps] = typings.grommet.mod.Nav.asInstanceOf[typings.react.mod.ComponentType[NavProps]]
  @scala.inline
  def Paragraph: ComponentType[
    ParagraphProps with (Omit[
      DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
      color
    ])
  ] = typings.grommet.mod.Paragraph.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.paragraphMod.ParagraphProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.HTMLAttributes[typings.std.HTMLParagraphElement], 
      typings.std.HTMLParagraphElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def RadioButton: ComponentType[
    RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.constructorOf[typings.grommet.mod.RadioButton].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.radioButtonMod.RadioButtonProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ])]]
  @scala.inline
  def RadioButtonGroup: ComponentType[RadioButtonGroupProps with BoxProps] = js.constructorOf[typings.grommet.mod.RadioButtonGroup].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.radioButtonGroupMod.RadioButtonGroupProps with typings.grommet.boxMod.BoxProps]]
  @scala.inline
  def RangeInput: ComponentType[
    RangeInputProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = typings.grommet.mod.RangeInput.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.rangeInputMod.RangeInputProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ])]]
  @scala.inline
  def RangeSelector: ComponentType[
    RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])
  ] = js.constructorOf[typings.grommet.mod.RangeSelector].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.rangeSelectorMod.RangeSelectorProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
      typings.std.HTMLDivElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def RoutedAnchor: ComponentType[RoutedAnchorProps] = js.constructorOf[typings.grommet.mod.RoutedAnchor].asInstanceOf[typings.react.mod.ComponentType[RoutedAnchorProps]]
  @scala.inline
  def RoutedButton: ComponentType[RoutedButtonProps with ButtonProps] = js.constructorOf[typings.grommet.mod.RoutedButton].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.routedButtonMod.RoutedButtonProps with typings.grommet.buttonMod.ButtonProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = js.constructorOf[typings.grommet.mod.Select].asInstanceOf[typings.react.mod.ComponentType[SelectProps]]
  @scala.inline
  def SkipLink: ComponentType[SkipLinkProps] = typings.grommet.mod.SkipLink.asInstanceOf[typings.react.mod.ComponentType[SkipLinkProps]]
  @scala.inline
  def SkipLinkTarget: ComponentType[SkipLinkTargetProps] = typings.grommet.mod.SkipLinkTarget.asInstanceOf[typings.react.mod.ComponentType[SkipLinkTargetProps]]
  @scala.inline
  def SkipLinks: ComponentType[SkipLinksProps] = typings.grommet.mod.SkipLinks.asInstanceOf[typings.react.mod.ComponentType[SkipLinksProps]]
  @scala.inline
  def Stack: ComponentType[
    StackProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.mod.Stack.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.stackMod.StackProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Tab: ComponentType[
    TabProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      title
    ])
  ] = js.constructorOf[typings.grommet.mod.Tab].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.tabMod.TabProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.ButtonHTMLAttributes[typings.std.HTMLButtonElement], 
      typings.std.HTMLButtonElement
    ], 
    typings.grommet.grommetStrings.title
  ])]]
  @scala.inline
  def Table: ComponentType[
    TableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = typings.grommet.mod.Table.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.tableMod.TableProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.TableHTMLAttributes[typings.std.HTMLTableElement], 
    typings.std.HTMLTableElement
  ])]]
  @scala.inline
  def TableBody: ComponentType[
    TableBodyProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = typings.grommet.mod.TableBody.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.tableBodyMod.TableBodyProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLTableSectionElement], 
    typings.std.HTMLTableSectionElement
  ])]]
  @scala.inline
  def TableCell: ComponentType[
    TableCellProps with BoxTypes with (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
  ] = typings.grommet.mod.TableCell.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.tableCellMod.TableCellProps with typings.grommet.boxMod.BoxTypes with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.TdHTMLAttributes[typings.std.HTMLTableDataCellElement], 
    typings.std.HTMLTableDataCellElement
  ])]]
  @scala.inline
  def TableFooter: ComponentType[
    TableFooterProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = typings.grommet.mod.TableFooter.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.tableFooterMod.TableFooterProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLTableSectionElement], 
    typings.std.HTMLTableSectionElement
  ])]]
  @scala.inline
  def TableHeader: ComponentType[
    TableHeaderProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = typings.grommet.mod.TableHeader.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.tableHeaderMod.TableHeaderProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLTableSectionElement], 
    typings.std.HTMLTableSectionElement
  ])]]
  @scala.inline
  def TableRow: ComponentType[
    TableRowProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement])
  ] = typings.grommet.mod.TableRow.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.tableRowMod.TableRowProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLTableRowElement], 
    typings.std.HTMLTableRowElement
  ])]]
  @scala.inline
  def Tabs: ComponentType[
    TabsProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.mod.Tabs.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.tabsMod.TabsProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ])]]
  @scala.inline
  def Text: ComponentType[
    TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
  ] = typings.grommet.mod.Text.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.textMod.TextProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.HTMLAttributes[typings.std.HTMLSpanElement], 
      typings.std.HTMLSpanElement
    ], 
    typings.grommet.grommetStrings.color
  ])]]
  @scala.inline
  def TextArea: ComponentType[
    TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement])
  ] = typings.grommet.mod.TextArea.asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.textAreaMod.TextAreaProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement], 
    typings.std.HTMLTextAreaElement
  ])]]
  @scala.inline
  def TextInput: ComponentType[
    TextInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ])
  ] = js.constructorOf[typings.grommet.mod.TextInput].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.textInputMod.TextInputProps with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
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
  ] = js.constructorOf[typings.grommet.mod.Video].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.videoMod.VideoProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.VideoHTMLAttributes[typings.std.HTMLVideoElement], 
    typings.std.HTMLVideoElement
  ]) with (typings.grommet.utilsMod.Omit[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.VideoHTMLAttributes[typings.std.HTMLVideoElement], 
      typings.std.HTMLVideoElement
    ], 
    typings.grommet.grommetStrings.controls
  ])]]
  @scala.inline
  def WorldMap: ComponentType[WorldMapProps with SVGProps[SVGSVGElement]] = js.constructorOf[typings.grommet.mod.WorldMap].asInstanceOf[typings.react.mod.ComponentType[
  typings.grommet.worldMapMod.WorldMapProps with typings.react.mod.SVGProps[typings.std.SVGSVGElement]]]
}

