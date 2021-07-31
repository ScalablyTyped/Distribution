package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "FixedOffsetZone")
@js.native
class FixedOffsetZone () extends Zone
/* static members */
object FixedOffsetZone {
  
  @JSImport("luxon", "FixedOffsetZone")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def instance(offset: Double): FixedOffsetZone = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(offset.asInstanceOf[js.Any]).asInstanceOf[FixedOffsetZone]
  
  @scala.inline
  def parseSpecifier(s: String): FixedOffsetZone = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSpecifier")(s.asInstanceOf[js.Any]).asInstanceOf[FixedOffsetZone]
  
  @JSImport("luxon", "FixedOffsetZone.utcInstance")
  @js.native
  def utcInstance: FixedOffsetZone = js.native
  @scala.inline
  def utcInstance_=(x: FixedOffsetZone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utcInstance")(x.asInstanceOf[js.Any])
}
