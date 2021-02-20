package typings.grammarkdown.nodesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "SymbolSpan")
@js.native
class SymbolSpan protected ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.SymbolSpan] {
  def this(symbol: LexicalSymbol) = this()
  def this(symbol: LexicalSymbol, next: SymbolSpan) = this()
  
  val next: js.UndefOr[SymbolSpan] = js.native
  
  val symbol: LexicalSymbol = js.native
  
  def update(symbol: LexicalSymbol): SymbolSpan = js.native
  def update(symbol: LexicalSymbol, next: SymbolSpan): SymbolSpan = js.native
}
