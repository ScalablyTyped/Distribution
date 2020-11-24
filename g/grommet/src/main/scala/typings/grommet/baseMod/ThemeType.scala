package typings.grommet.baseMod

import typings.grommet.anon.Analog
import typings.grommet.anon.Animation
import typings.grommet.anon.AnimationDisabled
import typings.grommet.anon.Baseline
import typings.grommet.anon.BodyContainer
import typings.grommet.anon.Captions
import typings.grommet.anon.Check
import typings.grommet.anon.ColorExtend
import typings.grommet.anon.Container
import typings.grommet.anon.Content
import typings.grommet.anon.Continent
import typings.grommet.anon.Control
import typings.grommet.anon.Day
import typings.grommet.anon.Default
import typings.grommet.anon.DisabledExtend
import typings.grommet.anon.Edge
import typings.grommet.anon.Extend
import typings.grommet.anon.FontWeightHover
import typings.grommet.anon.Footer
import typings.grommet.anon.GroupEnd
import typings.grommet.anon.Header
import typings.grommet.anon.Hover
import typings.grommet.anon.Icons
import typings.grommet.anon.Item
import typings.grommet.anon.Line
import typings.grommet.anon.MaxHeight
import typings.grommet.anon.Overlay
import typings.grommet.anon.Panel
import typings.grommet.anon.Position
import typings.grommet.anon.ResponsiveBreakpoint
import typings.grommet.anon.SizeText
import typings.grommet.anon.Thumb
import typings.grommet.anon.Toggle
import typings.grommet.anon.Xlarge
import typings.grommet.anon.Xsmall
import typings.grommet.anon.`13`
import typings.grommet.anon.`14`
import typings.grommet.anon.`22`
import typings.grommet.anon.`25`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeType extends js.Object {
  
  var accordion: js.UndefOr[Panel] = js.native
  
  var anchor: js.UndefOr[FontWeightHover] = js.native
  
  var avatar: js.UndefOr[SizeText] = js.native
  
  var box: js.UndefOr[ResponsiveBreakpoint] = js.native
  
  var button: js.UndefOr[Default] = js.native
  
  var calendar: js.UndefOr[Day] = js.native
  
  var card: js.UndefOr[BodyContainer] = js.native
  
  var carousel: js.UndefOr[AnimationDisabled] = js.native
  
  var chart: js.UndefOr[ColorExtend] = js.native
  
  var checkBox: js.UndefOr[Toggle] = js.native
  
  var clock: js.UndefOr[Analog] = js.native
  
  var collapsible: js.UndefOr[Baseline] = js.native
  
  var dataTable: js.UndefOr[GroupEnd] = js.native
  
  var dateInput: js.UndefOr[`13`] = js.native
  
  var diagram: js.UndefOr[Line] = js.native
  
  var drop: js.UndefOr[MaxHeight] = js.native
  
  var formField: js.UndefOr[Content] = js.native
  
  var global: js.UndefOr[Animation] = js.native
  
  var grommet: js.UndefOr[`14`] = js.native
  
  var heading: js.UndefOr[Extend] = js.native
  
  var icon: js.UndefOr[`25`] = js.native
  
  var layer: js.UndefOr[Overlay] = js.native
  
  var list: js.UndefOr[Item] = js.native
  
  var maskedInput: js.UndefOr[`22`] = js.native
  
  var menu: js.UndefOr[Icons] = js.native
  
  var meter: js.UndefOr[typings.grommet.anon.Colors] = js.native
  
  var paragraph: js.UndefOr[Xlarge] = js.native
  
  var radioButton: js.UndefOr[Check] = js.native
  
  var radioButtonGroup: js.UndefOr[Container] = js.native
  
  var rangeInput: js.UndefOr[Thumb] = js.native
  
  var rangeSelector: js.UndefOr[Edge] = js.native
  
  var select: js.UndefOr[Control] = js.native
  
  var skipLinks: js.UndefOr[Position] = js.native
  
  var tab: js.UndefOr[Hover] = js.native
  
  var table: js.UndefOr[Footer] = js.native
  
  var tabs: js.UndefOr[Header] = js.native
  
  var text: js.UndefOr[Xsmall] = js.native
  
  var textArea: js.UndefOr[DisabledExtend] = js.native
  
  var textInput: js.UndefOr[DisabledExtend] = js.native
  
  var video: js.UndefOr[Captions] = js.native
  
  var worldMap: js.UndefOr[Continent] = js.native
}
object ThemeType {
  
