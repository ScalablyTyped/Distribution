package typings.grammarkdown.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Parameter")
@js.native
class Parameter protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.Parameter] {
  def this(name: Identifier) = this()
  val name: Identifier = js.native
  def update(name: Identifier): Parameter = js.native
}

