package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeGroupAssignment extends StObject {
  
  /** ID of the creative group to be assigned. */
  var creativeGroupId: js.UndefOr[String] = js.undefined
  
  /** Creative group number of the creative group assignment. */
  var creativeGroupNumber: js.UndefOr[String] = js.undefined
}
object CreativeGroupAssignment {
  
  inline def apply(): CreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeGroupAssignment]
  }
  
  extension [Self <: CreativeGroupAssignment](x: Self) {
    
    inline def setCreativeGroupId(value: String): Self = StObject.set(x, "creativeGroupId", value.asInstanceOf[js.Any])
    
    inline def setCreativeGroupIdUndefined: Self = StObject.set(x, "creativeGroupId", js.undefined)
    
    inline def setCreativeGroupNumber(value: String): Self = StObject.set(x, "creativeGroupNumber", value.asInstanceOf[js.Any])
    
    inline def setCreativeGroupNumberUndefined: Self = StObject.set(x, "creativeGroupNumber", js.undefined)
  }
}
