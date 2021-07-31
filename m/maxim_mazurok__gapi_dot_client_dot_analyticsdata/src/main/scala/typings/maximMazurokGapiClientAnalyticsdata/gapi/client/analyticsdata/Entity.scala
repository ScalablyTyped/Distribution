package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  /** A Google Analytics GA4 property id. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). */
  var propertyId: js.UndefOr[String] = js.undefined
}
object Entity {
  
  @scala.inline
  def apply(): Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyId(value: String): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
  }
}
