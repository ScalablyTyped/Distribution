package typings.jsforce

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("jsforce/date", "SfDate")
  @js.native
  class SfDate () extends StObject
  /* static members */
  object SfDate {
    
    @JSImport("jsforce/date", "SfDate")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def parseDate(str: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def toDateLiteral(date: String): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    @scala.inline
    def toDateLiteral(date: Double): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    @scala.inline
    def toDateLiteral(date: Date): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    
    @scala.inline
    def toDateTimeLiteral(date: String): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    @scala.inline
    def toDateTimeLiteral(date: Double): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    @scala.inline
    def toDateTimeLiteral(date: Date): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
  }
}
