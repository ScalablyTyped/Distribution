package typings
package loryDotJsLib.loryDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoryStatic extends js.Object {
  def apply(element: stdLib.Element): LoryStatic = js.native
  def apply(element: stdLib.Element, options: LoryOptions): LoryStatic = js.native
  /**
    * unmount/destroy the instance of lory
    */
  def destroy(): scala.Unit = js.native
  /**
    * slides to the next slide.
    */
  def next(): scala.Unit = js.native
  /**
    * slides to the previous slide.
    */
  def prev(): scala.Unit = js.native
  /**
    * sets the slider back to the starting position and resets the current index (called on resize event).
    */
  def reset(): scala.Unit = js.native
  /**
    * returns the index of the current slide element
    */
  def returnIndex(): scala.Double = js.native
  /**
    * binds eventlisteners, merging default and user options, setup the slides based on DOM (called once during initialisation). Call setup if DOM or user options have changed or eventlisteners needs to be rebinded.
    */
  def setup(): scala.Unit = js.native
  /**
    * slides to the index given as an argument.
    */
  def slideTo(index: scala.Double): scala.Unit = js.native
}

