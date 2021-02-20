package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ValueRange")
@js.native
class ValueRange protected () extends StObject {
  
  def checkValidIntValue(value: Double, field: TemporalField): Double = js.native
  
  def checkValidValue(value: Double, field: TemporalField): js.Any = js.native
  
  def equals(other: js.Any): Boolean = js.native
  
  def isFixed(): Boolean = js.native
  
  def isIntValue(): Boolean = js.native
  
  def isValidIntValue(value: Double): Boolean = js.native
  
  def isValidValue(value: js.Any): Boolean = js.native
  
  def largestMinimum(): Double = js.native
  
  def maximum(): Double = js.native
  
  def minimum(): Double = js.native
  
  def smallestMaximum(): Double = js.native
}
object ValueRange {
  
  /* static member */
  @JSImport("js-joda", "ValueRange.of")
  @js.native
  def of(minSmallest: Double, minLargest: Double, maxSmallest: Double, maxLargest: Double): ValueRange = js.native
  /* static member */
  @JSImport("js-joda", "ValueRange.of")
  @js.native
  def of(min: Double, maxSmallest: Double, maxLargest: Double): ValueRange = js.native
  /* static member */
  @JSImport("js-joda", "ValueRange.of")
  @js.native
  def of(min: Double, max: Double): ValueRange = js.native
}
