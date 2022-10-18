package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@js-joda/core", "TemporalAmount")
@js.native
open class TemporalAmount () extends StObject {
  
  /**
    * This adds to the specified temporal object using the logic encapsulated in the
    * implementing class.
    *
    * There are two equivalent ways of using this method. The first is to invoke this method
    * directly. The second is to use `Temporal.plus(TemporalAmount)`:
    *
    * ```
    * // these two lines are equivalent, but the second approach is recommended
    * dateTime = amount.addTo(dateTime);
    * dateTime = dateTime.plus(amount);
    * ```
    *
    * It is recommended to use the second approach, `plus(TemporalAmount)`, as it is a lot
    * clearer to read in code.
    */
  def addTo[T /* <: Temporal */](temporal: T): T = js.native
  
  /** Gets the amount associated with the specified unit. */
  def get(unit: TemporalUnit): Double = js.native
  
  /**
    * This substract to the specified temporal object using the logic encapsulated in the
    * implementing class.
    *
    * There are two equivalent ways of using this method. The first is to invoke this method
    * directly. The second is to use `Temporal.minus(TemporalAmount)`:
    * ```
    * // these two lines are equivalent, but the second approach is recommended
    * dateTime = amount.substractFrom(dateTime);
    * dateTime = dateTime.minus(amount);
    * ```
    *
    * It is recommended to use the second approach, `minus(TemporalAmount)`, as it is a lot
    * clearer to read in code.
    */
  def subtractFrom[T /* <: Temporal */](temporal: T): T = js.native
  
  /** Gets the list of units, from largest to smallest, that fully define this amount. */
  def units(): js.Array[TemporalUnit] = js.native
}
