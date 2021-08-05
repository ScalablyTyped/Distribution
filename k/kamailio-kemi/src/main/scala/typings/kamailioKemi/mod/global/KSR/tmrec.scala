package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tmrec {
  
  @JSGlobal("KSR.tmrec")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLeapYear(y: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_leap_year")(y.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isLeapYearNow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_leap_year_now")().asInstanceOf[Double]
  
  inline def `match`(rv: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(rv.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def matchTimestamp(rv: String, ti: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("match_timestamp")(rv.asInstanceOf[js.Any], ti.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def timePeriodMatch(period: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("time_period_match")(period.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def timePeriodMatchTimestamp(period: String, ti: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("time_period_match_timestamp")(period.asInstanceOf[js.Any], ti.asInstanceOf[js.Any])).asInstanceOf[Double]
}
