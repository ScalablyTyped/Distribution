package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "SourceFile")
@js.native
class SourceFile protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(filename: java.lang.String, text: java.lang.String, elements: js.Array[SourceElement]) = this()
  val elements: js.Array[SourceElement] = js.native
  val filename: java.lang.String = js.native
  var imports: js.UndefOr[js.Array[java.lang.String]] = js.native
  val lineMap: grammarkdownLib.distDiagnosticsMod.LineMap = js.native
  val text: java.lang.String = js.native
  def update(elements: js.Array[SourceElement]): SourceFile = js.native
}

