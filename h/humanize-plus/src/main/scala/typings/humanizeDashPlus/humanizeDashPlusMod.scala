package typings.humanizeDashPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("humanize-plus", JSImport.Namespace)
@js.native
object humanizeDashPlusMod extends js.Object {
  def boundedNumber(number: Double): String = js.native
  def boundedNumber(number: Double, bounds: Double): String = js.native
  def boundedNumber(number: Double, bounds: Double, ending: String): String = js.native
  def capitalize(string: String): String = js.native
  def capitalize(string: String, downCaseTail: Boolean): String = js.native
  def capitalizeAll(string: String): String = js.native
  def compactInteger(number: Double): String = js.native
  def compactInteger(number: Double, decimals: Double): String = js.native
  def fileSize(filesize: Double): String = js.native
  def fileSize(filesize: Double, precision: Double): String = js.native
  def formatNumber(number: Double): String = js.native
  def formatNumber(number: Double, decimals: Double): String = js.native
  def frequency(list: js.Array[_]): String = js.native
  def frequency(list: js.Array[_], verb: String): String = js.native
  def intComma(number: Double): String = js.native
  def intComma(number: Double, decimals: Double): String = js.native
  def normalizePrecision(value: Double): Double = js.native
  def normalizePrecision(value: Double, base: Double): Double = js.native
  def ordinal(value: Double): String = js.native
  def oxford(items: js.Array[_]): String = js.native
  def oxford(items: js.Array[_], limit: Double): String = js.native
  def oxford(items: js.Array[_], limit: Double, limitStr: String): String = js.native
  def pace(value: Double, intervalMs: Double): String = js.native
  def pace(value: Double, intervalMs: Double, unit: String): String = js.native
  def pluralize(number: Double): String = js.native
  def pluralize(number: Double, singular: String): String = js.native
  def pluralize(number: Double, singular: String, plural: String): String = js.native
  def times(value: Double): String = js.native
  def times(value: Double, overrides: js.Any): String = js.native
  def titleCase(string: String): String = js.native
  def toFixed(value: Double): String = js.native
  def toFixed(value: Double, precision: Double): String = js.native
  def truncate(string: String): String = js.native
  def truncate(string: String, length: Double): String = js.native
  def truncate(string: String, length: Double, ending: String): String = js.native
  def truncateWords(string: String): String | Null = js.native
  def truncateWords(string: String, length: Double): String | Null = js.native
}

