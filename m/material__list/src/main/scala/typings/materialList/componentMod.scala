package typings.materialList

import typings.materialBase.componentMod.MDCComponent
import typings.materialList.foundationMod.MDCListFoundation
import typings.materialList.typesMod.MDCListIndex
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCList () extends MDCComponent[MDCListFoundation] {
    /**
      * Extracts the primary text from a list item.
      * @param item The list item element.
      * @return The primary text in the element.
      */
    def getPrimaryText(item: Element): String = js.native
    /**
      * Sets whether typeahead functionality is enabled on the list.
      * @param hasTypeahead Whether typeahead is enabled.
      */
    def hasTypeahead_=(hasTypeahead: Boolean): Unit = js.native
    /**
      * Initialize selectedIndex value based on pre-selected checkbox list items, single selection or radio.
      */
    def initializeListType(): Unit = js.native
    def layout(): Unit = js.native
    def listElements: js.Array[Element] = js.native
    def selectedIndex: MDCListIndex = js.native
    def selectedIndex_=(index: MDCListIndex): Unit = js.native
    /**
      * Updates the list item at itemIndex to the desired isEnabled state.
      * @param itemIndex Index of the list item
      * @param isEnabled Sets the list item to enabled or disabled.
      */
    def setEnabled(itemIndex: Double, isEnabled: Boolean): Unit = js.native
    def singleSelection_=(isSingleSelectionList: Boolean): Unit = js.native
    /**
      * @return Whether typeahead is currently matching a user-specified prefix.
      */
    def typeaheadInProgress: Boolean = js.native
    /**
      * Given the next desired character from the user, adds it to the typeahead
      * buffer. Then, attempts to find the next option matching the buffer. Wraps
      * around if at the end of options.
      *
      * @param nextChar The next character to add to the prefix buffer.
      * @param startingIndex The index from which to start matching. Defaults to
      *     the currently focused index.
      * @return The index of the matched item.
      */
    def typeaheadMatchItem(nextChar: String): Double = js.native
    def typeaheadMatchItem(nextChar: String, startingIndex: Double): Double = js.native
    def vertical_=(value: Boolean): Unit = js.native
    def wrapFocus_=(value: Boolean): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCList extends js.Object {
    def attachTo(root: Element): MDCList = js.native
  }
  
  type MDCListFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCListFoundation], MDCList]
}

