package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.ThemeIcon")
@js.native
open class ThemeIcon protected ()
  extends typings.vscode.mod.ThemeIcon {
  /**
    * Creates a reference to a theme icon.
    * @param id id of the icon. The available icons are listed in https://code.visualstudio.com/api/references/icons-in-labels#icon-listing.
    * @param color optional `ThemeColor` for the icon. The color is currently only used in {@link TreeItem}.
    */
  def this(id: String) = this()
  def this(id: String, color: typings.vscode.mod.ThemeColor) = this()
}
/* static members */
object ThemeIcon {
  
  /**
    * Reference to an icon representing a file. The icon is taken from the current file icon theme or a placeholder icon is used.
    */
  @JSGlobal("vscode.ThemeIcon.File")
  @js.native
  val File: typings.vscode.mod.ThemeIcon = js.native
  
  /**
    * Reference to an icon representing a folder. The icon is taken from the current file icon theme or a placeholder icon is used.
    */
  @JSGlobal("vscode.ThemeIcon.Folder")
  @js.native
  val Folder: typings.vscode.mod.ThemeIcon = js.native
}
