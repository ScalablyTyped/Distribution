package typings.jupyterlabConsole.panelMod.ConsolePanel

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabConsole.widgetMod.CodeConsole
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The console panel renderer.
  */
@js.native
trait IContentFactory
  extends typings.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory {
  
  /**
    * Create a new console panel.
    */
  def createConsole(options: typings.jupyterlabConsole.widgetMod.CodeConsole.IOptions): CodeConsole = js.native
}
/**
  * The console renderer token.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.IContentFactory")
@js.native
object IContentFactory extends TopLevel[Token[IContentFactory]]
