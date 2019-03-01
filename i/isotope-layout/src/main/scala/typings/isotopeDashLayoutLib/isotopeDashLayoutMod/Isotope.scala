package typings
package isotopeDashLayoutLib.isotopeDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Isotope extends js.Object {
  /**
    * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def addItems(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
  /**
    * Adds and lays out newly appended item elements to the end of the layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def appended(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
  /**
    * Filters, sorts, and lays out items. arrange is the principle method of Isotope. It is the default method with jQuery .isotope(). Pass in options to apply filtering and sorting.
    * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
    */
  def arrange(options: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.IsotopeOptions): scala.Unit
  /**
    * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
    */
  def destroy(): scala.Unit
  /**
    * Returns an array of filtered item elements in current sorted order.
    */
  def getFilteredItemElements(): js.Array[stdLib.Element]
  /**
    * Returns an array of all item elements in the Isotope instance.
    */
  def getItemElements(): js.Array[stdLib.Element]
  /**
    * Hide items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def hideItemElements(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
  /**
    * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def insert(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
  /**
    * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
    */
  def layout(): scala.Unit
  /**
    * Lays out specified items.
    * @param elements Array of Isotope.Items
    * @param isStill Disables transitions
    */
  def layoutItems(elements: js.Array[stdLib.HTMLElement], isStill: scala.Boolean): scala.Unit
  /**
    * Adds and lays out newly prepended item elements at the beginning of layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def prepended(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
  /**
    * Recollects all item elements.
    * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
    */
  def reloadItems(): scala.Unit
  /**
    * Removes elements from the Isotope instance and DOM.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def remove(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
  /**
    * Reveals hidden items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def revealItemElements(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
  /**
    * Shuffles items in a random order.
    */
  def shuffle(): scala.Unit
  /**
    * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
    * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def stamp(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
  /**
    * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def unstamp(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
  /**
    * Updates sort data
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def updateSortData(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit
}

object Isotope {
  @scala.inline
  def apply(
    addItems: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit],
    appended: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit],
    arrange: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.IsotopeOptions, scala.Unit],
    destroy: js.Function0[scala.Unit],
    getFilteredItemElements: js.Function0[js.Array[stdLib.Element]],
    getItemElements: js.Function0[js.Array[stdLib.Element]],
    hideItemElements: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit],
    insert: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit],
    layout: js.Function0[scala.Unit],
    layoutItems: js.Function2[js.Array[stdLib.HTMLElement], scala.Boolean, scala.Unit],
    prepended: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit],
    reloadItems: js.Function0[scala.Unit],
    remove: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit],
    revealItemElements: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit],
    shuffle: js.Function0[scala.Unit],
    stamp: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit],
    unstamp: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit],
    updateSortData: js.Function1[isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements, scala.Unit]
  ): Isotope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItems")(addItems)
    __obj.updateDynamic("appended")(appended)
    __obj.updateDynamic("arrange")(arrange)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getFilteredItemElements")(getFilteredItemElements)
    __obj.updateDynamic("getItemElements")(getItemElements)
    __obj.updateDynamic("hideItemElements")(hideItemElements)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("layoutItems")(layoutItems)
    __obj.updateDynamic("prepended")(prepended)
    __obj.updateDynamic("reloadItems")(reloadItems)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("revealItemElements")(revealItemElements)
    __obj.updateDynamic("shuffle")(shuffle)
    __obj.updateDynamic("stamp")(stamp)
    __obj.updateDynamic("unstamp")(unstamp)
    __obj.updateDynamic("updateSortData")(updateSortData)
    __obj.asInstanceOf[Isotope]
  }
}

