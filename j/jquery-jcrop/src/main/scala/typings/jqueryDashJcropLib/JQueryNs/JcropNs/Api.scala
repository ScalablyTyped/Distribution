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
    animateTo: js.Function1[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double], scala.Unit],
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    remove: js.Function0[scala.Unit],
    setSelect: js.Function1[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double], scala.Unit],
    tellScaled: js.Function0[SelectionInfo],
    tellSelect: js.Function0[SelectionInfo]
  ): Api = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animateTo")(animateTo)
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("setSelect")(setSelect)
    __obj.updateDynamic("tellScaled")(tellScaled)
    __obj.updateDynamic("tellSelect")(tellSelect)
    __obj.asInstanceOf[Api]
  }
}

