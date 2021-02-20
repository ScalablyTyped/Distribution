package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "TemporalAmount")
@js.native
abstract class TemporalAmount () extends StObject {
  
  def addTo[T /* <: Temporal */](temporal: T): T = js.native
  
  def get(unit: TemporalUnit): Double = js.native
  
  def subtractFrom[T /* <: Temporal */](temporal: T): T = js.native
  
  def units(): js.Array[TemporalUnit] = js.native
}
