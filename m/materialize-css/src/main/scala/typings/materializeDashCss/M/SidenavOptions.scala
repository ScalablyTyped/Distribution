package typings.materializeDashCss.M

import typings.materializeDashCss.materializeDashCssStrings.left
import typings.materializeDashCss.materializeDashCssStrings.right
import typings.std.Element
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
  var draggable: Boolean
  /**
    * Side of screen on which Sidenav appears
    * @default 'left'
    */
  var edge: left | right
  /**
    * Length in ms of enter transition
    * @default 250
    */
  var inDuration: Double
  /**
    * Length in ms of exit transition
    * @default 200
    */
  var outDuration: Double
  /**
    * Function called when sidenav finishes exiting
    */
  def onCloseEnd(`this`: Sidenav, elem: Element): Unit
  /**
    * Function called when sidenav starts exiting
    */
  def onCloseStart(`this`: Sidenav, elem: Element): Unit
  /**
    * Function called when sidenav finishes entering
    */
  def onOpenEnd(`this`: Sidenav, elem: Element): Unit
  /**
    * Function called when sidenav starts entering
    */
  def onOpenStart(`this`: Sidenav, elem: Element): Unit
}

object SidenavOptions {
  @scala.inline
  def apply(
    draggable: Boolean,
    edge: left | right,
    inDuration: Double,
    onCloseEnd: (Sidenav, Element) => Unit,
    onCloseStart: (Sidenav, Element) => Unit,
    onOpenEnd: (Sidenav, Element) => Unit,
    onOpenStart: (Sidenav, Element) => Unit,
    outDuration: Double
  ): SidenavOptions = {
    val __obj = js.Dynamic.literal(draggable = draggable, edge = edge.asInstanceOf[js.Any], inDuration = inDuration, onCloseEnd = js.Any.fromFunction2(onCloseEnd), onCloseStart = js.Any.fromFunction2(onCloseStart), onOpenEnd = js.Any.fromFunction2(onOpenEnd), onOpenStart = js.Any.fromFunction2(onOpenStart), outDuration = outDuration)
  
    __obj.asInstanceOf[SidenavOptions]
  }
}

