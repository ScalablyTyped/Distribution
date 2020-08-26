package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a file&#39;s parent.
  */
@js.native
trait SchemaParentReference extends js.Object {
  /**
    * The ID of the parent.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether or not the parent is the root folder.
    */
  var isRoot: js.UndefOr[Boolean] = js.native
  /**
    * This is always drive#parentReference.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A link to the parent.
    */
  var parentLink: js.UndefOr[String] = js.native
  /**
    * A link back to this reference.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaParentReference {
  @scala.inline
  def apply(): SchemaParentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParentReference]
  }
  @scala.inline
  implicit class SchemaParentReferenceOps[Self <: SchemaParentReference] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsRoot(value: Boolean): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRoot: Self = this.set("isRoot", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setParentLink(value: String): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

