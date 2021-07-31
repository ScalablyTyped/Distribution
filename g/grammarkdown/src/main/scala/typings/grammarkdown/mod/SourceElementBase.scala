package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SourceElementKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "SourceElementBase")
@js.native
abstract class SourceElementBase[TKind /* <: SourceElementKind */] protected ()
  extends typings.grammarkdown.nodesMod.SourceElementBase[TKind] {
  def this(kind: TKind) = this()
}
