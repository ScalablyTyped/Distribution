package typings
package atJupyterlabConsoleLib.atJupyterlabConsoleMod

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
    extends atJupyterlabConsoleLib.libPanelMod.ConsolePanelNs.ContentFactory
  
  /**
    * The console renderer token.
    */
  val IContentFactory: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[atJupyterlabConsoleLib.libPanelMod.ConsolePanelNs.IContentFactory] = js.native
  /**
    * A default code console content factory.
    */
  val defaultContentFactory: atJupyterlabConsoleLib.libPanelMod.ConsolePanelNs.IContentFactory = js.native
  /**
    * A namespace for the console panel content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

