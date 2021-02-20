package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.MetaElementKind
import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: MetaElementKind */] protected ()
  extends typings.grammarkdown.nodesMod.MetaElementBase[TKind] {
  def this(kind: TKind, atToken: typings.grammarkdown.nodesMod.Token[AtToken]) = this()
}
