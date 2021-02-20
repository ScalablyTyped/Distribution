package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyOrder extends StObject {
  
  /** The direction to order by. Defaults to `ASCENDING`. */
  var direction: js.UndefOr[String] = js.native
  
  /** The property to order by. */
  var property: js.UndefOr[PropertyReference] = js.native
}
object PropertyOrder {
  
  @scala.inline
  def apply(): PropertyOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyOrder]
  }
  
  @scala.inline
  implicit class PropertyOrderMutableBuilder[Self <: PropertyOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setProperty(value: PropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
