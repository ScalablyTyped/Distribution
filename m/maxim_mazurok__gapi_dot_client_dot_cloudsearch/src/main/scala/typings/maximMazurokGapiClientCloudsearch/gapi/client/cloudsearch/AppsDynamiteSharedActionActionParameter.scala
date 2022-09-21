package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedActionActionParameter extends StObject {
  
  /** The name of the parameter for the action script. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The value of the parameter. */
  var value: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedActionActionParameter {
  
  inline def apply(): AppsDynamiteSharedActionActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedActionActionParameter]
  }
  
  extension [Self <: AppsDynamiteSharedActionActionParameter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
