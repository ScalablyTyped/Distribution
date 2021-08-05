package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how many time series must fail a predicate to trigger a
  * condition. If not specified, then a {count: 1} trigger is used.
  */
trait SchemaTrigger extends StObject {
  
  /**
    * The absolute number of time series that must fail the predicate for the
    * condition to be triggered.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * The percentage of time series that must fail the predicate for the
    * condition to be triggered.
    */
  var percent: js.UndefOr[Double] = js.undefined
}
object SchemaTrigger {
  
  inline def apply(): SchemaTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrigger]
  }
  
  extension [Self <: SchemaTrigger](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
  }
}
