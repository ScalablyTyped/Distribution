package typings.hyperformula

import typings.hyperformula.statTypeMod.StatType
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticsStatisticsMod {
  
  @JSImport("hyperformula/typings/statistics/Statistics", "Statistics")
  @js.native
  open class Statistics () extends StObject {
    
    /**
      * Stops tracking particular statistic.
      * Raise error if tracking statistic wasn't started.
      *
      * @param name - statistic to stop tracking
      */
    def end(name: StatType): Unit = js.native
    
    def incrementCriterionFunctionFullCacheUsed(): Unit = js.native
    
    def incrementCriterionFunctionPartialCacheUsed(): Unit = js.native
    
    /**
      * Measure given statistic as execution of given function.
      *
      * @param name - statistic to track
      * @param func - function to call
      * @returns result of the function call
      */
    def measure[T](name: StatType, func: js.Function0[T]): T = js.native
    
    /**
      * Resets statistics
      */
    def reset(): Unit = js.native
    
    /**
      * Returns the snapshot of current results
      */
    def snapshot(): Map[StatType, Double] = js.native
    
    /**
      * Starts tracking particular statistic.
      *
      * @param name - statistic to start tracking
      */
    def start(name: StatType): Unit = js.native
    
    /* protected */ val startTimes: Map[StatType, Double] = js.native
    
    /* protected */ val stats: Map[StatType, Double] = js.native
  }
}
