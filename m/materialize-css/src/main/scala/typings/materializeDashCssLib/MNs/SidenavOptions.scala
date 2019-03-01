package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Sidenav
  */
trait SidenavOptions extends js.Object {
  /**
    * Allow swipe gestures to open/close Sidenav
    * @default true
    */
  var draggable: scala.Boolean
  /**
    * Side of screen on which Sidenav appears
    * @default 'left'
    */
  var edge: materializeDashCssLib.materializeDashCssLibStrings.left | materializeDashCssLib.materializeDashCssLibStrings.right
  /**
    * Length in ms of enter transition
    * @default 250
    */
  var inDuration: scala.Double
  /**
    * Length in ms of exit transition
    * @default 200
    */
  var outDuration: scala.Double
  /**
    * Function called when sidenav finishes exiting
    */
  def onCloseEnd(`this`: Sidenav, elem: stdLib.Element): scala.Unit
  /**
    * Function called when sidenav starts exiting
    */
  def onCloseStart(`this`: Sidenav, elem: stdLib.Element): scala.Unit
  /**
    * Function called when sidenav finishes entering
    */
  def onOpenEnd(`this`: Sidenav, elem: stdLib.Element): scala.Unit
  /**
    * Function called when sidenav starts entering
    */
  def onOpenStart(`this`: Sidenav, elem: stdLib.Element): scala.Unit
}

object SidenavOptions {
  @scala.inline
  def apply(
    draggable: scala.Boolean,
    edge: materializeDashCssLib.materializeDashCssLibStrings.left | materializeDashCssLib.materializeDashCssLibStrings.right,
    inDuration: scala.Double,
    onCloseEnd: js.Function2[Sidenav, stdLib.Element, scala.Unit],
    onCloseStart: js.Function2[Sidenav, stdLib.Element, scala.Unit],
    onOpenEnd: js.Function2[Sidenav, stdLib.Element, scala.Unit],
    onOpenStart: js.Function2[Sidenav, stdLib.Element, scala.Unit],
    outDuration: scala.Double
  ): SidenavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("draggable")(draggable)
    __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    __obj.updateDynamic("inDuration")(inDuration)
    __obj.updateDynamic("onCloseEnd")(onCloseEnd)
    __obj.updateDynamic("onCloseStart")(onCloseStart)
    __obj.updateDynamic("onOpenEnd")(onOpenEnd)
    __obj.updateDynamic("onOpenStart")(onOpenStart)
    __obj.updateDynamic("outDuration")(outDuration)
    __obj.asInstanceOf[SidenavOptions]
  }
}

