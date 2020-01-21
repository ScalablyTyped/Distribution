package typings.materializeCss.M

import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
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
  def onCloseEnd(el: Element): Unit
  /**
    * Function called when dropdown starts exiting
    * @default null
    */
  def onCloseStart(el: Element): Unit
  /**
    * Function called when dropdown finishes entering
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  /**
    * Function called when dropdown starts entering
    * @default null
    */
  def onOpenStart(el: Element): Unit
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
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double
  ): DropdownOptions = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autoTrigger = autoTrigger.asInstanceOf[js.Any], closeOnClick = closeOnClick.asInstanceOf[js.Any], constrainWidth = constrainWidth.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], coverTrigger = coverTrigger.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DropdownOptions]
  }
}

