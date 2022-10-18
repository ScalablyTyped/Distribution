package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.LexicalSymbolKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "LexicalSymbolBase")
@js.native
open class LexicalSymbolBase[TKind /* <: LexicalSymbolKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
}
