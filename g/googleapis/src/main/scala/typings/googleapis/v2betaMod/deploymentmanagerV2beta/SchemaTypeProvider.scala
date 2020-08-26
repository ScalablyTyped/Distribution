package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type provider that describes a service-backed Type.
  */
@js.native
trait SchemaTypeProvider extends js.Object {
  /**
    * Allows resource handling overrides for specific collections
    */
  var collectionOverrides: js.UndefOr[js.Array[SchemaCollectionOverride]] = js.native
  /**
    * Credential used when interacting with this type.
    */
  var credential: js.UndefOr[SchemaCredential] = js.native
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Descriptor Url for the this type provider.
    */
  var descriptorUrl: js.UndefOr[String] = js.native
  /**
    * Output only. Unique identifier for the resource defined by the server.
    */
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
  var labels: js.UndefOr[js.Array[SchemaTypeProviderLabelEntry]] = js.native
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The Operation that most recently ran, or is currently
    * running, on this type provider.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  /**
    * Options to apply when handling any resources in this service.
    */
  var options: js.UndefOr[SchemaOptions] = js.native
  /**
    * Output only. Self link for the type provider.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaTypeProvider {
  @scala.inline
  def apply(): SchemaTypeProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeProvider]
  }
  @scala.inline
  implicit class SchemaTypeProviderOps[Self <: SchemaTypeProvider] (val x: Self) extends AnyVal {
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
    def setCollectionOverridesVarargs(value: SchemaCollectionOverride*): Self = this.set("collectionOverrides", js.Array(value :_*))
    @scala.inline
    def setCollectionOverrides(value: js.Array[SchemaCollectionOverride]): Self = this.set("collectionOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionOverrides: Self = this.set("collectionOverrides", js.undefined)
    @scala.inline
    def setCredential(value: SchemaCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential: Self = this.set("credential", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptorUrl(value: String): Self = this.set("descriptorUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptorUrl: Self = this.set("descriptorUrl", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInsertTime(value: String): Self = this.set("insertTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTime: Self = this.set("insertTime", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: SchemaTypeProviderLabelEntry*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[SchemaTypeProviderLabelEntry]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOperation(value: SchemaOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setOptions(value: SchemaOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

