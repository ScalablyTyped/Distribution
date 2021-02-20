package typings.jsforce

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("jsforce/date", "SfDate")
  @js.native
  class SfDate () extends StObject
  /* static members */
  object SfDate {
    
    @JSImport("jsforce/date", "SfDate.parseDate")
    @js.native
    def parseDate(str: String): Date = js.native
    
    @JSImport("jsforce/date", "SfDate.toDateLiteral")
    @js.native
    def toDateLiteral(date: String): SfDate = js.native
    @JSImport("jsforce/date", "SfDate.toDateLiteral")
    @js.native
    def toDateLiteral(date: Double): SfDate = js.native
    @JSImport("jsforce/date", "SfDate.toDateLiteral")
    @js.native
    def toDateLiteral(date: Date): SfDate = js.native
    
    @JSImport("jsforce/date", "SfDate.toDateTimeLiteral")
    @js.native
    def toDateTimeLiteral(date: String): SfDate = js.native
    @JSImport("jsforce/date", "SfDate.toDateTimeLiteral")
    @js.native
    def toDateTimeLiteral(date: Double): SfDate = js.native
    @JSImport("jsforce/date", "SfDate.toDateTimeLiteral")
    @js.native
    def toDateTimeLiteral(date: Date): SfDate = js.native
  }
}
