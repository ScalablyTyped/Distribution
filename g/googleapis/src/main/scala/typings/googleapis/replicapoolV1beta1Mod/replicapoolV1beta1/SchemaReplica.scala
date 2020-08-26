package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An individual Replica within a Pool. Replicas are automatically created by
  * the replica pool, using the template provided by the user. You cannot
  * directly create replicas.
  */
@js.native
trait SchemaReplica extends js.Object {
  /**
    * [Output Only] The name of the Replica object.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The self-link of the Replica.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Last known status of the Replica.
    */
  var status: js.UndefOr[SchemaReplicaStatus] = js.native
}

object SchemaReplica {
  @scala.inline
  def apply(): SchemaReplica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplica]
  }
  @scala.inline
  implicit class SchemaReplicaOps[Self <: SchemaReplica] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStatus(value: SchemaReplicaStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

