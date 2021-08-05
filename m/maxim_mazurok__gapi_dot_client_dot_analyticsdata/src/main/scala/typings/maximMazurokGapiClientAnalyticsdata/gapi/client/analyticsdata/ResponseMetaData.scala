package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseMetaData extends StObject {
  
  /** If true, indicates some buckets of dimension combinations are rolled into "(other)" row. This can happen for high cardinality reports. */
  var dataLossFromOtherRow: js.UndefOr[Boolean] = js.undefined
}
object ResponseMetaData {
  
  inline def apply(): ResponseMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseMetaData]
  }
  
  extension [Self <: ResponseMetaData](x: Self) {
    
    inline def setDataLossFromOtherRow(value: Boolean): Self = StObject.set(x, "dataLossFromOtherRow", value.asInstanceOf[js.Any])
    
    inline def setDataLossFromOtherRowUndefined: Self = StObject.set(x, "dataLossFromOtherRow", js.undefined)
  }
}
