package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebPropertyRef extends StObject {
  
  var webPropertyRef: js.UndefOr[typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef] = js.native
}
object WebPropertyRef {
  
  @scala.inline
  def apply(): WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebPropertyRef]
  }
  
  @scala.inline
  implicit class WebPropertyRefMutableBuilder[Self <: WebPropertyRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebPropertyRef(value: typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef): Self = StObject.set(x, "webPropertyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyRefUndefined: Self = StObject.set(x, "webPropertyRef", js.undefined)
  }
}
