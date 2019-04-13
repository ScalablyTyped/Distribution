package typings
package laterLib.laterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends js.Object {
  /**
    * Finds the next valid instance or instances of the current schedule,
    * optionally between a specified start and end date. Start date is
    * Date.now() by default, end date is unspecified. Start date must be
    * smaller than end date.
    *
    * @param numberOfInst: The number of instances to return
    * @param dateFrom: The earliest a valid instance can occur
    * @param dateTo: The latest a valid instance can occur
    */
  def next(numberOfInst: scala.Double): js.Array[stdLib.Date] = js.native
  def next(numberOfInst: scala.Double, dateFrom: stdLib.Date): js.Array[stdLib.Date] = js.native
  def next(numberOfInst: scala.Double, dateFrom: stdLib.Date, dateTo: stdLib.Date): js.Array[stdLib.Date] = js.native
  /**
    * Finds the next valid range or ranges of the current schedule,
    * optionally between a specified start and end date. Start date is
    * Date.now() by default, end date is unspecified. Start date must be
    * greater than end date.
    *
    * @param numberOfInst: The number of ranges to return
    * @param dateFrom: The earliest a valid range can occur
    * @param dateTo: The latest a valid range can occur
    */
  def nextRange(numberOfInst: scala.Double): js.Array[stdLib.Date] = js.native
  def nextRange(numberOfInst: scala.Double, dateFrom: stdLib.Date): js.Array[stdLib.Date] = js.native
  def nextRange(numberOfInst: scala.Double, dateFrom: stdLib.Date, dateTo: stdLib.Date): js.Array[stdLib.Date] = js.native
  /**
    * Finds the previous valid instance or instances of the current schedule,
    * optionally between a specified start and end date. Start date is
    * Date.now() by default, end date is unspecified. Start date must be
    * greater than end date.
    *
    * @param numberOfInst: The number of instances to return
    * @param dateFrom: The earliest a valid instance can occur
    * @param dateTo: The latest a valid instance can occur
    */
  def prev(numberOfInst: scala.Double): js.Array[stdLib.Date] = js.native
  def prev(numberOfInst: scala.Double, dateFrom: stdLib.Date): js.Array[stdLib.Date] = js.native
  def prev(numberOfInst: scala.Double, dateFrom: stdLib.Date, dateTo: stdLib.Date): js.Array[stdLib.Date] = js.native
  /**
    * Finds the previous valid range or ranges of the current schedule,
    * optionally between a specified start and end date. Start date is
    * Date.now() by default, end date is unspecified. Start date must be
    * greater than end date.
    *
    * @param numberOfInst: The number of ranges to return
    * @param dateFrom: The earliest a valid range can occur
    * @param dateTo: The latest a valid range can occur
    */
  def prevRange(numberOfInst: scala.Double): js.Array[stdLib.Date] = js.native
  def prevRange(numberOfInst: scala.Double, dateFrom: stdLib.Date): js.Array[stdLib.Date] = js.native
  def prevRange(numberOfInst: scala.Double, dateFrom: stdLib.Date, dateTo: stdLib.Date): js.Array[stdLib.Date] = js.native
}

