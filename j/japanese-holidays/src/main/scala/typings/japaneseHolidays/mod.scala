package typings.japaneseHolidays

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("japanese-holidays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHolidaysOf(year: Double): js.Array[Holiday] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHolidaysOf")(year.asInstanceOf[js.Any]).asInstanceOf[js.Array[Holiday]]
  inline def getHolidaysOf(year: Double, furikae: Boolean): js.Array[Holiday] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHolidaysOf")(year.asInstanceOf[js.Any], furikae.asInstanceOf[js.Any])).asInstanceOf[js.Array[Holiday]]
  
  inline def isHoliday(date: Date): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHoliday")(date.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def isHoliday(date: Date, furikae: Boolean): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHoliday")(date.asInstanceOf[js.Any], furikae.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def isHolidayAt(date: Date): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("isHolidayAt")(date.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def isHolidayAt(date: Date, furikae: Boolean): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHolidayAt")(date.asInstanceOf[js.Any], furikae.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
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
    
    extension [Self <: Holiday](x: Self) {
      
      inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
