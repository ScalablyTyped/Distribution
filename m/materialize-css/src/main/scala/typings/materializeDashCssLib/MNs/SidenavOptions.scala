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

