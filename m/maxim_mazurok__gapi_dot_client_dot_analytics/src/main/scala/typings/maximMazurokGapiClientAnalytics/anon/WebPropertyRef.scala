package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebPropertyRef extends StObject {
  
  var webPropertyRef: js.UndefOr[typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef] = js.undefined
}
object WebPropertyRef {
  
  inline def apply(): WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebPropertyRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebPropertyRef] (val x: Self) extends AnyVal {
    
    inline def setWebPropertyRef(value: typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef): Self = StObject.set(x, "webPropertyRef", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyRefUndefined: Self = StObject.set(x, "webPropertyRef", js.undefined)
  }
}
