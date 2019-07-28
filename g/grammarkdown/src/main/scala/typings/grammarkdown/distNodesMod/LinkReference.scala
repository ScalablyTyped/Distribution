package typings.grammarkdown.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "LinkReference")
@js.native
class LinkReference ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.LinkReference] {
  def this(text: String) = this()
  val text: js.UndefOr[String] = js.native
}

