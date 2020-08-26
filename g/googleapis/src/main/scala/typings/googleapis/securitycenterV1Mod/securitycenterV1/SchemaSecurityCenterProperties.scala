package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud SCC managed properties. These properties are managed by Cloud SCC and
  * cannot be modified by the user.
  */
@js.native
trait SchemaSecurityCenterProperties extends js.Object {
  /**
    * The full resource name of the GCP resource this asset represents. This
    * field is immutable after create time. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * Owners of the Google Cloud resource.
    */
  var resourceOwners: js.UndefOr[js.Array[String]] = js.native
  /**
    * The full resource name of the immediate parent of the resource. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceParent: js.UndefOr[String] = js.native
  /**
    * The full resource name of the project the resource belongs to. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceProject: js.UndefOr[String] = js.native
  /**
    * The type of the GCP resource. Examples include: APPLICATION, PROJECT, and
    * ORGANIZATION. This is a case insensitive field defined by Cloud SCC
    * and/or the producer of the resource and is immutable after create time.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object SchemaSecurityCenterProperties {
  @scala.inline
  def apply(): SchemaSecurityCenterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityCenterProperties]
  }
  @scala.inline
  implicit class SchemaSecurityCenterPropertiesOps[Self <: SchemaSecurityCenterProperties] (val x: Self) extends AnyVal {
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
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setResourceOwnersVarargs(value: String*): Self = this.set("resourceOwners", js.Array(value :_*))
    @scala.inline
    def setResourceOwners(value: js.Array[String]): Self = this.set("resourceOwners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceOwners: Self = this.set("resourceOwners", js.undefined)
    @scala.inline
    def setResourceParent(value: String): Self = this.set("resourceParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceParent: Self = this.set("resourceParent", js.undefined)
    @scala.inline
    def setResourceProject(value: String): Self = this.set("resourceProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceProject: Self = this.set("resourceProject", js.undefined)
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

