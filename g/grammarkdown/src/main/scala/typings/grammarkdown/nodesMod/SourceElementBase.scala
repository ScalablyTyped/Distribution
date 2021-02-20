package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SourceElementKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "SourceElementBase")
@js.native
abstract class SourceElementBase[TKind /* <: SourceElementKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
}
