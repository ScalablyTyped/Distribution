package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFactory extends js.Object {
  def getAllMetrics(): js.Array[CommandMetrics]
  def getOrCreate(config: MetricsProperties): CommandMetrics
  def resetCache(): scala.Unit
}

object MetricsFactory {
  @scala.inline
  def apply(
    getAllMetrics: js.Function0[js.Array[CommandMetrics]],
    getOrCreate: js.Function1[MetricsProperties, CommandMetrics],
    resetCache: js.Function0[scala.Unit]
  ): MetricsFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllMetrics")(getAllMetrics)
    __obj.updateDynamic("getOrCreate")(getOrCreate)
    __obj.updateDynamic("resetCache")(resetCache)
    __obj.asInstanceOf[MetricsFactory]
  }
}

