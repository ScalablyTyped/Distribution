package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersGetcapabilities
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the user. Only "users/me/capabilities" is supported.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersGetcapabilities {
  
  inline def apply(): ParamsResourceUsersGetcapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersGetcapabilities]
  }
  
  extension [Self <: ParamsResourceUsersGetcapabilities](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
