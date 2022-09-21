package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationsCalculatestats
  extends StObject
     with StandardParameters {
  
  /**
    * A filter to reduce results to a specific subset. This field is useful for getting statistics about conversations with specific properties.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The location of the conversations.
    */
  var location: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConversationsCalculatestats {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationsCalculatestats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationsCalculatestats]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationsCalculatestats](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
