package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesExportdocuments
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Database to export. Should be of the form: `projects/{project_id\}/databases/{database_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFirestoreAdminV1ExportDocumentsRequest] = js.undefined
}
object ParamsResourceProjectsDatabasesExportdocuments {
  
  inline def apply(): ParamsResourceProjectsDatabasesExportdocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesExportdocuments]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesExportdocuments](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleFirestoreAdminV1ExportDocumentsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
