package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDatastreamsGetglobalsitetag
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the site tag to lookup. Note that site tags are singletons and do not have unique IDs. Format: properties/{property_id\}/dataStreams/{stream_id\}/globalSiteTag Example: "properties/123/dataStreams/456/globalSiteTag"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesDatastreamsGetglobalsitetag {
  
  inline def apply(): ParamsResourcePropertiesDatastreamsGetglobalsitetag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDatastreamsGetglobalsitetag]
  }
  
  extension [Self <: ParamsResourcePropertiesDatastreamsGetglobalsitetag](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
