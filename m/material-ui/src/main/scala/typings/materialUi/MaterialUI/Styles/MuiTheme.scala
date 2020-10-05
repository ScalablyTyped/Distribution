package typings.materialUi.MaterialUI.Styles

import typings.materialUi.anon.AccentColor
import typings.materialUi.anon.ActionColor
import typings.materialUi.anon.BackgroundColor
import typings.materialUi.anon.BackgroundColorColor
import typings.materialUi.anon.BodyColor
import typings.materialUi.anon.BorderColor
import typings.materialUi.anon.BorderColorTextColor
import typings.materialUi.anon.BoxColor
import typings.materialUi.anon.ButtonFilterColor
import typings.materialUi.anon.ButtonSize
import typings.materialUi.anon.CalendarTextColor
import typings.materialUi.anon.CheckedColor
import typings.materialUi.anon.ClockCircleColor
import typings.materialUi.anon.Color
import typings.materialUi.anon.ColorFontWeight
import typings.materialUi.anon.ConnectorLineColor
import typings.materialUi.anon.ContainerBackgroundColor
import typings.materialUi.anon.DataHeight
import typings.materialUi.anon.DeleteIconColor
import typings.materialUi.anon.DisabledColor
import typings.materialUi.anon.DisabledTextColor
import typings.materialUi.anon.FontWeight
import typings.materialUi.anon.HandleColorZero
import typings.materialUi.anon.Height
import typings.materialUi.anon.HeightSpacing
import typings.materialUi.anon.HoverColor
import typings.materialUi.anon.IconColor
import typings.materialUi.anon.LabelColor
import typings.materialUi.anon.LeftIconColor
import typings.materialUi.anon.LoadingStrokeColor
import typings.materialUi.anon.OverlayContentBackground
import typings.materialUi.anon.RippleBackgroundColor
import typings.materialUi.anon.SelectedTextColor
import typings.materialUi.anon.SubtitleColor
import typings.materialUi.anon.TapHighlightColor
import typings.materialUi.anon.TextColor
import typings.materialUi.anon.Width
import typings.materialUi.anon.ZDepthShadows
import typings.materialUi.anon.`0`
import typings.materialUi.anon.`1`
import typings.materialUi.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuiTheme extends js.Object {
  var appBar: js.UndefOr[Color] = js.native
  var avatar: js.UndefOr[BackgroundColor] = js.native
  var badge: js.UndefOr[FontWeight] = js.native
  var baseTheme: js.UndefOr[RawTheme] = js.native
  var button: js.UndefOr[Height] = js.native
  var card: js.UndefOr[SubtitleColor] = js.native
  var cardMedia: js.UndefOr[OverlayContentBackground] = js.native
  var cardText: js.UndefOr[TextColor] = js.native
  var checkbox: js.UndefOr[BoxColor] = js.native
  var chip: js.UndefOr[DeleteIconColor] = js.native
  var datePicker: js.UndefOr[CalendarTextColor] = js.native
  var dialog: js.UndefOr[BodyColor] = js.native
  var drawer: js.UndefOr[Width] = js.native
  var dropDownMenu: js.UndefOr[AccentColor] = js.native
  var enhancedButton: js.UndefOr[TapHighlightColor] = js.native
  var flatButton: js.UndefOr[ButtonFilterColor] = js.native
  var floatingActionButton: js.UndefOr[ButtonSize] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var gridTile: js.UndefOr[TextColor] = js.native
  var icon: js.UndefOr[BackgroundColorColor] = js.native
  var inkBar: js.UndefOr[`0`] = js.native
  var isRtl: js.UndefOr[Boolean] = js.native
  var listItem: js.UndefOr[LeftIconColor] = js.native
  var menu: js.UndefOr[ContainerBackgroundColor] = js.native
  var menuItem: js.UndefOr[DataHeight] = js.native
  var menuSubheader: js.UndefOr[BorderColor] = js.native
  var overlay: js.UndefOr[`0`] = js.native
  var palette: js.UndefOr[ThemePalette] = js.native
  var paper: js.UndefOr[ZDepthShadows] = js.native
  var radioButton: js.UndefOr[CheckedColor] = js.native
  var raisedButton: js.UndefOr[DisabledColor] = js.native
  var rawTheme: js.UndefOr[RawTheme] = js.native
  var refreshIndicator: js.UndefOr[LoadingStrokeColor] = js.native
  var ripple: js.UndefOr[`1`] = js.native
  var slider: js.UndefOr[HandleColorZero] = js.native
  var snackbar: js.UndefOr[ActionColor] = js.native
  var spacing: js.UndefOr[Spacing] = js.native
  var stepper: js.UndefOr[ConnectorLineColor] = js.native
  var subheader: js.UndefOr[ColorFontWeight] = js.native
  var svgIcon: js.UndefOr[`1`] = js.native
  var table: js.UndefOr[`0`] = js.native
  var tableFooter: js.UndefOr[BorderColorTextColor] = js.native
  var tableHeader: js.UndefOr[`2`] = js.native
  var tableHeaderColumn: js.UndefOr[typings.materialUi.anon.Spacing] = js.native
  var tableRow: js.UndefOr[HoverColor] = js.native
  var tableRowColumn: js.UndefOr[HeightSpacing] = js.native
  var tabs: js.UndefOr[SelectedTextColor] = js.native
  var textField: js.UndefOr[DisabledTextColor] = js.native
  var timePicker: js.UndefOr[ClockCircleColor] = js.native
  var toggle: js.UndefOr[LabelColor] = js.native
  var toolbar: js.UndefOr[IconColor] = js.native
  var tooltip: js.UndefOr[RippleBackgroundColor] = js.native
  var userAgent: js.UndefOr[String | Boolean] = js.native
  var zIndex: js.UndefOr[typings.materialUi.MaterialUI.Styles.zIndex] = js.native
}

