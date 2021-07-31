package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseMetaData extends StObject {
  
  /** If true, indicates some buckets of dimension combinations are rolled into "(other)" row. This can happen for high cardinality reports. */
  var dataLossFromOtherRow: js.UndefOr[Boolean] = js.undefined
}
object ResponseMetaData {
  
  @scala.inline
  def apply(): ResponseMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseMetaData]
  }
  
  @scala.inline
  implicit class ResponseMetaDataMutableBuilder[Self <: ResponseMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLossFromOtherRow(value: Boolean): Self = StObject.set(x, "dataLossFromOtherRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLossFromOtherRowUndefined: Self = StObject.set(x, "dataLossFromOtherRow", js.undefined)
  }
}
