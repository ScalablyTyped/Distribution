package typings.luminoWidgets.mod

import typings.luminoWidgets.commandpaletteMod.CommandPalette.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "CommandPalette")
@js.native
class CommandPalette protected ()
  extends typings.luminoWidgets.commandpaletteMod.CommandPalette {
  /**
    * Construct a new command palette.
    *
    * @param options - The options for initializing the palette.
    */
  def this(options: IOptions) = this()
}
@JSImport("@lumino/widgets", "CommandPalette")
@js.native
object CommandPalette extends js.Object {
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typings.luminoWidgets.commandpaletteMod.CommandPalette.Renderer = js.native
  
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer ()
    extends typings.luminoWidgets.commandpaletteMod.CommandPalette.Renderer
}
