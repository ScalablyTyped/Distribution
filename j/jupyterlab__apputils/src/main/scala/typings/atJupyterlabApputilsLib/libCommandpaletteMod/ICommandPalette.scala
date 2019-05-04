package typings
package atJupyterlabApputilsLib.libCommandpaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandPalette extends js.Object {
  /**
    * The placeholder text of the command palette's search input.
    */
  var placeholder: java.lang.String
  /**
    * Activate the command palette for user input.
    */
  def activate(): scala.Unit
  /**
    * Add a command item to the command palette.
    *
    * @param options - The options for creating the command item.
    *
    * @returns A disposable that will remove the item from the palette.
    */
  def addItem(options: IPaletteItem): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable
}

object ICommandPalette {
  @scala.inline
  def apply(
    activate: () => scala.Unit,
    addItem: IPaletteItem => atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable,
    placeholder: java.lang.String
  ): ICommandPalette = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), addItem = js.Any.fromFunction1(addItem), placeholder = placeholder)
  
    __obj.asInstanceOf[ICommandPalette]
  }
}

