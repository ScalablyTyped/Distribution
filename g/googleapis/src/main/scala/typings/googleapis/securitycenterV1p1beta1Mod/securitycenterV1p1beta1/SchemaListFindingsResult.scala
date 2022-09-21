package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFindingsResult extends StObject {
  
  /**
    * Finding matching the search request.
    */
  var finding: js.UndefOr[SchemaGoogleCloudSecuritycenterV1p1beta1Finding] = js.undefined
  
  /**
    * Output only. Resource that is associated with this finding.
    */
  var resource: js.UndefOr[SchemaResource] = js.undefined
  
  /**
    * State change of the finding between the points in time.
    */
  var stateChange: js.UndefOr[String | Null] = js.undefined
}
object SchemaListFindingsResult {
  
  inline def apply(): SchemaListFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingsResult]
  }
  
  extension [Self <: SchemaListFindingsResult](x: Self) {
    
    inline def setFinding(value: SchemaGoogleCloudSecuritycenterV1p1beta1Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setResource(value: SchemaResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setStateChange(value: String): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    inline def setStateChangeNull: Self = StObject.set(x, "stateChange", null)
    
    inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
  }
}
