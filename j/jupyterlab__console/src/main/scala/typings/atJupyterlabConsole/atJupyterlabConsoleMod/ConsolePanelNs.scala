package typings.atJupyterlabConsole.atJupyterlabConsoleMod

import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console", "ConsolePanel")
@js.native
object ConsolePanelNs extends js.Object {
  /**
    * Default implementation of `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typings.atJupyterlabConsole.libPanelMod.ConsolePanelNs.ContentFactory
  
  /**
    * The console renderer token.
    */
  val IContentFactory: Token[typings.atJupyterlabConsole.libPanelMod.ConsolePanelNs.IContentFactory] = js.native
  /**
    * A default code console content factory.
    */
  val defaultContentFactory: typings.atJupyterlabConsole.libPanelMod.ConsolePanelNs.IContentFactory = js.native
  /**
    * A namespace for the console panel content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

