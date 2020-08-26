package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource to hold the state and status of a user&#39;s domain mapping.
  */
@js.native
trait SchemaDomainMapping extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of resource, in this case &quot;DomainMapping&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this BuildTemplate.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.native
  /**
    * The spec for this DomainMapping.
    */
  var spec: js.UndefOr[SchemaDomainMappingSpec] = js.native
  /**
    * The current status of the DomainMapping.
    */
  var status: js.UndefOr[SchemaDomainMappingStatus] = js.native
}

object SchemaDomainMapping {
  @scala.inline
  def apply(): SchemaDomainMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMapping]
  }
  @scala.inline
  implicit class SchemaDomainMappingOps[Self <: SchemaDomainMapping] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setSpec(value: SchemaDomainMappingSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    @scala.inline
    def setStatus(value: SchemaDomainMappingStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

