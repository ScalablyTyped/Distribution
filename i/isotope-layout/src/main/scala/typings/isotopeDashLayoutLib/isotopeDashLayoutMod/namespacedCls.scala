package typings
package isotopeDashLayoutLib.isotopeDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isotope-layout", JSImport.Namespace)
@js.native
class namespacedCls protected () extends Isotope {
  def this(elementOrSelector: java.lang.String, options: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.IsotopeOptions) = this()
  def this(elementOrSelector: stdLib.HTMLElement, options: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.IsotopeOptions) = this()
  /**
    * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def addItems(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
  /**
    * Adds and lays out newly appended item elements to the end of the layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def appended(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
  /**
    * Filters, sorts, and lays out items. arrange is the principle method of Isotope. It is the default method with jQuery .isotope(). Pass in options to apply filtering and sorting.
    * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
    */
  /* CompleteClass */
  override def arrange(options: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.IsotopeOptions): scala.Unit = js.native
  /**
    * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
    */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /**
    * Returns an array of filtered item elements in current sorted order.
    */
  /* CompleteClass */
  override def getFilteredItemElements(): js.Array[stdLib.Element] = js.native
  /**
    * Returns an array of all item elements in the Isotope instance.
    */
  /* CompleteClass */
  override def getItemElements(): js.Array[stdLib.Element] = js.native
  /**
    * Hide items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def hideItemElements(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
  /**
    * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def insert(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
  /**
    * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
    */
  /* CompleteClass */
  override def layout(): scala.Unit = js.native
  /**
    * Lays out specified items.
    * @param elements Array of Isotope.Items
    * @param isStill Disables transitions
    */
  /* CompleteClass */
  override def layoutItems(elements: js.Array[stdLib.HTMLElement], isStill: scala.Boolean): scala.Unit = js.native
  /**
    * Adds and lays out newly prepended item elements at the beginning of layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def prepended(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
  /**
    * Recollects all item elements.
    * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
    */
  /* CompleteClass */
  override def reloadItems(): scala.Unit = js.native
  /**
    * Removes elements from the Isotope instance and DOM.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def remove(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
  /**
    * Reveals hidden items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def revealItemElements(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
  /**
    * Shuffles items in a random order.
    */
  /* CompleteClass */
  override def shuffle(): scala.Unit = js.native
  /**
    * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
    * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def stamp(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
  /**
    * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def unstamp(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
  /**
    * Updates sort data
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def updateSortData(elements: isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs.Elements): scala.Unit = js.native
}

