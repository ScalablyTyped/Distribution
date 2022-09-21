package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The API key to unregister including full resource path. `projects/x/locations/global/catalogs/default_catalog/eventStores/default_event_store/predictionApiKeyRegistrations/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
