package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "FixedOffsetZone")
@js.native
class FixedOffsetZone () extends Zone
/* static members */
object FixedOffsetZone {
  
  @JSImport("luxon", "FixedOffsetZone")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("luxon", "FixedOffsetZone.instance")
  @js.native
  def instance(offset: Double): FixedOffsetZone = js.native
  
  @JSImport("luxon", "FixedOffsetZone.parseSpecifier")
  @js.native
  def parseSpecifier(s: String): FixedOffsetZone = js.native
  
  @JSImport("luxon", "FixedOffsetZone.utcInstance")
  @js.native
  def utcInstance: FixedOffsetZone = js.native
  @scala.inline
  def utcInstance_=(x: FixedOffsetZone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utcInstance")(x.asInstanceOf[js.Any])
}
