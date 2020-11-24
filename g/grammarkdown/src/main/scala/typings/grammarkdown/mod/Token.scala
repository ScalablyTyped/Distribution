package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.TokenKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Token")
@js.native
class Token[TKind /* <: TokenKind */] ()
  extends typings.grammarkdown.nodesMod.Node[TKind]
