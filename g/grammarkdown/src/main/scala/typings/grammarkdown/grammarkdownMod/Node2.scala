package typings.grammarkdown.grammarkdownMod

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** {@docCategory Nodes} */
@js.native
trait Node2[TKind /* <: SyntaxKind */]
  extends StObject
     with TextRange {
  
  def children(): IterableIterator[Node2[SyntaxKind]] = js.native
  
  def firstChild: js.UndefOr[Node2[SyntaxKind]] = js.native
  
  def forEachChild[T](_cbNode: js.Function1[/* node */ Node2[SyntaxKind], js.UndefOr[T]]): js.UndefOr[T] = js.native
  
  def getEnd(): Double = js.native
  
  def getFullStart(): Double = js.native
  
  def getFullText(sourceFile: SourceFile): String = js.native
  
  def getFullWidth(): Double = js.native
  
  def getStart(): Double = js.native
  def getStart(sourceFile: SourceFile): Double = js.native
  
  def getText(sourceFile: SourceFile): String = js.native
  
  def getWidth(): Double = js.native
  def getWidth(sourceFile: SourceFile): Double = js.native
  
  val kind: TKind = js.native
  
  def lastChild: js.UndefOr[Node2[SyntaxKind]] = js.native
  
  var leadingHtmlTrivia: js.UndefOr[js.Array[HtmlTrivia]] = js.native
  
  var trailingHtmlTrivia: js.UndefOr[js.Array[HtmlTrivia]] = js.native
}
