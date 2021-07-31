package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.promClient.mod.Gauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agecountersMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/agecounters", "AgeCounters")
  @js.native
  /***
    * @param {String[]} counterPeriods A set of strings denoting the bucket periods
    * used by the gauge. It is in the format of '#X' where # is the integer period and
    * X is the unit of time. A unit can be one of 'h, d, w' for hours, days and weeks.
    * 7d would be 7 days. If not given, the periods are 1h, 1d and 7d.
    */
  class AgeCounters () extends StObject {
    def this(counterPeriods: js.Array[String]) = this()
    
    /**
      * Increment the values of the internal counters depending on the given age,
      * in seconds.
      *
      * @param {Number} age The age in seconds.
      */
    def bump(age: Double): Unit = js.native
    
    var counterPeriods: js.Any = js.native
    
    var counters: js.Any = js.native
    
    /**
      * Fetch the counts in the age buckets and set them as labeled observations in
      * the given gauge metric instance.
      *
      * @param {Gauge} gauge The gauge metric instance.
      * @param {Object} morelabels An object containing more labels to add to the
      * gauge when setting values.
      */
    def setGauge(gauge: Gauge[String]): Unit = js.native
    def setGauge(gauge: Gauge[String], morelabels: StringDictionary[String]): Unit = js.native
  }
}
