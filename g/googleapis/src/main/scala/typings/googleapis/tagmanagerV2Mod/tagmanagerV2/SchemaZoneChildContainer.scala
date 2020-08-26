package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a child container of a Zone.
  */
@js.native
trait SchemaZoneChildContainer extends js.Object {
  /**
    * The zone&#39;s nickname for the child container.
    */
  var nickname: js.UndefOr[String] = js.native
  /**
    * The child container&#39;s public id.
    */
  var publicId: js.UndefOr[String] = js.native
}

object SchemaZoneChildContainer {
  @scala.inline
  def apply(): SchemaZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneChildContainer]
  }
  @scala.inline
  implicit class SchemaZoneChildContainerOps[Self <: SchemaZoneChildContainer] (val x: Self) extends AnyVal {
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
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    @scala.inline
    def setPublicId(value: String): Self = this.set("publicId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicId: Self = this.set("publicId", js.undefined)
  }
  
}

