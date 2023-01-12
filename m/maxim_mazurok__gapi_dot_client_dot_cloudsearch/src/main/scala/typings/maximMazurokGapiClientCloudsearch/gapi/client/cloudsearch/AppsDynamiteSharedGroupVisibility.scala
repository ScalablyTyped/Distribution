package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedGroupVisibility extends StObject {
  
  var state: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedGroupVisibility {
  
  inline def apply(): AppsDynamiteSharedGroupVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedGroupVisibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedGroupVisibility] (val x: Self) extends AnyVal {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
