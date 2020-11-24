package typings.jsforce

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/date", JSImport.Namespace)
@js.native
object dateMod extends js.Object {
  
  @js.native
  class SfDate () extends js.Object
  /* static members */
  @js.native
  object SfDate extends js.Object {
    
    def parseDate(str: String): Date = js.native
    
    def toDateLiteral(date: String): SfDate = js.native
    def toDateLiteral(date: Double): SfDate = js.native
    def toDateLiteral(date: Date): SfDate = js.native
    
    def toDateTimeLiteral(date: String): SfDate = js.native
    def toDateTimeLiteral(date: Double): SfDate = js.native
    def toDateTimeLiteral(date: Date): SfDate = js.native
  }
}
