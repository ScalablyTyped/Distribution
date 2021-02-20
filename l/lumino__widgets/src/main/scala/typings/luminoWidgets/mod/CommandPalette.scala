package typings.luminoWidgets.mod

import typings.luminoWidgets.commandpaletteMod.CommandPalette.IOptions
import org.scalablytyped.runtime.StObject
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
object CommandPalette {
  
  /**
    * The default implementation of `IRenderer`.
    */
  @JSImport("@lumino/widgets", "CommandPalette.Renderer")
  @js.native
  class Renderer ()
    extends typings.luminoWidgets.commandpaletteMod.CommandPalette.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "CommandPalette.defaultRenderer")
  @js.native
  val defaultRenderer: typings.luminoWidgets.commandpaletteMod.CommandPalette.Renderer = js.native
}
