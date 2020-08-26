package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a property in a projection.
  */
@js.native
trait SchemaProjection extends js.Object {
  /**
    * The property to project.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.native
}

object SchemaProjection {
  @scala.inline
  def apply(): SchemaProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjection]
  }
  @scala.inline
  implicit class SchemaProjectionOps[Self <: SchemaProjection] (val x: Self) extends AnyVal {
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
    def setProperty(value: SchemaPropertyReference): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
  }
  
}

