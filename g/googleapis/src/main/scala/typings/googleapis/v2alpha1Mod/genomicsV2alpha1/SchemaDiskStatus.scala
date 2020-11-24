package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of a disk on a VM.
  */
@js.native
trait SchemaDiskStatus extends js.Object {
  
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
  implicit class SchemaDiskStatusOps[Self <: SchemaDiskStatus] (val x: Self) extends AnyVal {
    
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
    def setFreeSpaceBytes(value: String): Self = this.set("freeSpaceBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeSpaceBytes: Self = this.set("freeSpaceBytes", js.undefined)
    
    @scala.inline
    def setTotalSpaceBytes(value: String): Self = this.set("totalSpaceBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSpaceBytes: Self = this.set("totalSpaceBytes", js.undefined)
  }
}
