package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsqlops extends js.Object {
  def sql_is_null(sres: String, i: Double, j: Double): Double
  def sql_num_columns(sres: String): Double
  def sql_num_rows(sres: String): Double
  def sql_query(scon: String, squery: String, sres: String): Double
  def sql_query_async(scon: String, squery: String): Double
  def sql_result_free(sres: String): Double
  def sql_xquery(scon: String, squery: String, xavp: String): Double
}

object Typeofsqlops {
  @scala.inline
  def apply(
    sql_is_null: (String, Double, Double) => Double,
    sql_num_columns: String => Double,
    sql_num_rows: String => Double,
    sql_query: (String, String, String) => Double,
    sql_query_async: (String, String) => Double,
    sql_result_free: String => Double,
    sql_xquery: (String, String, String) => Double
  ): Typeofsqlops = {
    val __obj = js.Dynamic.literal(sql_is_null = js.Any.fromFunction3(sql_is_null), sql_num_columns = js.Any.fromFunction1(sql_num_columns), sql_num_rows = js.Any.fromFunction1(sql_num_rows), sql_query = js.Any.fromFunction3(sql_query), sql_query_async = js.Any.fromFunction2(sql_query_async), sql_result_free = js.Any.fromFunction1(sql_result_free), sql_xquery = js.Any.fromFunction3(sql_xquery))
  
    __obj.asInstanceOf[Typeofsqlops]
  }
}

