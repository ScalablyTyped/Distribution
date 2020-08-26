package typings.gremlin.mod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithOptions_ extends js.Object {
  var all: Double = js.native
  var ids: Double = js.native
  var indexer: String = js.native
  var keys: Double = js.native
  var labels: Double = js.native
  var list: Double = js.native
  var map: Double = js.native
  var none: Double = js.native
  var tokens: String = js.native
  var values: Double = js.native
}

object WithOptions_ {
  @scala.inline
  def apply(
    all: Double,
    ids: Double,
    indexer: String,
    keys: Double,
    labels: Double,
    list: Double,
    map: Double,
    none: Double,
    tokens: String,
    values: Double
  ): WithOptions_ = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithOptions_]
  }
  @scala.inline
  implicit class WithOptions_Ops[Self <: WithOptions_] (val x: Self) extends AnyVal {
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
    def setAll(value: Double): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setIds(value: Double): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexer(value: String): Self = this.set("indexer", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: Double): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: Double): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: Double): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: Double): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokens(value: String): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: Double): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

