package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsFactory_ extends js.Object {
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
  implicit class MetricsFactory_Ops[Self <: MetricsFactory_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAllMetrics(value: () => js.Array[CommandMetrics]): Self = this.set("getAllMetrics", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOrCreate(value: MetricsProperties => CommandMetrics): Self = this.set("getOrCreate", js.Any.fromFunction1(value))
    @scala.inline
    def setResetCache(value: () => Unit): Self = this.set("resetCache", js.Any.fromFunction0(value))
  }
  
}

