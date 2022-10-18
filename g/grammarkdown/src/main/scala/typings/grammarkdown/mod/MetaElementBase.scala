package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.MetaElementKind
import typings.grammarkdown.distTokensMod.SyntaxKind.AtToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown", "MetaElementBase")
@js.native
open class MetaElementBase[TKind /* <: MetaElementKind */] protected ()
  extends typings.grammarkdown.distNodesMod.MetaElementBase[TKind] {
  def this(kind: TKind, atToken: typings.grammarkdown.distNodesMod.Token[AtToken]) = this()
}
