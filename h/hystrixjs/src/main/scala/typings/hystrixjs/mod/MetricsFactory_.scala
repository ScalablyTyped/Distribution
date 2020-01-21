package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFactory_ extends js.Object {
  def getAllMetrics(): js.Array[CommandMetrics]
  def getOrCreate(config: MetricsProperties): CommandMetrics
  def resetCache(): Unit
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
}

