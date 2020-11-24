package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListScanRuns` method.
  */
@js.native
trait SchemaListScanRunsResponse extends js.Object {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of ScanRuns returned.
    */
  var scanRuns: js.UndefOr[js.Array[SchemaScanRun]] = js.native
}
object SchemaListScanRunsResponse {
  
  @scala.inline
  def apply(): SchemaListScanRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScanRunsResponse]
  }
  
  @scala.inline
  implicit class SchemaListScanRunsResponseOps[Self <: SchemaListScanRunsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setScanRunsVarargs(value: SchemaScanRun*): Self = this.set("scanRuns", js.Array(value :_*))
    
    @scala.inline
    def setScanRuns(value: js.Array[SchemaScanRun]): Self = this.set("scanRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanRuns: Self = this.set("scanRuns", js.undefined)
  }
}
