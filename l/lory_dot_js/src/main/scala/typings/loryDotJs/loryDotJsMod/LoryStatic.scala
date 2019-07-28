package typings.loryDotJs.loryDotJsMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoryStatic extends js.Object {
  def apply(element: Element): LoryStatic = js.native
  def apply(element: Element, options: LoryOptions): LoryStatic = js.native
  /**
    * unmount/destroy the instance of lory
    */
  def destroy(): Unit = js.native
  /**
    * slides to the next slide.
    */
  def next(): Unit = js.native
  /**
    * slides to the previous slide.
    */
  def prev(): Unit = js.native
  /**
    * sets the slider back to the starting position and resets the current index (called on resize event).
    */
  def reset(): Unit = js.native
  /**
    * returns the index of the current slide element
    */
  def returnIndex(): Double = js.native
  /**
    * binds eventlisteners, merging default and user options, setup the slides based on DOM (called once during initialisation). Call setup if DOM or user options have changed or eventlisteners needs to be rebinded.
    */
  def setup(): Unit = js.native
  /**
    * slides to the index given as an argument.
    */
  def slideTo(index: Double): Unit = js.native
}

