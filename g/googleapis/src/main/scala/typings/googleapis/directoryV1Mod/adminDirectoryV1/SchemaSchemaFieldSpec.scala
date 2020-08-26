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
  def apply(): SchemaSchemaFieldSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaFieldSpec]
  }
  @scala.inline
  implicit class SchemaSchemaFieldSpecOps[Self <: SchemaSchemaFieldSpec] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFieldId(value: String): Self = this.set("fieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldId: Self = this.set("fieldId", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setFieldType(value: String): Self = this.set("fieldType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldType: Self = this.set("fieldType", js.undefined)
    @scala.inline
    def setIndexed(value: Boolean): Self = this.set("indexed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexed: Self = this.set("indexed", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMultiValued(value: Boolean): Self = this.set("multiValued", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValued: Self = this.set("multiValued", js.undefined)
    @scala.inline
    def setNumericIndexingSpec(value: MaxValue): Self = this.set("numericIndexingSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericIndexingSpec: Self = this.set("numericIndexingSpec", js.undefined)
    @scala.inline
    def setReadAccessType(value: String): Self = this.set("readAccessType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadAccessType: Self = this.set("readAccessType", js.undefined)
  }
  
}

