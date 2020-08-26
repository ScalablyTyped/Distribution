package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Targeting Template List Response
  */
@js.native
trait SchemaTargetingTemplatesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetingTemplatesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Targeting template collection.
    */
  var targetingTemplates: js.UndefOr[js.Array[SchemaTargetingTemplate]] = js.native
}

object SchemaTargetingTemplatesListResponse {
  @scala.inline
  def apply(): SchemaTargetingTemplatesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingTemplatesListResponse]
  }
  @scala.inline
  implicit class SchemaTargetingTemplatesListResponseOps[Self <: SchemaTargetingTemplatesListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTargetingTemplatesVarargs(value: SchemaTargetingTemplate*): Self = this.set("targetingTemplates", js.Array(value :_*))
    @scala.inline
    def setTargetingTemplates(value: js.Array[SchemaTargetingTemplate]): Self = this.set("targetingTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetingTemplates: Self = this.set("targetingTemplates", js.undefined)
  }
  
}

