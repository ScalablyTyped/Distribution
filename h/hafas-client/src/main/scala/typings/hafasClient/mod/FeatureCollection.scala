package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureCollection extends js.Object {
  var features: js.Array[Feature] = js.native
  var `type`: typings.hafasClient.hafasClientStrings.FeatureCollection = js.native
}

object FeatureCollection {
  @scala.inline
  def apply(features: js.Array[Feature], `type`: typings.hafasClient.hafasClientStrings.FeatureCollection): FeatureCollection = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollection]
  }
  @scala.inline
  implicit class FeatureCollectionOps[Self <: FeatureCollection] (val x: Self) extends AnyVal {
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
    def setFeaturesVarargs(value: Feature*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.hafasClient.hafasClientStrings.FeatureCollection): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

