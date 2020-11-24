package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.PrimarySymbolKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "PrimarySymbolBase")
@js.native
abstract class PrimarySymbolBase[TKind /* <: PrimarySymbolKind */] () extends Node[TKind]
