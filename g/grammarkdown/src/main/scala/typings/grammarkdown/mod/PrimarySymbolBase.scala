package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.PrimarySymbolKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "PrimarySymbolBase")
@js.native
abstract class PrimarySymbolBase[TKind /* <: PrimarySymbolKind */] ()
  extends typings.grammarkdown.nodesMod.Node[TKind]
