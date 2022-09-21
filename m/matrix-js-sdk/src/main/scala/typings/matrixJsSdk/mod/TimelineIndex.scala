package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "TimelineIndex")
@js.native
open class TimelineIndex protected () extends StObject {
  def this(timeline: EventTimeline, index: Double) = this()
  
  def advance(delta: Double): Double = js.native
  
  def maxIndex(): Double = js.native
  
  def minIndex(): Double = js.native
  
  def retreat(delta: Double): Double = js.native
}
