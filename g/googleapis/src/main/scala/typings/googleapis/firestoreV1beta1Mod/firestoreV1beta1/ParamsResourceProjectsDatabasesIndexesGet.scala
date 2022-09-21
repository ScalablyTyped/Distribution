package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesIndexesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the index. For example: `projects/{project_id\}/databases/{database_id\}/indexes/{index_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesIndexesGet {
  
  inline def apply(): ParamsResourceProjectsDatabasesIndexesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesIndexesGet]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesIndexesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
