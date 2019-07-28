package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distNodesMod.ProseFragment
import typings.grammarkdown.distTokensMod.SyntaxKind.GreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Prose")
@js.native
class Prose protected ()
  extends typings.grammarkdown.distNodesMod.Prose {
  def this(greaterThanToken: typings.grammarkdown.distNodesMod.Token[GreaterThanToken]) = this()
  def this(
    greaterThanToken: typings.grammarkdown.distNodesMod.Token[GreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
}

