package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "LexicalSymbolBase")
@js.native
abstract class LexicalSymbolBase[TKind /* <: LexicalSymbolKind */] ()
  extends StObject
     with Node2[TKind] {
  
  /* CompleteClass */
  var end: Double = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
}
