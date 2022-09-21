package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesIndexesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The index name. For example: `projects/{project_id\}/databases/{database_id\}/indexes/{index_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesIndexesDelete {
  
  inline def apply(): ParamsResourceProjectsDatabasesIndexesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesIndexesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesIndexesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
