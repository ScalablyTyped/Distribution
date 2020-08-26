package typings.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for DomainMappings.ListDomainMappings.
  */
@js.native
trait SchemaListDomainMappingsResponse extends js.Object {
  /**
    * The domain mappings for the application.
    */
  var domainMappings: js.UndefOr[js.Array[SchemaDomainMapping]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDomainMappingsResponse {
  @scala.inline
  def apply(): SchemaListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDomainMappingsResponse]
  }
  @scala.inline
  implicit class SchemaListDomainMappingsResponseOps[Self <: SchemaListDomainMappingsResponse] (val x: Self) extends AnyVal {
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
    def setDomainMappingsVarargs(value: SchemaDomainMapping*): Self = this.set("domainMappings", js.Array(value :_*))
    @scala.inline
    def setDomainMappings(value: js.Array[SchemaDomainMapping]): Self = this.set("domainMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainMappings: Self = this.set("domainMappings", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

