package typings.grammarkdown.mod

import typings.grammarkdown.nodesMod.ProseFragment
import typings.grammarkdown.tokensMod.SyntaxKind.GreaterThanToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Prose")
@js.native
class Prose protected ()
  extends typings.grammarkdown.nodesMod.Prose {
  def this(greaterThanToken: typings.grammarkdown.nodesMod.Token[GreaterThanToken]) = this()
  def this(
    greaterThanToken: typings.grammarkdown.nodesMod.Token[GreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
}
