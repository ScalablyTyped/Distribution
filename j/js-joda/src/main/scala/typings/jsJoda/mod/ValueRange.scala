package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ValueRange")
@js.native
/* private */ open class ValueRange () extends StObject {
  
  def checkValidIntValue(value: Double, field: TemporalField): Double = js.native
  
  def checkValidValue(value: Double, field: TemporalField): Any = js.native
  
  def isFixed(): Boolean = js.native
  
  def isIntValue(): Boolean = js.native
  
  def isValidIntValue(value: Double): Boolean = js.native
  
  def isValidValue(value: Any): Boolean = js.native
  
  def largestMinimum(): Double = js.native
  
  def maximum(): Double = js.native
  
  def minimum(): Double = js.native
  
  def smallestMaximum(): Double = js.native
}
object ValueRange {
  
  @JSImport("js-joda", "ValueRange")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def of(minSmallest: Double, minLargest: Double, maxSmallest: Double, maxLargest: Double): ValueRange = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(minSmallest.asInstanceOf[js.Any], minLargest.asInstanceOf[js.Any], maxSmallest.asInstanceOf[js.Any], maxLargest.asInstanceOf[js.Any])).asInstanceOf[ValueRange]
  /* static member */
  inline def of(min: Double, maxSmallest: Double, maxLargest: Double): ValueRange = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(min.asInstanceOf[js.Any], maxSmallest.asInstanceOf[js.Any], maxLargest.asInstanceOf[js.Any])).asInstanceOf[ValueRange]
  /* static member */
  inline def of(min: Double, max: Double): ValueRange = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ValueRange]
}
