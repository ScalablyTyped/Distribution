package typings.materialUi.MaterialUI.Styles

import typings.materialUi.anon.AccentColor
import typings.materialUi.anon.ActionColor
import typings.materialUi.anon.BackgroundColor
import typings.materialUi.anon.BackgroundColorColor
import typings.materialUi.anon.BackgroundColorString
import typings.materialUi.anon.BodyColor
import typings.materialUi.anon.BorderColor
import typings.materialUi.anon.BorderColorString
import typings.materialUi.anon.BorderColorTextColor
import typings.materialUi.anon.BoxColor
import typings.materialUi.anon.ButtonFilterColor
import typings.materialUi.anon.ButtonSize
import typings.materialUi.anon.CalendarTextColor
import typings.materialUi.anon.CheckedColor
import typings.materialUi.anon.ClockCircleColor
import typings.materialUi.anon.Color
import typings.materialUi.anon.ColorFontWeight
import typings.materialUi.anon.ColorString
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiTheme extends js.Object {
  var appBar: js.UndefOr[Color] = js.undefined
  var avatar: js.UndefOr[BackgroundColor] = js.undefined
  var badge: js.UndefOr[FontWeight] = js.undefined
  var baseTheme: js.UndefOr[RawTheme] = js.undefined
  var button: js.UndefOr[Height] = js.undefined
  var card: js.UndefOr[SubtitleColor] = js.undefined
  var cardMedia: js.UndefOr[OverlayContentBackground] = js.undefined
  var cardText: js.UndefOr[TextColor] = js.undefined
  var checkbox: js.UndefOr[BoxColor] = js.undefined
  var chip: js.UndefOr[DeleteIconColor] = js.undefined
  var datePicker: js.UndefOr[CalendarTextColor] = js.undefined
  var dialog: js.UndefOr[BodyColor] = js.undefined
  var drawer: js.UndefOr[Width] = js.undefined
  var dropDownMenu: js.UndefOr[AccentColor] = js.undefined
  var enhancedButton: js.UndefOr[TapHighlightColor] = js.undefined
  var flatButton: js.UndefOr[ButtonFilterColor] = js.undefined
  var floatingActionButton: js.UndefOr[ButtonSize] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var gridTile: js.UndefOr[TextColor] = js.undefined
  var icon: js.UndefOr[BackgroundColorColor] = js.undefined
  var inkBar: js.UndefOr[BackgroundColorString] = js.undefined
  var isRtl: js.UndefOr[Boolean] = js.undefined
  var listItem: js.UndefOr[LeftIconColor] = js.undefined
  var menu: js.UndefOr[ContainerBackgroundColor] = js.undefined
  var menuItem: js.UndefOr[DataHeight] = js.undefined
  var menuSubheader: js.UndefOr[BorderColor] = js.undefined
  var overlay: js.UndefOr[BackgroundColorString] = js.undefined
  var palette: js.UndefOr[ThemePalette] = js.undefined
  var paper: js.UndefOr[ZDepthShadows] = js.undefined
  var radioButton: js.UndefOr[CheckedColor] = js.undefined
  var raisedButton: js.UndefOr[DisabledColor] = js.undefined
  var rawTheme: js.UndefOr[RawTheme] = js.undefined
  var refreshIndicator: js.UndefOr[LoadingStrokeColor] = js.undefined
  var ripple: js.UndefOr[ColorString] = js.undefined
  var slider: js.UndefOr[HandleColorZero] = js.undefined
  var snackbar: js.UndefOr[ActionColor] = js.undefined
  var spacing: js.UndefOr[Spacing] = js.undefined
  var stepper: js.UndefOr[ConnectorLineColor] = js.undefined
  var subheader: js.UndefOr[ColorFontWeight] = js.undefined
  var svgIcon: js.UndefOr[ColorString] = js.undefined
  var table: js.UndefOr[BackgroundColorString] = js.undefined
  var tableFooter: js.UndefOr[BorderColorTextColor] = js.undefined
  var tableHeader: js.UndefOr[BorderColorString] = js.undefined
  var tableHeaderColumn: js.UndefOr[typings.materialUi.anon.Spacing] = js.undefined
  var tableRow: js.UndefOr[HoverColor] = js.undefined
  var tableRowColumn: js.UndefOr[HeightSpacing] = js.undefined
  var tabs: js.UndefOr[SelectedTextColor] = js.undefined
  var textField: js.UndefOr[DisabledTextColor] = js.undefined
  var timePicker: js.UndefOr[ClockCircleColor] = js.undefined
  var toggle: js.UndefOr[LabelColor] = js.undefined
  var toolbar: js.UndefOr[IconColor] = js.undefined
  var tooltip: js.UndefOr[RippleBackgroundColor] = js.undefined
  var userAgent: js.UndefOr[String | Boolean] = js.undefined
  var zIndex: js.UndefOr[typings.materialUi.MaterialUI.Styles.zIndex] = js.undefined
}

