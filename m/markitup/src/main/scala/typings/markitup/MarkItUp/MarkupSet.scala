package typings.markitup.MarkItUp

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkupSet extends js.Object {
  
  /**
    * Function to be called just after a markup insertion. If a global afterInsert callback is already defined this function is fired before.
    */
  var afterInsert: js.UndefOr[js.Function1[/* h */ this.type, String]] = js.native
  
  /**
    * Function to be called after a multiline markup insertion.
    */
  var afterMultiInsert: js.UndefOr[js.Function1[/* h */ this.type, String]] = js.native
  
  /**
    * Returns true if the Alt key is pressed when the callback is fired.
    */
  var altKey: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to be called just before a markup insertion. If a global beforeInsert callback is already defined this function is fired just after.
    */
  var beforeInsert: js.UndefOr[js.Function1[/* h */ this.type, String]] = js.native
  
  /**
    * Function to be called before a multiline markup insertion.
    */
  var beforeMultiInsert: js.UndefOr[js.Function1[/* h */ this.type, String]] = js.native
  
  /**
    * Returns the position of the selection.
    */
  var caretPosition: js.UndefOr[Double] = js.native
  
  /**
    * Classname to be applied to this very button.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Text to be added after a whole block. Accepts functions.
    */
  var closeBlockWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  
  /**
    * Markup to be added after selection. Accepts functions.
    */
  var closeWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  
  /**
    * Returns true if the Control key is pressed when the callback is fired.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.native
  
  /**
    * Open a dropdown menu with another button set.
    */
  var dropMenu: js.UndefOr[js.Array[MarkupSet]] = js.native
  
  /**
    * Keep (true) or not (false) the default behaviour of the key.
    */
  var keepDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Shortcut key to be applied to the button. Ctrl+key trigger the action of a button.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * If a multi-line edition is trigged (Ctrl + Shift + click). This property return the number of the line being processed.
    */
  var line: js.UndefOr[Double] = js.native
  
  /**
    * Set whether the tags has to be inserted at each line or on the whole selected block.
    */
  var multiline: js.UndefOr[Boolean] = js.native
  
  /**
    * Button name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Text to be added before a whole block. Accepts functions.
    */
  var openBlockWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  
  /**
    * Markup to be added before selection. Accepts functions.
    */
  var openWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  
  /**
    * Placeholder text to be inserted if no text is selected by the user.
    */
  var placeHolder: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  
  /**
    * Text to be added in place of the cursor or selection. Accepts functions.
    */
  var replaceWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  
  /**
    * Returns the position of the scrollbar.
    */
  var scrollPosition: js.UndefOr[Double] = js.native
  
  /**
    * Returns the selection.
    */
  var selection: js.UndefOr[String] = js.native
  
  /** Not documented on the markitup site, but present in the tests */
  var separator: js.UndefOr[String] = js.native
  
  /**
    * Returns true if the Shift key is pressed when the callback is fired.
    */
  var shiftKey: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns the textarea object.
    */
  var textarea: js.UndefOr[HTMLElement] = js.native
}
object MarkupSet {
  
  @scala.inline
  def apply(): MarkupSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkupSet]
  }
  
  @scala.inline
  implicit class MarkupSetOps[Self <: MarkupSet] (val x: Self) extends AnyVal {
    
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
    def setAfterInsert(value: MarkupSet => String): Self = this.set("afterInsert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterInsert: Self = this.set("afterInsert", js.undefined)
    
    @scala.inline
    def setAfterMultiInsert(value: MarkupSet => String): Self = this.set("afterMultiInsert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterMultiInsert: Self = this.set("afterMultiInsert", js.undefined)
    
    @scala.inline
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    
    @scala.inline
    def setBeforeInsert(value: MarkupSet => String): Self = this.set("beforeInsert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeInsert: Self = this.set("beforeInsert", js.undefined)
    
    @scala.inline
    def setBeforeMultiInsert(value: MarkupSet => String): Self = this.set("beforeMultiInsert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeMultiInsert: Self = this.set("beforeMultiInsert", js.undefined)
    
    @scala.inline
    def setCaretPosition(value: Double): Self = this.set("caretPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaretPosition: Self = this.set("caretPosition", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCloseBlockWithFunction1(value: MarkupSet => String): Self = this.set("closeBlockWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseBlockWith(value: String | (js.Function1[MarkupSet, String])): Self = this.set("closeBlockWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseBlockWith: Self = this.set("closeBlockWith", js.undefined)
    
    @scala.inline
    def setCloseWithFunction1(value: MarkupSet => String): Self = this.set("closeWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseWith(value: String | (js.Function1[MarkupSet, String])): Self = this.set("closeWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseWith: Self = this.set("closeWith", js.undefined)
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    
    @scala.inline
    def setDropMenuVarargs(value: MarkupSet*): Self = this.set("dropMenu", js.Array(value :_*))
    
    @scala.inline
    def setDropMenu(value: js.Array[MarkupSet]): Self = this.set("dropMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropMenu: Self = this.set("dropMenu", js.undefined)
    
    @scala.inline
    def setKeepDefault(value: Boolean): Self = this.set("keepDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepDefault: Self = this.set("keepDefault", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpenBlockWithFunction1(value: MarkupSet => String): Self = this.set("openBlockWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenBlockWith(value: String | (js.Function1[MarkupSet, String])): Self = this.set("openBlockWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenBlockWith: Self = this.set("openBlockWith", js.undefined)
    
    @scala.inline
    def setOpenWithFunction1(value: MarkupSet => String): Self = this.set("openWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenWith(value: String | (js.Function1[MarkupSet, String])): Self = this.set("openWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenWith: Self = this.set("openWith", js.undefined)
    
    @scala.inline
    def setPlaceHolderFunction1(value: MarkupSet => String): Self = this.set("placeHolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlaceHolder(value: String | (js.Function1[MarkupSet, String])): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    
    @scala.inline
    def setReplaceWithFunction1(value: MarkupSet => String): Self = this.set("replaceWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceWith(value: String | (js.Function1[MarkupSet, String])): Self = this.set("replaceWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceWith: Self = this.set("replaceWith", js.undefined)
    
    @scala.inline
    def setScrollPosition(value: Double): Self = this.set("scrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPosition: Self = this.set("scrollPosition", js.undefined)
    
    @scala.inline
    def setSelection(value: String): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
    
    @scala.inline
    def setTextarea(value: HTMLElement): Self = this.set("textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextarea: Self = this.set("textarea", js.undefined)
  }
}
