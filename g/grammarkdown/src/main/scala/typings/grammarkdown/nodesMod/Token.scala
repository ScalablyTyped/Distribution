package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.TokenKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Token")
@js.native
class Token[TKind /* <: TokenKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
}