object MuiTheme {
  @scala.inline
  def apply(
    appBar: Color = null,
    avatar: BackgroundColor = null,
    badge: FontWeight = null,
    baseTheme: RawTheme = null,
    button: Height = null,
    card: SubtitleColor = null,
    cardMedia: OverlayContentBackground = null,
    cardText: TextColor = null,
    checkbox: BoxColor = null,
    chip: DeleteIconColor = null,
    datePicker: CalendarTextColor = null,
    dialog: BodyColor = null,
    drawer: Width = null,
    dropDownMenu: AccentColor = null,
    enhancedButton: TapHighlightColor = null,
    flatButton: ButtonFilterColor = null,
    floatingActionButton: ButtonSize = null,
    fontFamily: String = null,
    gridTile: TextColor = null,
    icon: BackgroundColorColor = null,
    inkBar: BackgroundColorString = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    listItem: LeftIconColor = null,
    menu: ContainerBackgroundColor = null,
    menuItem: DataHeight = null,
    menuSubheader: BorderColor = null,
    overlay: BackgroundColorString = null,
    palette: ThemePalette = null,
    paper: ZDepthShadows = null,
    radioButton: CheckedColor = null,
    raisedButton: DisabledColor = null,
    rawTheme: RawTheme = null,
    refreshIndicator: LoadingStrokeColor = null,
    ripple: ColorString = null,
    slider: HandleColorZero = null,
    snackbar: ActionColor = null,
    spacing: Spacing = null,
    stepper: ConnectorLineColor = null,
    subheader: ColorFontWeight = null,
    svgIcon: ColorString = null,
    table: BackgroundColorString = null,
    tableFooter: BorderColorTextColor = null,
    tableHeader: BorderColorString = null,
    tableHeaderColumn: typings.materialUi.anon.Spacing = null,
    tableRow: HoverColor = null,
    tableRowColumn: HeightSpacing = null,
    tabs: SelectedTextColor = null,
    textField: DisabledTextColor = null,
    timePicker: ClockCircleColor = null,
    toggle: LabelColor = null,
    toolbar: IconColor = null,
    tooltip: RippleBackgroundColor = null,
    userAgent: String | Boolean = null,
    zIndex: zIndex = null
  ): MuiTheme = {
    val __obj = js.Dynamic.literal()
    if (appBar != null) __obj.updateDynamic("appBar")(appBar.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (baseTheme != null) __obj.updateDynamic("baseTheme")(baseTheme.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (cardMedia != null) __obj.updateDynamic("cardMedia")(cardMedia.asInstanceOf[js.Any])
    if (cardText != null) __obj.updateDynamic("cardText")(cardText.asInstanceOf[js.Any])
    if (checkbox != null) __obj.updateDynamic("checkbox")(checkbox.asInstanceOf[js.Any])
    if (chip != null) __obj.updateDynamic("chip")(chip.asInstanceOf[js.Any])
    if (datePicker != null) __obj.updateDynamic("datePicker")(datePicker.asInstanceOf[js.Any])
    if (dialog != null) __obj.updateDynamic("dialog")(dialog.asInstanceOf[js.Any])
    if (drawer != null) __obj.updateDynamic("drawer")(drawer.asInstanceOf[js.Any])
    if (dropDownMenu != null) __obj.updateDynamic("dropDownMenu")(dropDownMenu.asInstanceOf[js.Any])
    if (enhancedButton != null) __obj.updateDynamic("enhancedButton")(enhancedButton.asInstanceOf[js.Any])
    if (flatButton != null) __obj.updateDynamic("flatButton")(flatButton.asInstanceOf[js.Any])
    if (floatingActionButton != null) __obj.updateDynamic("floatingActionButton")(floatingActionButton.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (gridTile != null) __obj.updateDynamic("gridTile")(gridTile.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inkBar != null) __obj.updateDynamic("inkBar")(inkBar.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.get.asInstanceOf[js.Any])
    if (listItem != null) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem.asInstanceOf[js.Any])
    if (menuSubheader != null) __obj.updateDynamic("menuSubheader")(menuSubheader.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    if (radioButton != null) __obj.updateDynamic("radioButton")(radioButton.asInstanceOf[js.Any])
    if (raisedButton != null) __obj.updateDynamic("raisedButton")(raisedButton.asInstanceOf[js.Any])
    if (rawTheme != null) __obj.updateDynamic("rawTheme")(rawTheme.asInstanceOf[js.Any])
    if (refreshIndicator != null) __obj.updateDynamic("refreshIndicator")(refreshIndicator.asInstanceOf[js.Any])
    if (ripple != null) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    if (slider != null) __obj.updateDynamic("slider")(slider.asInstanceOf[js.Any])
    if (snackbar != null) __obj.updateDynamic("snackbar")(snackbar.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (stepper != null) __obj.updateDynamic("stepper")(stepper.asInstanceOf[js.Any])
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    if (svgIcon != null) __obj.updateDynamic("svgIcon")(svgIcon.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (tableFooter != null) __obj.updateDynamic("tableFooter")(tableFooter.asInstanceOf[js.Any])
    if (tableHeader != null) __obj.updateDynamic("tableHeader")(tableHeader.asInstanceOf[js.Any])
    if (tableHeaderColumn != null) __obj.updateDynamic("tableHeaderColumn")(tableHeaderColumn.asInstanceOf[js.Any])
    if (tableRow != null) __obj.updateDynamic("tableRow")(tableRow.asInstanceOf[js.Any])
    if (tableRowColumn != null) __obj.updateDynamic("tableRowColumn")(tableRowColumn.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (timePicker != null) __obj.updateDynamic("timePicker")(timePicker.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiTheme]
  }
}

