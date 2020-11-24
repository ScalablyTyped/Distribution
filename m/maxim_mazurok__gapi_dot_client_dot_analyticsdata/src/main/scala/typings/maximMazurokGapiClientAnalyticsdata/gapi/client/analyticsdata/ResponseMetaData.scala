package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseMetaData extends js.Object {
  
  /** If true, indicates some buckets of dimension combinations are rolled into "(other)" row. This can happen for high cardinality reports. */
  var dataLossFromOtherRow: js.UndefOr[Boolean] = js.native
}
object ResponseMetaData {
  
  @scala.inline
  def apply(): ResponseMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseMetaData]
  }
  
  @scala.inline
  implicit class ResponseMetaDataOps[Self <: ResponseMetaData] (val x: Self) extends AnyVal {
    
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
    def setDataLossFromOtherRow(value: Boolean): Self = this.set("dataLossFromOtherRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLossFromOtherRow: Self = this.set("dataLossFromOtherRow", js.undefined)
  }
}
