package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distDiagnosticsMod.LineMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "SourceFile")
@js.native
class SourceFile protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.SourceFile] {
  def this(filename: String, text: String, elements: js.Array[SourceElement]) = this()
  val elements: js.Array[SourceElement] = js.native
  val filename: String = js.native
  var imports: js.UndefOr[js.Array[String]] = js.native
  val lineMap: LineMap = js.native
  val text: String = js.native
  def update(elements: js.Array[SourceElement]): SourceFile = js.native
}

