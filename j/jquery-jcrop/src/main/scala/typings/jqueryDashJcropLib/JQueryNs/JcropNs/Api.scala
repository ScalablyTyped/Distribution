package typings
package jqueryDashJcropLib.JQueryNs.JcropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  /** Animate selection to new selection, format: [ x,y,x2,y2 ] */
  def animateTo(selection: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]): scala.Unit
  /** Disables Jcrop interactivity */
  def disable(): scala.Unit
  /** Enables Jcrop interactivity */
  def enable(): scala.Unit
  /** Release current selection */
  def release(): scala.Unit
  /** Remove Jcrop entirely */
  def remove(): scala.Unit
  /** Set selection, format: [ x,y,x2,y2 ] */
  def setSelect(selection: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]): scala.Unit
  /** Query current selection values (interface)  */
  def tellScaled(): SelectionInfo
  /** Query current selection values (true size) */
  def tellSelect(): SelectionInfo
}

object Api {
  @scala.inline
  def apply(
    animateTo: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double] => scala.Unit,
    disable: () => scala.Unit,
    enable: () => scala.Unit,
    release: () => scala.Unit,
    remove: () => scala.Unit,
    setSelect: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double] => scala.Unit,
    tellScaled: () => SelectionInfo,
    tellSelect: () => SelectionInfo
  ): Api = {
    val __obj = js.Dynamic.literal(animateTo = js.Any.fromFunction1(animateTo), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction0(remove), setSelect = js.Any.fromFunction1(setSelect), tellScaled = js.Any.fromFunction0(tellScaled), tellSelect = js.Any.fromFunction0(tellSelect))
  
    __obj.asInstanceOf[Api]
  }
}

