package typings.jupyterlabApputils.commandpaletteMod

import org.scalablytyped.runtime.TopLevel
import typings.phosphorCoreutils.mod.Token
import typings.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandPalette extends js.Object {
  /**
    * The placeholder text of the command palette's search input.
    */
  var placeholder: String
  /**
    * Activate the command palette for user input.
    */
  def activate(): Unit
  /**
    * Add a command item to the command palette.
    *
    * @param options - The options for creating the command item.
    *
    * @returns A disposable that will remove the item from the palette.
    */
  def addItem(options: IPaletteItem): IDisposable
}

@JSImport("@jupyterlab/apputils/lib/commandpalette", "ICommandPalette")
@js.native
object ICommandPalette extends TopLevel[Token[ICommandPalette]]

