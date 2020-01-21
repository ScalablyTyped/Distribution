package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type Information. Contains detailed information about a composite type,
  * base type, or base type with specific collection.
  */
@js.native
trait SchemaTypeInfo extends js.Object {
  /**
    * The description of the type.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * For swagger 2.0 externalDocs field will be used. For swagger 1.2 this
    * field will be empty.
    */
  var documentationLink: js.UndefOr[String] = js.native
  /**
    * Output only. Type of the output. Always deploymentManager#TypeInfo for
    * TypeInfo.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The base type or composite type name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * For base types with a collection, we return a schema and documentation
    * link For template types, we return only a schema
    */
  var schema: js.UndefOr[SchemaTypeInfoSchemaInfo] = js.native
  /**
    * Output only. Self link for the type provider.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The title on the API descriptor URL provided.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaTypeInfo {
  @scala.inline
  def apply(
    description: String = null,
    documentationLink: String = null,
    kind: String = null,
    name: String = null,
    schema: SchemaTypeInfoSchemaInfo = null,
    selfLink: String = null,
    title: String = null
  ): SchemaTypeInfo = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (documentationLink != null) __obj.updateDynamic("documentationLink")(documentationLink.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTypeInfo]
  }
}

