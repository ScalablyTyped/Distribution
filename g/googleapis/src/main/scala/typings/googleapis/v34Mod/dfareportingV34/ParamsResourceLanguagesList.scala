package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLanguagesList
  extends StObject
     with StandardParameters {
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
}
object ParamsResourceLanguagesList {
  
  inline def apply(): ParamsResourceLanguagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLanguagesList]
  }
  
  extension [Self <: ParamsResourceLanguagesList](x: Self) {
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
