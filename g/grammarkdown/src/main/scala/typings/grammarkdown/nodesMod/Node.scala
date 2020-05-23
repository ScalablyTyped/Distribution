package typings.grammarkdown.nodesMod

import typings.grammarkdown.coreMod.TextRange
import typings.grammarkdown.tokensMod.SyntaxKind
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Node")
@js.native
abstract class Node[TKind /* <: SyntaxKind */] protected () extends TextRange {
  def this(kind: TKind) = this()
  /* CompleteClass */
  override var end: Double = js.native
  val kind: TKind = js.native
  var leadingHtmlTrivia: js.UndefOr[js.Array[HtmlTrivia]] = js.native
  /* CompleteClass */
  override var pos: Double = js.native
  var trailingHtmlTrivia: js.UndefOr[js.Array[HtmlTrivia]] = js.native
  def children(): IterableIterator[Node[SyntaxKind]] = js.native
  def firstChild: js.UndefOr[Node[SyntaxKind]] = js.native
  def forEachChild[T](_cbNode: js.Function1[/* node */ Node[SyntaxKind], js.UndefOr[T]]): js.UndefOr[T] = js.native
  def getEnd(): Double = js.native
  def getFullStart(): Double = js.native
  def getFullText(sourceFile: SourceFile): String = js.native
  def getFullWidth(): Double = js.native
  def getStart(): Double = js.native
  def getStart(sourceFile: SourceFile): Double = js.native
  def getText(sourceFile: SourceFile): String = js.native
  def getWidth(): Double = js.native
  def getWidth(sourceFile: SourceFile): Double = js.native
  def lastChild: js.UndefOr[Node[SyntaxKind]] = js.native
}

