package typings.japaneseHolidays

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("japanese-holidays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHolidaysOf(year: Double): js.Array[Holiday] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHolidaysOf")(year.asInstanceOf[js.Any]).asInstanceOf[js.Array[Holiday]]
  inline def getHolidaysOf(year: Double, furikae: Boolean): js.Array[Holiday] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHolidaysOf")(year.asInstanceOf[js.Any], furikae.asInstanceOf[js.Any])).asInstanceOf[js.Array[Holiday]]
  
  inline def getJDate(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getJDate")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getJDay(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getJDay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getJFullYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getJFullYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getJHours(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getJHours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getJMinutes(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getJMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getJMonth(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getJMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isHoliday(date: js.Date): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHoliday")(date.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def isHoliday(date: js.Date, furikae: Boolean): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHoliday")(date.asInstanceOf[js.Any], furikae.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def isHolidayAt(date: js.Date): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHolidayAt")(date.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def isHolidayAt(date: js.Date, furikae: Boolean): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHolidayAt")(date.asInstanceOf[js.Any], furikae.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def j2u(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("j2u")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def jDate(year: Double, month: Double, day: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("jDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def shiftDate(
    date: js.Date,
    year: Double,
    mon: Double,
    day: Double,
    hour: Double,
    min: Double,
    sec: Double,
    msec: Double
  ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("shiftDate")(date.asInstanceOf[js.Any], year.asInstanceOf[js.Any], mon.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], min.asInstanceOf[js.Any], sec.asInstanceOf[js.Any], msec.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def u2j(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("u2j")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def uDate(year: Double, month: Double, day: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("uDate")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  trait Holiday extends StObject {
    
    var date: Double
    
    var month: Double
    
    var name: String
  }
  object Holiday {
    
    inline def apply(date: Double, month: Double, name: String): Holiday = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Holiday]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Holiday] (val x: Self) extends AnyVal {
      
      inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
