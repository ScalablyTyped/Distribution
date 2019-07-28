package typings.materializeDashCss.MNs

import typings.materializeDashCss.materializeDashCssStrings.left
import typings.materializeDashCss.materializeDashCssStrings.right
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownOptions extends js.Object {
  /**
    * Defines the edge the menu is aligned to
    * @default 'left'
    */
  var alignment: left | right
  /**
    * If true, automatically focus dropdown el for keyboard
    * @default true
    */
  var autoTrigger: Boolean
  /**
    * If true, close dropdown on item click
    * @default true
    */
  var closeOnClick: Boolean
  /**
    * If true, constrainWidth to the size of the dropdown activator
    * @default true
    */
  var constrainWidth: Boolean
  /**
    * Provide an element that will be the bounding container of the dropdown
    * @default null
    */
  var container: Element
  /**
    * If false, the dropdown will show below the trigger
    * @default true
    */
  var coverTrigger: Boolean
  /**
    * If true, the dropdown will open on hover
    * @default false
    */
  var hover: Boolean
  /**
    * The duration of the transition enter in milliseconds
    * @default 150
    */
  var inDuration: Double
  /**
    * The duration of the transition out in milliseconds
    * @default 250
    */
  var outDuration: Double
  /**
    * Function called when dropdown finishes exiting
    * @default null
    */
  def onCloseEnd(`this`: Dropdown, el: Element): Unit
  /**
    * Function called when dropdown starts exiting
    * @default null
    */
  def onCloseStart(`this`: Dropdown, el: Element): Unit
  /**
    * Function called when dropdown finishes entering
    * @default null
    */
  def onOpenEnd(`this`: Dropdown, el: Element): Unit
  /**
    * Function called when dropdown starts entering
    * @default null
    */
  def onOpenStart(`this`: Dropdown, el: Element): Unit
}

object DropdownOptions {
  @scala.inline
  def apply(
    alignment: left | right,
    autoTrigger: Boolean,
    closeOnClick: Boolean,
    constrainWidth: Boolean,
    container: Element,
    coverTrigger: Boolean,
    hover: Boolean,
    inDuration: Double,
    onCloseEnd: (Dropdown, Element) => Unit,
    onCloseStart: (Dropdown, Element) => Unit,
    onOpenEnd: (Dropdown, Element) => Unit,
    onOpenStart: (Dropdown, Element) => Unit,
    outDuration: Double
  ): DropdownOptions = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autoTrigger = autoTrigger, closeOnClick = closeOnClick, constrainWidth = constrainWidth, container = container, coverTrigger = coverTrigger, hover = hover, inDuration = inDuration, onCloseEnd = js.Any.fromFunction2(onCloseEnd), onCloseStart = js.Any.fromFunction2(onCloseStart), onOpenEnd = js.Any.fromFunction2(onOpenEnd), onOpenStart = js.Any.fromFunction2(onOpenStart), outDuration = outDuration)
  
    __obj.asInstanceOf[DropdownOptions]
  }
}

