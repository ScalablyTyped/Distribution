package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "ZoneId")
@js.native
abstract class ZoneId () extends StObject {
  
  def id(): String = js.native
  
  def normalized(): ZoneId = js.native
  
  def rules(): ZoneRules = js.native
  
  def toJSON(): String = js.native
}
/* static members */
object ZoneId {
  
  @JSImport("@js-joda/core", "ZoneId")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "ZoneId.SYSTEM")
  @js.native
  def SYSTEM: ZoneId = js.native
  inline def SYSTEM_=(x: ZoneId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "ZoneId.UTC")
  @js.native
  def UTC: ZoneId = js.native
  inline def UTC_=(x: ZoneId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[ZoneId]
  
  inline def getAvailableZoneIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableZoneIds")().asInstanceOf[js.Array[String]]
  
  inline def of(zoneId: String): ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(zoneId.asInstanceOf[js.Any]).asInstanceOf[ZoneId]
  
  inline def ofOffset(prefix: String, offset: ZoneOffset): ZoneId = (^.asInstanceOf[js.Dynamic].applyDynamic("ofOffset")(prefix.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ZoneId]
  
  inline def systemDefault(): ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("systemDefault")().asInstanceOf[ZoneId]
}
