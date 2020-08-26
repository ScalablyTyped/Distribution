package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A width and height.
  */
@js.native
trait SchemaSize extends js.Object {
  /**
    * The height of the object.
    */
  var height: js.UndefOr[SchemaDimension] = js.native
  /**
    * The width of the object.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
}

object SchemaSize {
  @scala.inline
  def apply(): SchemaSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSize]
  }
  @scala.inline
  implicit class SchemaSizeOps[Self <: SchemaSize] (val x: Self) extends AnyVal {
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
    def setHeight(value: SchemaDimension): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: SchemaDimension): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

