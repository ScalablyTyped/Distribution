package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds the composite type.
  */
@js.native
trait SchemaCompositeType extends js.Object {
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * Map of labels; provided by the client when the resource is created or
    * updated. Specifically: Label keys must be between 1 and 63 characters
    * long and must conform to the following regular expression:
    * [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
    * characters long and must conform to the regular expression
    * ([a-z]([-a-z0-9]*[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[SchemaCompositeTypeLabelEntry]] = js.native
  /**
    * Name of the composite type, must follow the expression:
    * [a-z]([-a-z0-9_.]{0,61}[a-z0-9])?.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The Operation that most recently ran, or is currently
    * running, on this composite type.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  /**
    * Output only. Server defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  /**
    * Files for the template type.
    */
  var templateContents: js.UndefOr[SchemaTemplateContents] = js.native
}

object SchemaCompositeType {
  @scala.inline
  def apply(
    description: String = null,
    id: String = null,
    insertTime: String = null,
    labels: js.Array[SchemaCompositeTypeLabelEntry] = null,
    name: String = null,
    operation: SchemaOperation = null,
    selfLink: String = null,
    status: String = null,
    templateContents: SchemaTemplateContents = null
  ): SchemaCompositeType = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (templateContents != null) __obj.updateDynamic("templateContents")(templateContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompositeType]
  }
}

