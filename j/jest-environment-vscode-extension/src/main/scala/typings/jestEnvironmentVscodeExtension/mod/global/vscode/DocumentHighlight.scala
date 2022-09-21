package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.DocumentHighlight")
@js.native
open class DocumentHighlight protected ()
  extends typings.vscode.mod.DocumentHighlight {
  /**
    * Creates a new document highlight object.
    *
    * @param range The range the highlight applies to.
    * @param kind The highlight kind, default is {@link DocumentHighlightKind.Text text}.
    */
  def this(range: typings.vscode.mod.Range) = this()
  def this(range: typings.vscode.mod.Range, kind: typings.vscode.mod.DocumentHighlightKind) = this()
}
