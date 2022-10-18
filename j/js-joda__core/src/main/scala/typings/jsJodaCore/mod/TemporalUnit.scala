package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@js-joda/core", "TemporalUnit")
@js.native
open class TemporalUnit () extends StObject {
  
  /** Returns a copy of the specified temporal object with the specified period added. */
  def addTo[T /* <: Temporal */](temporal: T, amount: Double): T = js.native
  
  /**
    * Calculates the period in terms of this unit between two temporal objects of the same type.
    *
    * Returns the period between temporal1 and temporal2 in terms of this unit; a positive number
    * if `temporal2` is later than `temporal1`, negative if earlier.
    */
  def between(temporal1: Temporal, temporal2: Temporal): Double = js.native
  
  /** Gets the duration of this unit, which may be an estimate. */
  def duration(): Duration = js.native
  
  /** Checks if this unit is date-based. */
  def isDateBased(): Boolean = js.native
  
  /** Checks if the duration of the unit is an estimate. */
  def isDurationEstimated(): Boolean = js.native
  
  /** Checks if this unit is supported by the specified temporal object. */
  def isSupportedBy(temporal: Temporal): Boolean = js.native
  
  /** Checks if this unit is time-based. */
  def isTimeBased(): Boolean = js.native
}
