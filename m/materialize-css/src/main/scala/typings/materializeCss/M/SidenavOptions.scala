package typings.materializeCss.M

import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
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
  def onCloseEnd(elem: Element): Unit
  /**
    * Function called when sidenav starts exiting
    */
  def onCloseStart(elem: Element): Unit
  /**
    * Function called when sidenav finishes entering
    */
  def onOpenEnd(elem: Element): Unit
  /**
    * Function called when sidenav starts entering
    */
  def onOpenStart(elem: Element): Unit
}

object SidenavOptions {
  @scala.inline
  def apply(
    draggable: Boolean,
    edge: left | right,
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double
  ): SidenavOptions = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidenavOptions]
  }
}

