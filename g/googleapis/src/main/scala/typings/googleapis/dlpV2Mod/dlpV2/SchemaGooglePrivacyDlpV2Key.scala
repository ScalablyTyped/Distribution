package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A unique identifier for a Datastore entity. If a key&#39;s partition ID or
  * any of its path kinds or names are reserved/read-only, the key is
  * reserved/read-only. A reserved/read-only key is forbidden in certain
  * documented contexts.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Key extends js.Object {
  /**
    * Entities are partitioned into subsets, currently identified by a project
    * ID and namespace ID. Queries are scoped to a single partition.
    */
  var partitionId: js.UndefOr[SchemaGooglePrivacyDlpV2PartitionId] = js.native
  /**
    * The entity path. An entity path consists of one or more elements composed
    * of a kind and a string or numerical identifier, which identify entities.
    * The first element identifies a _root entity_, the second element
    * identifies a _child_ of the root entity, the third element identifies a
    * child of the second entity, and so forth. The entities identified by all
    * prefixes of the path are called the element&#39;s _ancestors_.  A path
    * can never be empty, and a path can have at most 100 elements.
    */
  var path: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2PathElement]] = js.native
}

object SchemaGooglePrivacyDlpV2Key {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Key]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KeyOps[Self <: SchemaGooglePrivacyDlpV2Key] (val x: Self) extends AnyVal {
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
    def setPartitionId(value: SchemaGooglePrivacyDlpV2PartitionId): Self = this.set("partitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionId: Self = this.set("partitionId", js.undefined)
    @scala.inline
    def setPathVarargs(value: SchemaGooglePrivacyDlpV2PathElement*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[SchemaGooglePrivacyDlpV2PathElement]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

