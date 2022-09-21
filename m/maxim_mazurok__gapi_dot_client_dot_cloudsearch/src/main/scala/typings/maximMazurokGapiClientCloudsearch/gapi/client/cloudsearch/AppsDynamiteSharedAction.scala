package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedAction extends StObject {
  
  /** Apps Script function to invoke when the containing element is clicked/activated. */
  var function: js.UndefOr[String] = js.undefined
  
  var interaction: js.UndefOr[String] = js.undefined
  
  var loadIndicator: js.UndefOr[String] = js.undefined
  
  /** List of action parameters. */
  var parameters: js.UndefOr[js.Array[AppsDynamiteSharedActionActionParameter]] = js.undefined
}
object AppsDynamiteSharedAction {
  
  inline def apply(): AppsDynamiteSharedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedAction]
  }
  
  extension [Self <: AppsDynamiteSharedAction](x: Self) {
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setInteraction(value: String): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setLoadIndicator(value: String): Self = StObject.set(x, "loadIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadIndicatorUndefined: Self = StObject.set(x, "loadIndicator", js.undefined)
    
    inline def setParameters(value: js.Array[AppsDynamiteSharedActionActionParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: AppsDynamiteSharedActionActionParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
