package typings.grammarkdown.mod

import typings.grammarkdown.distNodesMod.ProseFragment
import typings.grammarkdown.distTokensMod.SyntaxKind.GreaterThanToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Prose")
@js.native
open class Prose protected ()
  extends typings.grammarkdown.distNodesMod.Prose {
  def this(greaterThanToken: typings.grammarkdown.distNodesMod.Token[GreaterThanToken]) = this()
  def this(
    greaterThanToken: typings.grammarkdown.distNodesMod.Token[GreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
}
