package typings
package humanizeDashPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("humanize-plus", JSImport.Namespace)
@js.native
object humanizeDashPlusMod extends js.Object {
  def boundedNumber(number: scala.Double): java.lang.String = js.native
  def boundedNumber(number: scala.Double, bounds: scala.Double): java.lang.String = js.native
  def boundedNumber(number: scala.Double, bounds: scala.Double, ending: java.lang.String): java.lang.String = js.native
  def capitalize(string: java.lang.String): java.lang.String = js.native
  def capitalize(string: java.lang.String, downCaseTail: scala.Boolean): java.lang.String = js.native
  def capitalizeAll(string: java.lang.String): java.lang.String = js.native
  def compactInteger(number: scala.Double): java.lang.String = js.native
  def compactInteger(number: scala.Double, decimals: scala.Double): java.lang.String = js.native
  def fileSize(filesize: scala.Double): java.lang.String = js.native
  def fileSize(filesize: scala.Double, precision: scala.Double): java.lang.String = js.native
  def formatNumber(number: scala.Double): java.lang.String = js.native
  def formatNumber(number: scala.Double, decimals: scala.Double): java.lang.String = js.native
  def frequency(list: js.Array[_]): java.lang.String = js.native
  def frequency(list: js.Array[_], verb: java.lang.String): java.lang.String = js.native
  def intComma(number: scala.Double): java.lang.String = js.native
  def intComma(number: scala.Double, decimals: scala.Double): java.lang.String = js.native
  def normalizePrecision(value: scala.Double): scala.Double = js.native
  def normalizePrecision(value: scala.Double, base: scala.Double): scala.Double = js.native
  def ordinal(value: scala.Double): java.lang.String = js.native
  def oxford(items: js.Array[_]): java.lang.String = js.native
  def oxford(items: js.Array[_], limit: scala.Double): java.lang.String = js.native
  def oxford(items: js.Array[_], limit: scala.Double, limitStr: java.lang.String): java.lang.String = js.native
  def pace(value: scala.Double, intervalMs: scala.Double): java.lang.String = js.native
  def pace(value: scala.Double, intervalMs: scala.Double, unit: java.lang.String): java.lang.String = js.native
  def pluralize(number: scala.Double): java.lang.String = js.native
  def pluralize(number: scala.Double, singular: java.lang.String): java.lang.String = js.native
  def pluralize(number: scala.Double, singular: java.lang.String, plural: java.lang.String): java.lang.String = js.native
  def times(value: scala.Double): java.lang.String = js.native
  def times(value: scala.Double, overrides: js.Any): java.lang.String = js.native
  def titleCase(string: java.lang.String): java.lang.String = js.native
  def toFixed(value: scala.Double): java.lang.String = js.native
  def toFixed(value: scala.Double, precision: scala.Double): java.lang.String = js.native
  def truncate(string: java.lang.String): java.lang.String = js.native
  def truncate(string: java.lang.String, length: scala.Double): java.lang.String = js.native
  def truncate(string: java.lang.String, length: scala.Double, ending: java.lang.String): java.lang.String = js.native
  def truncateWords(string: java.lang.String): java.lang.String | scala.Null = js.native
  def truncateWords(string: java.lang.String, length: scala.Double): java.lang.String | scala.Null = js.native
}

