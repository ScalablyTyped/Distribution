package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distDiagnosticsMod.LineMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "SourceFile")
@js.native
open class SourceFile protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.SourceFile]
     with Declaration {
  def this(filename: String, text: String, elements: js.Array[SourceElement]) = this()
  
  /* private */ var _imports: Any = js.native
  
  /* private */ var _parseDiagnostics: Any = js.native
  
  val elements: js.Array[SourceElement] = js.native
  
  val filename: String = js.native
  
  def imports: js.UndefOr[js.Array[String]] = js.native
  
  val lineMap: LineMap = js.native
  
  val text: String = js.native
  
  def update(elements: js.Array[SourceElement]): SourceFile = js.native
}
