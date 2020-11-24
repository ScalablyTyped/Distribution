package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A selection owner.
  */
@js.native
trait ISelectionOwner extends js.Object {
  
  /**
    * Returns the primary position of the cursor, never `null`.
    */
  def getCursorPosition(): IPosition = js.native
  
  /**
    * Returns the primary selection, never `null`.
    */
  def getSelection(): IRange = js.native
  
  /**
    * Gets the selections for all the cursors, never `null` or empty.
    */
  def getSelections(): js.Array[IRange] = js.native
  
  /**
    * Set the primary position of the cursor.
    *
    * @param position - The new primary position.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setCursorPosition(position: IPosition): Unit = js.native
  
  /**
    * Set the primary selection.
    *
    * @param selection - The desired selection range.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setSelection(selection: IRange): Unit = js.native
  
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
  def setSelections(selections: js.Array[IRange]): Unit = js.native
  
  /**
    * The uuid of this selection owner.
    */
  var uuid: String = js.native
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
  
  @scala.inline
  implicit class ISelectionOwnerOps[Self <: ISelectionOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCursorPosition(value: () => IPosition): Self = this.set("getCursorPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelection(value: () => IRange): Self = this.set("getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelections(value: () => js.Array[IRange]): Self = this.set("getSelections", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCursorPosition(value: IPosition => Unit): Self = this.set("setCursorPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelection(value: IRange => Unit): Self = this.set("setSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelections(value: js.Array[IRange] => Unit): Self = this.set("setSelections", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
