package typings.hystrixjs.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFactory extends js.Object {
  def getAllMetrics(): js.Array[CommandMetrics]
  def getOrCreate(config: MetricsProperties): CommandMetrics
  def resetCache(): Unit
}

object MetricsFactory {
  @scala.inline
  def apply(
    getAllMetrics: () => js.Array[CommandMetrics],
    getOrCreate: MetricsProperties => CommandMetrics,
    resetCache: () => Unit
  ): MetricsFactory = {
    val __obj = js.Dynamic.literal(getAllMetrics = js.Any.fromFunction0(getAllMetrics), getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = js.Any.fromFunction0(resetCache))
  
    __obj.asInstanceOf[MetricsFactory]
  }
}

