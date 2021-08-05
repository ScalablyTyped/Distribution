package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricHeaderEntry extends StObject {
  
  /** The name of the header. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The type of the metric, for example `INTEGER`. */
  var `type`: js.UndefOr[String] = js.undefined
}
object MetricHeaderEntry {
  
  inline def apply(): MetricHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricHeaderEntry]
  }
  
  extension [Self <: MetricHeaderEntry](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
