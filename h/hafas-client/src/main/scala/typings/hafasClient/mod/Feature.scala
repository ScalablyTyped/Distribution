package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature extends js.Object {
  var geometry: Geometry = js.native
  var properties: js.UndefOr[Station | Stop] = js.native
  var `type`: typings.hafasClient.hafasClientStrings.Feature = js.native
}

object Feature {
  @scala.inline
  def apply(geometry: Geometry, `type`: typings.hafasClient.hafasClientStrings.Feature): Feature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  @scala.inline
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
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
    def setGeometry(value: Geometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.hafasClient.hafasClientStrings.Feature): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: Station | Stop): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

