package typings.grommet

import typings.grommet.accordionMod.AccordionProps
import typings.grommet.accordionPanelMod.AccordionPanelProps
import typings.grommet.anchorMod.AnchorProps
import typings.grommet.announceContextMod.AnnounceValue
import typings.grommet.anon.Analog
import typings.grommet.anon.Animation
import typings.grommet.anon.AnimationDisabled
import typings.grommet.anon.Baseline
import typings.grommet.anon.BodyContainer
import typings.grommet.anon.Captions
import typings.grommet.anon.Check
import typings.grommet.anon.ColorExtend
import typings.grommet.anon.Colors
import typings.grommet.anon.Container
import typings.grommet.anon.Content
import typings.grommet.anon.Continent
import typings.grommet.anon.Control
import typings.grommet.anon.Day
import typings.grommet.anon.DeepReadonlyThemeType
import typings.grommet.anon.Default
import typings.grommet.anon.DisabledExtend
import typings.grommet.anon.Edge
import typings.grommet.anon.Extend
import typings.grommet.anon.FontWeight
import typings.grommet.anon.GroupEnd
import typings.grommet.anon.Hover
import typings.grommet.anon.Icons
import typings.grommet.anon.Item
import typings.grommet.anon.Line
import typings.grommet.anon.MaxHeight
import typings.grommet.anon.Overlay
import typings.grommet.anon.Panel
import typings.grommet.anon.Position
import typings.grommet.anon.ResponsiveBreakpoint
import typings.grommet.anon.RoutedAnchorPropsOmitAnch
import typings.grommet.anon.SizeText
import typings.grommet.anon.Thumb
import typings.grommet.anon.Toggle
import typings.grommet.anon.Xlarge
import typings.grommet.anon.Xsmall
import typings.grommet.anon.`13`
import typings.grommet.anon.`14`
import typings.grommet.anon.`22`
import typings.grommet.anon.`25`
import typings.grommet.avatarMod.AvatarProps
import typings.grommet.baseMod.ThemeType
import typings.grommet.boxMod.BoxProps
import typings.grommet.boxMod.BoxTypes
import typings.grommet.buttonMod.ButtonProps
import typings.grommet.buttonMod.ButtonType
import typings.grommet.calendarMod.CalendarProps
import typings.grommet.carouselMod.CarouselProps
import typings.grommet.chartMod.ChartProps
import typings.grommet.checkBoxGroupMod.CheckBoxGroupProps
import typings.grommet.checkBoxMod.CheckBoxProps
import typings.grommet.clockMod.ClockProps
import typings.grommet.collapsibleMod.CollapsibleProps
import typings.grommet.containerTargetContextMod.ContainerTargetValue
import typings.grommet.dataChartMod.DataChartProps
import typings.grommet.dataTableMod.DataTableProps
import typings.grommet.dateInputMod.DateInputProps
import typings.grommet.diagramMod.DiagramProps
import typings.grommet.distributionMod.DistributionProps
import typings.grommet.dropButtonMod.DropButtonProps
import typings.grommet.dropMod.DropProps
import typings.grommet.formFieldMod.FormFieldProps
import typings.grommet.formMod.FormProps
import typings.grommet.formMod.TypedForm
import typings.grommet.gridMod.GridProps
import typings.grommet.grommetMod.GrommetProps
import typings.grommet.grommetStrings.color
import typings.grommet.grommetStrings.controls
import typings.grommet.grommetStrings.icon
import typings.grommet.grommetStrings.id
import typings.grommet.grommetStrings.mask
import typings.grommet.grommetStrings.name
import typings.grommet.grommetStrings.onBlur
import typings.grommet.grommetStrings.onChange
import typings.grommet.grommetStrings.onSelect
import typings.grommet.grommetStrings.onSubmit
import typings.grommet.grommetStrings.placeholder
import typings.grommet.grommetStrings.plain
import typings.grommet.grommetStrings.reverse
import typings.grommet.grommetStrings.size
import typings.grommet.grommetStrings.title
import typings.grommet.grommetStrings.value
import typings.grommet.headingMod.HeadingProps
import typings.grommet.imageMod.ImageProps
import typings.grommet.infiniteScrollMod.InfiniteScrollProps
import typings.grommet.keyboardMod.KeyboardProps
import typings.grommet.layerMod.LayerProps
import typings.grommet.listMod.ListProps
import typings.grommet.markdownMod.MarkdownProps
import typings.grommet.maskedInputMod.MaskedInputProps
import typings.grommet.menuMod.MenuProps
import typings.grommet.meterMod.MeterProps
import typings.grommet.paragraphMod.ParagraphProps
import typings.grommet.radioButtonGroupMod.RadioButtonGroupProps
import typings.grommet.radioButtonMod.RadioButtonProps
import typings.grommet.rangeInputMod.RangeInputProps
import typings.grommet.rangeSelectorMod.RangeSelectorProps
import typings.grommet.responsiveContextMod.ResponsiveValue
import typings.grommet.routedButtonMod.RoutedButtonProps
import typings.grommet.selectMod.SelectProps
import typings.grommet.sidebarMod.SidebarProps
import typings.grommet.skipLinkMod.SkipLinkProps
import typings.grommet.skipLinkTargetMod.SkipLinkTargetProps
import typings.grommet.skipLinksMod.SkipLinksProps
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
import typings.grommet.themeContextMod.ThemeContextI
import typings.grommet.utilsMod.DeepReadonly
import typings.grommet.utilsMod.Omit
import typings.grommet.videoMod.VideoProps
import typings.grommet.worldMapMod.WorldMapProps
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grommet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grommet", "Accordion")
  @js.native
  val Accordion: FC[
    BoxProps & AccordionProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "AccordionPanel")
  @js.native
  class AccordionPanel protected ()
    extends Component[
          AccordionPanelProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: AccordionPanelProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: AccordionPanelProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "AccordionPanel")
  @js.native
  val AccordionPanel: ComponentClass[
    AccordionPanelProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "Anchor")
  @js.native
  val Anchor: FC[
    AnchorProps & (Omit[
      DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
      color
    ])
  ] = js.native
  
  @JSImport("grommet", "AnnounceContext")
  @js.native
  val AnnounceContext: Context[AnnounceValue] = js.native
  
  @JSImport("grommet", "Avatar")
  @js.native
  val Avatar: FC[
    BoxProps & AvatarProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "Box")
  @js.native
  val Box: FC[BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])] = js.native
  
  @JSImport("grommet", "Button")
  @js.native
  val Button: FC[
    ButtonProps & (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Calendar")
  @js.native
  class Calendar protected ()
    extends Component[
          CalendarProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: CalendarProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CalendarProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Calendar")
  @js.native
  val Calendar: ComponentClass[
    CalendarProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "Card")
  @js.native
  val Card: FC[BoxTypes] = js.native
  
  @JSImport("grommet", "CardBody")
  @js.native
  val CardBody: FC[BoxTypes] = js.native
  
  @JSImport("grommet", "CardFooter")
  @js.native
  val CardFooter: FC[BoxTypes] = js.native
  
  @JSImport("grommet", "CardHeader")
  @js.native
  val CardHeader: FC[BoxTypes] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Carousel")
  @js.native
  class Carousel protected ()
    extends Component[
          CarouselProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: CarouselProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CarouselProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Carousel")
  @js.native
  val Carousel: ComponentClass[
    CarouselProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Chart")
  @js.native
  class Chart protected ()
    extends Component[ChartProps, ComponentState, js.Any] {
    def this(props: ChartProps) = this()
    def this(props: ChartProps, context: js.Any) = this()
  }
  @JSImport("grommet", "Chart")
  @js.native
  val Chart: ComponentClass[ChartProps, ComponentState] = js.native
  
  @JSImport("grommet", "CheckBox")
  @js.native
  val CheckBox: FC[
    CheckBoxProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "CheckBoxGroup")
  @js.native
  class CheckBoxGroup protected ()
    extends Component[
          CheckBoxGroupProps & BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: CheckBoxGroupProps & BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CheckBoxGroupProps & BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "CheckBoxGroup")
  @js.native
  val CheckBoxGroup: ComponentClass[
    CheckBoxGroupProps & BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Clock")
  @js.native
  class Clock protected ()
    extends Component[
          ClockProps & ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: ClockProps & ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])) = this()
    def this(
      props: ClockProps & ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Clock")
  @js.native
  val Clock: ComponentClass[
    ClockProps & ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
    ComponentState
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Collapsible")
  @js.native
  class Collapsible protected ()
    extends Component[
          CollapsibleProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: CollapsibleProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CollapsibleProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Collapsible")
  @js.native
  val Collapsible: ComponentClass[
    CollapsibleProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "ContainerTargetContext")
  @js.native
  val ContainerTargetContext: Context[ContainerTargetValue] = js.native
  
  @JSImport("grommet", "DataChart")
  @js.native
  val DataChart: FC[DataChartProps] = js.native
  
  @JSImport("grommet", "DataTable")
  @js.native
  class DataTable[TRowType] protected ()
    extends typings.grommet.dataTableMod.DataTable[TRowType] {
    def this(props: DataTableProps[TRowType] & (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(
      props: DataTableProps[TRowType] & (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]),
      context: js.Any
    ) = this()
  }
  
  @JSImport("grommet", "DateInput")
  @js.native
  val DateInput: FC[DateInputProps] = js.native
  
  @JSImport("grommet", "Diagram")
  @js.native
  val Diagram: FC[DiagramProps & SVGProps[SVGSVGElement]] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Distribution")
  @js.native
  class Distribution protected ()
    extends Component[
          DistributionProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: DistributionProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: DistributionProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Distribution")
  @js.native
  val Distribution: ComponentClass[
    DistributionProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Drop")
  @js.native
  class Drop protected ()
    extends Component[
          DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Drop")
  @js.native
  val Drop: ComponentClass[
    DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "DropButton")
  @js.native
  class DropButton protected ()
    extends Component[
          DropButtonProps & ButtonProps & (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            color
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: DropButtonProps & ButtonProps & (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            color
          ])) = this()
    def this(
      props: DropButtonProps & ButtonProps & (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            color
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "DropButton")
  @js.native
  val DropButton: ComponentClass[
    DropButtonProps & ButtonProps & (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "Footer")
  @js.native
  val Footer: FC[BoxProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Form")
  @js.native
  class Form protected ()
    extends Component[
          FormProps[js.Any] & (typings.std.Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: FormProps[js.Any] & (typings.std.Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ])) = this()
    def this(
      props: FormProps[js.Any] & (typings.std.Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Form")
  @js.native
  val Form: TypedForm[js.Any] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "FormField")
  @js.native
  class FormField protected ()
    extends Component[
          FormFieldProps & (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            placeholder
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: FormFieldProps & (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            placeholder
          ])) = this()
    def this(
      props: FormFieldProps & (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            placeholder
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "FormField")
  @js.native
  val FormField: ComponentClass[
    FormFieldProps & (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      placeholder
    ]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "Grid")
  @js.native
  val Grid: FC[GridProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Grommet")
  @js.native
  class Grommet_ protected ()
    extends Component[
          GrommetProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: GrommetProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: GrommetProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  
  @JSImport("grommet", "Grommet")
  @js.native
  val Grommet_ : ComponentClass[
    GrommetProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "Header")
  @js.native
  val Header: FC[BoxTypes] = js.native
  
  @JSImport("grommet", "Heading")
  @js.native
  val Heading: FC[
    HeadingProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
  ] = js.native
  
  @JSImport("grommet", "Image")
  @js.native
  val Image: FC[
    ImageProps & (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "InfiniteScroll")
  @js.native
  class InfiniteScroll protected ()
    extends Component[InfiniteScrollProps, ComponentState, js.Any] {
    def this(props: InfiniteScrollProps) = this()
    def this(props: InfiniteScrollProps, context: js.Any) = this()
  }
  @JSImport("grommet", "InfiniteScroll")
  @js.native
  val InfiniteScroll: ComponentClass[InfiniteScrollProps, ComponentState] = js.native
  
  @JSImport("grommet", "Keyboard")
  @js.native
  val Keyboard: FC[KeyboardProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Layer")
  @js.native
  class Layer protected ()
    extends Component[
          LayerProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: LayerProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: LayerProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Layer")
  @js.native
  val Layer: ComponentClass[
    LayerProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "List")
  @js.native
  class List protected ()
    extends Component[
          ListProps & (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: ListProps & (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])) = this()
    def this(
      props: ListProps & (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "List")
  @js.native
  val List: ComponentClass[
    ListProps & (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "Main")
  @js.native
  val Main: FC[BoxProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Markdown")
  @js.native
  class Markdown protected ()
    extends Component[
          MarkdownProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: MarkdownProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: MarkdownProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Markdown")
  @js.native
  val Markdown: ComponentClass[
    MarkdownProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "MaskedInput")
  @js.native
  class MaskedInput protected ()
    extends Component[
          MaskedInputProps & (typings.std.Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: MaskedInputProps & (typings.std.Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ])) = this()
    def this(
      props: MaskedInputProps & (typings.std.Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "MaskedInput")
  @js.native
  val MaskedInput: ComponentClass[
    MaskedInputProps & (typings.std.Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      icon | id | mask | name | onBlur | plain | reverse | size | value
    ]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "Menu")
  @js.native
  val Menu: FC[MenuProps & (Omit[ButtonType, icon])] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Meter")
  @js.native
  class Meter protected ()
    extends Component[MeterProps, ComponentState, js.Any] {
    def this(props: MeterProps) = this()
    def this(props: MeterProps, context: js.Any) = this()
  }
  @JSImport("grommet", "Meter")
  @js.native
  val Meter: ComponentClass[MeterProps, ComponentState] = js.native
  
  @JSImport("grommet", "Nav")
  @js.native
  val Nav: FC[BoxProps] = js.native
  
  @JSImport("grommet", "Paragraph")
  @js.native
  val Paragraph: FC[
    ParagraphProps & (Omit[
      DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
      color
    ])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RadioButton")
  @js.native
  class RadioButton protected ()
    extends Component[
          RadioButtonProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: RadioButtonProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])) = this()
    def this(
      props: RadioButtonProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "RadioButton")
  @js.native
  val RadioButton: ComponentClass[
    RadioButtonProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
    ComponentState
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RadioButtonGroup")
  @js.native
  class RadioButtonGroup protected ()
    extends Component[
          RadioButtonGroupProps & BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: RadioButtonGroupProps & BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: RadioButtonGroupProps & BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "RadioButtonGroup")
  @js.native
  val RadioButtonGroup: ComponentClass[
    RadioButtonGroupProps & BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "RangeInput")
  @js.native
  val RangeInput: FC[
    RangeInputProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RangeSelector")
  @js.native
  class RangeSelector protected ()
    extends Component[
          RangeSelectorProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: RangeSelectorProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])) = this()
    def this(
      props: RangeSelectorProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "RangeSelector")
  @js.native
  val RangeSelector: ComponentClass[
    RangeSelectorProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "ResponsiveContext")
  @js.native
  val ResponsiveContext: Context[ResponsiveValue] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RoutedAnchor")
  @js.native
  class RoutedAnchor protected ()
    extends Component[RoutedAnchorPropsOmitAnch, ComponentState, js.Any] {
    def this(props: RoutedAnchorPropsOmitAnch) = this()
    def this(props: RoutedAnchorPropsOmitAnch, context: js.Any) = this()
  }
  @JSImport("grommet", "RoutedAnchor")
  @js.native
  val RoutedAnchor: ComponentClass[RoutedAnchorPropsOmitAnch, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RoutedButton")
  @js.native
  class RoutedButton protected ()
    extends Component[RoutedButtonProps & ButtonProps, ComponentState, js.Any] {
    def this(props: RoutedButtonProps & ButtonProps) = this()
    def this(props: RoutedButtonProps & ButtonProps, context: js.Any) = this()
  }
  @JSImport("grommet", "RoutedButton")
  @js.native
  val RoutedButton: ComponentClass[RoutedButtonProps & ButtonProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Select")
  @js.native
  class Select protected ()
    extends Component[SelectProps, ComponentState, js.Any] {
    def this(props: SelectProps) = this()
    def this(props: SelectProps, context: js.Any) = this()
  }
  @JSImport("grommet", "Select")
  @js.native
  val Select: ComponentClass[SelectProps, ComponentState] = js.native
  
  @JSImport("grommet", "Sidebar")
  @js.native
  val Sidebar: FC[
    BoxProps & SidebarProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "SkipLink")
  @js.native
  val SkipLink: FC[SkipLinkProps] = js.native
  
  @JSImport("grommet", "SkipLinkTarget")
  @js.native
  val SkipLinkTarget: FC[SkipLinkTargetProps] = js.native
  
  @JSImport("grommet", "SkipLinks")
  @js.native
  val SkipLinks: FC[SkipLinksProps] = js.native
  
  @JSImport("grommet", "Stack")
  @js.native
  val Stack: FC[StackProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Tab")
  @js.native
  class Tab protected ()
    extends Component[
          TabProps & (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            title
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: TabProps & (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            title
          ])) = this()
    def this(
      props: TabProps & (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            title
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Tab")
  @js.native
  val Tab: ComponentClass[
    TabProps & (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      title
    ]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "Table")
  @js.native
  val Table: FC[
    TableProps & (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = js.native
  
  @JSImport("grommet", "TableBody")
  @js.native
  val TableBody: FC[
    TableBodyProps & (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = js.native
  
  @JSImport("grommet", "TableCell")
  @js.native
  val TableCell: FC[
    TableCellProps & BoxTypes & (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
  ] = js.native
  
  @JSImport("grommet", "TableFooter")
  @js.native
  val TableFooter: FC[
    TableFooterProps & (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = js.native
  
  @JSImport("grommet", "TableHeader")
  @js.native
  val TableHeader: FC[
    TableHeaderProps & (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = js.native
  
  @JSImport("grommet", "TableRow")
  @js.native
  val TableRow: FC[
    TableRowProps & (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement])
  ] = js.native
  
  @JSImport("grommet", "Tabs")
  @js.native
  val Tabs: FC[TabsProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])] = js.native
  
  @JSImport("grommet", "Text")
  @js.native
  val Text: FC[
    TextProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
  ] = js.native
  
  @JSImport("grommet", "TextArea")
  @js.native
  val TextArea: FC[
    TextAreaProps & (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "TextInput")
  @js.native
  class TextInput protected ()
    extends Component[
          TextInputProps & (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: TextInputProps & (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ])) = this()
    def this(
      props: TextInputProps & (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "TextInput")
  @js.native
  val TextInput: ComponentClass[
    TextInputProps & (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ]), 
    ComponentState
  ] = js.native
  
  @JSImport("grommet", "ThemeContext")
  @js.native
  val ThemeContext: ThemeContextI = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Video")
  @js.native
  class Video protected ()
    extends Component[
          VideoProps & (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) & (Omit[
            DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
            controls
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: VideoProps & (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) & (Omit[
            DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
            controls
          ])) = this()
    def this(
      props: VideoProps & (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) & (Omit[
            DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
            controls
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Video")
  @js.native
  val Video: ComponentClass[
    VideoProps & (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) & (Omit[
      DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
      controls
    ]), 
    ComponentState
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "WorldMap")
  @js.native
  class WorldMap protected ()
    extends Component[
          WorldMapProps & (typings.std.Omit[SVGProps[SVGSVGElement], color]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: WorldMapProps & (typings.std.Omit[SVGProps[SVGSVGElement], color])) = this()
    def this(props: WorldMapProps & (typings.std.Omit[SVGProps[SVGSVGElement], color]), context: js.Any) = this()
  }
  @JSImport("grommet", "WorldMap")
  @js.native
  val WorldMap: ComponentClass[WorldMapProps & (typings.std.Omit[SVGProps[SVGSVGElement], color]), ComponentState] = js.native
  
  /* Inlined grommet.grommet/utils.DeepReadonly<grommet.grommet/themes/base.ThemeType> */
  object base {
    
    @JSImport("grommet", "base.accordion")
    @js.native
    val accordion: js.UndefOr[Panel | DeepReadonly[js.UndefOr[Panel]]] = js.native
    
    @JSImport("grommet", "base.anchor")
    @js.native
    val anchor: js.UndefOr[FontWeight | DeepReadonly[js.UndefOr[FontWeight]]] = js.native
    
    @JSImport("grommet", "base.avatar")
    @js.native
    val avatar: js.UndefOr[SizeText | DeepReadonly[js.UndefOr[SizeText]]] = js.native
    
    @JSImport("grommet", "base.box")
    @js.native
    val box: js.UndefOr[ResponsiveBreakpoint | DeepReadonly[js.UndefOr[ResponsiveBreakpoint]]] = js.native
    
    @JSImport("grommet", "base.button")
    @js.native
    val button: js.UndefOr[Default | DeepReadonly[js.UndefOr[Default]]] = js.native
    
    @JSImport("grommet", "base.calendar")
    @js.native
    val calendar: js.UndefOr[Day | DeepReadonly[js.UndefOr[Day]]] = js.native
    
    @JSImport("grommet", "base.card")
    @js.native
    val card: js.UndefOr[BodyContainer | DeepReadonly[js.UndefOr[BodyContainer]]] = js.native
    
    @JSImport("grommet", "base.carousel")
    @js.native
    val carousel: js.UndefOr[AnimationDisabled | DeepReadonly[js.UndefOr[AnimationDisabled]]] = js.native
    
    @JSImport("grommet", "base.chart")
    @js.native
    val chart: js.UndefOr[ColorExtend | DeepReadonly[js.UndefOr[ColorExtend]]] = js.native
    
    @JSImport("grommet", "base.checkBox")
    @js.native
    val checkBox: js.UndefOr[Toggle | DeepReadonly[js.UndefOr[Toggle]]] = js.native
    
    @JSImport("grommet", "base.clock")
    @js.native
    val clock: js.UndefOr[Analog | DeepReadonly[js.UndefOr[Analog]]] = js.native
    
    @JSImport("grommet", "base.collapsible")
    @js.native
    val collapsible: js.UndefOr[Baseline | DeepReadonly[js.UndefOr[Baseline]]] = js.native
    
    @JSImport("grommet", "base.dataTable")
    @js.native
    val dataTable: js.UndefOr[GroupEnd | DeepReadonly[js.UndefOr[GroupEnd]]] = js.native
    
    @JSImport("grommet", "base.dateInput")
    @js.native
    val dateInput: js.UndefOr[`13` | DeepReadonly[js.UndefOr[`13`]]] = js.native
    
    @JSImport("grommet", "base.diagram")
    @js.native
    val diagram: js.UndefOr[Line | DeepReadonly[js.UndefOr[Line]]] = js.native
    
    @JSImport("grommet", "base.drop")
    @js.native
    val drop: js.UndefOr[MaxHeight | DeepReadonly[js.UndefOr[MaxHeight]]] = js.native
    
    @JSImport("grommet", "base.formField")
    @js.native
    val formField: js.UndefOr[Content | DeepReadonly[js.UndefOr[Content]]] = js.native
    
    @JSImport("grommet", "base.global")
    @js.native
    val global: js.UndefOr[Animation | DeepReadonly[js.UndefOr[Animation]]] = js.native
    
    @JSImport("grommet", "base.grommet")
    @js.native
    val grommet: js.UndefOr[`14` | DeepReadonly[js.UndefOr[`14`]]] = js.native
    
    @JSImport("grommet", "base.heading")
    @js.native
    val heading: js.UndefOr[Extend | DeepReadonly[js.UndefOr[Extend]]] = js.native
    
    @JSImport("grommet", "base.icon")
    @js.native
    val icon: js.UndefOr[`25` | DeepReadonly[js.UndefOr[`25`]]] = js.native
    
    @JSImport("grommet", "base.layer")
    @js.native
    val layer: js.UndefOr[Overlay | DeepReadonly[js.UndefOr[Overlay]]] = js.native
    
    @JSImport("grommet", "base.list")
    @js.native
    val list: js.UndefOr[Item | DeepReadonly[js.UndefOr[Item]]] = js.native
    
    @JSImport("grommet", "base.maskedInput")
    @js.native
    val maskedInput: js.UndefOr[`22` | DeepReadonly[js.UndefOr[`22`]]] = js.native
    
    @JSImport("grommet", "base.menu")
    @js.native
    val menu: js.UndefOr[Icons | DeepReadonly[js.UndefOr[Icons]]] = js.native
    
    @JSImport("grommet", "base.meter")
    @js.native
    val meter: js.UndefOr[Colors | DeepReadonly[js.UndefOr[Colors]]] = js.native
    
    @JSImport("grommet", "base.paragraph")
    @js.native
    val paragraph: js.UndefOr[Xlarge | DeepReadonly[js.UndefOr[Xlarge]]] = js.native
    
    @JSImport("grommet", "base.radioButton")
    @js.native
    val radioButton: js.UndefOr[Check | DeepReadonly[js.UndefOr[Check]]] = js.native
    
    @JSImport("grommet", "base.radioButtonGroup")
    @js.native
    val radioButtonGroup: js.UndefOr[Container | DeepReadonly[js.UndefOr[Container]]] = js.native
    
    @JSImport("grommet", "base.rangeInput")
    @js.native
    val rangeInput: js.UndefOr[Thumb | DeepReadonly[js.UndefOr[Thumb]]] = js.native
    
    @JSImport("grommet", "base.rangeSelector")
    @js.native
    val rangeSelector: js.UndefOr[Edge | DeepReadonly[js.UndefOr[Edge]]] = js.native
    
    @JSImport("grommet", "base.select")
    @js.native
    val select: js.UndefOr[Control | DeepReadonly[js.UndefOr[Control]]] = js.native
    
    @JSImport("grommet", "base.skipLinks")
    @js.native
    val skipLinks: js.UndefOr[Position | DeepReadonly[js.UndefOr[Position]]] = js.native
    
    @JSImport("grommet", "base.tab")
    @js.native
    val tab: js.UndefOr[Hover | DeepReadonly[js.UndefOr[Hover]]] = js.native
    
    @JSImport("grommet", "base.table")
    @js.native
    val table: js.UndefOr[
        typings.grommet.anon.Footer | DeepReadonly[js.UndefOr[typings.grommet.anon.Footer]]
      ] = js.native
    
    @JSImport("grommet", "base.tabs")
    @js.native
    val tabs: js.UndefOr[
        typings.grommet.anon.Header | DeepReadonly[js.UndefOr[typings.grommet.anon.Header]]
      ] = js.native
    
    @JSImport("grommet", "base.text")
    @js.native
    val text: js.UndefOr[Xsmall | DeepReadonly[js.UndefOr[Xsmall]]] = js.native
    
    @JSImport("grommet", "base.textArea")
    @js.native
    val textArea: js.UndefOr[DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]] = js.native
    
    @JSImport("grommet", "base.textInput")
    @js.native
    val textInput: js.UndefOr[DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]] = js.native
    
    @JSImport("grommet", "base.video")
    @js.native
    val video: js.UndefOr[Captions | DeepReadonly[js.UndefOr[Captions]]] = js.native
    
    @JSImport("grommet", "base.worldMap")
    @js.native
    val worldMap: js.UndefOr[Continent | DeepReadonly[js.UndefOr[Continent]]] = js.native
  }
  
  @JSImport("grommet", "dark")
  @js.native
  val dark: ThemeType = js.native
  
  @scala.inline
  def extendDefaultTheme(theme: ThemeType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendDefaultTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def generate(): DeepReadonlyThemeType = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[DeepReadonlyThemeType]
  @scala.inline
  def generate(baseSpacing: Double): DeepReadonlyThemeType = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(baseSpacing.asInstanceOf[js.Any]).asInstanceOf[DeepReadonlyThemeType]
  @scala.inline
  def generate(baseSpacing: Double, scale: Double): DeepReadonlyThemeType = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(baseSpacing.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[DeepReadonlyThemeType]
  @scala.inline
  def generate(baseSpacing: Unit, scale: Double): DeepReadonlyThemeType = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(baseSpacing.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[DeepReadonlyThemeType]
  
  @JSImport("grommet", "grommet")
  @js.native
  val grommet: ThemeType = js.native
}
