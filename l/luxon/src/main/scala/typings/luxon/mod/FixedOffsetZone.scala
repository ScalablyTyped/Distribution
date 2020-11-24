package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "FixedOffsetZone")
@js.native
class FixedOffsetZone () extends Zone
/* static members */
@JSImport("luxon", "FixedOffsetZone")
@js.native
object FixedOffsetZone extends js.Object {
  
  def instance(offset: Double): FixedOffsetZone = js.native
  
  def parseSpecifier(s: String): FixedOffsetZone = js.native
  
  var utcInstance: FixedOffsetZone = js.native
}
