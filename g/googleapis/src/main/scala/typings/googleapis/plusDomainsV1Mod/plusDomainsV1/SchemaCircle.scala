package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.anon.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCircle extends js.Object {
  /**
    * The description of this circle.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The circle name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID of the circle.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies this resource as a circle. Value: &quot;plus#circle&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The people in this circle.
    */
  var people: js.UndefOr[`7`] = js.native
  /**
    * Link to this circle resource
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaCircle {
  @scala.inline
  def apply(): SchemaCircle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCircle]
  }
  @scala.inline
  implicit class SchemaCircleOps[Self <: SchemaCircle] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPeople(value: `7`): Self = this.set("people", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeople: Self = this.set("people", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

