package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetPublisherProfilesByAccountIdResponse extends StObject {
  
  /**
    * Profiles for the requested publisher
    */
  var profiles: js.UndefOr[js.Array[SchemaPublisherProfileApiProto]] = js.undefined
}
object SchemaGetPublisherProfilesByAccountIdResponse {
  
  inline def apply(): SchemaGetPublisherProfilesByAccountIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetPublisherProfilesByAccountIdResponse]
  }
  
  extension [Self <: SchemaGetPublisherProfilesByAccountIdResponse](x: Self) {
    
    inline def setProfiles(value: js.Array[SchemaPublisherProfileApiProto]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(value: SchemaPublisherProfileApiProto*): Self = StObject.set(x, "profiles", js.Array(value :_*))
  }
}
