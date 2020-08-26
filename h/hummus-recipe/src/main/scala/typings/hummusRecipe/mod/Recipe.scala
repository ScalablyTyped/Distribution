package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recipe extends js.Object {
  val metadata: Metadata = js.native
  def annot(x: Double, y: Double, subtype: AnnotSubtype): Recipe = js.native
  def annot(x: Double, y: Double, subtype: AnnotSubtype, options: AnnotOptions): Recipe = js.native
  def appendPage(pdfSrc: String, pages: js.Array[Double]): Recipe = js.native
  def appendPage(pdfSrc: String, pages: Double): Recipe = js.native
  def circle(x: Double, y: Double, radius: Double): Recipe = js.native
  def circle(x: Double, y: Double, radius: Double, options: CircleOptions): Recipe = js.native
  def comment(text: String, x: Double, y: Double): Recipe = js.native
  def comment(text: String, x: Double, y: Double, options: CommentOptions): Recipe = js.native
  def createPage(pageWidth: Double, pageHeight: Double): Recipe = js.native
  def custom(): Recipe = js.native
  def custom(key: js.UndefOr[scala.Nothing], value: String): Recipe = js.native
  def custom(key: String): Recipe = js.native
  def custom(key: String, value: String): Recipe = js.native
  def editPage(pageNumber: Double): Recipe = js.native
  def encrypt(options: EncryptOptions): Recipe = js.native
  def endPDF(): Recipe = js.native
  def endPDF(callback: EndPDFCallback): Recipe = js.native
  def endPage(): Recipe = js.native
  def image(imgSrc: String, x: Double, y: Double): Recipe = js.native
  def image(imgSrc: String, x: Double, y: Double, options: ImageOptions): Recipe = js.native
  def info(): Recipe = js.native
  def info(options: InfoOptions): Recipe = js.native
  def insertPage(afterPageNumber: Double, pdfSrc: String, srcPageNumber: Double): Recipe = js.native
  def line(coordinates: js.Array[js.Array[Double]]): Recipe = js.native
  def line(coordinates: js.Array[js.Array[Double]], options: LineOptions): Recipe = js.native
  def lineTo(x: Double, y: Double): Recipe = js.native
  def lineTo(x: Double, y: Double, options: LineToOptions): Recipe = js.native
  def moveTo(x: Double, y: Double): Recipe = js.native
  def overlay(pdfSrc: String, x: Double, y: Double): Recipe = js.native
  def overlay(pdfSrc: String, x: Double, y: Double, options: OverlayOptions): Recipe = js.native
  def pageInfo(pageNumber: Double): Recipe = js.native
  def polygon(coordinates: js.Array[js.Array[Double]]): Recipe = js.native
  def polygon(coordinates: js.Array[js.Array[Double]], options: PolygonOptions): Recipe = js.native
  def rectangle(x: Double, y: Double, width: Double, height: Double): Recipe = js.native
  def rectangle(x: Double, y: Double, width: Double, height: Double, options: RectangleOptions): Recipe = js.native
  def registerFont(fontName: String, fontSrcPath: String): Recipe = js.native
  def split(outputDir: String, prefix: String): Recipe = js.native
  def text(text: String, x: Double, y: Double): Recipe = js.native
  def text(text: String, x: Double, y: Double, options: TextOptions): Recipe = js.native
}

