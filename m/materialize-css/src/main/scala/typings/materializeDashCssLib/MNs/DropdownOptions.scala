package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DropdownOptions extends js.Object {
  /**
           * Defines the edge the menu is aligned to
           * @default 'left'
           */
  var alignment: materializeDashCssLib.materializeDashCssLibStrings.left | materializeDashCssLib.materializeDashCssLibStrings.right
  /**
           * If true, automatically focus dropdown el for keyboard
           * @default true
           */
  var autoTrigger: scala.Boolean
  /**
           * If true, close dropdown on item click
           * @default true
           */
  var closeOnClick: scala.Boolean
  /**
           * If true, constrainWidth to the size of the dropdown activator
           * @default true
           */
  var constrainWidth: scala.Boolean
  /**
           * Provide an element that will be the bounding container of the dropdown
           * @default null
           */
  var container: stdLib.Element
  /**
           * If false, the dropdown will show below the trigger
           * @default true
           */
  var coverTrigger: scala.Boolean
  /**
           * If true, the dropdown will open on hover
           * @default false
           */
  var hover: scala.Boolean
  /**
           * The duration of the transition enter in milliseconds
           * @default 150
           */
  var inDuration: scala.Double
  /**
           * The duration of the transition out in milliseconds
           * @default 250
           */
  var outDuration: scala.Double
  /**
           * Function called when dropdown finishes exiting
           * @default null
           */
  def onCloseEnd(`this`: Dropdown, el: stdLib.Element): scala.Unit
  /**
           * Function called when dropdown starts exiting
           * @default null
           */
  def onCloseStart(`this`: Dropdown, el: stdLib.Element): scala.Unit
  /**
           * Function called when dropdown finishes entering
           * @default null
           */
  def onOpenEnd(`this`: Dropdown, el: stdLib.Element): scala.Unit
  /**
           * Function called when dropdown starts entering
           * @default null
           */
  def onOpenStart(`this`: Dropdown, el: stdLib.Element): scala.Unit
}

