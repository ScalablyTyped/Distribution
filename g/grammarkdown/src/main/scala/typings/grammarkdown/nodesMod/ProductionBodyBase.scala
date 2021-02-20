package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.ProductionBodyKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "ProductionBodyBase")
@js.native
abstract class ProductionBodyBase[TKind /* <: ProductionBodyKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
}
