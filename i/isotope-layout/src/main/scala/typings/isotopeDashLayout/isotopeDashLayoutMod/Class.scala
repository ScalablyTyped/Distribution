package typings.isotopeDashLayout.isotopeDashLayoutMod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isotope-layout", JSImport.Namespace)
@js.native
class Class protected () extends Isotope {
  def this(elementOrSelector: String, options: IsotopeOptions) = this()
  def this(elementOrSelector: HTMLElement, options: IsotopeOptions) = this()
  /**
    * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def addItems(elements: Elements): Unit = js.native
  /**
    * Adds and lays out newly appended item elements to the end of the layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def appended(elements: Elements): Unit = js.native
  /**
    * Filters, sorts, and lays out items. arrange is the principle method of Isotope. It is the default method with jQuery .isotope(). Pass in options to apply filtering and sorting.
    * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
    */
  /* CompleteClass */
  override def arrange(options: IsotopeOptions): Unit = js.native
  /**
    * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Returns an array of filtered item elements in current sorted order.
    */
  /* CompleteClass */
  override def getFilteredItemElements(): js.Array[Element] = js.native
  /**
    * Returns an array of all item elements in the Isotope instance.
    */
  /* CompleteClass */
  override def getItemElements(): js.Array[Element] = js.native
  /**
    * Hide items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def hideItemElements(elements: Elements): Unit = js.native
  /**
    * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def insert(elements: Elements): Unit = js.native
  /**
    * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
    */
  /* CompleteClass */
  override def layout(): Unit = js.native
  /**
    * Lays out specified items.
    * @param elements Array of Isotope.Items
    * @param isStill Disables transitions
    */
  /* CompleteClass */
  override def layoutItems(elements: js.Array[HTMLElement], isStill: Boolean): Unit = js.native
  /**
    * Adds and lays out newly prepended item elements at the beginning of layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def prepended(elements: Elements): Unit = js.native
  /**
    * Recollects all item elements.
    * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
    */
  /* CompleteClass */
  override def reloadItems(): Unit = js.native
  /**
    * Removes elements from the Isotope instance and DOM.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def remove(elements: Elements): Unit = js.native
  /**
    * Reveals hidden items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def revealItemElements(elements: Elements): Unit = js.native
  /**
    * Shuffles items in a random order.
    */
  /* CompleteClass */
  override def shuffle(): Unit = js.native
  /**
    * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
    * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def stamp(elements: Elements): Unit = js.native
  /**
    * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def unstamp(elements: Elements): Unit = js.native
  /**
    * Updates sort data
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  /* CompleteClass */
  override def updateSortData(elements: Elements): Unit = js.native
}

