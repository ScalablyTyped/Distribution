package typings.materializeCss.mod

import typings.materializeCss.M.DropdownOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialDropdownOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Dropdown")
@js.native
class Dropdown ()
  extends typings.materializeCss.M.Dropdown {
  /**
    * The DOM element of the dropdown
    */
  /* CompleteClass */
  override var dropdownEl: Element = js.native
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The index of the item focused
    */
  /* CompleteClass */
  override var focusedIndex: Double = js.native
  /**
    * ID of the dropdown element
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * If the dropdown is open
    */
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * If the dropdown content is scrollable
    */
  /* CompleteClass */
  override var isScrollable: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: DropdownOptions = js.native
  /**
    * Close dropdown
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Open dropdown
    */
  /* CompleteClass */
  override def open(): Unit = js.native
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  /* CompleteClass */
  override def recalculateDimensions(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "Dropdown")
@js.native
object Dropdown extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Dropdown = js.native
  /**
    * Init Dropdowns
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Dropdown] = js.native
  def init(els: MElements, options: PartialDropdownOptions): js.Array[typings.materializeCss.M.Dropdown] = js.native
  /**
    * Init Dropdown
    */
  def init(els: Element): typings.materializeCss.M.Dropdown = js.native
  def init(els: Element, options: PartialDropdownOptions): typings.materializeCss.M.Dropdown = js.native
}

