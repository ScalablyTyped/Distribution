package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyConstructor
  extends ScalablyTyped.runtime.Instantiable0[PNotify]
     with ScalablyTyped.runtime.Instantiable1[/* options */ PNotifyOptions, PNotify] {
  /**
       * Reposition the notices, optionally animating their movement.
       */
  def positionAll(): scala.Unit = js.native
  /**
       * Reposition the notices, optionally animating their movement.
       */
  def positionAll(animate: scala.Boolean): scala.Unit = js.native
  /**
       * Remove all notices.
       */
  def removeAll(): scala.Unit = js.native
  /**
       * Remove all the notices in a stack.
       * @param stack 
       */
  def removeStack(stack: PNotifyStack): scala.Unit = js.native
}

