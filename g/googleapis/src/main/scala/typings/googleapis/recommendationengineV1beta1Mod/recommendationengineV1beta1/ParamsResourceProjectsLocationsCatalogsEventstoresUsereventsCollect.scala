package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The event timestamp in milliseconds. This prevents browser caching of otherwise identical get requests. The name is abbreviated to reduce the payload bytes.
    */
  var ets: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent eventStore name, such as `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The url including cgi-parameters but excluding the hash fragment. The URL must be truncated to 1.5K bytes to conservatively be under the 2K bytes. This is often more useful than the referer url, because many browsers only send the domain for 3rd party requests.
    */
  var uri: js.UndefOr[String] = js.undefined
  
  /**
    * Required. URL encoded UserEvent proto.
    */
  var userEvent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect](x: Self) {
    
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
