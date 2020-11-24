package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.LexicalSymbolKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "LexicalSymbolBase")
@js.native
abstract class LexicalSymbolBase[TKind /* <: LexicalSymbolKind */] ()
  extends typings.grammarkdown.nodesMod.Node[TKind]
