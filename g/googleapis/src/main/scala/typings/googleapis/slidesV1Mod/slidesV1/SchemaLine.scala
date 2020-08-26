package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a non-connector line, straight connector,
  * curved connector, or bent connector.
  */
@js.native
trait SchemaLine extends js.Object {
  /**
    * The category of the line.  It matches the `category` specified in
    * CreateLineRequest, and can be updated with UpdateLineCategoryRequest.
    */
  var lineCategory: js.UndefOr[String] = js.native
  /**
    * The properties of the line.
    */
  var lineProperties: js.UndefOr[SchemaLineProperties] = js.native
  /**
    * The type of the line.
    */
  var lineType: js.UndefOr[String] = js.native
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
    def setLineCategory(value: String): Self = this.set("lineCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCategory: Self = this.set("lineCategory", js.undefined)
    @scala.inline
    def setLineProperties(value: SchemaLineProperties): Self = this.set("lineProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineProperties: Self = this.set("lineProperties", js.undefined)
    @scala.inline
    def setLineType(value: String): Self = this.set("lineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineType: Self = this.set("lineType", js.undefined)
  }
  
}

