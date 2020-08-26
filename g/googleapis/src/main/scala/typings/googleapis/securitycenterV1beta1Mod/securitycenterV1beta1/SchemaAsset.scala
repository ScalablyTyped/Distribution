package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Security Command Center&#39;s (Cloud SCC) representation of a Google
  * Cloud Platform (GCP) resource.  The Asset is a Cloud SCC resource that
  * captures information about a single GCP resource. All modifications to an
  * Asset are only within the context of Cloud SCC and don&#39;t affect the
  * referenced GCP resource.
  */
@js.native
trait SchemaAsset extends js.Object {
  /**
    * The time at which the asset was created in Cloud SCC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The relative resource name of this asset. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/assets/456&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Resource managed properties. These properties are managed and defined by
    * the GCP resource and cannot be modified by the user.
    */
  var resourceProperties: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Cloud SCC managed properties. These properties are managed by Cloud SCC
    * and cannot be modified by the user.
    */
  var securityCenterProperties: js.UndefOr[SchemaSecurityCenterProperties] = js.native
  /**
    * User specified security marks. These marks are entirely managed by the
    * user and come from the SecurityMarks resource that belongs to the asset.
    */
  var securityMarks: js.UndefOr[SchemaSecurityMarks] = js.native
  /**
    * The time at which the asset was last updated, added, or deleted in Cloud
    * SCC.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaAsset {
  @scala.inline
  def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  @scala.inline
  implicit class SchemaAssetOps[Self <: SchemaAsset] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceProperties(value: StringDictionary[js.Any]): Self = this.set("resourceProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceProperties: Self = this.set("resourceProperties", js.undefined)
    @scala.inline
    def setSecurityCenterProperties(value: SchemaSecurityCenterProperties): Self = this.set("securityCenterProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityCenterProperties: Self = this.set("securityCenterProperties", js.undefined)
    @scala.inline
    def setSecurityMarks(value: SchemaSecurityMarks): Self = this.set("securityMarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityMarks: Self = this.set("securityMarks", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

