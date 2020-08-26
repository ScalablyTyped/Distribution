package typings.isotopeLayout.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Isotope extends js.Object {
  /**
    * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def addItems(elements: Elements): Unit = js.native
  /**
    * Adds and lays out newly appended item elements to the end of the layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def appended(elements: Elements): Unit = js.native
  /**
    * Filters, sorts, and lays out items. arrange is the principle method of Isotope. It is the default method with jQuery .isotope(). Pass in options to apply filtering and sorting.
    * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
    */
  def arrange(options: IsotopeOptions): Unit = js.native
  /**
    * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
    */
  def destroy(): Unit = js.native
  /**
    * Returns an array of filtered item elements in current sorted order.
    */
  def getFilteredItemElements(): js.Array[Element] = js.native
  /**
    * Returns an array of all item elements in the Isotope instance.
    */
  def getItemElements(): js.Array[Element] = js.native
  /**
    * Hide items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def hideItemElements(elements: Elements): Unit = js.native
  /**
    * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def insert(elements: Elements): Unit = js.native
  /**
    * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
    */
  def layout(): Unit = js.native
  /**
    * Lays out specified items.
    * @param elements Array of Isotope.Items
    * @param isStill Disables transitions
    */
  def layoutItems(elements: js.Array[HTMLElement], isStill: Boolean): Unit = js.native
  /**
    * Adds and lays out newly prepended item elements at the beginning of layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def prepended(elements: Elements): Unit = js.native
  /**
    * Recollects all item elements.
    * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
    */
  def reloadItems(): Unit = js.native
  /**
    * Removes elements from the Isotope instance and DOM.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def remove(elements: Elements): Unit = js.native
  /**
    * Reveals hidden items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def revealItemElements(elements: Elements): Unit = js.native
  /**
    * Shuffles items in a random order.
    */
  def shuffle(): Unit = js.native
  /**
    * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
    * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def stamp(elements: Elements): Unit = js.native
  /**
    * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def unstamp(elements: Elements): Unit = js.native
  /**
    * Updates sort data
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def updateSortData(elements: Elements): Unit = js.native
}

object Isotope {
  @scala.inline
  def apply(
    addItems: Elements => Unit,
    appended: Elements => Unit,
    arrange: IsotopeOptions => Unit,
    destroy: () => Unit,
    getFilteredItemElements: () => js.Array[Element],
    getItemElements: () => js.Array[Element],
    hideItemElements: Elements => Unit,
    insert: Elements => Unit,
    layout: () => Unit,
    layoutItems: (js.Array[HTMLElement], Boolean) => Unit,
    prepended: Elements => Unit,
    reloadItems: () => Unit,
    remove: Elements => Unit,
    revealItemElements: Elements => Unit,
    shuffle: () => Unit,
    stamp: Elements => Unit,
    unstamp: Elements => Unit,
    updateSortData: Elements => Unit
  ): Isotope = {
    val __obj = js.Dynamic.literal(addItems = js.Any.fromFunction1(addItems), appended = js.Any.fromFunction1(appended), arrange = js.Any.fromFunction1(arrange), destroy = js.Any.fromFunction0(destroy), getFilteredItemElements = js.Any.fromFunction0(getFilteredItemElements), getItemElements = js.Any.fromFunction0(getItemElements), hideItemElements = js.Any.fromFunction1(hideItemElements), insert = js.Any.fromFunction1(insert), layout = js.Any.fromFunction0(layout), layoutItems = js.Any.fromFunction2(layoutItems), prepended = js.Any.fromFunction1(prepended), reloadItems = js.Any.fromFunction0(reloadItems), remove = js.Any.fromFunction1(remove), revealItemElements = js.Any.fromFunction1(revealItemElements), shuffle = js.Any.fromFunction0(shuffle), stamp = js.Any.fromFunction1(stamp), unstamp = js.Any.fromFunction1(unstamp), updateSortData = js.Any.fromFunction1(updateSortData))
    __obj.asInstanceOf[Isotope]
  }
  @scala.inline
  implicit class IsotopeOps[Self <: Isotope] (val x: Self) extends AnyVal {
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
    def setAddItems(value: Elements => Unit): Self = this.set("addItems", js.Any.fromFunction1(value))
    @scala.inline
    def setAppended(value: Elements => Unit): Self = this.set("appended", js.Any.fromFunction1(value))
    @scala.inline
    def setArrange(value: IsotopeOptions => Unit): Self = this.set("arrange", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFilteredItemElements(value: () => js.Array[Element]): Self = this.set("getFilteredItemElements", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItemElements(value: () => js.Array[Element]): Self = this.set("getItemElements", js.Any.fromFunction0(value))
    @scala.inline
    def setHideItemElements(value: Elements => Unit): Self = this.set("hideItemElements", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Elements => Unit): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setLayout(value: () => Unit): Self = this.set("layout", js.Any.fromFunction0(value))
    @scala.inline
    def setLayoutItems(value: (js.Array[HTMLElement], Boolean) => Unit): Self = this.set("layoutItems", js.Any.fromFunction2(value))
    @scala.inline
    def setPrepended(value: Elements => Unit): Self = this.set("prepended", js.Any.fromFunction1(value))
    @scala.inline
    def setReloadItems(value: () => Unit): Self = this.set("reloadItems", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: Elements => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRevealItemElements(value: Elements => Unit): Self = this.set("revealItemElements", js.Any.fromFunction1(value))
    @scala.inline
    def setShuffle(value: () => Unit): Self = this.set("shuffle", js.Any.fromFunction0(value))
    @scala.inline
    def setStamp(value: Elements => Unit): Self = this.set("stamp", js.Any.fromFunction1(value))
    @scala.inline
    def setUnstamp(value: Elements => Unit): Self = this.set("unstamp", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateSortData(value: Elements => Unit): Self = this.set("updateSortData", js.Any.fromFunction1(value))
  }
  
}

