package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I extends js.Object {
  def sql_is_null(sres: java.lang.String, i: scala.Double, j: scala.Double): scala.Double
  def sql_num_columns(sres: java.lang.String): scala.Double
  def sql_num_rows(sres: java.lang.String): scala.Double
  def sql_query(scon: java.lang.String, squery: java.lang.String, sres: java.lang.String): scala.Double
  def sql_query_async(scon: java.lang.String, squery: java.lang.String): scala.Double
  def sql_result_free(sres: java.lang.String): scala.Double
  def sql_xquery(scon: java.lang.String, squery: java.lang.String, xavp: java.lang.String): scala.Double
}

object Anon_I {
  @scala.inline
  def apply(
    sql_is_null: (java.lang.String, scala.Double, scala.Double) => scala.Double,
    sql_num_columns: java.lang.String => scala.Double,
    sql_num_rows: java.lang.String => scala.Double,
    sql_query: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    sql_query_async: (java.lang.String, java.lang.String) => scala.Double,
    sql_result_free: java.lang.String => scala.Double,
    sql_xquery: (java.lang.String, java.lang.String, java.lang.String) => scala.Double
  ): Anon_I = {
    val __obj = js.Dynamic.literal(sql_is_null = js.Any.fromFunction3(sql_is_null), sql_num_columns = js.Any.fromFunction1(sql_num_columns), sql_num_rows = js.Any.fromFunction1(sql_num_rows), sql_query = js.Any.fromFunction3(sql_query), sql_query_async = js.Any.fromFunction2(sql_query_async), sql_result_free = js.Any.fromFunction1(sql_result_free), sql_xquery = js.Any.fromFunction3(sql_xquery))
  
    __obj.asInstanceOf[Anon_I]
  }
}

