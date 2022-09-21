package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUserprofilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The user profile ID.
    */
  var profileId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUserprofilesGet {
  
  inline def apply(): ParamsResourceUserprofilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserprofilesGet]
  }
  
  extension [Self <: ParamsResourceUserprofilesGet](x: Self) {
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
