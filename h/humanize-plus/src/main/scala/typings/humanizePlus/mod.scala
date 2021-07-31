package typings.humanizePlus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("humanize-plus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def boundedNumber(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("boundedNumber")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def boundedNumber(number: Double, bounds: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("boundedNumber")(number.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def boundedNumber(number: Double, bounds: Double, ending: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("boundedNumber")(number.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], ending.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def boundedNumber(number: Double, bounds: Unit, ending: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("boundedNumber")(number.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], ending.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def capitalize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def capitalize(string: String, downCaseTail: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any], downCaseTail.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def capitalizeAll(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalizeAll")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def compactInteger(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compactInteger")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def compactInteger(number: Double, decimals: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compactInteger")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def fileSize(filesize: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSize")(filesize.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def fileSize(filesize: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fileSize")(filesize.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatNumber(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatNumber(number: Double, decimals: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def frequency(list: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("frequency")(list.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def frequency(list: js.Array[js.Any], verb: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("frequency")(list.asInstanceOf[js.Any], verb.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def intComma(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intComma")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def intComma(number: Double, decimals: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intComma")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def normalizePrecision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def normalizePrecision(value: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizePrecision")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def ordinal(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinal")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def oxford(items: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("oxford")(items.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def oxford(items: js.Array[js.Any], limit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("oxford")(items.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def oxford(items: js.Array[js.Any], limit: Double, limitStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("oxford")(items.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitStr.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def oxford(items: js.Array[js.Any], limit: Unit, limitStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("oxford")(items.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], limitStr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pace(value: Double, intervalMs: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pace")(value.asInstanceOf[js.Any], intervalMs.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pace(value: Double, intervalMs: Double, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pace")(value.asInstanceOf[js.Any], intervalMs.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pluralize(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def pluralize(number: Double, singular: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(number.asInstanceOf[js.Any], singular.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pluralize(number: Double, singular: String, plural: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(number.asInstanceOf[js.Any], singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pluralize(number: Double, singular: Unit, plural: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(number.asInstanceOf[js.Any], singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def times(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("times")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def times(value: Double, overrides: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("times")(value.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def titleCase(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCase")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toFixed(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toFixed(value: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def truncate(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def truncate(string: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(string.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def truncate(string: String, length: Double, ending: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(string.asInstanceOf[js.Any], length.asInstanceOf[js.Any], ending.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def truncate(string: String, length: Unit, ending: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(string.asInstanceOf[js.Any], length.asInstanceOf[js.Any], ending.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def truncateWords(string: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateWords")(string.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def truncateWords(string: String, length: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateWords")(string.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
