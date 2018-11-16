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

