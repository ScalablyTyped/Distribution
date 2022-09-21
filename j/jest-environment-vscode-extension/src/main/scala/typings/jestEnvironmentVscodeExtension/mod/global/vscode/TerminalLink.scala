package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.TerminalLink")
@js.native
open class TerminalLink protected ()
  extends typings.vscode.mod.TerminalLink {
  /**
    * Creates a new terminal link.
    * @param startIndex The start index of the link on {@link TerminalLinkContext.line}.
    * @param length The length of the link on {@link TerminalLinkContext.line}.
    * @param tooltip The tooltip text when you hover over this link.
    *
    * If a tooltip is provided, is will be displayed in a string that includes instructions on
    * how to trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary
    * depending on OS, user settings, and localization.
    */
  def this(startIndex: Double, length: Double) = this()
  def this(startIndex: Double, length: Double, tooltip: String) = this()
}
