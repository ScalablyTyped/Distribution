package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metaline extends StObject {
  
  /** The list of displayed properties for the metaline. The maximum number of properties is 5. */
  var properties: js.UndefOr[js.Array[DisplayedProperty]] = js.undefined
}
object Metaline {
  
  inline def apply(): Metaline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metaline]
  }
  
  extension [Self <: Metaline](x: Self) {
    
    inline def setProperties(value: js.Array[DisplayedProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: DisplayedProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
