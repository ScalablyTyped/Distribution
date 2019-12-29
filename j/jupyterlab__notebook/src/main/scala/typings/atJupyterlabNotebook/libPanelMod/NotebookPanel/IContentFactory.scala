package typings.atJupyterlabNotebook.libPanelMod.NotebookPanel

import org.scalablytyped.runtime.TopLevel
import typings.atJupyterlabNotebook.libWidgetMod.Notebook
import typings.atJupyterlabNotebook.libWidgetMod.Notebook.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A content factory interface for NotebookPanel.
  */
trait IContentFactory
  extends typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook.IContentFactory {
  /**
    * Create a new content area for the panel.
    */
  def createNotebook(options: IOptions): Notebook
}

/**
  * The notebook renderer token.
  */
@JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.IContentFactory")
@js.native
object IContentFactory extends TopLevel[Token[IContentFactory]]

