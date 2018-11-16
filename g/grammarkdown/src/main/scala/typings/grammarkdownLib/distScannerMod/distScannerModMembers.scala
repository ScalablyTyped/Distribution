package typings
package grammarkdownLib.distScannerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/scanner", JSImport.Namespace)
@js.native
object distScannerModMembers extends js.Object {
  def scanHtmlTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): js.UndefOr[js.Array[grammarkdownLib.distNodesMod.HtmlTrivia]] = js.native
  def skipTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): scala.Double = js.native
  def skipTrivia(
    text: java.lang.String,
    pos: scala.Double,
    end: scala.Double,
    htmlTrivia: js.Array[grammarkdownLib.distNodesMod.HtmlTrivia]
  ): scala.Double = js.native
  def skipTrivia(
    text: java.lang.String,
    pos: scala.Double,
    end: scala.Double,
    htmlTrivia: js.Array[grammarkdownLib.distNodesMod.HtmlTrivia],
    commentTrivia: js.Array[grammarkdownLib.distNodesMod.CommentTrivia]
  ): scala.Double = js.native
}