object MuiTheme {
  @scala.inline
  def apply(): MuiTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuiTheme]
  }
  @scala.inline
  implicit class MuiThemeOps[Self <: MuiTheme] (val x: Self) extends AnyVal {
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
    def setAppBar(value: Color): Self = this.set("appBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppBar: Self = this.set("appBar", js.undefined)
    @scala.inline
    def setAvatar(value: BackgroundColor): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setBadge(value: FontWeight): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setBaseTheme(value: RawTheme): Self = this.set("baseTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseTheme: Self = this.set("baseTheme", js.undefined)
    @scala.inline
    def setButton(value: Height): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setCard(value: SubtitleColor): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setCardMedia(value: OverlayContentBackground): Self = this.set("cardMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardMedia: Self = this.set("cardMedia", js.undefined)
    @scala.inline
    def setCardText(value: TextColor): Self = this.set("cardText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardText: Self = this.set("cardText", js.undefined)
    @scala.inline
    def setCheckbox(value: BoxColor): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    @scala.inline
    def setChip(value: DeleteIconColor): Self = this.set("chip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChip: Self = this.set("chip", js.undefined)
    @scala.inline
    def setDatePicker(value: CalendarTextColor): Self = this.set("datePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatePicker: Self = this.set("datePicker", js.undefined)
    @scala.inline
    def setDialog(value: BodyColor): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialog: Self = this.set("dialog", js.undefined)
    @scala.inline
    def setDrawer(value: Width): Self = this.set("drawer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawer: Self = this.set("drawer", js.undefined)
    @scala.inline
    def setDropDownMenu(value: AccentColor): Self = this.set("dropDownMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownMenu: Self = this.set("dropDownMenu", js.undefined)
    @scala.inline
    def setEnhancedButton(value: TapHighlightColor): Self = this.set("enhancedButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedButton: Self = this.set("enhancedButton", js.undefined)
    @scala.inline
    def setFlatButton(value: ButtonFilterColor): Self = this.set("flatButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatButton: Self = this.set("flatButton", js.undefined)
    @scala.inline
    def setFloatingActionButton(value: ButtonSize): Self = this.set("floatingActionButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingActionButton: Self = this.set("floatingActionButton", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setGridTile(value: TextColor): Self = this.set("gridTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTile: Self = this.set("gridTile", js.undefined)
    @scala.inline
    def setIcon(value: BackgroundColorColor): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInkBar(value: `0`): Self = this.set("inkBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInkBar: Self = this.set("inkBar", js.undefined)
    @scala.inline
    def setIsRtl(value: Boolean): Self = this.set("isRtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRtl: Self = this.set("isRtl", js.undefined)
    @scala.inline
    def setListItem(value: LeftIconColor): Self = this.set("listItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
    @scala.inline
    def setMenu(value: ContainerBackgroundColor): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setMenuItem(value: DataHeight): Self = this.set("menuItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItem: Self = this.set("menuItem", js.undefined)
    @scala.inline
    def setMenuSubheader(value: BorderColor): Self = this.set("menuSubheader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuSubheader: Self = this.set("menuSubheader", js.undefined)
    @scala.inline
    def setOverlay(value: `0`): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPalette(value: ThemePalette): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    @scala.inline
    def setPaper(value: ZDepthShadows): Self = this.set("paper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaper: Self = this.set("paper", js.undefined)
    @scala.inline
    def setRadioButton(value: CheckedColor): Self = this.set("radioButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioButton: Self = this.set("radioButton", js.undefined)
    @scala.inline
    def setRaisedButton(value: DisabledColor): Self = this.set("raisedButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaisedButton: Self = this.set("raisedButton", js.undefined)
    @scala.inline
    def setRawTheme(value: RawTheme): Self = this.set("rawTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawTheme: Self = this.set("rawTheme", js.undefined)
    @scala.inline
    def setRefreshIndicator(value: LoadingStrokeColor): Self = this.set("refreshIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshIndicator: Self = this.set("refreshIndicator", js.undefined)
    @scala.inline
    def setRipple(value: `1`): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setSlider(value: HandleColorZero): Self = this.set("slider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlider: Self = this.set("slider", js.undefined)
    @scala.inline
    def setSnackbar(value: ActionColor): Self = this.set("snackbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnackbar: Self = this.set("snackbar", js.undefined)
    @scala.inline
    def setSpacing(value: Spacing): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setStepper(value: ConnectorLineColor): Self = this.set("stepper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepper: Self = this.set("stepper", js.undefined)
    @scala.inline
    def setSubheader(value: ColorFontWeight): Self = this.set("subheader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubheader: Self = this.set("subheader", js.undefined)
    @scala.inline
    def setSvgIcon(value: `1`): Self = this.set("svgIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgIcon: Self = this.set("svgIcon", js.undefined)
    @scala.inline
    def setTable(value: `0`): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setTableFooter(value: BorderColorTextColor): Self = this.set("tableFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableFooter: Self = this.set("tableFooter", js.undefined)
    @scala.inline
    def setTableHeader(value: `2`): Self = this.set("tableHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableHeader: Self = this.set("tableHeader", js.undefined)
    @scala.inline
    def setTableHeaderColumn(value: typings.materialUi.anon.Spacing): Self = this.set("tableHeaderColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableHeaderColumn: Self = this.set("tableHeaderColumn", js.undefined)
    @scala.inline
    def setTableRow(value: HoverColor): Self = this.set("tableRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRow: Self = this.set("tableRow", js.undefined)
    @scala.inline
    def setTableRowColumn(value: HeightSpacing): Self = this.set("tableRowColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRowColumn: Self = this.set("tableRowColumn", js.undefined)
    @scala.inline
    def setTabs(value: SelectedTextColor): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setTextField(value: DisabledTextColor): Self = this.set("textField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextField: Self = this.set("textField", js.undefined)
    @scala.inline
    def setTimePicker(value: ClockCircleColor): Self = this.set("timePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePicker: Self = this.set("timePicker", js.undefined)
    @scala.inline
    def setToggle(value: LabelColor): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setToolbar(value: IconColor): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setTooltip(value: RippleBackgroundColor): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setUserAgent(value: String | Boolean): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    @scala.inline
    def setZIndex(value: zIndex): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

