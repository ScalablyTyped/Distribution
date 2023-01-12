package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyOrder extends StObject {
  
  /** The direction to order by. Defaults to `ASCENDING`. */
  var direction: js.UndefOr[String] = js.undefined
  
  /** The property to order by. */
  var property: js.UndefOr[PropertyReference] = js.undefined
}
object PropertyOrder {
  
  inline def apply(): PropertyOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyOrder] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setProperty(value: PropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
