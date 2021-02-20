package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Persistent Disk resource that will be created and attached to each
  * Replica in the Pool. Each Replica will have a unique persistent disk that
  * is created and attached to that Replica in READ_WRITE mode.
  */
@js.native
trait SchemaNewDisk extends StObject {
  
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
  implicit class SchemaNewDiskMutableBuilder[Self <: SchemaNewDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: SchemaDiskAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    @scala.inline
    def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
    
    @scala.inline
    def setBoot(value: Boolean): Self = StObject.set(x, "boot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootUndefined: Self = StObject.set(x, "boot", js.undefined)
    
    @scala.inline
    def setInitializeParams(value: SchemaNewDiskInitializeParams): Self = StObject.set(x, "initializeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializeParamsUndefined: Self = StObject.set(x, "initializeParams", js.undefined)
  }
}
