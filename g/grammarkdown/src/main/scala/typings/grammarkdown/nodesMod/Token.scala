package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.TokenKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Token")
@js.native
class Token[TKind /* <: TokenKind */] () extends Node[TKind]
