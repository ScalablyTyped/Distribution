package typings.japaneseHolidays

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("japanese-holidays", "getHolidaysOf")
  @js.native
  def getHolidaysOf(year: Double): js.Array[Holiday] = js.native
  @JSImport("japanese-holidays", "getHolidaysOf")
  @js.native
  def getHolidaysOf(year: Double, furikae: Boolean): js.Array[Holiday] = js.native
  
  @JSImport("japanese-holidays", "isHoliday")
  @js.native
  def isHoliday(date: Date): js.UndefOr[String] = js.native
  @JSImport("japanese-holidays", "isHoliday")
  @js.native
  def isHoliday(date: Date, furikae: Boolean): js.UndefOr[String] = js.native
  
  @JSImport("japanese-holidays", "isHolidayAt")
  @js.native
  def isHolidayAt(date: Date): js.UndefOr[String] = js.native
  @JSImport("japanese-holidays", "isHolidayAt")
  @js.native
  def isHolidayAt(date: Date, furikae: Boolean): js.UndefOr[String] = js.native
  
  @js.native
  trait Holiday extends StObject {
    
    var date: Double = js.native
    
    var month: Double = js.native
    
    var name: String = js.native
  }
  object Holiday {
    
    @scala.inline
    def apply(date: Double, month: Double, name: String): Holiday = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Holiday]
    }
    
    @scala.inline
    implicit class HolidayMutableBuilder[Self <: Holiday] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
