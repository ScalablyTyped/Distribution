package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait SchemaBoundingPoly extends js.Object {
  var label: js.UndefOr[String] = js.native
  var vertices: js.UndefOr[js.Array[SchemaVertex]] = js.native
}

object SchemaBoundingPoly {
  @scala.inline
  def apply(): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
  @scala.inline
  implicit class SchemaBoundingPolyOps[Self <: SchemaBoundingPoly] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setVerticesVarargs(value: SchemaVertex*): Self = this.set("vertices", js.Array(value :_*))
    @scala.inline
    def setVertices(value: js.Array[SchemaVertex]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
  
}

