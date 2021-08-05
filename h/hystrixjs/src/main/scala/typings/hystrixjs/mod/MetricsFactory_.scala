package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsFactory_ extends StObject {
  
  def getAllMetrics(): js.Array[CommandMetrics]
  
  def getOrCreate(config: MetricsProperties): CommandMetrics
  
  def resetCache(): Unit
}
object MetricsFactory_ {
  
  inline def apply(
    getAllMetrics: () => js.Array[CommandMetrics],
    getOrCreate: MetricsProperties => CommandMetrics,
    resetCache: () => Unit
  ): MetricsFactory_ = {
    val __obj = js.Dynamic.literal(getAllMetrics = js.Any.fromFunction0(getAllMetrics), getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = js.Any.fromFunction0(resetCache))
    __obj.asInstanceOf[MetricsFactory_]
  }
  
  extension [Self <: MetricsFactory_](x: Self) {
    
    inline def setGetAllMetrics(value: () => js.Array[CommandMetrics]): Self = StObject.set(x, "getAllMetrics", js.Any.fromFunction0(value))
    
    inline def setGetOrCreate(value: MetricsProperties => CommandMetrics): Self = StObject.set(x, "getOrCreate", js.Any.fromFunction1(value))
    
    inline def setResetCache(value: () => Unit): Self = StObject.set(x, "resetCache", js.Any.fromFunction0(value))
  }
}
