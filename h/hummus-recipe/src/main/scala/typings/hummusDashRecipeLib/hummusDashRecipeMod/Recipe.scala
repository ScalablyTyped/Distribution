package typings
package hummusDashRecipeLib.hummusDashRecipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hummus-recipe", "Recipe")
@js.native
class Recipe protected () extends js.Object {
  def this(src: java.lang.String, output: java.lang.String) = this()
  def this(src: java.lang.String, output: java.lang.String, options: RecipeOptions) = this()
  def annot(
    x: scala.Double,
    y: scala.Double,
    subtype: hummusDashRecipeLib.hummusDashRecipeLibStrings.Text | hummusDashRecipeLib.hummusDashRecipeLibStrings.FreeText | hummusDashRecipeLib.hummusDashRecipeLibStrings.Line | hummusDashRecipeLib.hummusDashRecipeLibStrings.Square | hummusDashRecipeLib.hummusDashRecipeLibStrings.Circle | hummusDashRecipeLib.hummusDashRecipeLibStrings.Polygon | hummusDashRecipeLib.hummusDashRecipeLibStrings.PolyLine | hummusDashRecipeLib.hummusDashRecipeLibStrings.Highlight | hummusDashRecipeLib.hummusDashRecipeLibStrings.Underline | hummusDashRecipeLib.hummusDashRecipeLibStrings.Squiggly | hummusDashRecipeLib.hummusDashRecipeLibStrings.StrikeOut | hummusDashRecipeLib.hummusDashRecipeLibStrings.Stamp | hummusDashRecipeLib.hummusDashRecipeLibStrings.Caret | hummusDashRecipeLib.hummusDashRecipeLibStrings.Ink | hummusDashRecipeLib.hummusDashRecipeLibStrings.FileAttachment | hummusDashRecipeLib.hummusDashRecipeLibStrings.Sound
  ): Recipe = js.native
  def annot(
    x: scala.Double,
    y: scala.Double,
    subtype: hummusDashRecipeLib.hummusDashRecipeLibStrings.Text | hummusDashRecipeLib.hummusDashRecipeLibStrings.FreeText | hummusDashRecipeLib.hummusDashRecipeLibStrings.Line | hummusDashRecipeLib.hummusDashRecipeLibStrings.Square | hummusDashRecipeLib.hummusDashRecipeLibStrings.Circle | hummusDashRecipeLib.hummusDashRecipeLibStrings.Polygon | hummusDashRecipeLib.hummusDashRecipeLibStrings.PolyLine | hummusDashRecipeLib.hummusDashRecipeLibStrings.Highlight | hummusDashRecipeLib.hummusDashRecipeLibStrings.Underline | hummusDashRecipeLib.hummusDashRecipeLibStrings.Squiggly | hummusDashRecipeLib.hummusDashRecipeLibStrings.StrikeOut | hummusDashRecipeLib.hummusDashRecipeLibStrings.Stamp | hummusDashRecipeLib.hummusDashRecipeLibStrings.Caret | hummusDashRecipeLib.hummusDashRecipeLibStrings.Ink | hummusDashRecipeLib.hummusDashRecipeLibStrings.FileAttachment | hummusDashRecipeLib.hummusDashRecipeLibStrings.Sound,
    options: AnotOptions
  ): Recipe = js.native
  def appendPage(pdfSrc: java.lang.String, pages: js.Array[scala.Double]): Recipe = js.native
  def appendPage(pdfSrc: java.lang.String, pages: scala.Double): Recipe = js.native
  def circle(x: scala.Double, y: scala.Double, radius: scala.Double): Recipe = js.native
  def circle(x: scala.Double, y: scala.Double, radius: scala.Double, options: CircleOptions): Recipe = js.native
  def comment(text: java.lang.String, x: scala.Double, y: scala.Double): Recipe = js.native
  def comment(text: java.lang.String, x: scala.Double, y: scala.Double, options: CommentOptions): Recipe = js.native
  def createPage(pageWidth: scala.Double, pageHeight: scala.Double): Recipe = js.native
  def custom(): Recipe = js.native
  def custom(key: java.lang.String): Recipe = js.native
  def custom(key: java.lang.String, value: java.lang.String): Recipe = js.native
  def editPage(pageNumber: scala.Double): Recipe = js.native
  def encrypt(options: EncryptOptions): Recipe = js.native
  def endPDF(): Recipe = js.native
  def endPDF(callback: js.Function0[_]): Recipe = js.native
  def endPage(): Recipe = js.native
  def image(imgSrc: java.lang.String, x: scala.Double, y: scala.Double): Recipe = js.native
  def image(imgSrc: java.lang.String, x: scala.Double, y: scala.Double, options: ImageOptions): Recipe = js.native
  def info(): Recipe = js.native
  def info(options: InfoOptions): Recipe = js.native
  def insertPage(afterPageNumber: scala.Double, pdfSrc: java.lang.String, srcPageNumber: scala.Double): Recipe = js.native
  def line(coordinates: js.Array[scala.Double]): Recipe = js.native
  def line(coordinates: js.Array[scala.Double], options: LineOptions): Recipe = js.native
  def lineTo(x: scala.Double, y: scala.Double): Recipe = js.native
  def lineTo(x: scala.Double, y: scala.Double, options: LineToOptions): Recipe = js.native
  def moveTo(x: scala.Double, y: scala.Double): Recipe = js.native
  def overlay(pdfSrc: java.lang.String, x: scala.Double, y: scala.Double): Recipe = js.native
  def overlay(pdfSrc: java.lang.String, x: scala.Double, y: scala.Double, options: OverlayOptions): Recipe = js.native
  def pageInfo(pageNumber: scala.Double): Recipe = js.native
  def polygon(coordinates: js.Array[js.Array[scala.Double]]): Recipe = js.native
  def polygon(coordinates: js.Array[js.Array[scala.Double]], options: PolygonOptions): Recipe = js.native
  def rectangle(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Recipe = js.native
  def rectangle(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    options: RectangleOptions
  ): Recipe = js.native
  def registerFont(fontName: java.lang.String, fontSrcPath: java.lang.String): Recipe = js.native
  def split(outputDir: java.lang.String, prefix: java.lang.String): Recipe = js.native
  def text(text: java.lang.String, x: scala.Double, y: scala.Double): Recipe = js.native
  def text(text: java.lang.String, x: scala.Double, y: scala.Double, options: TextOptions): Recipe = js.native
}

