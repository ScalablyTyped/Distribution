package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.ProductionBodyKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "ProductionBodyBase")
@js.native
open class ProductionBodyBase[TKind /* <: ProductionBodyKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
}
