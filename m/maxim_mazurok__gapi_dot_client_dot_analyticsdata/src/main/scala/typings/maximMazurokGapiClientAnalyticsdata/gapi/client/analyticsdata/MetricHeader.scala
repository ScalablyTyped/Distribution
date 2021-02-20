package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricHeader extends StObject {
  
  /** The metric's name. */
  var name: js.UndefOr[String] = js.native
  
  /** The metric's data type. */
  var `type`: js.UndefOr[String] = js.native
}
object MetricHeader {
  
  @scala.inline
  def apply(): MetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricHeader]
  }
  
  @scala.inline
  implicit class MetricHeaderMutableBuilder[Self <: MetricHeader] (val x: Self) extends AnyVal {
    
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
