package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.MetaElementKind
import typings.grammarkdown.distTokensMod.SyntaxKind.AtToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "MetaElementBase")
@js.native
open class MetaElementBase[TKind /* <: MetaElementKind */] protected () extends SourceElementBase[TKind] {
  def this(kind: TKind, atToken: Token[AtToken]) = this()
  
  val atToken: Token[AtToken] = js.native
}
