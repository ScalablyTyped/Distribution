package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Node")
@js.native
abstract class Node[TKind /* <: grammarkdownLib.distTokensMod.SyntaxKind */] protected ()
  extends grammarkdownLib.distCoreMod.TextRange {
  def this(kind: TKind) = this()
  /* CompleteClass */
  override var end: scala.Double = js.native
  val firstChild: js.UndefOr[Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val kind: TKind = js.native
  val lastChild: js.UndefOr[Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  var leadingHtmlTrivia: js.UndefOr[js.Array[HtmlTrivia]] = js.native
  /* CompleteClass */
  override var pos: scala.Double = js.native
  var trailingHtmlTrivia: js.UndefOr[js.Array[HtmlTrivia]] = js.native
  def children(): stdLib.IterableIterator[Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def forEachChild[T](_cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def getEnd(): scala.Double = js.native
  def getFullStart(): scala.Double = js.native
  def getFullText(sourceFile: SourceFile): java.lang.String = js.native
  def getFullWidth(): scala.Double = js.native
  def getStart(): scala.Double = js.native
  def getStart(sourceFile: SourceFile): scala.Double = js.native
  def getText(sourceFile: SourceFile): java.lang.String = js.native
  def getWidth(): scala.Double = js.native
  def getWidth(sourceFile: SourceFile): scala.Double = js.native
}

