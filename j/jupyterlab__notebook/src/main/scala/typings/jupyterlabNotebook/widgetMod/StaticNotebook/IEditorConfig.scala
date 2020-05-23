package typings.jupyterlabNotebook.widgetMod.StaticNotebook

import typings.jupyterlabNotebook.anon.PartialIConfig
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
  val code: PartialIConfig
  /**
    * Config options for markdown cells.
    */
  val markdown: PartialIConfig
  /**
    * Config options for raw cells.
    */
  val raw: PartialIConfig
}

object IEditorConfig {
  @scala.inline
  def apply(code: PartialIConfig, markdown: PartialIConfig, raw: PartialIConfig): IEditorConfig = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorConfig]
  }
}

