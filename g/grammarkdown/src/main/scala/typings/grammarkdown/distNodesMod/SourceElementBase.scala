package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SourceElementKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "SourceElementBase")
@js.native
open class SourceElementBase[TKind /* <: SourceElementKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
}
