package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.mod.WorkspaceFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.RelativePattern")
@js.native
open class RelativePattern protected ()
  extends typings.vscode.mod.RelativePattern {
  def this(base: String, pattern: String) = this()
  def this(base: typings.vscode.mod.Uri, pattern: String) = this()
  /**
  		 * Creates a new relative pattern object with a base file path and pattern to match. This pattern
  		 * will be matched on file paths relative to the base.
  		 *
  		 * Example:
  		 * ```ts
  		 * const folder = vscode.workspace.workspaceFolders?.[0];
  		 * if (folder) {
  		 *
  		 *   // Match any TypeScript file in the root of this workspace folder
  		 *   const pattern1 = new vscode.RelativePattern(folder, '*.ts');
  		 *
  		 *   // Match any TypeScript file in `someFolder` inside this workspace folder
  		 *   const pattern2 = new vscode.RelativePattern(folder, 'someFolder/ *.ts');
  		 * }
  		 * ```
  		 *
  		 * @param base A base to which this pattern will be matched against relatively. It is recommended
  		 * to pass in a {@link WorkspaceFolder workspace folder} if the pattern should match inside the workspace.
  		 * Otherwise, a uri or string should only be used if the pattern is for a file path outside the workspace.
  		 * @param pattern A file glob pattern like `*.{ts,js}` that will be matched on paths relative to the base.
  		 */
  def this(base: WorkspaceFolder, pattern: String) = this()
}
