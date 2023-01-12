package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMapReference extends StObject {
  
  var urlMap: js.UndefOr[String] = js.undefined
}
object UrlMapReference {
  
  inline def apply(): UrlMapReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlMapReference] (val x: Self) extends AnyVal {
    
    inline def setUrlMap(value: String): Self = StObject.set(x, "urlMap", value.asInstanceOf[js.Any])
    
    inline def setUrlMapUndefined: Self = StObject.set(x, "urlMap", js.undefined)
  }
}
