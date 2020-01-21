package typings.later.mod

import typings.std.Date
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
  def next(numberOfInst: Double): js.Array[Date] = js.native
  def next(numberOfInst: Double, dateFrom: Date): js.Array[Date] = js.native
  def next(numberOfInst: Double, dateFrom: Date, dateTo: Date): js.Array[Date] = js.native
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
  def nextRange(numberOfInst: Double): js.Array[Date] = js.native
  def nextRange(numberOfInst: Double, dateFrom: Date): js.Array[Date] = js.native
  def nextRange(numberOfInst: Double, dateFrom: Date, dateTo: Date): js.Array[Date] = js.native
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
  def prev(numberOfInst: Double): js.Array[Date] = js.native
  def prev(numberOfInst: Double, dateFrom: Date): js.Array[Date] = js.native
  def prev(numberOfInst: Double, dateFrom: Date, dateTo: Date): js.Array[Date] = js.native
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
  def prevRange(numberOfInst: Double): js.Array[Date] = js.native
  def prevRange(numberOfInst: Double, dateFrom: Date): js.Array[Date] = js.native
  def prevRange(numberOfInst: Double, dateFrom: Date, dateTo: Date): js.Array[Date] = js.native
}

