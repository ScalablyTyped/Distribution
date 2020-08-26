package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsqlops extends js.Object {
  def sql_is_null(sres: String, i: Double, j: Double): Double = js.native
  def sql_num_columns(sres: String): Double = js.native
  def sql_num_rows(sres: String): Double = js.native
  def sql_query(scon: String, squery: String, sres: String): Double = js.native
  def sql_query_async(scon: String, squery: String): Double = js.native
  def sql_result_free(sres: String): Double = js.native
  def sql_xquery(scon: String, squery: String, xavp: String): Double = js.native
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
  @scala.inline
  implicit class TypeofsqlopsOps[Self <: Typeofsqlops] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSql_is_null(value: (String, Double, Double) => Double): Self = this.set("sql_is_null", js.Any.fromFunction3(value))
    @scala.inline
    def setSql_num_columns(value: String => Double): Self = this.set("sql_num_columns", js.Any.fromFunction1(value))
    @scala.inline
    def setSql_num_rows(value: String => Double): Self = this.set("sql_num_rows", js.Any.fromFunction1(value))
    @scala.inline
    def setSql_query(value: (String, String, String) => Double): Self = this.set("sql_query", js.Any.fromFunction3(value))
    @scala.inline
    def setSql_query_async(value: (String, String) => Double): Self = this.set("sql_query_async", js.Any.fromFunction2(value))
    @scala.inline
    def setSql_result_free(value: String => Double): Self = this.set("sql_result_free", js.Any.fromFunction1(value))
    @scala.inline
    def setSql_xquery(value: (String, String, String) => Double): Self = this.set("sql_xquery", js.Any.fromFunction3(value))
  }
  
}

