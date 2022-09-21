package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesDocumentsBatchwrite
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The database name. In the format: `projects/{project_id\}/databases/{database_id\}`.
    */
  var database: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchWriteRequest] = js.undefined
}
object ParamsResourceProjectsDatabasesDocumentsBatchwrite {
  
  inline def apply(): ParamsResourceProjectsDatabasesDocumentsBatchwrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsBatchwrite]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesDocumentsBatchwrite](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchWriteRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
