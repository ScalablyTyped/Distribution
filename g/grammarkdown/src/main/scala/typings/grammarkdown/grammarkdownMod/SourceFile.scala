package typings.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "SourceFile")
@js.native
class SourceFile protected ()
  extends Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.SourceFile] {
  def this(filename: String, text: String, elements: js.Array[SourceElement]) = this()
  
  val elements: js.Array[SourceElement] = js.native
  
  val filename: String = js.native
  
  var imports: js.UndefOr[js.Array[String]] = js.native
  
  val lineMap: LineMap = js.native
  
  val text: String = js.native
  
  def update(elements: js.Array[SourceElement]): SourceFile = js.native
}
