package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyFilter extends StObject {
  
  /** The operator to filter by. */
  var op: js.UndefOr[String] = js.undefined
  
  /** The property to filter by. */
  var property: js.UndefOr[PropertyReference] = js.undefined
  
  /** The value to compare the property to. */
  var value: js.UndefOr[Value] = js.undefined
}
object PropertyFilter {
  
  inline def apply(): PropertyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyFilter] (val x: Self) extends AnyVal {
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setProperty(value: PropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
