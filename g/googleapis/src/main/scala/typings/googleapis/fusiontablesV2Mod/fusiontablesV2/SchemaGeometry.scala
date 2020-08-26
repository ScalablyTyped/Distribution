package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Geometry object.
  */
@js.native
trait SchemaGeometry extends js.Object {
  /**
    * The list of geometries in this geometry collection.
    */
  var geometries: js.UndefOr[js.Array[_]] = js.native
  var geometry: js.UndefOr[js.Any] = js.native
  /**
    * Type: A collection of geometries.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGeometry {
  @scala.inline
  def apply(): SchemaGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeometry]
  }
  @scala.inline
  implicit class SchemaGeometryOps[Self <: SchemaGeometry] (val x: Self) extends AnyVal {
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
    def setGeometriesVarargs(value: js.Any*): Self = this.set("geometries", js.Array(value :_*))
    @scala.inline
    def setGeometries(value: js.Array[_]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometries: Self = this.set("geometries", js.undefined)
    @scala.inline
    def setGeometry(value: js.Any): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

