package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Persistent Disk resource that will be created and attached to each
  * Replica in the Pool. Each Replica will have a unique persistent disk that
  * is created and attached to that Replica in READ_WRITE mode.
  */
@js.native
trait SchemaNewDisk extends js.Object {
  
  /**
    * How the disk will be attached to the Replica.
    */
  var attachment: js.UndefOr[SchemaDiskAttachment] = js.native
  
  /**
    * If true, then this disk will be deleted when the instance is deleted. The
    * default value is true.
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, indicates that this is the root persistent disk.
    */
  var boot: js.UndefOr[Boolean] = js.native
  
  /**
    * Create the new disk using these parameters. The name of the disk will be
    * &lt;instance_name&gt;-&lt;four_random_charactersgt;.
    */
  var initializeParams: js.UndefOr[SchemaNewDiskInitializeParams] = js.native
}
object SchemaNewDisk {
  
  @scala.inline
  def apply(): SchemaNewDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNewDisk]
  }
  
  @scala.inline
  implicit class SchemaNewDiskOps[Self <: SchemaNewDisk] (val x: Self) extends AnyVal {
    
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
    def setAutoDelete(value: Boolean): Self = this.set("autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDelete: Self = this.set("autoDelete", js.undefined)
    
    @scala.inline
    def setBoot(value: Boolean): Self = this.set("boot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoot: Self = this.set("boot", js.undefined)
    
    @scala.inline
    def setInitializeParams(value: SchemaNewDiskInitializeParams): Self = this.set("initializeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitializeParams: Self = this.set("initializeParams", js.undefined)
  }
}
