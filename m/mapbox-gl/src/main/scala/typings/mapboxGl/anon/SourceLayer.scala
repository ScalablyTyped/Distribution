package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceLayer extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.native
  var sourceLayer: js.UndefOr[String] = js.native
  var validate: js.UndefOr[Boolean] = js.native
}

object SourceLayer {
  @scala.inline
  def apply(): SourceLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceLayer]
  }
  @scala.inline
  implicit class SourceLayerOps[Self <: SourceLayer] (val x: Self) extends AnyVal {
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
    def setFilterVarargs(value: js.Any*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: js.Array[_]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setSourceLayer(value: String): Self = this.set("sourceLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceLayer: Self = this.set("sourceLayer", js.undefined)
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

