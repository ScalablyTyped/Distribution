package typings.jupyterlabApputils.commandpaletteMod

import org.scalablytyped.runtime.TopLevel
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommandPalette extends js.Object {
  
  /**
    * Activate the command palette for user input.
    */
  def activate(): Unit = js.native
  
  /**
    * Add a command item to the command palette.
    *
    * @param options - The options for creating the command item.
    *
    * @returns A disposable that will remove the item from the palette.
    */
  def addItem(options: IPaletteItem): IDisposable = js.native
  
  /**
    * The placeholder text of the command palette's search input.
    */
  var placeholder: String = js.native
}
@JSImport("@jupyterlab/apputils/lib/commandpalette", "ICommandPalette")
@js.native
object ICommandPalette extends TopLevel[Token[ICommandPalette]]
