package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeidentifiedStoreDestination extends StObject {
  
  /**
    * The configuration to use when de-identifying resources that are added to this store.
    */
  var config: js.UndefOr[SchemaDeidentifyConfig] = js.undefined
  
  /**
    * The full resource name of a Cloud Healthcare FHIR store, for example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/fhirStores/{fhir_store_id\}`.
    */
  var store: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeidentifiedStoreDestination {
  
  inline def apply(): SchemaDeidentifiedStoreDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifiedStoreDestination]
  }
  
  extension [Self <: SchemaDeidentifiedStoreDestination](x: Self) {
    
    inline def setConfig(value: SchemaDeidentifyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setStore(value: String): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreNull: Self = StObject.set(x, "store", null)
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
