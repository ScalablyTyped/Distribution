package typings
package hummusDashRecipeLib.hummusDashRecipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recipe extends js.Object {
  def annot(
    x: scala.Double,
    y: scala.Double,
    subtype: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.AnnotSubtype
  ): Recipe = js.native
  def annot(
    x: scala.Double,
    y: scala.Double,
    subtype: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.AnnotSubtype,
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.AnnotOptions
  ): Recipe = js.native
  def appendPage(pdfSrc: java.lang.String, pages: js.Array[scala.Double]): Recipe = js.native
  def appendPage(pdfSrc: java.lang.String, pages: scala.Double): Recipe = js.native
  def circle(x: scala.Double, y: scala.Double, radius: scala.Double): Recipe = js.native
  def circle(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.CircleOptions
  ): Recipe = js.native
  def comment(text: java.lang.String, x: scala.Double, y: scala.Double): Recipe = js.native
  def comment(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.CommentOptions
  ): Recipe = js.native
  def createPage(pageWidth: scala.Double, pageHeight: scala.Double): Recipe = js.native
  def custom(): Recipe = js.native
  def custom(key: java.lang.String): Recipe = js.native
  def custom(key: java.lang.String, value: java.lang.String): Recipe = js.native
  def editPage(pageNumber: scala.Double): Recipe = js.native
  def encrypt(options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.EncryptOptions): Recipe = js.native
  def endPDF(): Recipe = js.native
  def endPDF(callback: js.Function0[_]): Recipe = js.native
  def endPage(): Recipe = js.native
  def image(imgSrc: java.lang.String, x: scala.Double, y: scala.Double): Recipe = js.native
  def image(
    imgSrc: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.ImageOptions
  ): Recipe = js.native
  def info(): Recipe = js.native
  def info(options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.InfoOptions): Recipe = js.native
  def insertPage(afterPageNumber: scala.Double, pdfSrc: java.lang.String, srcPageNumber: scala.Double): Recipe = js.native
  def line(coordinates: js.Array[js.Array[scala.Double]]): Recipe = js.native
  def line(
    coordinates: js.Array[js.Array[scala.Double]],
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.LineOptions
  ): Recipe = js.native
  def lineTo(x: scala.Double, y: scala.Double): Recipe = js.native
  def lineTo(
    x: scala.Double,
    y: scala.Double,
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.LineToOptions
  ): Recipe = js.native
  def moveTo(x: scala.Double, y: scala.Double): Recipe = js.native
  def overlay(pdfSrc: java.lang.String, x: scala.Double, y: scala.Double): Recipe = js.native
  def overlay(
    pdfSrc: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.OverlayOptions
  ): Recipe = js.native
  def pageInfo(pageNumber: scala.Double): Recipe = js.native
  def polygon(coordinates: js.Array[js.Array[scala.Double]]): Recipe = js.native
  def polygon(
    coordinates: js.Array[js.Array[scala.Double]],
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.PolygonOptions
  ): Recipe = js.native
  def rectangle(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Recipe = js.native
  def rectangle(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.RectangleOptions
  ): Recipe = js.native
  def registerFont(fontName: java.lang.String, fontSrcPath: java.lang.String): Recipe = js.native
  def split(outputDir: java.lang.String, prefix: java.lang.String): Recipe = js.native
  def text(text: java.lang.String, x: scala.Double, y: scala.Double): Recipe = js.native
  def text(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    options: hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs.TextOptions
  ): Recipe = js.native
}

