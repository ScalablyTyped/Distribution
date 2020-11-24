package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SourceElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "SourceElementBase")
@js.native
abstract class SourceElementBase[TKind /* <: SourceElementKind */] ()
  extends typings.grammarkdown.nodesMod.Node[TKind]
