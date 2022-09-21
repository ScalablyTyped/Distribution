package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A parent name of the form `projects/{project_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesList {
  
  inline def apply(): ParamsResourceProjectsDatabasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesList]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
