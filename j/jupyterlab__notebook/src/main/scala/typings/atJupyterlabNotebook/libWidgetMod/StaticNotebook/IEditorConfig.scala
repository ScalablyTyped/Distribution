package typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A config object for the cell editors.
  */
trait IEditorConfig extends js.Object {
  /**
    * Config options for code cells.
    */
  val code: Partial[IConfig]
  /**
    * Config options for markdown cells.
    */
  val markdown: Partial[IConfig]
  /**
    * Config options for raw cells.
    */
  val raw: Partial[IConfig]
}

object IEditorConfig {
  @scala.inline
  def apply(code: Partial[IConfig], markdown: Partial[IConfig], raw: Partial[IConfig]): IEditorConfig = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEditorConfig]
  }
}

