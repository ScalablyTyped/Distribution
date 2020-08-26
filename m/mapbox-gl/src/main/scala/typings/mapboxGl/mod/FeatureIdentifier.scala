package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureIdentifier extends js.Object {
  var id: js.UndefOr[String | Double] = js.native
  var source: String = js.native
  var sourceLayer: js.UndefOr[String] = js.native
}

object FeatureIdentifier {
  @scala.inline
  def apply(source: String): FeatureIdentifier = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureIdentifier]
  }
  @scala.inline
  implicit class FeatureIdentifierOps[Self <: FeatureIdentifier] (val x: Self) extends AnyVal {
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setSourceLayer(value: String): Self = this.set("sourceLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceLayer: Self = this.set("sourceLayer", js.undefined)
  }
  
}

