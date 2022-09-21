package typings.jsforce.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce", "SfDate")
@js.native
open class SfDate protected ()
  extends typings.jsforce.dateMod.SfDate {
  def this(str: String) = this()
}
/* static members */
object SfDate {
  
  @JSImport("jsforce", "SfDate")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDate(str: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def toDateLiteral(date: String): typings.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typings.jsforce.dateMod.SfDate]
  inline def toDateLiteral(date: js.Date): typings.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typings.jsforce.dateMod.SfDate]
  inline def toDateLiteral(date: Double): typings.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typings.jsforce.dateMod.SfDate]
  
  inline def toDateTimeLiteral(date: String): typings.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typings.jsforce.dateMod.SfDate]
  inline def toDateTimeLiteral(date: js.Date): typings.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typings.jsforce.dateMod.SfDate]
  inline def toDateTimeLiteral(date: Double): typings.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typings.jsforce.dateMod.SfDate]
}
