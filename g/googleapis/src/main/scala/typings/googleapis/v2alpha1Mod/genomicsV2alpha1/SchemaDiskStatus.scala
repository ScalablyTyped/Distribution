package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of a disk on a VM.
  */
@js.native
trait SchemaDiskStatus extends StObject {
  
  /**
    * Free disk space.
    */
  var freeSpaceBytes: js.UndefOr[String] = js.native
  
  /**
    * Total disk space.
    */
  var totalSpaceBytes: js.UndefOr[String] = js.native
}
object SchemaDiskStatus {
  
  @scala.inline
  def apply(): SchemaDiskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskStatus]
  }
  
  @scala.inline
  implicit class SchemaDiskStatusMutableBuilder[Self <: SchemaDiskStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreeSpaceBytes(value: String): Self = StObject.set(x, "freeSpaceBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeSpaceBytesUndefined: Self = StObject.set(x, "freeSpaceBytes", js.undefined)
    
    @scala.inline
    def setTotalSpaceBytes(value: String): Self = StObject.set(x, "totalSpaceBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSpaceBytesUndefined: Self = StObject.set(x, "totalSpaceBytes", js.undefined)
  }
}
