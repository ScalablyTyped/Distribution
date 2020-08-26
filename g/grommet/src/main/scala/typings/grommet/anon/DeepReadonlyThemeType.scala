package typings.grommet.anon

import typings.grommet.utilsMod.DeepReadonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined grommet.grommet/es6/utils.DeepReadonly<grommet.grommet/es6/themes/base.ThemeType> */
@js.native
trait DeepReadonlyThemeType extends js.Object {
  val accordion: js.UndefOr[Panel | DeepReadonly[js.UndefOr[Panel]]] = js.native
  val anchor: js.UndefOr[FontWeight | DeepReadonly[js.UndefOr[FontWeight]]] = js.native
  val avatar: js.UndefOr[SizeText | DeepReadonly[js.UndefOr[SizeText]]] = js.native
  val box: js.UndefOr[ResponsiveBreakpoint | DeepReadonly[js.UndefOr[ResponsiveBreakpoint]]] = js.native
  val button: js.UndefOr[Default | DeepReadonly[js.UndefOr[Default]]] = js.native
  val calendar: js.UndefOr[HeadingIcons | DeepReadonly[js.UndefOr[HeadingIcons]]] = js.native
  val carousel: js.UndefOr[AnimationDisabled | DeepReadonly[js.UndefOr[AnimationDisabled]]] = js.native
  val chart: js.UndefOr[ColorExtend | DeepReadonly[js.UndefOr[ColorExtend]]] = js.native
  val checkBox: js.UndefOr[Icon | DeepReadonly[js.UndefOr[Icon]]] = js.native
  val clock: js.UndefOr[Analog | DeepReadonly[js.UndefOr[Analog]]] = js.native
  val collapsible: js.UndefOr[Baseline | DeepReadonly[js.UndefOr[Baseline]]] = js.native
  val dataTable: js.UndefOr[GroupEnd | DeepReadonly[js.UndefOr[GroupEnd]]] = js.native
  val diagram: js.UndefOr[Line | DeepReadonly[js.UndefOr[Line]]] = js.native
  val drop: js.UndefOr[MaxHeight | DeepReadonly[js.UndefOr[MaxHeight]]] = js.native
  val formField: js.UndefOr[Content | DeepReadonly[js.UndefOr[Content]]] = js.native
  val global: js.UndefOr[Animation | DeepReadonly[js.UndefOr[Animation]]] = js.native
  val grommet: js.UndefOr[`10` | DeepReadonly[js.UndefOr[`10`]]] = js.native
  val heading: js.UndefOr[Extend | DeepReadonly[js.UndefOr[Extend]]] = js.native
  val icon: js.UndefOr[`21` | DeepReadonly[js.UndefOr[`21`]]] = js.native
  val layer: js.UndefOr[Overlay | DeepReadonly[js.UndefOr[Overlay]]] = js.native
  val list: js.UndefOr[Item | DeepReadonly[js.UndefOr[Item]]] = js.native
  val maskedInput: js.UndefOr[`18` | DeepReadonly[js.UndefOr[`18`]]] = js.native
  val menu: js.UndefOr[Icons | DeepReadonly[js.UndefOr[Icons]]] = js.native
  val meter: js.UndefOr[Colors | DeepReadonly[js.UndefOr[Colors]]] = js.native
  val paragraph: js.UndefOr[Xlarge | DeepReadonly[js.UndefOr[Xlarge]]] = js.native
  val radioButton: js.UndefOr[Check | DeepReadonly[js.UndefOr[Check]]] = js.native
  val rangeInput: js.UndefOr[Thumb | DeepReadonly[js.UndefOr[Thumb]]] = js.native
  val rangeSelector: js.UndefOr[Edge | DeepReadonly[js.UndefOr[Edge]]] = js.native
  val select: js.UndefOr[Control | DeepReadonly[js.UndefOr[Control]]] = js.native
  val tab: js.UndefOr[Hover | DeepReadonly[js.UndefOr[Hover]]] = js.native
  val table: js.UndefOr[Body | DeepReadonly[js.UndefOr[Body]]] = js.native
  val tabs: js.UndefOr[Gap | DeepReadonly[js.UndefOr[Gap]]] = js.native
  val text: js.UndefOr[Xsmall | DeepReadonly[js.UndefOr[Xsmall]]] = js.native
  val textArea: js.UndefOr[DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]] = js.native
  val textInput: js.UndefOr[DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]] = js.native
  val video: js.UndefOr[Captions | DeepReadonly[js.UndefOr[Captions]]] = js.native
  val worldMap: js.UndefOr[Continent | DeepReadonly[js.UndefOr[Continent]]] = js.native
}

