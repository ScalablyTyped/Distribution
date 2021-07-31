package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "SymbolSpan")
@js.native
class SymbolSpan protected ()
  extends StObject
     with Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.SymbolSpan] {
  def this(symbol: LexicalSymbol) = this()
  def this(symbol: LexicalSymbol, next: SymbolSpan) = this()
  
  /* CompleteClass */
  var end: Double = js.native
  
  val next: js.UndefOr[SymbolSpan] = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
  
  val symbol: LexicalSymbol = js.native
  
  def update(symbol: LexicalSymbol): SymbolSpan = js.native
  def update(symbol: LexicalSymbol, next: SymbolSpan): SymbolSpan = js.native
}
