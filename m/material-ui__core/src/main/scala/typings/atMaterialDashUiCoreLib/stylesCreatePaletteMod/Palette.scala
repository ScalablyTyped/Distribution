package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Palette extends js.Object {
  var action: TypeAction = js.native
  @JSName("augmentColor")
  var augmentColor_Original: atMaterialDashUiCoreLib.Anon_Color = js.native
  var background: TypeBackground = js.native
  var common: atMaterialDashUiCoreLib.colorsCommonMod.CommonColors = js.native
  var contrastThreshold: scala.Double = js.native
  var divider: TypeDivider = js.native
  var error: PaletteColor = js.native
  var grey: atMaterialDashUiCoreLib.coreMod.Color = js.native
  var primary: PaletteColor = js.native
  var secondary: PaletteColor = js.native
  var text: TypeText = js.native
  var tonalOffset: scala.Double = js.native
  var `type`: atMaterialDashUiCoreLib.coreMod.PaletteType = js.native
  def augmentColor(color: ColorPartial): scala.Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: java.lang.String): scala.Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: java.lang.String, lightShade: java.lang.String): scala.Unit = js.native
  def augmentColor(
    color: ColorPartial,
    mainShade: java.lang.String,
    lightShade: java.lang.String,
    darkShade: java.lang.String
  ): scala.Unit = js.native
  def augmentColor(
    color: ColorPartial,
    mainShade: java.lang.String,
    lightShade: java.lang.String,
    darkShade: scala.Double
  ): scala.Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: java.lang.String, lightShade: scala.Double): scala.Unit = js.native
  def augmentColor(
    color: ColorPartial,
    mainShade: java.lang.String,
    lightShade: scala.Double,
    darkShade: java.lang.String
  ): scala.Unit = js.native
  def augmentColor(
    color: ColorPartial,
    mainShade: java.lang.String,
    lightShade: scala.Double,
    darkShade: scala.Double
  ): scala.Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: scala.Double): scala.Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: scala.Double, lightShade: java.lang.String): scala.Unit = js.native
  def augmentColor(
    color: ColorPartial,
    mainShade: scala.Double,
    lightShade: java.lang.String,
    darkShade: java.lang.String
  ): scala.Unit = js.native
  def augmentColor(
    color: ColorPartial,
    mainShade: scala.Double,
    lightShade: java.lang.String,
    darkShade: scala.Double
  ): scala.Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: scala.Double, lightShade: scala.Double): scala.Unit = js.native
  def augmentColor(
    color: ColorPartial,
    mainShade: scala.Double,
    lightShade: scala.Double,
    darkShade: java.lang.String
  ): scala.Unit = js.native
  def augmentColor(color: ColorPartial, mainShade: scala.Double, lightShade: scala.Double, darkShade: scala.Double): scala.Unit = js.native
  def augmentColor(color: PaletteColorOptions): scala.Unit = js.native
  def getContrastText(background: java.lang.String): java.lang.String = js.native
}

