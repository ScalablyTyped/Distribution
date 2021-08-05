package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanPropertyOptions extends StObject {
  
  /** If set, describes how the boolean should be used as a search operator. */
  var operatorOptions: js.UndefOr[BooleanOperatorOptions] = js.undefined
}
object BooleanPropertyOptions {
  
  inline def apply(): BooleanPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanPropertyOptions]
  }
  
  extension [Self <: BooleanPropertyOptions](x: Self) {
    
    inline def setOperatorOptions(value: BooleanOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
