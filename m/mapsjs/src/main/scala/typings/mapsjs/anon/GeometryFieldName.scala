package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryFieldName extends js.Object {
  var bleedRatio: js.UndefOr[Double] = js.native
  var geometryFieldName: String = js.native
  var valueFieldNames: js.Array[String] = js.native
}

object GeometryFieldName {
  @scala.inline
  def apply(geometryFieldName: String, valueFieldNames: js.Array[String]): GeometryFieldName = {
    val __obj = js.Dynamic.literal(geometryFieldName = geometryFieldName.asInstanceOf[js.Any], valueFieldNames = valueFieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryFieldName]
  }
  @scala.inline
  implicit class GeometryFieldNameOps[Self <: GeometryFieldName] (val x: Self) extends AnyVal {
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
    def setGeometryFieldName(value: String): Self = this.set("geometryFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueFieldNamesVarargs(value: String*): Self = this.set("valueFieldNames", js.Array(value :_*))
    @scala.inline
    def setValueFieldNames(value: js.Array[String]): Self = this.set("valueFieldNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setBleedRatio(value: Double): Self = this.set("bleedRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBleedRatio: Self = this.set("bleedRatio", js.undefined)
  }
  
}

