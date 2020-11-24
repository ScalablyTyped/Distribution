package typings.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "skipTrivia")
@js.native
object skipTrivia extends js.Object {
  
  def apply(text: String, pos: Double, end: Double): Double = js.native
  def apply(
    text: String,
    pos: Double,
    end: Double,
    htmlTrivia: js.UndefOr[scala.Nothing],
    commentTrivia: js.Array[CommentTrivia]
  ): Double = js.native
  def apply(text: String, pos: Double, end: Double, htmlTrivia: js.Array[HtmlTrivia]): Double = js.native
  def apply(
    text: String,
    pos: Double,
    end: Double,
    htmlTrivia: js.Array[HtmlTrivia],
    commentTrivia: js.Array[CommentTrivia]
  ): Double = js.native
}
