package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFamily extends js.Object {
  
  /**
    * Garbage collection rule specified as a protobuf. Must serialize to at most 500 bytes. NOTE: Garbage collection executes opportunistically in the background, and so it's possible for
    * reads to return a cell even if it matches the active GC expression for its family.
    */
  var gcRule: js.UndefOr[GcRule] = js.native
}
object ColumnFamily {
  
  @scala.inline
  def apply(): ColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFamily]
  }
  
  @scala.inline
  implicit class ColumnFamilyOps[Self <: ColumnFamily] (val x: Self) extends AnyVal {
    
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
    def setGcRule(value: GcRule): Self = this.set("gcRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcRule: Self = this.set("gcRule", js.undefined)
  }
}
