package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionProperty extends StObject {
  
  /** [Required] Name of the connection property to set. */
  var key: js.UndefOr[String] = js.undefined
  
  /** [Required] Value of the connection property. */
  var value: js.UndefOr[String] = js.undefined
}
object ConnectionProperty {
  
  inline def apply(): ConnectionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionProperty]
  }
  
  extension [Self <: ConnectionProperty](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
