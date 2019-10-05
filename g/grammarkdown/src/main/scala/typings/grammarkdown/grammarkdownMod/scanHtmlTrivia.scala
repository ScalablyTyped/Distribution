package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distNodesMod.HtmlTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "scanHtmlTrivia")
@js.native
object scanHtmlTrivia extends js.Object {
  def apply(text: String, pos: Double, end: Double): js.UndefOr[js.Array[HtmlTrivia]] = js.native
}

