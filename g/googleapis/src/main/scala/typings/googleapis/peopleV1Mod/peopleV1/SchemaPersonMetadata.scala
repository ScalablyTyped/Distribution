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
  def apply(
    deleted: js.UndefOr[Boolean] = js.undefined,
    linkedPeopleResourceNames: js.Array[String] = null,
    objectType: String = null,
    previousResourceNames: js.Array[String] = null,
    sources: js.Array[SchemaSource] = null
  ): SchemaPersonMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (linkedPeopleResourceNames != null) __obj.updateDynamic("linkedPeopleResourceNames")(linkedPeopleResourceNames.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (previousResourceNames != null) __obj.updateDynamic("previousResourceNames")(previousResourceNames.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPersonMetadata]
  }
}

