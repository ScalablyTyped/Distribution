package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.InlayHint")
@js.native
open class InlayHint protected ()
  extends typings.vscode.mod.InlayHint {
  /**
  		 * Creates a new inlay hint.
  		 *
  		 * @param position The position of the hint.
  		 * @param label The label of the hint.
  		 * @param kind The {@link InlayHintKind kind} of the hint.
  		 */
  def this(position: typings.vscode.mod.Position, label: String) = this()
  def this(position: typings.vscode.mod.Position, label: js.Array[typings.vscode.mod.InlayHintLabelPart]) = this()
  def this(position: typings.vscode.mod.Position, label: String, kind: typings.vscode.mod.InlayHintKind) = this()
  def this(
    position: typings.vscode.mod.Position,
    label: js.Array[typings.vscode.mod.InlayHintLabelPart],
    kind: typings.vscode.mod.InlayHintKind
  ) = this()
}
