package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pre-existing persistent disk that will be attached to every Replica in
  * the Pool in READ_ONLY mode.
  */
trait SchemaExistingDisk extends StObject {
  
  /**
    * How the disk will be attached to the Replica.
    */
  var attachment: js.UndefOr[SchemaDiskAttachment] = js.undefined
  
  /**
    * The name of the Persistent Disk resource. The Persistent Disk resource
    * must be in the same zone as the Pool.
    */
  var source: js.UndefOr[String] = js.undefined
}
object SchemaExistingDisk {
  
  @scala.inline
  def apply(): SchemaExistingDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExistingDisk]
  }
  
  @scala.inline
  implicit class SchemaExistingDiskMutableBuilder[Self <: SchemaExistingDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: SchemaDiskAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
