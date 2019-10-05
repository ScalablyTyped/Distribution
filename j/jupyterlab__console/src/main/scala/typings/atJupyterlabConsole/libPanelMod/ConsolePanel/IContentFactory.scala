package typings.atJupyterlabConsole.libPanelMod.ConsolePanel

import org.scalablytyped.runtime.TopLevel
import typings.atJupyterlabConsole.libWidgetMod.CodeConsole
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The console panel renderer.
  */
trait IContentFactory
  extends typings.atJupyterlabConsole.libWidgetMod.CodeConsole.IContentFactory {
  /**
    * Create a new console panel.
    */
  def createConsole(options: typings.atJupyterlabConsole.libWidgetMod.CodeConsole.IOptions): CodeConsole
}

/**
  * The console renderer token.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.IContentFactory")
@js.native
object IContentFactory extends TopLevel[Token[IContentFactory]]

