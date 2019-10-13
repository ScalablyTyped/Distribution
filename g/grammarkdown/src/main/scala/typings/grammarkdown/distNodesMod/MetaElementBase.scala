package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: MetaElementKind */] protected () extends Node[TKind] {
  def this(kind: TKind, atToken: Token[AtToken]) = this()
  val atToken: Token[AtToken] = js.native
}

