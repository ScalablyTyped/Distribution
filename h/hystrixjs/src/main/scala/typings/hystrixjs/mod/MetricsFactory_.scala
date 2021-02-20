package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsFactory_ extends StObject {
  
  def getAllMetrics(): js.Array[CommandMetrics] = js.native
  
  def getOrCreate(config: MetricsProperties): CommandMetrics = js.native
  
  def resetCache(): Unit = js.native
}
object MetricsFactory_ {
  
  @scala.inline
  def apply(
    getAllMetrics: () => js.Array[CommandMetrics],
    getOrCreate: MetricsProperties => CommandMetrics,
    resetCache: () => Unit
  ): MetricsFactory_ = {
    val __obj = js.Dynamic.literal(getAllMetrics = js.Any.fromFunction0(getAllMetrics), getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = js.Any.fromFunction0(resetCache))
    __obj.asInstanceOf[MetricsFactory_]
  }
  
  @scala.inline
  implicit class MetricsFactory_MutableBuilder[Self <: MetricsFactory_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAllMetrics(value: () => js.Array[CommandMetrics]): Self = StObject.set(x, "getAllMetrics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOrCreate(value: MetricsProperties => CommandMetrics): Self = StObject.set(x, "getOrCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetCache(value: () => Unit): Self = StObject.set(x, "resetCache", js.Any.fromFunction0(value))
  }
}
