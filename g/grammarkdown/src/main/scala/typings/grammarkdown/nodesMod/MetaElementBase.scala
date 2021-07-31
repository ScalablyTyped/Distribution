package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.MetaElementKind
import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: MetaElementKind */] protected () extends SourceElementBase[TKind] {
  def this(kind: TKind, atToken: Token[AtToken]) = this()
  
  val atToken: Token[AtToken] = js.native
}
