package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind
import typings.grammarkdown.distTypesMod.TextRange
import typings.grammarkdown.distVisitorMod.NodeVisitor
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "Node")
@js.native
open class Node[TKind /* <: SyntaxKind */] protected ()
  extends StObject
     with TextRange {
  def this(kind: TKind) = this()
  
  /* private */ var _detachedTrivia: Any = js.native
  
  /* private */ var _end: Any = js.native
  
  /* private */ var _leadingHtmlTrivia: Any = js.native
  
  /* private */ var _leadingTrivia: Any = js.native
  
  /* private */ var _pos: Any = js.native
  
  /* private */ var _trailingHtmlTrivia: Any = js.native
  
  /* private */ var _trailingTrivia: Any = js.native
  
  /* protected */ def accept(visitor: NodeVisitor): Node[SyntaxKind] = js.native
  
  def children(): IterableIterator[Node[SyntaxKind]] = js.native
  
  /**
    * Detached trivia is any trivia that occurs prior to the node that is not the leading or trailing trivia of this
    * or any other node.
    */
  def detachedTrivia: js.UndefOr[js.Array[Trivia]] = js.native
  
  /* protected */ def edgeCount: Double = js.native
  
  /* protected */ def edgeName(offset: Double): js.UndefOr[String] = js.native
  
  /* protected */ def edgeValue(offset: Double): js.UndefOr[Node[SyntaxKind] | js.Array[Node[SyntaxKind]]] = js.native
  
  /* CompleteClass */
  override val end: Double = js.native
  @JSName("end")
  def end_MNode: Double = js.native
  
  def firstChild: js.UndefOr[Node[SyntaxKind]] = js.native
  
  def forEachChild[T](cbNode: js.Function1[/* node */ Node[SyntaxKind], js.UndefOr[T]]): js.UndefOr[T] = js.native
  
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
  
  def lastChild: js.UndefOr[Node[SyntaxKind]] = js.native
  
  /** @deprecated Use {@link leadingTrivia} or {@link detachedTrivia} instead. */
  def leadingHtmlTrivia: js.UndefOr[js.Array[HtmlTrivia]] = js.native
  
  /**
    * Leading trivia is trivia that belongs to the beginning of the node:
    * - An HTML close tag trivia, or any trivia preceding an HTML close tag trivia, is not leading trivia of the node.
    * - An HTML open tag trivia, and any trivia following an HTML open tag trivia, is leading trivia of the node.
    * - If the node has a preceding line break, then
    *   - Any other non-HTML tag trivia on the same line as the node that precedes the node is leading trivia of the node.
    *   - Any other non-HTML tag trivia on a line that precedes the node, but not preceding a blank line, is leading trivia of the node.
    * - Otherwise,
    *   - Any other non-HTML tag trivia on the same line as the node that precedes the node is leading trivia, if there is no whitespace between
    *     that trivia and the node.
    */
  def leadingTrivia: js.UndefOr[js.Array[Trivia]] = js.native
  
  /* CompleteClass */
  override val pos: Double = js.native
  @JSName("pos")
  def pos_MNode: Double = js.native
  
  /** @deprecated Use {@link trailingTrivia} instead. */
  def trailingHtmlTrivia: js.UndefOr[js.Array[HtmlTrivia]] = js.native
  
  /**
    * Trailing trivia is trivia that belongs to the end of the node:
    * - An HTML open tag trivia, or any trivia following an HTML open tag trivia, is not trailing trivia of the node.
    * - An HTML close tag trivia, and any trivia preceding an HTML close tag trivia, is trailing trivia of the node.
    * - If the node has a trailing line break, then
    *   - Any other non-HTML tag trivia on the same line as the node that follows the node is trailing trivia of the node.
    *   - Any other non-HTML tag trivia on a line that follows the node, but not following a blank line, is trailing trivia of the node.
    * - Otherwise,
    *   - Any other non-HTML tag trivia on the same line as the node that follows the node is trailing trivia, if there is no whitespace between
    *     that trivia and the node.
    */
  def trailingTrivia: js.UndefOr[js.Array[Trivia]] = js.native
}
