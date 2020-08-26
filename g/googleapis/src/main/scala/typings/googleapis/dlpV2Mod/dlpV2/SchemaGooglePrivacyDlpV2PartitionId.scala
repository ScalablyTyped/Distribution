package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Datastore partition ID. A partition ID identifies a grouping of entities.
  * The grouping is always by project and namespace, however the namespace ID
  * may be empty.  A partition ID contains several dimensions: project ID and
  * namespace ID.
  */
@js.native
trait SchemaGooglePrivacyDlpV2PartitionId extends js.Object {
  /**
    * If not empty, the ID of the namespace to which the entities belong.
    */
  var namespaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the project to which the entities belong.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2PartitionId {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2PartitionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PartitionId]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PartitionIdOps[Self <: SchemaGooglePrivacyDlpV2PartitionId] (val x: Self) extends AnyVal {
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
    def setNamespaceId(value: String): Self = this.set("namespaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceId: Self = this.set("namespaceId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

