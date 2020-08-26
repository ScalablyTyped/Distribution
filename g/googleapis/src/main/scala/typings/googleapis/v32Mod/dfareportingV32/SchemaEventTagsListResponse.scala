package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event Tag List Response
  */
@js.native
trait SchemaEventTagsListResponse extends js.Object {
  /**
    * Event tag collection.
    */
  var eventTags: js.UndefOr[js.Array[SchemaEventTag]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#eventTagsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEventTagsListResponse {
  @scala.inline
  def apply(): SchemaEventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTagsListResponse]
  }
  @scala.inline
  implicit class SchemaEventTagsListResponseOps[Self <: SchemaEventTagsListResponse] (val x: Self) extends AnyVal {
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
    def setEventTagsVarargs(value: SchemaEventTag*): Self = this.set("eventTags", js.Array(value :_*))
    @scala.inline
    def setEventTags(value: js.Array[SchemaEventTag]): Self = this.set("eventTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTags: Self = this.set("eventTags", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

