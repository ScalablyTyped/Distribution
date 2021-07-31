package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "ProseFragmentLiteral")
@js.native
class ProseFragmentLiteral[TKind /* <: ProseFragmentLiteralKind */] protected ()
  extends StObject
     with Node2[SyntaxKind]
     with TextContent {
  def this(kind: SyntaxKind) = this()
  def this(kind: SyntaxKind, text: String) = this()
  
  /* CompleteClass */
  var end: Double = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
}
