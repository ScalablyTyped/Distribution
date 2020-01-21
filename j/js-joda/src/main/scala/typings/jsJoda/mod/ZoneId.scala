package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneId")
@js.native
abstract class ZoneId () extends js.Object {
  def equals(other: js.Any): Boolean = js.native
  def id(): String = js.native
  def normalized(): ZoneId = js.native
  def rules(): ZoneRules = js.native
}

/* static members */
@JSImport("js-joda", "ZoneId")
@js.native
object ZoneId extends js.Object {
  var SYSTEM: ZoneId = js.native
  var UTC: ZoneId = js.native
  def from(temporal: TemporalAccessor): ZoneId = js.native
  def getAvailableZoneIds(): js.Array[String] = js.native
  def of(zoneId: String): ZoneId = js.native
  def ofOffset(prefix: String, offset: ZoneOffset): ZoneId = js.native
  def systemDefault(): ZoneId = js.native
}

