package typings.jsforce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce", "SfDate")
@js.native
class SfDate ()
  extends typings.jsforce.dateMod.SfDate
/* static members */
@JSImport("jsforce", "SfDate")
@js.native
object SfDate extends js.Object {
  
  def parseDate(str: String): typings.std.Date = js.native
  
  def toDateLiteral(date: String): typings.jsforce.dateMod.SfDate = js.native
  def toDateLiteral(date: Double): typings.jsforce.dateMod.SfDate = js.native
  def toDateLiteral(date: typings.std.Date): typings.jsforce.dateMod.SfDate = js.native
  
  def toDateTimeLiteral(date: String): typings.jsforce.dateMod.SfDate = js.native
  def toDateTimeLiteral(date: Double): typings.jsforce.dateMod.SfDate = js.native
  def toDateTimeLiteral(date: typings.std.Date): typings.jsforce.dateMod.SfDate = js.native
}
