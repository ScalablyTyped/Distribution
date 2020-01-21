package typings.jqueryPnotify

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyConstructor
  extends Instantiable0[PNotify]
     with Instantiable1[/* options */ PNotifyOptions, PNotify] {
  /**
    * Reposition the notices, optionally animating their movement.
    */
  def positionAll(): Unit = js.native
  def positionAll(animate: Boolean): Unit = js.native
  /**
    * Remove all notices.
    */
  def removeAll(): Unit = js.native
  /**
    * Remove all the notices in a stack.
    * @param stack 
    */
  def removeStack(stack: PNotifyStack): Unit = js.native
}

