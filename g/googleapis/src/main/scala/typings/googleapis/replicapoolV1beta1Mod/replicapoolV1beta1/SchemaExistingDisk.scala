package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pre-existing persistent disk that will be attached to every Replica in
  * the Pool in READ_ONLY mode.
  */
@js.native
trait SchemaExistingDisk extends js.Object {
  /**
    * How the disk will be attached to the Replica.
    */
  var attachment: js.UndefOr[SchemaDiskAttachment] = js.native
  /**
    * The name of the Persistent Disk resource. The Persistent Disk resource
    * must be in the same zone as the Pool.
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaExistingDisk {
  @scala.inline
  def apply(): SchemaExistingDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExistingDisk]
  }
  @scala.inline
  implicit class SchemaExistingDiskOps[Self <: SchemaExistingDisk] (val x: Self) extends AnyVal {
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
    def setAttachment(value: SchemaDiskAttachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

