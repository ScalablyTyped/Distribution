package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricHeaderEntry extends StObject {
  
  /** The name of the header. */
  var name: js.UndefOr[String] = js.native
  
  /** The type of the metric, for example `INTEGER`. */
  var `type`: js.UndefOr[String] = js.native
}
object MetricHeaderEntry {
  
  @scala.inline
  def apply(): MetricHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricHeaderEntry]
  }
  
  @scala.inline
  implicit class MetricHeaderEntryMutableBuilder[Self <: MetricHeaderEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
