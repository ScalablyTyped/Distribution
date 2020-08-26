package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A partition ID identifies a grouping of entities. The grouping is always by
  * project and namespace, however the namespace ID may be empty.  A partition
  * ID contains several dimensions: project ID and namespace ID.  Partition
  * dimensions:  - May be `&quot;&quot;`. - Must be valid UTF-8 bytes. - Must
  * have values that match regex `[A-Za-z\d\.\-_]{1,100}` If the value of any
  * dimension matches regex `__.*__`, the partition is reserved/read-only. A
  * reserved/read-only partition ID is forbidden in certain documented
  * contexts.  Foreign partition IDs (in which the project ID does not match
  * the context project ID ) are discouraged. Reads and writes of foreign
  * partition IDs may fail if the project is not in an active state.
  */
@js.native
trait SchemaPartitionId extends js.Object {
  /**
    * If not empty, the ID of the namespace to which the entities belong.
    */
  var namespaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the project to which the entities belong.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaPartitionId {
  @scala.inline
  def apply(): SchemaPartitionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionId]
  }
  @scala.inline
  implicit class SchemaPartitionIdOps[Self <: SchemaPartitionId] (val x: Self) extends AnyVal {
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

