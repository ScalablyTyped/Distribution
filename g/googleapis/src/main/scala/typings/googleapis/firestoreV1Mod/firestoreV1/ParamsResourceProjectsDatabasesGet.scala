package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the form `projects/{project_id\}/databases/{database_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesGet {
  
  inline def apply(): ParamsResourceProjectsDatabasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesGet]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
