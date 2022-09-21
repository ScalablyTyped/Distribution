package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.MarkdownString")
@js.native
/**
  * Creates a new markdown string with the given value.
  *
  * @param value Optional, initial value.
  * @param supportThemeIcons Optional, Specifies whether {@link ThemeIcon ThemeIcons} are supported within the {@linkcode MarkdownString}.
  */
open class MarkdownString ()
  extends typings.vscode.mod.MarkdownString {
  def this(value: String) = this()
  def this(value: String, supportThemeIcons: Boolean) = this()
  def this(value: Unit, supportThemeIcons: Boolean) = this()
}
