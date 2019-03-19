package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enumiquerysuffix extends js.Object {
  def enum_i_query_suffix(vsuffix: java.lang.String): scala.Double
  def enum_pv_query(ve164: java.lang.String): scala.Double
  def enum_pv_query_suffix(ve164: java.lang.String, vsuffix: java.lang.String): scala.Double
  def enum_pv_query_suffix_service(ve164: java.lang.String, vsuffix: java.lang.String, vservice: java.lang.String): scala.Double
  def enum_query(): scala.Double
  def enum_query_suffix(vsuffix: java.lang.String): scala.Double
  def enum_query_suffix_service(vsuffix: java.lang.String, vservice: java.lang.String): scala.Double
  def i_enum_query(): scala.Double
  def i_enum_query_suffix_service(vsuffix: java.lang.String, vservice: java.lang.String): scala.Double
  def is_from_user_enum(): scala.Double
  def is_from_user_enum_suffix(vsuffix: java.lang.String): scala.Double
  def is_from_user_enum_suffix_service(vsuffix: java.lang.String, vservice: java.lang.String): scala.Double
}

object Anon_Enumiquerysuffix {
  @scala.inline
  def apply(
    enum_i_query_suffix: java.lang.String => scala.Double,
    enum_pv_query: java.lang.String => scala.Double,
    enum_pv_query_suffix: (java.lang.String, java.lang.String) => scala.Double,
    enum_pv_query_suffix_service: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    enum_query: () => scala.Double,
    enum_query_suffix: java.lang.String => scala.Double,
    enum_query_suffix_service: (java.lang.String, java.lang.String) => scala.Double,
    i_enum_query: () => scala.Double,
    i_enum_query_suffix_service: (java.lang.String, java.lang.String) => scala.Double,
    is_from_user_enum: () => scala.Double,
    is_from_user_enum_suffix: java.lang.String => scala.Double,
    is_from_user_enum_suffix_service: (java.lang.String, java.lang.String) => scala.Double
  ): Anon_Enumiquerysuffix = {
    val __obj = js.Dynamic.literal(enum_i_query_suffix = js.Any.fromFunction1(enum_i_query_suffix), enum_pv_query = js.Any.fromFunction1(enum_pv_query), enum_pv_query_suffix = js.Any.fromFunction2(enum_pv_query_suffix), enum_pv_query_suffix_service = js.Any.fromFunction3(enum_pv_query_suffix_service), enum_query = js.Any.fromFunction0(enum_query), enum_query_suffix = js.Any.fromFunction1(enum_query_suffix), enum_query_suffix_service = js.Any.fromFunction2(enum_query_suffix_service), i_enum_query = js.Any.fromFunction0(i_enum_query), i_enum_query_suffix_service = js.Any.fromFunction2(i_enum_query_suffix_service), is_from_user_enum = js.Any.fromFunction0(is_from_user_enum), is_from_user_enum_suffix = js.Any.fromFunction1(is_from_user_enum_suffix), is_from_user_enum_suffix_service = js.Any.fromFunction2(is_from_user_enum_suffix_service))
  
    __obj.asInstanceOf[Anon_Enumiquerysuffix]
  }
}

