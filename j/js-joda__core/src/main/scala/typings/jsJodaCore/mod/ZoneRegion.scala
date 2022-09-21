package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "ZoneRegion")
@js.native
/* private */ open class ZoneRegion () extends ZoneId
/* static members */
object ZoneRegion {
  
  @JSImport("@js-joda/core", "ZoneRegion")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ofId(zoneId: String): ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("ofId")(zoneId.asInstanceOf[js.Any]).asInstanceOf[ZoneId]
}
