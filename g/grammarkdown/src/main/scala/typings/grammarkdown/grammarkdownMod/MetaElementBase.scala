package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distNodesMod.MetaElementKind
import typings.grammarkdown.distTokensMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: MetaElementKind */] protected ()
  extends typings.grammarkdown.distNodesMod.MetaElementBase[TKind] {
  def this(kind: TKind, atToken: typings.grammarkdown.distNodesMod.Token[AtToken]) = this()
}

