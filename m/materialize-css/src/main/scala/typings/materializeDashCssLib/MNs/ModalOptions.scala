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

object ModalOptions {
  @scala.inline
  def apply(
    dismissible: scala.Boolean,
    endingTop: java.lang.String,
    inDuration: scala.Double,
    onCloseEnd: js.Function2[Modal, stdLib.Element, scala.Unit],
    onCloseStart: js.Function2[Modal, stdLib.Element, scala.Unit],
    onOpenEnd: js.Function2[Modal, stdLib.Element, scala.Unit],
    onOpenStart: js.Function2[Modal, stdLib.Element, scala.Unit],
    opacity: scala.Double,
    outDuration: scala.Double,
    preventScrolling: scala.Boolean,
    startingTop: java.lang.String
  ): ModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dismissible")(dismissible)
    __obj.updateDynamic("endingTop")(endingTop)
    __obj.updateDynamic("inDuration")(inDuration)
    __obj.updateDynamic("onCloseEnd")(onCloseEnd)
    __obj.updateDynamic("onCloseStart")(onCloseStart)
    __obj.updateDynamic("onOpenEnd")(onOpenEnd)
    __obj.updateDynamic("onOpenStart")(onOpenStart)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("outDuration")(outDuration)
    __obj.updateDynamic("preventScrolling")(preventScrolling)
    __obj.updateDynamic("startingTop")(startingTop)
    __obj.asInstanceOf[ModalOptions]
  }
}

