package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsUsereventsCollect
  extends StObject
     with StandardParameters {
  
  /**
    * The event timestamp in milliseconds. This prevents browser caching of otherwise identical get requests. The name is abbreviated to reduce the payload bytes.
    */
  var ets: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent catalog name, such as `projects/1234/locations/global/catalogs/default_catalog`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The URL including cgi-parameters but excluding the hash fragment with a length limit of 5,000 characters. This is often more useful than the referer URL, because many browsers only send the domain for 3rd party requests.
    */
  var uri: js.UndefOr[String] = js.undefined
  
  /**
    * Required. URL encoded UserEvent proto with a length limit of 2,000,000 characters.
    */
  var userEvent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsUsereventsCollect {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsUsereventsCollect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsUsereventsCollect]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsUsereventsCollect](x: Self) {
    
    inline def setEts(value: String): Self = StObject.set(x, "ets", value.asInstanceOf[js.Any])
    
    inline def setEtsUndefined: Self = StObject.set(x, "ets", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUserEvent(value: String): Self = StObject.set(x, "userEvent", value.asInstanceOf[js.Any])
    
    inline def setUserEventUndefined: Self = StObject.set(x, "userEvent", js.undefined)
  }
}
