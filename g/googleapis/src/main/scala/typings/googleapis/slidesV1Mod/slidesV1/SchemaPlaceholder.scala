package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The placeholder information that uniquely identifies a placeholder shape.
  */
@js.native
trait SchemaPlaceholder extends js.Object {
  /**
    * The index of the placeholder. If the same placeholder types are present
    * in the same page, they would have different index values.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The object ID of this shape&#39;s parent placeholder. If unset, the
    * parent placeholder shape does not exist, so the shape does not inherit
    * properties from any other shape.
    */
  var parentObjectId: js.UndefOr[String] = js.native
  /**
    * The type of the placeholder.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPlaceholder {
  @scala.inline
  def apply(): SchemaPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaceholder]
  }
  @scala.inline
  implicit class SchemaPlaceholderOps[Self <: SchemaPlaceholder] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setParentObjectId(value: String): Self = this.set("parentObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentObjectId: Self = this.set("parentObjectId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

