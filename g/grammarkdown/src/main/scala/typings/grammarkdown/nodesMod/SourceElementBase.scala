package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SourceElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "SourceElementBase")
@js.native
abstract class SourceElementBase[TKind /* <: SourceElementKind */] () extends Node[TKind]
