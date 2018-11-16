package typings
package inflectionLib.inflectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inflection extends js.Object {
  def camelize(str: java.lang.String): java.lang.String = js.native
  def camelize(str: java.lang.String, low_first_letter: scala.Boolean): java.lang.String = js.native
  def capitalize(str: java.lang.String): java.lang.String = js.native
  def classify(str: java.lang.String): java.lang.String = js.native
  def dasherize(str: java.lang.String): java.lang.String = js.native
  def demodulize(str: java.lang.String): java.lang.String = js.native
  def foreign_key(str: java.lang.String): java.lang.String = js.native
  def foreign_key(str: java.lang.String, drop_id_ubar: scala.Boolean): java.lang.String = js.native
  def humanize(str: java.lang.String): java.lang.String = js.native
  def humanize(str: java.lang.String, low_first_letter: scala.Boolean): java.lang.String = js.native
  def indexOf[T, T2](arr: js.Array[T], item: T2): scala.Double = js.native
  def indexOf[T, T2](arr: js.Array[T], item: T2, from_index: scala.Double): scala.Double = js.native
  def indexOf[T, T2](
    arr: js.Array[T],
    item: T2,
    from_index: scala.Double,
    compare_func: js.Function2[/* arr_item */ T, /* item */ T2, scala.Boolean]
  ): scala.Double = js.native
  def inflect(str: java.lang.String, count: scala.Double): java.lang.String = js.native
  def inflect(str: java.lang.String, count: scala.Double, singular: java.lang.String): java.lang.String = js.native
  def inflect(str: java.lang.String, count: scala.Double, singular: java.lang.String, plural: java.lang.String): java.lang.String = js.native
  def ordinalize(str: java.lang.String): java.lang.String = js.native
  def pluralize(str: java.lang.String): java.lang.String = js.native
  def pluralize(str: java.lang.String, plural: java.lang.String): java.lang.String = js.native
  def singularize(str: java.lang.String): java.lang.String = js.native
  def singularize(str: java.lang.String, singular: java.lang.String): java.lang.String = js.native
  def tableize(str: java.lang.String): java.lang.String = js.native
  def titleize(str: java.lang.String): java.lang.String = js.native
  def transform(str: java.lang.String, arr: js.Array[java.lang.String]): java.lang.String = js.native
  def underscore(str: java.lang.String): java.lang.String = js.native
  def underscore(str: java.lang.String, all_upper_case: scala.Boolean): java.lang.String = js.native
}

