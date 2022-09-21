package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMapTestHeader extends StObject {
  
  /** Header name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Header value. */
  var value: js.UndefOr[String] = js.undefined
}
object UrlMapTestHeader {
  
  inline def apply(): UrlMapTestHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapTestHeader]
  }
  
  extension [Self <: UrlMapTestHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
