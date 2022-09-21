package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFloodlightconfigurationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Set of IDs of floodlight configurations to retrieve. Required field; otherwise an empty list will be returned.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFloodlightconfigurationsList {
  
  inline def apply(): ParamsResourceFloodlightconfigurationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFloodlightconfigurationsList]
  }
  
  extension [Self <: ParamsResourceFloodlightconfigurationsList](x: Self) {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
