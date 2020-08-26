package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the dimensions of ads, placements, creatives, or creative
  * assets.
  */
@js.native
trait SchemaSize extends js.Object {
  /**
    * Height of this size. Acceptable values are 0 to 32767, inclusive.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * IAB standard size. This is a read-only, auto-generated field.
    */
  var iab: js.UndefOr[Boolean] = js.native
  /**
    * ID of this size. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#size&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Width of this size. Acceptable values are 0 to 32767, inclusive.
    */
  var width: js.UndefOr[Double] = js.native
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIab(value: Boolean): Self = this.set("iab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIab: Self = this.set("iab", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

