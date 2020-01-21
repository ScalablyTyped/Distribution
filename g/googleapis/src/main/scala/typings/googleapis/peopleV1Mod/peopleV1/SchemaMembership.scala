package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only membership in a group.
  */
@js.native
trait SchemaMembership extends js.Object {
  /**
    * The contact group membership.
    */
  var contactGroupMembership: js.UndefOr[SchemaContactGroupMembership] = js.native
  /**
    * The domain membership.
    */
  var domainMembership: js.UndefOr[SchemaDomainMembership] = js.native
  /**
    * Metadata about the membership.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
}

object SchemaMembership {
  @scala.inline
  def apply(
    contactGroupMembership: SchemaContactGroupMembership = null,
    domainMembership: SchemaDomainMembership = null,
    metadata: SchemaFieldMetadata = null
  ): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    if (contactGroupMembership != null) __obj.updateDynamic("contactGroupMembership")(contactGroupMembership.asInstanceOf[js.Any])
    if (domainMembership != null) __obj.updateDynamic("domainMembership")(domainMembership.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMembership]
  }
}

