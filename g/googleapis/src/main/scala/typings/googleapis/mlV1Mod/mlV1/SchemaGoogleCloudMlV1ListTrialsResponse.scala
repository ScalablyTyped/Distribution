package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1ListTrialsResponse extends StObject {
  
  /**
    * The trials associated with the study.
    */
  var trials: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Trial]] = js.undefined
}
object SchemaGoogleCloudMlV1ListTrialsResponse {
  
  inline def apply(): SchemaGoogleCloudMlV1ListTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListTrialsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ListTrialsResponse](x: Self) {
    
    inline def setTrials(value: js.Array[SchemaGoogleCloudMlV1Trial]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    inline def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    inline def setTrialsVarargs(value: SchemaGoogleCloudMlV1Trial*): Self = StObject.set(x, "trials", js.Array(value*))
  }
}