object DeepReadonlyThemeType {
  @scala.inline
  def apply(): DeepReadonlyThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepReadonlyThemeType]
  }
  @scala.inline
  implicit class DeepReadonlyThemeTypeOps[Self <: DeepReadonlyThemeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccordion(value: Panel | DeepReadonly[js.UndefOr[Panel]]): Self = this.set("accordion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccordion: Self = this.set("accordion", js.undefined)
    @scala.inline
    def setAnchor(value: FontWeight | DeepReadonly[js.UndefOr[FontWeight]]): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setAvatar(value: SizeText | DeepReadonly[js.UndefOr[SizeText]]): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setBox(value: ResponsiveBreakpoint | DeepReadonly[js.UndefOr[ResponsiveBreakpoint]]): Self = this.set("box", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    @scala.inline
    def setButton(value: Default | DeepReadonly[js.UndefOr[Default]]): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setCalendar(value: HeadingIcons | DeepReadonly[js.UndefOr[HeadingIcons]]): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setCarousel(value: AnimationDisabled | DeepReadonly[js.UndefOr[AnimationDisabled]]): Self = this.set("carousel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarousel: Self = this.set("carousel", js.undefined)
    @scala.inline
    def setChart(value: ColorExtend | DeepReadonly[js.UndefOr[ColorExtend]]): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setCheckBox(value: Icon | DeepReadonly[js.UndefOr[Icon]]): Self = this.set("checkBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckBox: Self = this.set("checkBox", js.undefined)
    @scala.inline
    def setClock(value: Analog | DeepReadonly[js.UndefOr[Analog]]): Self = this.set("clock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClock: Self = this.set("clock", js.undefined)
    @scala.inline
    def setCollapsible(value: Baseline | DeepReadonly[js.UndefOr[Baseline]]): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setDataTable(value: GroupEnd | DeepReadonly[js.UndefOr[GroupEnd]]): Self = this.set("dataTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTable: Self = this.set("dataTable", js.undefined)
    @scala.inline
    def setDiagram(value: Line | DeepReadonly[js.UndefOr[Line]]): Self = this.set("diagram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagram: Self = this.set("diagram", js.undefined)
    @scala.inline
    def setDrop(value: MaxHeight | DeepReadonly[js.UndefOr[MaxHeight]]): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setFormField(value: Content | DeepReadonly[js.UndefOr[Content]]): Self = this.set("formField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormField: Self = this.set("formField", js.undefined)
    @scala.inline
    def setGlobal(value: Animation | DeepReadonly[js.UndefOr[Animation]]): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setGrommet(value: `10` | DeepReadonly[js.UndefOr[`10`]]): Self = this.set("grommet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrommet: Self = this.set("grommet", js.undefined)
    @scala.inline
    def setHeading(value: Extend | DeepReadonly[js.UndefOr[Extend]]): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setIcon(value: `21` | DeepReadonly[js.UndefOr[`21`]]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLayer(value: Overlay | DeepReadonly[js.UndefOr[Overlay]]): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setList(value: Item | DeepReadonly[js.UndefOr[Item]]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setMaskedInput(value: `18` | DeepReadonly[js.UndefOr[`18`]]): Self = this.set("maskedInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskedInput: Self = this.set("maskedInput", js.undefined)
    @scala.inline
    def setMenu(value: Icons | DeepReadonly[js.UndefOr[Icons]]): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setMeter(value: Colors | DeepReadonly[js.UndefOr[Colors]]): Self = this.set("meter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeter: Self = this.set("meter", js.undefined)
    @scala.inline
    def setParagraph(value: Xlarge | DeepReadonly[js.UndefOr[Xlarge]]): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    @scala.inline
    def setRadioButton(value: Check | DeepReadonly[js.UndefOr[Check]]): Self = this.set("radioButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioButton: Self = this.set("radioButton", js.undefined)
    @scala.inline
    def setRangeInput(value: Thumb | DeepReadonly[js.UndefOr[Thumb]]): Self = this.set("rangeInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeInput: Self = this.set("rangeInput", js.undefined)
    @scala.inline
    def setRangeSelector(value: Edge | DeepReadonly[js.UndefOr[Edge]]): Self = this.set("rangeSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSelector: Self = this.set("rangeSelector", js.undefined)
    @scala.inline
    def setSelect(value: Control | DeepReadonly[js.UndefOr[Control]]): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setTab(value: Hover | DeepReadonly[js.UndefOr[Hover]]): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
    @scala.inline
    def setTable(value: Body | DeepReadonly[js.UndefOr[Body]]): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setTabs(value: Gap | DeepReadonly[js.UndefOr[Gap]]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setText(value: Xsmall | DeepReadonly[js.UndefOr[Xsmall]]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextArea(value: DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]): Self = this.set("textArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextArea: Self = this.set("textArea", js.undefined)
    @scala.inline
    def setTextInput(value: DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]): Self = this.set("textInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextInput: Self = this.set("textInput", js.undefined)
    @scala.inline
    def setVideo(value: Captions | DeepReadonly[js.UndefOr[Captions]]): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setWorldMap(value: Continent | DeepReadonly[js.UndefOr[Continent]]): Self = this.set("worldMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldMap: Self = this.set("worldMap", js.undefined)
  }
  
}

