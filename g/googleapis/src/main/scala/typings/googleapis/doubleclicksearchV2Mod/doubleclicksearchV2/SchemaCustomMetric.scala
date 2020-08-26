package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message containing the custome metric.
  */
@js.native
trait SchemaCustomMetric extends js.Object {
  /**
    * Custom metric name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Custom metric numeric value.
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaCustomMetric {
  @scala.inline
  def apply(): SchemaCustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomMetric]
  }
  @scala.inline
  implicit class SchemaCustomMetricOps[Self <: SchemaCustomMetric] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

