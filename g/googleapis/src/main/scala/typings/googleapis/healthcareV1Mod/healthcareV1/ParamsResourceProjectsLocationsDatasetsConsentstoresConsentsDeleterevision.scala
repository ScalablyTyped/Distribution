package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Consent revision to delete, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}@{revision_id\}`. An INVALID_ARGUMENT error occurs if `revision_id` is not specified in the name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
