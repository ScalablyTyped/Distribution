package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTextConfig extends js.Object {
  /**
    * The transformations to apply to the detected data.
    */
  var transformations: js.UndefOr[js.Array[SchemaInfoTypeTransformation]] = js.native
}

object SchemaTextConfig {
  @scala.inline
  def apply(): SchemaTextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextConfig]
  }
  @scala.inline
  implicit class SchemaTextConfigOps[Self <: SchemaTextConfig] (val x: Self) extends AnyVal {
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
    def setTransformationsVarargs(value: SchemaInfoTypeTransformation*): Self = this.set("transformations", js.Array(value :_*))
    @scala.inline
    def setTransformations(value: js.Array[SchemaInfoTypeTransformation]): Self = this.set("transformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformations: Self = this.set("transformations", js.undefined)
  }
  
}

