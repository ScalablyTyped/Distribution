package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedButtonList extends StObject {
  
  var buttons: js.UndefOr[js.Array[AppsDynamiteSharedButton]] = js.undefined
}
object AppsDynamiteSharedButtonList {
  
  inline def apply(): AppsDynamiteSharedButtonList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedButtonList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedButtonList] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[AppsDynamiteSharedButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: AppsDynamiteSharedButton*): Self = StObject.set(x, "buttons", js.Array(value*))
  }
}
