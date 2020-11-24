package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "TemporalUnit")
@js.native
abstract class TemporalUnit () extends js.Object {
  
  def addTo[T /* <: Temporal */](temporal: T, amount: Double): T = js.native
  
  def between(temporal1: Temporal, temporal2: Temporal): Double = js.native
  
  def duration(): Duration = js.native
  
  def isDateBased(): Boolean = js.native
  
  def isDurationEstimated(): Boolean = js.native
  
  def isSupportedBy(temporal: Temporal): Boolean = js.native
  
  def isTimeBased(): Boolean = js.native
}
