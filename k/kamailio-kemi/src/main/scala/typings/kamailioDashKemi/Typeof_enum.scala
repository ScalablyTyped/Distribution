package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeof_enum extends js.Object {
  def enum_i_query_suffix(vsuffix: String): Double
  def enum_pv_query(ve164: String): Double
  def enum_pv_query_suffix(ve164: String, vsuffix: String): Double
  def enum_pv_query_suffix_service(ve164: String, vsuffix: String, vservice: String): Double
  def enum_query(): Double
  def enum_query_suffix(vsuffix: String): Double
  def enum_query_suffix_service(vsuffix: String, vservice: String): Double
  def i_enum_query(): Double
  def i_enum_query_suffix_service(vsuffix: String, vservice: String): Double
  def is_from_user_enum(): Double
  def is_from_user_enum_suffix(vsuffix: String): Double
  def is_from_user_enum_suffix_service(vsuffix: String, vservice: String): Double
}

object Typeof_enum {
  @scala.inline
  def apply(
    enum_i_query_suffix: String => Double,
    enum_pv_query: String => Double,
    enum_pv_query_suffix: (String, String) => Double,
    enum_pv_query_suffix_service: (String, String, String) => Double,
    enum_query: () => Double,
    enum_query_suffix: String => Double,
    enum_query_suffix_service: (String, String) => Double,
    i_enum_query: () => Double,
    i_enum_query_suffix_service: (String, String) => Double,
    is_from_user_enum: () => Double,
    is_from_user_enum_suffix: String => Double,
    is_from_user_enum_suffix_service: (String, String) => Double
  ): Typeof_enum = {
    val __obj = js.Dynamic.literal(enum_i_query_suffix = js.Any.fromFunction1(enum_i_query_suffix), enum_pv_query = js.Any.fromFunction1(enum_pv_query), enum_pv_query_suffix = js.Any.fromFunction2(enum_pv_query_suffix), enum_pv_query_suffix_service = js.Any.fromFunction3(enum_pv_query_suffix_service), enum_query = js.Any.fromFunction0(enum_query), enum_query_suffix = js.Any.fromFunction1(enum_query_suffix), enum_query_suffix_service = js.Any.fromFunction2(enum_query_suffix_service), i_enum_query = js.Any.fromFunction0(i_enum_query), i_enum_query_suffix_service = js.Any.fromFunction2(i_enum_query_suffix_service), is_from_user_enum = js.Any.fromFunction0(is_from_user_enum), is_from_user_enum_suffix = js.Any.fromFunction1(is_from_user_enum_suffix), is_from_user_enum_suffix_service = js.Any.fromFunction2(is_from_user_enum_suffix_service))
  
    __obj.asInstanceOf[Typeof_enum]
  }
}

