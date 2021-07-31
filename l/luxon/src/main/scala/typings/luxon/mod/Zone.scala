package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "Zone")
@js.native
class Zone () extends StObject {
  
  def equals(other: Zone): Boolean = js.native
  
  def formatOffset(ts: Double, format: ZoneOffsetFormat): String = js.native
  
  var isValid: Boolean = js.native
  
  var name: String = js.native
  
  def offset(ts: Double): Double = js.native
  
  def offsetName(ts: Double, options: ZoneOffsetOptions): String = js.native
  
  var `type`: String = js.native
  
  var universal: Boolean = js.native
}
