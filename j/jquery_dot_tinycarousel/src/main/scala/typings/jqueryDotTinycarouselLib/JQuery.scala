package typings
package jqueryDotTinycarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
      * Creates a new tinycarousel with the specified, or default, options.
      *
      * @param options The options
      */
  def tinycarousel(): JQuery = js.native
  /**
      * Creates a new tinycarousel with the specified, or default, options.
      *
      * @param options The options
      */
  def tinycarousel(options: jqueryDotTinycarouselLib.JQueryTinyCarouselNs.JQueryTinyCarouselOptions): JQuery = js.native
  /**
      * Moves the tinycarousel to the specified block.
      *
      * @param index The index of the block to move to
      */
  def tinycarousel_move(index: scala.Double): scala.Unit = js.native
  /**
      * Starts the interval.
      */
  def tinycarousel_start(): scala.Unit = js.native
  /**
      * Stops the interval.
      */
  def tinycarousel_stop(): scala.Unit = js.native
}

