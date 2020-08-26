package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The read-only metadata about a person.
  */
@js.native
trait SchemaPersonMetadata extends js.Object {
  /**
    * True if the person resource has been deleted. Populated only for
    * [`connections.list`](/people/api/rest/v1/people.connections/list)
    * requests that include a sync token.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Resource names of people linked to this resource.
    */
  var linkedPeopleResourceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * **DEPRECATED** (Please use
    * `person.metadata.sources.profileMetadata.objectType` instead)  The type
    * of the person object.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Any former resource names this person has had. Populated only for
    * [`connections.list`](/people/api/rest/v1/people.connections/list)
    * requests that include a sync token.  The resource name may change when
    * adding or removing fields that link a contact and profile such as a
    * verified email, verified phone number, or profile URL.
    */
  var previousResourceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The sources of data for the person.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
}

object SchemaPersonMetadata {
  @scala.inline
  def apply(): SchemaPersonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPersonMetadata]
  }
  @scala.inline
  implicit class SchemaPersonMetadataOps[Self <: SchemaPersonMetadata] (val x: Self) extends AnyVal {
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setLinkedPeopleResourceNamesVarargs(value: String*): Self = this.set("linkedPeopleResourceNames", js.Array(value :_*))
    @scala.inline
    def setLinkedPeopleResourceNames(value: js.Array[String]): Self = this.set("linkedPeopleResourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedPeopleResourceNames: Self = this.set("linkedPeopleResourceNames", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setPreviousResourceNamesVarargs(value: String*): Self = this.set("previousResourceNames", js.Array(value :_*))
    @scala.inline
    def setPreviousResourceNames(value: js.Array[String]): Self = this.set("previousResourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousResourceNames: Self = this.set("previousResourceNames", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: SchemaSource*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[SchemaSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
  
}

