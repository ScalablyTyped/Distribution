package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.MaxValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for FieldSpec resource for Schemas in Directory API.
  */
@js.native
trait SchemaSchemaFieldSpec extends js.Object {
  /**
    * Display Name of the field.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Unique identifier of Field (Read-only)
    */
  var fieldId: js.UndefOr[String] = js.native
  /**
    * Name of the field.
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * Type of the field.
    */
  var fieldType: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether the field is indexed or not.
    */
  var indexed: js.UndefOr[Boolean] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether this is a multi-valued field or not.
    */
  var multiValued: js.UndefOr[Boolean] = js.native
  /**
    * Indexing spec for a numeric field. By default, only exact match queries
    * will be supported for numeric fields. Setting the numericIndexingSpec
    * allows range queries to be supported.
    */
  var numericIndexingSpec: js.UndefOr[MaxValue] = js.native
  /**
    * Read ACLs on the field specifying who can view values of this field.
    * Valid values are &quot;ALL_DOMAIN_USERS&quot; and
    * &quot;ADMINS_AND_SELF&quot;.
    */
  var readAccessType: js.UndefOr[String] = js.native
}

object SchemaSchemaFieldSpec {
  @scala.inline
  def apply(
    displayName: String = null,
    etag: String = null,
    fieldId: String = null,
    fieldName: String = null,
    fieldType: String = null,
    indexed: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    multiValued: js.UndefOr[Boolean] = js.undefined,
    numericIndexingSpec: MaxValue = null,
    readAccessType: String = null
  ): SchemaSchemaFieldSpec = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fieldId != null) __obj.updateDynamic("fieldId")(fieldId.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (fieldType != null) __obj.updateDynamic("fieldType")(fieldType.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(multiValued)) __obj.updateDynamic("multiValued")(multiValued.get.asInstanceOf[js.Any])
    if (numericIndexingSpec != null) __obj.updateDynamic("numericIndexingSpec")(numericIndexingSpec.asInstanceOf[js.Any])
    if (readAccessType != null) __obj.updateDynamic("readAccessType")(readAccessType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSchemaFieldSpec]
  }
}

