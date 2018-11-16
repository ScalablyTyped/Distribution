package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options for the Modal
     */

trait ModalOptions extends js.Object {
  /**
           * Allow modal to be dismissed by keyboard or overlay click.
           * @default true
           */
  var dismissible: scala.Boolean
  /**
           * Ending top offset
           * @default '10%'
           */
  var endingTop: java.lang.String
  /**
           * Transition in duration in milliseconds.
           * @default 250
           */
  var inDuration: scala.Double
  /**
           * Opacity of the modal overlay.
           * @default 0.5
           */
  var opacity: scala.Double
  /**
           * Transition out duration in milliseconds.
           * @default 250
           */
  var outDuration: scala.Double
  /**
           * Prevent page from scrolling while modal is open
           * @default true
           */
  var preventScrolling: scala.Boolean
  /**
           * Starting top offset
           * @default '4%'
           */
  var startingTop: java.lang.String
  /**
           * Callback function called after modal is closed
           * @default null
           */
  def onCloseEnd(`this`: Modal, el: stdLib.Element): scala.Unit
  /**
           * Callback function called before modal is closed
           * @default null
           */
  def onCloseStart(`this`: Modal, el: stdLib.Element): scala.Unit
  /**
           * Callback function called after modal is opened
           * @default null
           */
  def onOpenEnd(`this`: Modal, el: stdLib.Element): scala.Unit
  /**
           * Callback function called before modal is opened
           * @default null
           */
  def onOpenStart(`this`: Modal, el: stdLib.Element): scala.Unit
}

