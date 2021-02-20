package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ZoneId")
@js.native
abstract class ZoneId () extends StObject {
  
  def equals(other: js.Any): Boolean = js.native
  
  def id(): String = js.native
  
  def normalized(): ZoneId = js.native
  
  def rules(): ZoneRules = js.native
}
object ZoneId {
  
  @JSImport("js-joda", "ZoneId")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneId.SYSTEM")
  @js.native
  def SYSTEM: ZoneId = js.native
  @scala.inline
  def SYSTEM_=(x: ZoneId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneId.UTC")
  @js.native
  def UTC: ZoneId = js.native
  @scala.inline
  def UTC_=(x: ZoneId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneId.from")
  @js.native
  def from(temporal: TemporalAccessor): ZoneId = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneId.getAvailableZoneIds")
  @js.native
  def getAvailableZoneIds(): js.Array[String] = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneId.of")
  @js.native
  def of(zoneId: String): ZoneId = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneId.ofOffset")
  @js.native
  def ofOffset(prefix: String, offset: ZoneOffset): ZoneId = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneId.systemDefault")
  @js.native
  def systemDefault(): ZoneId = js.native
}
