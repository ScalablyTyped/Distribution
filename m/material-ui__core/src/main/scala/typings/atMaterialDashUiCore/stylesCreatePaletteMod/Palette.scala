package typings.atMaterialDashUiCore.stylesCreatePaletteMod

import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.Color
import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.PaletteType
import typings.atMaterialDashUiCore.colorsCommonMod.CommonColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Palette extends js.Object {
  var action: TypeAction = js.native
  var background: TypeBackground = js.native
  var common: CommonColors = js.native
  var contrastThreshold: Double = js.native
  var divider: TypeDivider = js.native
  var error: PaletteColor = js.native
  var grey: Color = js.native
  var primary: PaletteColor = js.native
  var secondary: PaletteColor = js.native
  var text: TypeText = js.native
  var tonalOffset: Double = js.native
  var `type`: PaletteType = js.native
  def augmentColor(color: ColorPartial): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: String): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: String, lightShade: String): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: String, lightShade: String, darkShade: String): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: String, lightShade: String, darkShade: Double): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: String, lightShade: Double): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: String, lightShade: Double, darkShade: String): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: String, lightShade: Double, darkShade: Double): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: Double): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: Double, lightShade: String): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: Double, lightShade: String, darkShade: String): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: Double, lightShade: String, darkShade: Double): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Double): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Double, darkShade: String): Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Double, darkShade: Double): Unit = js.native
  def augmentColor(color: PaletteColorOptions): Unit = js.native
  def getContrastText(background: String): String = js.native
}

