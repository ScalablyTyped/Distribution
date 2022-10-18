package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@js-joda/core", "TemporalField")
@js.native
open class TemporalField () extends StObject {
  
  /** Returns a copy of the specified temporal object with the value of this field set. */
  def adjustInto[R /* <: Temporal */](temporal: R, newValue: Double): R = js.native
  
  /** Gets the unit that the field is measured in. */
  def baseUnit(): TemporalUnit = js.native
  
  def displayName(): String = js.native
  
  /** Gets the value of this field from the specified temporal object. */
  def getFrom(temporal: TemporalAccessor): Double = js.native
  
  /** Checks if this field represents a component of a date. */
  def isDateBased(): Boolean = js.native
  
  /** Checks if this field is supported by the temporal object. */
  def isSupportedBy(temporal: TemporalAccessor): Boolean = js.native
  
  /** Checks if this field represents a component of a time. */
  def isTimeBased(): Boolean = js.native
  
  def name(): String = js.native
  
  /** Gets the range of valid values for the field. */
  def range(): ValueRange = js.native
  
  /**
    * Get the range of valid values for this field using the temporal object to
    * refine the result.
    */
  def rangeRefinedBy(temporal: TemporalAccessor): ValueRange = js.native
  
  /** Gets the range that the field is bound by. */
  def rangeUnit(): TemporalUnit = js.native
}
