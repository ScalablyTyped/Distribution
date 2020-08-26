package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a line geometry.
  */
@js.native
trait SchemaLine extends js.Object {
  /**
    * The coordinates that define the line.
    */
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  /**
    * Type: A line geometry.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaLine {
  @scala.inline
  def apply(): SchemaLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLine]
  }
  @scala.inline
  implicit class SchemaLineOps[Self <: SchemaLine] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

