package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenStreetMapProviderOptionsOther extends StObject {
  
  var debug: js.UndefOr[`0` | `1`] = js.undefined
  
  var dedupe: js.UndefOr[`0` | `1`] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
}
object OpenStreetMapProviderOptionsOther {
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOther]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsOtherMutableBuilder[Self <: OpenStreetMapProviderOptionsOther] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: `0` | `1`): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDedupe(value: `0` | `1`): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
