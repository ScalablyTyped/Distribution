package typings.jsforce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("jsforce/date", "SfDate")
  @js.native
  open class SfDate protected () extends StObject {
    def this(str: String) = this()
  }
  /* static members */
  object SfDate {
    
    @JSImport("jsforce/date", "SfDate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseDate(str: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    inline def toDateLiteral(date: String): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    inline def toDateLiteral(date: js.Date): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    inline def toDateLiteral(date: Double): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    
    inline def toDateTimeLiteral(date: String): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    inline def toDateTimeLiteral(date: js.Date): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
    inline def toDateTimeLiteral(date: Double): SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[SfDate]
  }
}
