package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlops {
  
  @JSGlobal("KSR.sqlops.sql_is_null")
  @js.native
  def sqlIsNull(sres: String, i: Double, j: Double): Double = js.native
  
  @JSGlobal("KSR.sqlops.sql_num_columns")
  @js.native
  def sqlNumColumns(sres: String): Double = js.native
  
  @JSGlobal("KSR.sqlops.sql_num_rows")
  @js.native
  def sqlNumRows(sres: String): Double = js.native
  
  @JSGlobal("KSR.sqlops.sql_query")
  @js.native
  def sqlQuery(scon: String, squery: String, sres: String): Double = js.native
  
  @JSGlobal("KSR.sqlops.sql_query_async")
  @js.native
  def sqlQueryAsync(scon: String, squery: String): Double = js.native
  
  @JSGlobal("KSR.sqlops.sql_result_free")
  @js.native
  def sqlResultFree(sres: String): Double = js.native
  
  @JSGlobal("KSR.sqlops.sql_xquery")
  @js.native
  def sqlXquery(scon: String, squery: String, xavp: String): Double = js.native
}