  @scala.inline
  def apply(): ThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeType]
  }
  
  @scala.inline
  implicit class ThemeTypeOps[Self <: ThemeType] (val x: Self) extends AnyVal {
    
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
    def setAccordion(value: Panel): Self = this.set("accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccordion: Self = this.set("accordion", js.undefined)
    
    @scala.inline
    def setAnchor(value: FontWeightHover): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAvatar(value: SizeText): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    
    @scala.inline
    def setBox(value: ResponsiveBreakpoint): Self = this.set("box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    
    @scala.inline
    def setButton(value: Default): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setCalendar(value: Day): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setCard(value: BodyContainer): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    
    @scala.inline
    def setCarousel(value: AnimationDisabled): Self = this.set("carousel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel: Self = this.set("carousel", js.undefined)
    
    @scala.inline
    def setChart(value: ColorExtend): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    
    @scala.inline
    def setCheckBox(value: Toggle): Self = this.set("checkBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBox: Self = this.set("checkBox", js.undefined)
    
    @scala.inline
    def setClock(value: Analog): Self = this.set("clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClock: Self = this.set("clock", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Baseline): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setDataTable(value: GroupEnd): Self = this.set("dataTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTable: Self = this.set("dataTable", js.undefined)
    
    @scala.inline
    def setDateInput(value: `13`): Self = this.set("dateInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateInput: Self = this.set("dateInput", js.undefined)
    
    @scala.inline
    def setDiagram(value: Line): Self = this.set("diagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagram: Self = this.set("diagram", js.undefined)
    
    @scala.inline
    def setDrop(value: MaxHeight): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setFormField(value: Content): Self = this.set("formField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormField: Self = this.set("formField", js.undefined)
    
    @scala.inline
    def setGlobal(value: Animation): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setGrommet(value: `14`): Self = this.set("grommet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrommet: Self = this.set("grommet", js.undefined)
    
    @scala.inline
    def setHeading(value: Extend): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setIcon(value: `25`): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLayer(value: Overlay): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setList(value: Item): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setMaskedInput(value: `22`): Self = this.set("maskedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskedInput: Self = this.set("maskedInput", js.undefined)
    
    @scala.inline
    def setMenu(value: Icons): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMeter(value: typings.grommet.anon.Colors): Self = this.set("meter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeter: Self = this.set("meter", js.undefined)
    
    @scala.inline
    def setParagraph(value: Xlarge): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    
    @scala.inline
    def setRadioButton(value: Check): Self = this.set("radioButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioButton: Self = this.set("radioButton", js.undefined)
    
    @scala.inline
    def setRadioButtonGroup(value: Container): Self = this.set("radioButtonGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioButtonGroup: Self = this.set("radioButtonGroup", js.undefined)
    
    @scala.inline
    def setRangeInput(value: Thumb): Self = this.set("rangeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeInput: Self = this.set("rangeInput", js.undefined)
    
    @scala.inline
    def setRangeSelector(value: Edge): Self = this.set("rangeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeSelector: Self = this.set("rangeSelector", js.undefined)
    
    @scala.inline
    def setSelect(value: Control): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSkipLinks(value: Position): Self = this.set("skipLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipLinks: Self = this.set("skipLinks", js.undefined)
    
    @scala.inline
    def setTab(value: Hover): Self = this.set("tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
    
    @scala.inline
    def setTable(value: Footer): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTabs(value: Header): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    
    @scala.inline
    def setText(value: Xsmall): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextArea(value: DisabledExtend): Self = this.set("textArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextArea: Self = this.set("textArea", js.undefined)
    
    @scala.inline
    def setTextInput(value: DisabledExtend): Self = this.set("textInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInput: Self = this.set("textInput", js.undefined)
    
    @scala.inline
    def setVideo(value: Captions): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setWorldMap(value: Continent): Self = this.set("worldMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldMap: Self = this.set("worldMap", js.undefined)
  }
}
