package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAnnotation extends StObject {
  
  var `type`: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object EventAnnotation {
  
  inline def apply(): EventAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAnnotation]
  }
  
  extension [Self <: EventAnnotation](x: Self) {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
