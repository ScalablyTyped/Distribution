package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A parent name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFirestoreAdminV1Index] = js.undefined
}
object ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate {
  
  inline def apply(): ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleFirestoreAdminV1Index): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
