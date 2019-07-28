package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Info")
@js.native
object InfoNs extends js.Object {
  def eras(): js.Array[String] = js.native
  def eras(length: StringUnitLength): js.Array[String] = js.native
  def eras(length: StringUnitLength, options: InfoOptions): js.Array[String] = js.native
  def features(): Features = js.native
  def hasDST(zone: String): Boolean = js.native
  def hasDST(zone: Zone): Boolean = js.native
  def isValidIANAZone(zone: String): Boolean = js.native
  def meridiems(): js.Array[String] = js.native
  def meridiems(options: InfoOptions): js.Array[String] = js.native
  def months(): js.Array[String] = js.native
  def months(length: UnitLength): js.Array[String] = js.native
  def months(length: UnitLength, options: InfoCalendarOptions): js.Array[String] = js.native
  def monthsFormat(): js.Array[String] = js.native
  def monthsFormat(length: UnitLength): js.Array[String] = js.native
  def monthsFormat(length: UnitLength, options: InfoCalendarOptions): js.Array[String] = js.native
  def normalizeZone(): Zone = js.native
  def normalizeZone(input: String): Zone = js.native
  def normalizeZone(input: Double): Zone = js.native
  def normalizeZone(input: Zone): Zone = js.native
  def weekdays(): js.Array[String] = js.native
  def weekdays(length: StringUnitLength): js.Array[String] = js.native
  def weekdays(length: StringUnitLength, options: InfoUnitOptions): js.Array[String] = js.native
  def weekdaysFormat(): js.Array[String] = js.native
  def weekdaysFormat(length: StringUnitLength): js.Array[String] = js.native
  def weekdaysFormat(length: StringUnitLength, options: InfoUnitOptions): js.Array[String] = js.native
}

