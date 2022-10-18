package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.TokenKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Token")
@js.native
open class Token[TKind /* <: TokenKind */] protected ()
  extends typings.grammarkdown.distNodesMod.Token[TKind] {
  def this(kind: TKind) = this()
}
