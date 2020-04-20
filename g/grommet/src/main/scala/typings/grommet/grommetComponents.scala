package typings.grommet

import typings.grommet.accordionMod.AccordionProps
import typings.grommet.accordionPanelMod.AccordionPanelProps
import typings.grommet.anchorMod.AnchorProps
import typings.grommet.avatarMod.AvatarProps
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
import typings.grommet.mod.Grommet_
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
  ] = typings.grommet.mod.Accordion.asInstanceOf[ComponentType[
    AccordionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def AccordionPanel: ComponentType[
    AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.AccordionPanel].asInstanceOf[ComponentType[
    AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def Anchor: ComponentType[
    AnchorProps with (Omit[
      DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
      color
    ])
  ] = typings.grommet.mod.Anchor.asInstanceOf[ComponentType[
    AnchorProps with (Omit[
      DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
      color
    ])
  ]]
  @scala.inline
  def Avatar: ComponentType[BoxProps with AvatarProps] = typings.grommet.mod.Avatar.asInstanceOf[ComponentType[BoxProps with AvatarProps]]
  @scala.inline
  def Box: ComponentType[
    BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.mod.Box.asInstanceOf[ComponentType[
    BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def Button: ComponentType[
    ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = typings.grommet.mod.Button.asInstanceOf[ComponentType[
    ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ]]
  @scala.inline
  def Calendar: ComponentType[
    CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Calendar].asInstanceOf[ComponentType[
    CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def Carousel: ComponentType[
    CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Carousel].asInstanceOf[ComponentType[
    CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def Chart: ComponentType[ChartProps] = js.constructorOf[typings.grommet.mod.Chart].asInstanceOf[ComponentType[ChartProps]]
  @scala.inline
  def CheckBox: ComponentType[
    CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = typings.grommet.mod.CheckBox.asInstanceOf[ComponentType[
    CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ]]
  @scala.inline
  def Clock: ComponentType[
    ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])
  ] = js.constructorOf[typings.grommet.mod.Clock].asInstanceOf[ComponentType[
    ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])
  ]]
  @scala.inline
  def Collapsible: ComponentType[
    CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Collapsible].asInstanceOf[ComponentType[
    CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def DataTable: ComponentType[
    DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = js.constructorOf[typings.grommet.mod.DataTable].asInstanceOf[ComponentType[
    DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ]]
  @scala.inline
  def Diagram: ComponentType[DiagramProps with SVGProps[SVGSVGElement]] = typings.grommet.mod.Diagram.asInstanceOf[ComponentType[DiagramProps with SVGProps[SVGSVGElement]]]
  @scala.inline
  def Distribution: ComponentType[
    DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Distribution].asInstanceOf[ComponentType[
    DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def Drop: ComponentType[
    DropProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Drop].asInstanceOf[ComponentType[
    DropProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def DropButton: ComponentType[
    DropButtonProps with ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = js.constructorOf[typings.grommet.mod.DropButton].asInstanceOf[ComponentType[
    DropButtonProps with ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ]]
  @scala.inline
  def Footer: ComponentType[FooterProps] = typings.grommet.mod.Footer.asInstanceOf[ComponentType[FooterProps]]
  @scala.inline
  def Form: ComponentType[
    FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement])
  ] = js.constructorOf[typings.grommet.mod.Form].asInstanceOf[ComponentType[
    FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement])
  ]]
  @scala.inline
  def FormField: ComponentType[
    FormFieldProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      placeholder
    ])
  ] = js.constructorOf[typings.grommet.mod.FormField].asInstanceOf[ComponentType[
    FormFieldProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      placeholder
    ])
  ]]
  @scala.inline
  def Grid: ComponentType[
    GridProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.mod.Grid.asInstanceOf[ComponentType[
    GridProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def Grommet: ComponentType[
    GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[Grommet_].asInstanceOf[ComponentType[
    GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def Header: ComponentType[HeaderProps] = typings.grommet.mod.Header.asInstanceOf[ComponentType[HeaderProps]]
  @scala.inline
  def Heading: ComponentType[
    HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
  ] = typings.grommet.mod.Heading.asInstanceOf[ComponentType[
    HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
  ]]
  @scala.inline
  def Image: ComponentType[
    ImageProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = typings.grommet.mod.Image.asInstanceOf[ComponentType[
    ImageProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ]]
  @scala.inline
  def InfiniteScroll: ComponentType[InfiniteScrollProps] = js.constructorOf[typings.grommet.mod.InfiniteScroll].asInstanceOf[ComponentType[InfiniteScrollProps]]
  @scala.inline
  def Keyboard: ComponentType[KeyboardProps] = typings.grommet.mod.Keyboard.asInstanceOf[ComponentType[KeyboardProps]]
  @scala.inline
  def Layer: ComponentType[
    LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Layer].asInstanceOf[ComponentType[
    LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def List: ComponentType[
    ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])
  ] = js.constructorOf[typings.grommet.mod.List].asInstanceOf[ComponentType[
    ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])
  ]]
  @scala.inline
  def Main: ComponentType[MainProps] = typings.grommet.mod.Main.asInstanceOf[ComponentType[MainProps]]
  @scala.inline
  def Markdown: ComponentType[
    MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.constructorOf[typings.grommet.mod.Markdown].asInstanceOf[ComponentType[
    MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def MaskedInput: ComponentType[
    MaskedInputProps with (typings.std.Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      icon | id | mask | name | plain | reverse | size | value
    ])
  ] = js.constructorOf[typings.grommet.mod.MaskedInput].asInstanceOf[ComponentType[
    MaskedInputProps with (typings.std.Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      icon | id | mask | name | plain | reverse | size | value
    ])
  ]]
  @scala.inline
  def Menu: ComponentType[MenuProps with (Omit[ButtonType, icon])] = typings.grommet.mod.Menu.asInstanceOf[ComponentType[MenuProps with (Omit[ButtonType, icon])]]
  @scala.inline
  def Meter: ComponentType[MeterProps] = js.constructorOf[typings.grommet.mod.Meter].asInstanceOf[ComponentType[MeterProps]]
  @scala.inline
  def Nav: ComponentType[NavProps] = typings.grommet.mod.Nav.asInstanceOf[ComponentType[NavProps]]
  @scala.inline
  def Paragraph: ComponentType[
    ParagraphProps with (Omit[
      DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
      color
    ])
  ] = typings.grommet.mod.Paragraph.asInstanceOf[ComponentType[
    ParagraphProps with (Omit[
      DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
      color
    ])
  ]]
  @scala.inline
  def RadioButton: ComponentType[
    RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.constructorOf[typings.grommet.mod.RadioButton].asInstanceOf[ComponentType[
    RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ]]
  @scala.inline
  def RadioButtonGroup: ComponentType[RadioButtonGroupProps with BoxProps] = js.constructorOf[typings.grommet.mod.RadioButtonGroup].asInstanceOf[ComponentType[RadioButtonGroupProps with BoxProps]]
  @scala.inline
  def RangeInput: ComponentType[
    RangeInputProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = typings.grommet.mod.RangeInput.asInstanceOf[ComponentType[
    RangeInputProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ]]
  @scala.inline
  def RangeSelector: ComponentType[
    RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])
  ] = js.constructorOf[typings.grommet.mod.RangeSelector].asInstanceOf[ComponentType[
    RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])
  ]]
  @scala.inline
  def RoutedAnchor: ComponentType[RoutedAnchorProps] = js.constructorOf[typings.grommet.mod.RoutedAnchor].asInstanceOf[ComponentType[RoutedAnchorProps]]
  @scala.inline
  def RoutedButton: ComponentType[RoutedButtonProps with ButtonProps] = js.constructorOf[typings.grommet.mod.RoutedButton].asInstanceOf[ComponentType[RoutedButtonProps with ButtonProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = js.constructorOf[typings.grommet.mod.Select].asInstanceOf[ComponentType[SelectProps]]
  @scala.inline
  def SkipLink: ComponentType[SkipLinkProps] = typings.grommet.mod.SkipLink.asInstanceOf[ComponentType[SkipLinkProps]]
  @scala.inline
  def SkipLinkTarget: ComponentType[SkipLinkTargetProps] = typings.grommet.mod.SkipLinkTarget.asInstanceOf[ComponentType[SkipLinkTargetProps]]
  @scala.inline
  def SkipLinks: ComponentType[SkipLinksProps] = typings.grommet.mod.SkipLinks.asInstanceOf[ComponentType[SkipLinksProps]]
  @scala.inline
  def Stack: ComponentType[
    StackProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.mod.Stack.asInstanceOf[ComponentType[
    StackProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def Tab: ComponentType[
    TabProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      title
    ])
  ] = js.constructorOf[typings.grommet.mod.Tab].asInstanceOf[ComponentType[
    TabProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      title
    ])
  ]]
  @scala.inline
  def Table: ComponentType[
    TableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = typings.grommet.mod.Table.asInstanceOf[ComponentType[
    TableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ]]
  @scala.inline
  def TableBody: ComponentType[
    TableBodyProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = typings.grommet.mod.TableBody.asInstanceOf[ComponentType[
    TableBodyProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ]]
  @scala.inline
  def TableCell: ComponentType[
    TableCellProps with BoxTypes with (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
  ] = typings.grommet.mod.TableCell.asInstanceOf[ComponentType[
    TableCellProps with BoxTypes with (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
  ]]
  @scala.inline
  def TableFooter: ComponentType[
    TableFooterProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = typings.grommet.mod.TableFooter.asInstanceOf[ComponentType[
    TableFooterProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ]]
  @scala.inline
  def TableHeader: ComponentType[
    TableHeaderProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = typings.grommet.mod.TableHeader.asInstanceOf[ComponentType[
    TableHeaderProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ]]
  @scala.inline
  def TableRow: ComponentType[
    TableRowProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement])
  ] = typings.grommet.mod.TableRow.asInstanceOf[ComponentType[
    TableRowProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement])
  ]]
  @scala.inline
  def Tabs: ComponentType[
    TabsProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = typings.grommet.mod.Tabs.asInstanceOf[ComponentType[
    TabsProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ]]
  @scala.inline
  def Text: ComponentType[
    TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
  ] = typings.grommet.mod.Text.asInstanceOf[ComponentType[
    TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
  ]]
  @scala.inline
  def TextArea: ComponentType[
    TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement])
  ] = typings.grommet.mod.TextArea.asInstanceOf[ComponentType[
    TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement])
  ]]
  @scala.inline
  def TextInput: ComponentType[
    TextInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ])
  ] = js.constructorOf[typings.grommet.mod.TextInput].asInstanceOf[ComponentType[
    TextInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ])
  ]]
  @scala.inline
  def Video: ComponentType[
    VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
      DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
      controls
    ])
  ] = js.constructorOf[typings.grommet.mod.Video].asInstanceOf[ComponentType[
    VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
      DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
      controls
    ])
  ]]
  @scala.inline
  def WorldMap: ComponentType[WorldMapProps with SVGProps[SVGSVGElement]] = js.constructorOf[typings.grommet.mod.WorldMap].asInstanceOf[ComponentType[WorldMapProps with SVGProps[SVGSVGElement]]]
}

