package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampPropertyOptions extends StObject {
  
  /** If set, describes how the timestamp should be used as a search operator. */
  var operatorOptions: js.UndefOr[TimestampOperatorOptions] = js.undefined
}
object TimestampPropertyOptions {
  
  inline def apply(): TimestampPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampPropertyOptions]
  }
  
  extension [Self <: TimestampPropertyOptions](x: Self) {
    
    inline def setOperatorOptions(value: TimestampOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
