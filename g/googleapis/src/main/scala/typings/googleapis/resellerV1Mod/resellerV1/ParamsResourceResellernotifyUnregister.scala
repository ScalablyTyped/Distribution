package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResellernotifyUnregister
  extends StObject
     with StandardParameters {
  
  /**
    * The service account which owns the Cloud-PubSub topic.
    */
  var serviceAccountEmailAddress: js.UndefOr[String] = js.undefined
}
object ParamsResourceResellernotifyUnregister {
  
  inline def apply(): ParamsResourceResellernotifyUnregister = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResellernotifyUnregister]
  }
  
  extension [Self <: ParamsResourceResellernotifyUnregister](x: Self) {
    
    inline def setServiceAccountEmailAddress(value: String): Self = StObject.set(x, "serviceAccountEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailAddressUndefined: Self = StObject.set(x, "serviceAccountEmailAddress", js.undefined)
  }
}
