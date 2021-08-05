package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePropertyOptions extends StObject {
  
  /** If set, describes how the date should be used as a search operator. */
  var operatorOptions: js.UndefOr[DateOperatorOptions] = js.undefined
}
object DatePropertyOptions {
  
  inline def apply(): DatePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePropertyOptions]
  }
  
  extension [Self <: DatePropertyOptions](x: Self) {
    
    inline def setOperatorOptions(value: DateOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
