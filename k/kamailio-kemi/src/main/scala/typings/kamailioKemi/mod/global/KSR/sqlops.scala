package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlops {
  
  @JSGlobal("KSR.sqlops")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sqlIsNull(sres: String, i: Double, j: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sql_is_null")(sres.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sqlNumColumns(sres: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sql_num_columns")(sres.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sqlNumRows(sres: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sql_num_rows")(sres.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sqlQuery(scon: String, squery: String, sres: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sql_query")(scon.asInstanceOf[js.Any], squery.asInstanceOf[js.Any], sres.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sqlQueryAsync(scon: String, squery: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sql_query_async")(scon.asInstanceOf[js.Any], squery.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sqlResultFree(sres: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sql_result_free")(sres.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sqlXquery(scon: String, squery: String, xavp: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sql_xquery")(scon.asInstanceOf[js.Any], squery.asInstanceOf[js.Any], xavp.asInstanceOf[js.Any])).asInstanceOf[Double]
}
