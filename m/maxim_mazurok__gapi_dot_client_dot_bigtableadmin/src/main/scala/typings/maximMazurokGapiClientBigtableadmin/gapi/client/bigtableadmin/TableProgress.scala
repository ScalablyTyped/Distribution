package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProgress extends js.Object {
  
  /** Estimate of the number of bytes copied so far for this table. This will eventually reach 'estimated_size_bytes' unless the table copy is CANCELLED. */
  var estimatedCopiedBytes: js.UndefOr[String] = js.native
  
  /** Estimate of the size of the table to be copied. */
  var estimatedSizeBytes: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object TableProgress {
  
  @scala.inline
  def apply(): TableProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProgress]
  }
  
  @scala.inline
  implicit class TableProgressOps[Self <: TableProgress] (val x: Self) extends AnyVal {
    
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
    def setEstimatedCopiedBytes(value: String): Self = this.set("estimatedCopiedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedCopiedBytes: Self = this.set("estimatedCopiedBytes", js.undefined)
    
    @scala.inline
    def setEstimatedSizeBytes(value: String): Self = this.set("estimatedSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedSizeBytes: Self = this.set("estimatedSizeBytes", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
