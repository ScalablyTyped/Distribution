package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1ListOptimalTrialsResponse extends StObject {
  
  /**
    * The pareto-optimal trials for multiple objective study or the optimal trial for single objective study. The definition of pareto-optimal can be checked in wiki page. https://en.wikipedia.org/wiki/Pareto_efficiency
    */
  var trials: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Trial]] = js.undefined
}
object SchemaGoogleCloudMlV1ListOptimalTrialsResponse {
  
  inline def apply(): SchemaGoogleCloudMlV1ListOptimalTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListOptimalTrialsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ListOptimalTrialsResponse](x: Self) {
    
    inline def setTrials(value: js.Array[SchemaGoogleCloudMlV1Trial]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    inline def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    inline def setTrialsVarargs(value: SchemaGoogleCloudMlV1Trial*): Self = StObject.set(x, "trials", js.Array(value*))
  }
}
