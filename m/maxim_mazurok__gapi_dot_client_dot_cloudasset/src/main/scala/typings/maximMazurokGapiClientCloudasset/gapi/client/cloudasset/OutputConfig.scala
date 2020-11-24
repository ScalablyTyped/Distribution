package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputConfig extends js.Object {
  
  /** Destination on BigQuery. The output table stores the fields in asset proto as columns in BigQuery. */
  var bigqueryDestination: js.UndefOr[BigQueryDestination] = js.native
  
  /** Destination on Cloud Storage. */
  var gcsDestination: js.UndefOr[GcsDestination] = js.native
}
object OutputConfig {
  
  @scala.inline
  def apply(): OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputConfig]
  }
  
  @scala.inline
  implicit class OutputConfigOps[Self <: OutputConfig] (val x: Self) extends AnyVal {
    
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
    def setBigqueryDestination(value: BigQueryDestination): Self = this.set("bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryDestination: Self = this.set("bigqueryDestination", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: GcsDestination): Self = this.set("gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsDestination: Self = this.set("gcsDestination", js.undefined)
  }
}
