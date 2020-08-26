package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCustomGroup extends js.Object {
  /**
    * The sub-attributes.
    */
  var attributes: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.native
  /**
    * The name of the group. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaCustomGroup {
  @scala.inline
  def apply(): SchemaCustomGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomGroup]
  }
  @scala.inline
  implicit class SchemaCustomGroupOps[Self <: SchemaCustomGroup] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: SchemaCustomAttribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[SchemaCustomAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

