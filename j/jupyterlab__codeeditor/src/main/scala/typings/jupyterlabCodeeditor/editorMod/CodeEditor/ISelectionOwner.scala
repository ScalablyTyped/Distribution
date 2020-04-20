package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection owner.
  */
trait ISelectionOwner extends js.Object {
  /**
    * The uuid of this selection owner.
    */
  var uuid: String
  /**
    * Returns the primary position of the cursor, never `null`.
    */
  def getCursorPosition(): IPosition
  /**
    * Returns the primary selection, never `null`.
    */
  def getSelection(): IRange
  /**
    * Gets the selections for all the cursors, never `null` or empty.
    */
  def getSelections(): js.Array[IRange]
  /**
    * Set the primary position of the cursor.
    *
    * @param position - The new primary position.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setCursorPosition(position: IPosition): Unit
  /**
    * Set the primary selection.
    *
    * @param selection - The desired selection range.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setSelection(selection: IRange): Unit
  /**
    * Sets the selections for all the cursors.
    *
    * @param selections - The new selections.
    *
    * #### Notes
    * Cursors will be removed or added, as necessary.
    * Passing an empty array resets a cursor position to the start of a
    * document.
    */
  def setSelections(selections: js.Array[IRange]): Unit
}

object ISelectionOwner {
  @scala.inline
  def apply(
    getCursorPosition: () => IPosition,
    getSelection: () => IRange,
    getSelections: () => js.Array[IRange],
    setCursorPosition: IPosition => Unit,
    setSelection: IRange => Unit,
    setSelections: js.Array[IRange] => Unit,
    uuid: String
  ): ISelectionOwner = {
    val __obj = js.Dynamic.literal(getCursorPosition = js.Any.fromFunction0(getCursorPosition), getSelection = js.Any.fromFunction0(getSelection), getSelections = js.Any.fromFunction0(getSelections), setCursorPosition = js.Any.fromFunction1(setCursorPosition), setSelection = js.Any.fromFunction1(setSelection), setSelections = js.Any.fromFunction1(setSelections), uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionOwner]
  }
}

