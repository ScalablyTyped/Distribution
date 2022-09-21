package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsRevisionsPermissionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Label Permission resource name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    */
  var useAdminAccess: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceLabelsRevisionsPermissionsDelete {
  
  inline def apply(): ParamsResourceLabelsRevisionsPermissionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsRevisionsPermissionsDelete]
  }
  
  extension [Self <: ParamsResourceLabelsRevisionsPermissionsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
  }
}
