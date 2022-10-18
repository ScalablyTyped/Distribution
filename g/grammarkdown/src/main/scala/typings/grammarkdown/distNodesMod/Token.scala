package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.TokenKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Token")
@js.native
open class Token[TKind /* <: TokenKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
}
