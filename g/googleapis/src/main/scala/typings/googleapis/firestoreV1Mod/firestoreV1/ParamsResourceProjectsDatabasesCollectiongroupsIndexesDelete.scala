package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}/indexes/{index_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete {
  
  inline def apply(): ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
