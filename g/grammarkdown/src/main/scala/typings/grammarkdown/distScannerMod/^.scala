package typings.grammarkdown.distScannerMod

import typings.grammarkdown.distNodesMod.CommentTrivia
import typings.grammarkdown.distNodesMod.HtmlTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/scanner", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def scanHtmlTrivia(text: String, pos: Double, end: Double): js.UndefOr[js.Array[HtmlTrivia]] = js.native
  def skipTrivia(text: String, pos: Double, end: Double): Double = js.native
  def skipTrivia(text: String, pos: Double, end: Double, htmlTrivia: js.Array[HtmlTrivia]): Double = js.native
  def skipTrivia(
    text: String,
    pos: Double,
    end: Double,
    htmlTrivia: js.Array[HtmlTrivia],
    commentTrivia: js.Array[CommentTrivia]
  ): Double = js.native
}

